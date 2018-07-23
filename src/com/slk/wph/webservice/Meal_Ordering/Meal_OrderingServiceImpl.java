package com.slk.wph.webservice.Meal_Ordering;

import com.slk.wph.framework.Exception.CustimExceptionResolver;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.po.WphMealCustomerApp;
import com.slk.wph.module.WPH_Mealmenu.mapper.WphMealmenuMapper;
import com.slk.wph.module.WPH_Mealmenu.mapper.WphMealmenuMapperCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealtime.mapper.WphMealtimeMapperCustom;
import com.slk.wph.module.WPH_Mealtime.po.WphMealtimeCustom;
import com.slk.wph.module.WPH_Mealtype.mapper.WphMealtypeMapperCustom;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_One.mapper.WphOneMapperCustom;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapper;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphMealCollect;
import com.slk.wph.module.WPH_Ordering.po.WphMealInfo;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapper;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapperCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphMealPcCollect;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodExample;
import com.slk.wph.module.WPH_Unsubscribetime.mapper.WphUnsubscribetimeMapperCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.Wph_Servicedetails.mapper.WphServicedetailsMapperCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.jws.WebService;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Lazy(false)
@WebService
public class Meal_OrderingServiceImpl implements Meal_OrderingService {

	@Autowired
	private WphMealmenuMapperCustom mapperCustom;
	@Autowired
	private WphMealmenuMapper mapper;
	@Autowired
	private WphMealtypeMapperCustom mealtypeMapper;
	@Autowired
	private WphCustomerMapperCustom customerCustomMapper;
	@Autowired
	private WphOrderingfoodMapperCustom orderingfoodCustomMapper;
	@Autowired
	private WphOrderingfoodMapper orderingfoodMapper;
	@Autowired
	private WphOrderingMapper orderingMapper;
	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;
	@Autowired
	private WphServicedetailsMapperCustom servicedetailsMapper;
	@Autowired
	private WphUserCustomMapper userCustomMapper;
	@Autowired
	private WphMealtimeMapperCustom mealtimeMapperCustom;
	@Autowired
	private WphWardMapperCustom wardMapperCustom;
	@Autowired
	private WphUnsubscribetimeMapperCustom unsubscribetimeMapperCustom;
	@Autowired
    private WphOneMapperCustom oneMapperCustom;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");

	private static Logger logger = LogManager.getLogger(CustimExceptionResolver.class);
	
	@Override
	public String getMealAll() {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		
		List<WphMealtypeCustom> menuOne = mealtypeMapper.getMealTypeAndMenu();
		
		List<WphMealmenuCustom> menuTwe = mapperCustom.getMenuBySpecialMealWeek(getWeekByNextDate(new Date()));
		if(menuOne.size()+menuTwe.size() != 0){
			map.put("menuOneList", menuOne);
			map.put("menuTweList", menuTwe);
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}
	
	

	@Override
	public String getHospitalOrCardByCustomerMealOrdinary(String number,String menuFid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		Integer customerState = 0;//患者 获取不到患者
		Integer nursingState = 0; //护理  没定护理，也不是儿童科
		Integer historyState = 0; //历史  获取不到历史
		WphCustomerCustom customer = new WphCustomerCustom();
		if(number.length() == 10){
			customer = customerCustomMapper.getCustomerByCardId(number);//根据卡id
		}else{
			customer = customerCustomMapper.getCustomerByHospitalld(number);//根据住院号
		}
		if(null != customer){
			customerState = 1;//换获取到患者
			map.put("customer", customer);
            Integer oneCountByWorkId = oneMapperCustom.getOneCountByWorkId(customer.getFid());
            if(customer.getWorker() == 0 || oneMapperCustom.getOneCountByWorkId(customer.getFid()) != 0){
                if(customer.getWphWardFid() == 2 || customer.getWphWardFid() == 3){
                    nursingState = 2;//是儿童科，可以订糖餐，儿童餐,不能订普餐
                }else if(mapperCustom.getBoolNursingByCustomerFid(customer.getFid()) != 0){
                    nursingState = 1;//已订护理
                }
                if(nursingState != 0){
                    WphOrderingfoodCustom food = new WphOrderingfoodCustom();
                    food.setCustomerFid(customer.getFid());
                    food.setWphMealmenuFid(Integer.valueOf(menuFid));
                    List<Integer> fids = new ArrayList<Integer>();
                    fids.add(Integer.valueOf(menuFid));fids.add(27);
                    food.setFids(fids);
                    WphOrderingfoodCustom history = new WphOrderingfoodCustom();
                    history = orderingfoodCustomMapper.getHistoryByInfo(food);
                    if(null != history){
                        flag = true;
                        historyState = 1;//能获取历史记录
                        map.put("history", history);
                    }
                }
            }else{
                customerState = 2;//此为未在工作状态的护工，不能订餐
            }
		}
		
		map.put("flag", flag);
		map.put("customerState", customerState);
		map.put("nursingState", nursingState);
		map.put("historyState", historyState);
		
		return JSONObject.fromObject(map).toString();
	}

	
	
	
	
	
	@Override
	public String PaymentMealOrdinaryIng(String info ,String UUID) {
		Map<String,Object> map = new HashMap<String,Object>();
		Integer count = 0;
		Boolean flag = false;
		Boolean moneyFlag = true;//判断金额是否充足
		Boolean bookedFlag = false;

		JSONObject objects = JSONObject.fromObject(info);
		WphOrderingfoodCustom food = (WphOrderingfoodCustom)JSONObject.toBean(objects.getJSONObject("orderingFood"), WphOrderingfoodCustom.class);
		WphOrdering ordering = (WphOrdering)JSONObject.toBean(objects.getJSONObject("ordering"), WphOrdering.class);
		String orderingnumber =  "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+food.getCustomerFid();
		try {
			food.setMealdate(sdf.parse(food.getDatetime()));
			//根据时间的不同，订餐状态不同(接收患者确认订餐)
			List<WphUnsubscribetimeCustom> timeList = unsubscribetimeMapperCustom.getTimeByArrFids(new Integer[]{1,2,3});
			Integer[] mealstate = null;
			
				Calendar c = Calendar.getInstance();  
		        c.setTime(new Date());  
		        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天  
		        
		        if(sdf.parse(food.getDatetime()).getTime() == sdf.parse(sdf.format(c.getTime())).getTime()){
		        	mealstate = new Integer[]{1,1,1};
		        }else{
					long nowTime = sdf2.parse(sdf2.format(new Date())).getTime();
					long starttime1 = sdf2.parse(timeList.get(0).getStarttime()+":00").getTime();
					long endtime1 = sdf2.parse(timeList.get(0).getEndtime()+":00").getTime();
					long starttime2 = sdf2.parse(timeList.get(1).getStarttime()+":00").getTime();
					long endtime2 = sdf2.parse(timeList.get(1).getEndtime()+":00").getTime();
					long starttime3 = sdf2.parse(timeList.get(2).getStarttime()+":00").getTime();
					long endtime3 = sdf2.parse(timeList.get(2).getEndtime()+":00").getTime();
					if(nowTime<starttime1 || nowTime<endtime1){
						mealstate = new Integer[]{1,1,1};
					}else if(nowTime>starttime2 && nowTime<endtime2){
						mealstate = new Integer[]{2,1,1};
					}else if(nowTime>starttime3 && nowTime<endtime3){
						mealstate = new Integer[]{2,2,1};
					}else if(nowTime>endtime3){
						food.setMealdate(sdf.parse(sdf.format(c.getTime())));
						mealstate = new Integer[]{1,1,1};
					}
		        }
			//第一个判断：该患者是否已订餐 第二个判断：该患者属于儿童科，直接可以订多份
			if(mapperCustom.getOrderingCountByInfo(food) == 0 || (ordering.getWphWardFid() == 2 || ordering.getWphWardFid() == 3 ) ){
				bookedFlag = true;//当前时间没有订过普餐类
				if(null != food.getMoney()){//金额为null时，不提交订单
					WphCustomerCustom customer = customerCustomMapper.getCustomerByFid(food.getCustomerFid());
					if(customer.getBalance()<ordering.getMoney()){
						map.put("flag", flag);
						map.put("moneyFlag", moneyFlag);//余额不足
						return JSONObject.fromObject(map).toString();
					}
					
					WphServicedetailsCustom details = servicedetailsMapper.selectByUUid(UUID);
					String[] meal = new String[]{"早餐","午餐","晚餐"};
					food.setOrderingnumber(orderingnumber);	
					
					
					for(int i=0;i<meal.length;i++){
						food.setWphMealtimeName(meal[i]);
						food.setMealstatse(mealstate[i]);
						food.setWphMealtimeFid(i+1);
						count = orderingfoodMapper.insertSelective(food);
					}
					
					ordering.setWphQueryFid(details.getWphQueryFid());
					ordering.setWphServicetypeFid(details.getWphServicetypeFid());
					ordering.setWphServicedetailsFid(details.getFid());
					ordering.setWphInvoicerateFid(2);
					ordering.setOrderingdate(food.getMealdate());
					ordering.setOrderingnumber(orderingnumber);
					ordering.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(customer.getBalance()-food.getMoney())));
					count += orderingMapper.insertSelective(ordering);
					
					//修改患者余额
					customer.setBalance(ordering.getCustomerBalance());
					customerCustomMapper.updateCustomer(customer);
					
					if(count != 0)flag = true;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("webservice-----订餐日期转换错误");
		}
		
		map.put("bookedFlag", bookedFlag);
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}
	

	@Override
	public String PaymentMealSpecialIng(String info) {
		Map<String,Object> map = new HashMap<String,Object>();
		Integer count = 0;
		Boolean flag = false;
		Boolean moneyFlag = true;//判断金额是否充足

		JSONObject objects = JSONObject.fromObject(info);
		Integer customerFid = Integer.parseInt(objects.getString("customerFid"));
		String orderingnumber =  "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+customerFid;//订单号
		Double totalamount = Double.parseDouble(objects.getString("totalamount"));
		JSONArray foodList = objects.getJSONArray("foodList");
//		JSONArray foodList = JSONArray.fromObject(objects.getJSONArray("foodList"));
		Double balance = Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
				 (customerCustomMapper.getCustomerByFid(customerFid).getBalance())));//从数据库里获取患者余额
		//余额验证
		if(totalamount>balance){
			map.put("flag", flag);
			map.put("moneyFlag", moneyFlag);//余额不足
			return JSONObject.fromObject(map).toString();
	 	 }
		
		//添加餐类消费以及总的消费信息
		for(int i=0;i<foodList.size();i++){
			WphOrderingfoodCustom food = (WphOrderingfoodCustom)JSONObject.toBean((JSONObject) foodList.get(i), WphOrderingfoodCustom.class);
			
			try {
				food.setMealdate(sdf.parse(food.getDatetime()));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("定特餐时--------------日期转换错误");
			}
			
			food.setOrderingnumber(orderingnumber);
			count += orderingfoodMapper.insertSelective(food);
			WphOrdering ordering = new WphOrdering();
			ordering.setTitle(food.getTitle());
			ordering.setDepict(food.getDepict());
			ordering.setMoney(food.getMoney());
			ordering.setOrderingstatse(1);
			ordering.setCustomerFid(food.getCustomerFid());
			ordering.setCustomerCarid(food.getCustomerCardid());
			ordering.setCustomerHospitalld(food.getCustomerHospitalld());
			balance = Double.valueOf(new DecimalFormat("#.00").format(balance-food.getMoney()));
			ordering.setCustomerBalance(balance);
			WphServicedetails details = servicedetailsMapper.selectByUUid(food.getUuid());
			ordering.setWphQueryFid(details.getWphQueryFid());
			ordering.setWphServicetypeFid(details.getWphServicetypeFid());
			ordering.setWphServicedetailsFid(details.getFid());
			ordering.setWphInvoicerateFid(2);
			ordering.setOrderingdate(food.getMealdate());
			ordering.setPaytype(5);
			ordering.setOrderingnumber(orderingnumber);
			ordering.setUserFid(food.getUserFid());
			ordering.setUsername(food.getUsername());
			ordering.setUserrole(food.getUserrole());
			ordering.setWphWardFid(food.getWphWardFid());
			count += orderingMapper.insertSelective(ordering);
		}
		
		
		//修改患者余额
		WphCustomerCustom customer = new WphCustomerCustom();
		customer.setFid(customerFid);
		customer.setBalance(Double.valueOf(new DecimalFormat("#.00").format(balance)));
		customerCustomMapper.updateCustomer(customer);
		
		if(count != 0)flag = true;
		
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}
	
	
	
	
	
	/**
	  * 描述：根据当前时间获取明天的星期数（数字）
	  *
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月21日-下午3:59:03
	  */
	 private Integer getWeekByNextDate(Date date){
		 
		 Calendar calendar = Calendar.getInstance();
		 calendar.setTime(date);
		 calendar.add(Calendar.DAY_OF_MONTH, +1);//+1今天的时间加一天
		 
		 SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
		 String format = dateFm.format(calendar.getTime());
		 
			 if ("星期一".equalsIgnoreCase(format)||"Monday".equals(format))
			 	 return 1;
		    else if ("星期二".equalsIgnoreCase(format)||"Tuesday".equals(format))
		    	 return 2;
		    else if ("星期三".equalsIgnoreCase(format)||"Wednesday".equals(format))
		    	 return 3;
		    else if ("星期四".equalsIgnoreCase(format)||"Thursday".equals(format))
		    	 return 4;
		    else if ("星期五".equalsIgnoreCase(format)||"Friday".equals(format))
		    	 return 5;
		    else if ("星期六".equalsIgnoreCase(format)||"Saturday".equals(format))
		    	 return 6;
		    else if ("星期日".equalsIgnoreCase(format)||"Sunday".equals(format))
		        return 7;
		 return 0;
	 }



	@Override
	public String getfoodRetreatByhospitalFid(String hospitalFid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphOrderingfoodCustom> foodList = orderingfoodCustomMapper.getCurrentTweFoodByHospitaFid(hospitalFid);
		
		if(foodList.size()>0){
			flag = true;
			map.put("foodList", foodList);
		}
		
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String FoodRetreatIng(String fids,Integer userFid,String ordernumber ) {
		Map<String,Object> map = new HashMap<String,Object>();
		String[] OrderNumber = ordernumber.split(",");
		//退餐
		orderingfoodCustomMapper.updateFoodStateByFidsArr(fids.split(","));
		//order退餐退费
		for(int i=0;i<OrderNumber.length;i++){
			WphOrderingfoodCustom food = new WphOrderingfoodCustom();
			food.setOrderingnumber(OrderNumber[i]);
			food.setMealstatse(1);
			if(orderingfoodCustomMapper.getFoodListByInfo(food).size() == 0){
				WphOrdering ordering = new WphOrdering();
				ordering.setOrderingnumber(OrderNumber[i]);
				ordering = orderingMapperCustom.getOrderingByInfo(ordering);
				Double balance =  Double.valueOf(new DecimalFormat("#.00").format((customerCustomMapper.getCustomerByHospitalld(ordering.getCustomerHospitalld())//从数据库里获取患者余额
						 .getBalance()+ordering.getMoney())));//消费后的患者余额
				ordering.setFid(null);
				ordering.setOrderingstatse(2);
				ordering.setCustomerBalance(balance);
				ordering.setOldorderingnumber(ordering.getOrderingnumber());
				ordering.setOrderingnumber("std_"+(int) ((Math.random() * 9 + 1) * 10000000)+ordering.getCustomerFid());
				WphUserCustom user = userCustomMapper.getRoleAndUserByUserFid(userFid);
				ordering.setUserFid(user.getFid());
				ordering.setUsername(user.getName());
				ordering.setUserrole(user.getRoleName());
				orderingMapper.insertSelective(ordering);
				
				WphCustomerCustom customer = new WphCustomerCustom();
				customer.setFid(ordering.getCustomerFid());
				customer.setBalance(balance);
				customerCustomMapper.updateCustomer(customer);
			}
		}
		map.put("flag", true);
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String getFoodChangeListByInfo(String datetime, String hospitalFid) {

		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		
		Integer wardFid = customerCustomMapper.getCustomerByHospitalld(hospitalFid).getWphWardFid();
		
		WphOrderingfood food = new WphOrderingfood();
		
		if(wardFid == 2 || wardFid == 3)
			food.setWphMealtypeFid(3);
		else
			food.setWphMealtypeFid(2);
		try {
			food.setMealdate(sdf.parse(datetime));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("获取变餐集合时--------------日期转换错误");
		}
		food.setCustomerHospitalld(hospitalFid);
		
		List<WphMealtimeCustom> timeList = mealtimeMapperCustom.getMealOrderFoodByinfo(food);
		if(timeList.size() != 0){
			map.put("timeList", timeList);
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String ChangeMealIng(String info) {
        Boolean flag = true;
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            WphOrderingfoodCustom food = (WphOrderingfoodCustom)JSONObject.toBean(JSONObject.fromObject(info),WphOrderingfoodCustom.class);
            //修改food
            food.setFid(null);
            WphOrderingfoodExample example = new WphOrderingfoodExample();
            WphOrderingfoodExample.Criteria criteria = example.createCriteria();
            criteria.andOrderingnumberEqualTo(food.getOrderingnumber());
            orderingfoodMapper.updateByExampleSelective(food,example);

            //查询mealmenu中与detail对应的参数
            WphServicedetails detail = servicedetailsMapper.getDetailBymenuFid(food.getWphMealmenuFid());
            //修改order表
            WphOrdering order = new WphOrdering();
            order.setOrderingnumber(food.getOrderingnumber());
            order = orderingMapperCustom.getOrderingByInfo(order);
            order.setWphServicetypeFid(detail.getWphServicetypeFid());
            order.setWphServicedetailsFid(detail.getFid());
            orderingMapper.updateByPrimaryKeySelective(order);
        }catch (Exception e){
            flag = false;
        }
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String MealReserveSummary(String datetime,String wardFid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphMealCustomerApp> list = wardMapperCustom.appMealReserveSummaryByTime(datetime, Integer.valueOf(wardFid));
		if(list.size()>0){
			flag = true;
			map.put("list", list);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	public String mealReserveTcSummary(String datetime,String wardFid){
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphMealCustomerApp> list = wardMapperCustom.mealReserveTcSummary(datetime, Integer.valueOf(wardFid));
		if(list.size()>0){
			map.put("list", list);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	

	
	@Override
	public String getMealMenuListByFids(String fids) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		String[] split = fids.split(",");
		Integer[] arr = new Integer[split.length];
		Integer i=0;
		for(String str : split){
			arr[i++] = Integer.valueOf(str);
		}
		List<WphMealmenu> mealmenuList = mapperCustom.getMealMenuListByFids(arr);
		if(null != mealmenuList){
			map.put("mealList", mealmenuList);
			flag = true;
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}


	@Override
	public String getSpecialList(String hospitalld) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphOrderingfoodCustom> foodList = orderingfoodCustomMapper.getspecialListByInfo(hospitalld);
		if(foodList.size() != 0){
			flag = true;
			map.put("foodList",foodList);
		}
		map.put("flag",flag);
		return JSONObject.fromObject(map).toString();
	}




	@Override
	public String getSpecialListIng(String ordernumber, String hospitalld) {
		Map<String,Object> map = new HashMap<String,Object>();
	 	Boolean flag = false;

		String[] ordernumberArr = ordernumber.split(",");
		WphCustomerCustom customer = customerCustomMapper.getCustomerByHospitalld(hospitalld);
		List<WphOrderingCustom> orderList = orderingMapperCustom.getManyRetreatListByOrderNumber(ordernumberArr);
		Double mm = 0.0;
		for(int i=0;i<orderList.size();i++){
			mm += i==0? mm = orderList.get(i).getMoney()+customer.getBalance():orderList.get(i).getMoney();
			orderList.get(i).setCustomerBalance(mm);
		}
		Integer ordercount = orderingMapperCustom.insertSugarMealOrderList(orderList);
		Integer foodcount = orderingfoodCustomMapper.updateFoodByOrderNumber(2, ordernumberArr);
		customer.setBalance(orderList.get(orderList.size()-1).getCustomerBalance());
		Integer customercount = customerCustomMapper.updateCustomer(customer);
		if((ordercount+foodcount+customercount)>=3){
			flag = true;
			map.put("flag",flag);
		}

		return JSONObject.fromObject(map).toString();
	}


    @Override
    public String getCountByUserFid(String userFid,String datetime) {
        Map<String,Object> map = new HashMap<String,Object>();
        Boolean flag = true;
		WphMealCollect wphMealCollect=orderingMapperCustom.getCountByUserFid(userFid,datetime);
        map.put("mealcount",wphMealCollect.getMealcount());
        map.put("mealmoney",wphMealCollect.getMealmoney());
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }

	@Override
	public String selectMealTcInfo(String datetime,String wardFid){
		Map<String,Object> map = new HashMap<String,Object>();
		boolean flag=false;
		List<WphMealInfo> mealInfoList=customerCustomMapper.selectMealTcInfo(datetime,wardFid);
		if(mealInfoList.size()!=0){
			flag=true;
			for(WphMealInfo info : mealInfoList){
				for (WphMealInfo ordernumber : info.getInfoList() ){
					Double total = 0.0;
					for(WphMealCollect meal : ordernumber.getMealCollectList()){
						total +=meal.getMealmoney();
					}
					ordernumber.setCountMoney(total);
				}
			}
			map.put("mealInfo",mealInfoList);
		}
		map.put("flag",flag);
		return JSONObject.fromObject(map).toString();
	}

	@Override
	public String selectMealPcInfo(String datetime,String wardFid,String mealTimeFid){
		Map<String,Object> map = new HashMap<String,Object>();
		boolean flag=false;
		List<WphMealPcCollect> collectList=orderingfoodCustomMapper.selectMealPcInfo(datetime,wardFid,mealTimeFid);
		if(collectList.size()!=0){
			flag=true;
			map.put("mealInfo",collectList);
		}
		map.put("flag",flag);
		return JSONObject.fromObject(map).toString();
	}
}
