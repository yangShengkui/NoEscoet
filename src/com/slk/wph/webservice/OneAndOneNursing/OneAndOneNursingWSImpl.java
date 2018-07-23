package com.slk.wph.webservice.OneAndOneNursing;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Onursing.po.WphNursingMessage;
import com.slk.wph.module.WPH_Onursing.po.WphOnursing;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.mapper.WphServicedetailsMapperCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class OneAndOneNursingWSImpl implements OneAndOneNursingWS {

	DecimalFormat df = new java.text.DecimalFormat("#0.00");
	@Autowired
	private WphOrderingnursingMapperCustom mapperCustom;
	@Autowired
	private WphServicedetailsMapperCustom detailsMapper;
	SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat formats = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public Date fordate(String date){
		Date newdate=null; 
		try {
			newdate=format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newdate;
	} 
	
	@Override
	public String selectCustomerNursingType(String userFid, String cardNumber,String hospita, String date) {
		Map<String,Object> map = new HashMap<String,Object>();
		Date fordate = null;
		Boolean flag = false;
		try {
			fordate = format.parse(date);
			// 得到患者信息 
			WphCustomerCustom wphCustomerCustom = mapperCustom.selectByCardIdOrHospita(cardNumber, hospita);
			if (wphCustomerCustom != null) {// 卡号或者住院号是否能查到患者
				// 患者是否在用户管辖范围内并且患者已经办理住院
				if (mapperCustom.selectCountByUserFid(Integer.parseInt(userFid),wphCustomerCustom.getWphWardFid()) > 0&& wphCustomerCustom.getHospitalldstatus() == 1) {
					flag = true;
					// 用户是否办理护理
					if (mapperCustom.selectNursinggradeByCusFidAndDate(wphCustomerCustom.getFid(), fordate) > 0) {
						//
						wphCustomerCustom = mapperCustom.selectCustomerNursingType(cardNumber, hospita,fordate);
						if("2".equals(wphCustomerCustom.getNursingGType())){
							WphOneCustom wphone=mapperCustom.selectWphOneByCustomerFid(wphCustomerCustom.getFid());
							map.put("imgs", wphone.getImgs());
						}
					}
				}
				map.put("wphCustomerCustom", wphCustomerCustom);// 患者
				map.put("nursingGradeList", mapperCustom.selectNursingGradeByWardFid(wphCustomerCustom.getWphWardFid(), 2));// 一对一护理等级
				map.put("workerList", mapperCustom.selectWorker());// 护工
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	@Override
	public String reserveNursing(String json,String imgs) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphOnursing unur = (WphOnursing) JSONObject.toBean(JSONObject.fromObject(json), WphOnursing.class);
		
		WphCustomerCustom customer = mapperCustom.getCustomerByFid(unur.getCustomerFid()[0]);
		WphWardOmCustom wardOm = mapperCustom.selectWardOmCustom(customer.getWphWardFid(), unur.getWphNursinggradeFid(), 2);
		Double m = Double.parseDouble(df.format(customer.getBalance()- wardOm.getMoney()));
		// 得到选取的护理等级信息
		WphNursinggradeCustom ngc = mapperCustom.selectNursingGradeByFid(unur.getWphNursinggradeFid(),customer.getWphWardFid(),2);
		// 服务信息
		WphServicedetailsCustom wsc = detailsMapper.selectByUUid(ngc.getUuid());
		// 获取登录用户信息
		WphUserCustom user = mapperCustom.getRoleAndUserByUser(unur.getUserFid());
		if(customer.getHospitalldstatus()!=1){
			map.put("message", customer.getName() + "该患者未办理住院");
			map.put("flag", false);
			return JSONObject.fromObject(map).toString();
		}
		if (mapperCustom.selectNursinggradeByCusFidAndDate(customer.getFid(), fordate(unur.getDate())) > 0) {
			map.put("message", customer.getName() + "该患者已订护理");
			map.put("flag", false);
			return JSONObject.fromObject(map).toString();
		}
		if (m > 0) {
			try {
				String ordingND = "phd_" + randmon(customer.getFid());
				// 保存到 一对一信息表
				WphOneCustom wphOne = new WphOneCustom();
				wphOne.setWphWardFid(customer.getWphWardFid());
				wphOne.setWphNursinggradeFid(unur.getWphNursinggradeFid());
				wphOne.setCustomerFid(customer.getFid());
				wphOne.setWorkersFid(unur.getWorkerFid());
				wphOne.setStartdate(formats.parse(unur.getStartDate()));
				wphOne.setEnddate(formats.parse(unur.getEndDate()));
				wphOne.setMoney(wardOm.getMoney());
				wphOne.setUserFid(unur.getUserFid());
				wphOne.setImgs(imgs);
				WphOrdering orderingd = new WphOrdering();
				orderingd.setTitle("一对一护理费用");
				orderingd.setDepict("一对一护理费用扣除");
				orderingd.setMoney(wardOm.getMoney());
				orderingd.setOrderingstatse(1);
				orderingd.setCustomerFid(customer.getFid());
				orderingd.setCustomerCarid(customer.getWphCardNumber());
				orderingd.setCustomerHospitalld(customer.getHospitalld());
				orderingd.setCustomerBalance(m);
				orderingd.setWphInvoicerateFid(1);// 所属发票类别(护理、餐费、其他等)
				orderingd.setWphQueryFid(wsc.getWphQueryFid());// 消费类型(护理/用血/餐费/延伸服务)
				// 服务类型(一对一，一对多，办血服务费，特餐，普餐，治疗餐)
				orderingd.setWphServicetypeFid(wsc.getWphServicetypeFid());
				// 服务明细(几级护理，办血服务费，办血费用，流餐，半流餐，普餐，回餐，糖餐，肠内)
				orderingd.setUserFid(user.getFid());
				orderingd.setWphServicedetailsFid(wsc.getFid());
				orderingd.setOrderingdate(new Date());
				orderingd.setPaytype(5);
				orderingd.setOrderingnumber(ordingND);
				orderingd.setUsername(user.getName());
				orderingd.setUserrole(user.getRoleName());
				orderingd.setNotes(unur.getNotes());
				orderingd.setWphWardFid(customer.getWphWardFid());
				mapperCustom.insertSelective(wphOne);
				// 保存消费信息
				// 保存到护理定消费信息表
				WphOrderingnursingCustom orderingnursingd = new WphOrderingnursingCustom();
				orderingnursingd.setOrderingnumber(ordingND);// 订单编号
				orderingnursingd.setTitle("一对一护理费用");
				orderingnursingd.setDepict("一对一护理费用扣除");
				orderingnursingd.setWphWardOmFid(wardOm.getFid());
				orderingnursingd.setNursingName(ngc.getName());
				orderingnursingd.setMoney(wardOm.getMoney());
				orderingnursingd.setNursingstates(1);
				orderingnursingd.setCustomerFid(customer.getFid());
				orderingnursingd.setCustomerHospitalld(customer.getHospitalld());
				orderingnursingd.setNursingType(2);
				orderingnursingd.setCustomerCardid(customer.getWphCardNumber());
				orderingnursingd.setWphOneFid(wphOne.getFid());
				orderingnursingd.setWorkersFid(wphOne.getWorkersFid());
				orderingnursingd.setNotes(unur.getNotes());
				orderingnursingd.setUserFid(user.getFid());
				orderingnursingd.setNursingdate(format.parse(unur.getStartDate()));
				orderingnursingd.setUsername(user.getName());
				orderingnursingd.setUserrole(user.getRoleName());
				customer.setBalance(m);
				mapperCustom.insertWphOrderingnursing(orderingnursingd);
				mapperCustom.insertOrdering(orderingd);
				mapperCustom.updateCustomer(customer);
				//修改护工的病区
				//WphCustomerCustom worker = mapperCustom.getCustomerByFid();
				//worker.setWphWardFid(customer.getWphWardFid());
				mapperCustom.updateWork(unur.getWorkerFid(),customer.getWphWardFid());
				flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			map.put("message", "余额不足");
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	//查询所有病区
	@Override
	public String selectWardList(String userFid) {
		// TODO Auto-generated method stub
		Boolean flag = false;
		Map<String,Object> map = new HashMap<String,Object>();
		List<WphWardCustom> list = mapperCustom.selectWardListByUserFid(Integer.parseInt(userFid));
		if (list.size() > 0) {
			flag = true;
			map.put("wardList", list);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	//查询所有定理的患者--此处应改为按病区+日期查询
	@Override
	public String selectCustomerByWardAndDate(String wardFid, String date) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		try {
			List<WphCustomerCustom> list = mapperCustom.selectCustomerByWardAndDate(Integer.parseInt(wardFid),format.parse(date),2);
			if (list.size() > 0) {
				flag = true;
				map.put("customerList", list);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	//陪护信息
	@Override
	public String selectWphNursingMessage(String customerFid, String date) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphNursingMessage wnm = null;

        System.out.println("---------"+Integer.parseInt(customerFid));
        try {

            Date  newDate=formats.parse(date);
			WphCustomerCustom customer = mapperCustom.getCustomerByFid(Integer.parseInt(customerFid));
			if(customer.getWorker()==1){
				map.put("flag", flag);
				return JSONObject.fromObject(map).toString();
			}
			WphOneCustom one = mapperCustom.selectWphOneByCustomerFid(Integer.parseInt(customerFid));//无问题
			WphWardOmCustom wardOm = mapperCustom.selectWardOmCustom(customer.getWphWardFid(), one.getWphNursinggradeFid(), 2);
			Double totalMoeny = mapperCustom.totalCost(one.getFid(),one.getStartdate(),one.getTrueenddate()==null?one.getEnddate():one.getTrueenddate());

			// 每小时金额
			int day=differentDays(one.getStartdate(),newDate);
			double priceHours = wardOm.getMoney();
			wnm = new WphNursingMessage(); 
			wnm.setBalance(customer.getBalance());//患者余额
			wnm.setPriceMoney(priceHours);//单价
			wnm.setStartdate(formats.format(one.getStartdate()));//开始时间
			wnm.setTotalTime(day);//天
			wnm.setNowMoney(totalMoeny);//系统已扣费用
			wnm.setRealityMoney(totalMoeny-priceHours);//系统已扣费用-一天护理费用

        } catch (Exception e) {
            e.getStackTrace();
        }
		if (wnm != null) {
			flag = true;
			map.put("WphOneCustom", wnm);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	//退订
	@Override
	public String unsubscribe(String json) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphOnursing unur = (WphOnursing) JSONObject.toBean(JSONObject.fromObject(json), WphOnursing.class);
		WphOneCustom one = mapperCustom.selectWphOneByCustomerFid(unur.getCustomerFid()[0]);
		WphUserCustom user = mapperCustom.getRoleAndUserByUser(unur.getUserFid());
		//Double totalMoeny = mapperCustom.totalCost(one.getFid(),one.getStartdate(),one.getTrueenddate()==null?one.getEnddate():one.getTrueenddate() );
		WphCustomerCustom customer = mapperCustom.getCustomerByFid(unur.getCustomerFid()[0]);// 患者
		if(customer.getWorker()==1){
			map.put("flag", flag);
			return JSONObject.fromObject(map).toString();
		}
		Double balance = customer.getBalance() + unur.getMoney();

			try {
				//护理信息
				WphOrderingnursingCustom orderingByCustomer = mapperCustom.selectOrderingByCustomerFid(customer.getFid(),fordate(unur.getDate()),2);
				
				if(orderingByCustomer==null){
					map.put("message", customer.getName() + "该患者未订护理");
					map.put("flag", false);
					return JSONObject.fromObject(map).toString();
				}
				String ordingND = "phd_" + randmon(customer.getFid());
				WphOrderingCustom orderingCustom= mapperCustom.selectOrderingByCustomer(orderingByCustomer.getOrderingnumber());
				String oldOrderingnumber=orderingByCustomer.getOrderingnumber();;
				//退费0元
				//return null;
				/*if(unur.getMoney()-totalMoeny>=0){
					money=unur.getMoney()-totalMoeny;
					orderingCustom.setMoney(orderingCustom.getMoney()+money);
					orderingByCustomer.setMoney(orderingByCustomer.getMoney()+money);
					mapperCustom.updateOrdringnursing(orderingByCustomer);
					mapperCustom.updateOrdering(orderingCustom);
					insertOrderingnursing("一对一护理费用", "一对一护理费用退费", oldOrderingnumber, 
							orderingByCustomer.getWphWardOmFid(), 
							orderingByCustomer.getNursingName(), 
							 2, customer.getFid(), 
							customer.getHospitalld(),
							orderingByCustomer.getNursingType(),
							orderingByCustomer.getWphOneFid(),
							orderingByCustomer.getWorkersFid(),
							orderingByCustomer.getCustomerCardid(),
							balance,0.0, new Date(), ordingND, user.getName(),
							user.getName(), null, user.getFid());
					insertOrdering("一对一护理费用", "一对一护理费用退费",ordingND,oldOrderingnumber,2,
							customer.getFid(), customer.getWphCardNumber(), customer.getHospitalld(),
							balance,1, orderingCustom.getWphQueryFid(), orderingCustom.getWphServicetypeFid(),new Date(), 5, 
							 user.getName(), user.getRoleName(), unur.getNotes(), 
							 customer.getWphWardFid(),user.getFid(),orderingCustom.getWphServicedetailsFid(),0.0);
					
					
				}else{*/
					insertOrderingnursing("一对一护理费用", "一对一护理费用退费", oldOrderingnumber, 
							orderingByCustomer.getWphWardOmFid(), 
							orderingByCustomer.getNursingName(), 
							 2, customer.getFid(), 
							customer.getHospitalld(),
							orderingByCustomer.getNursingType(),
							orderingByCustomer.getWphOneFid(),
							orderingByCustomer.getWorkersFid(),
							orderingByCustomer.getCustomerCardid(),
							balance,unur.getMoney(), format.parse(format.format(new Date())), ordingND, user.getName(),
							user.getName(), null, user.getFid());
					insertOrdering(
							"一对一护理费用",
							"一对一护理费用退费",
							ordingND,
							oldOrderingnumber,
							2,
							customer.getFid(),
							customer.getWphCardNumber(),
							customer.getHospitalld(),
							balance,
							1,
							orderingCustom.getWphQueryFid(),
							orderingCustom.getWphServicetypeFid(),
							formats.parse(formats.format(new Date())),
							5, 
						    user.getName(),
							 user.getRoleName(),
							 unur.getNotes(), 
							 customer.getWphWardFid(),
							 user.getFid(),
							 orderingCustom.getWphServicedetailsFid(),
							unur.getMoney());
				//}
				one.setWorkermoney(mapperCustom.selectWardOmByFid(orderingByCustomer.getWphWardOmFid()).getWages());
				one.setStatse(1);
				one.setTrueenddate(formats.parse(formats.format(new Date())));
				mapperCustom.updateByWphOne(one);
				customer.setBalance(balance);
				mapperCustom.updateCustomer(customer);
				//修改护工状态为  空闲
				mapperCustom.updateWorkStatus(one.getWorkersFid(),0);
				flag = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	public String randmon(Integer cusFid) {
		StringBuilder str = new StringBuilder();// 定义变长字符串
		Random random = new Random();
		// 随机生成数字，并添加到字符串
		for (int i = 0; i < 8; i++) {
			str.append(random.nextInt(10));
		}
		str.append(cusFid);
		// 将字符串转换为数字并输出
		return str.toString();
	}
	//插入消费信息表
	public void insertOrdering(String title,String depict,String orderingnumber,String oldOrderingnumber,Integer orderingstatse,
			Integer customerFid,String customerCarid,String customerHospitalld,double customerBalance,
			Integer wphInvoicerateFid,Integer wphQueryFid,Integer wphServicetypeFid,Date Orderingdate,
			Integer payType,String username,String userrole,String notes,
			Integer wphWardFid,Integer userFid,Integer servicedetailsFid,double money){

		WphOrdering orderingd = new WphOrdering();
		orderingd.setTitle(title);
		orderingd.setDepict(depict);
		orderingd.setOrderingnumber(orderingnumber);
		orderingd.setOldorderingnumber(oldOrderingnumber);
		orderingd.setOrderingstatse(orderingstatse);// 退费
		orderingd.setCustomerFid(customerFid);
		orderingd.setCustomerCarid(customerCarid);
		orderingd.setCustomerHospitalld(customerHospitalld);
		orderingd.setCustomerBalance(customerBalance);
		orderingd.setWphInvoicerateFid(wphInvoicerateFid);// 所属发票类别(护理、餐费、其他等)
		orderingd.setWphQueryFid(wphQueryFid);// 消费类型(护理/用血/餐费/延伸服务)
		// 服务类型(一对一，一对多，办血服务费，特餐，普餐，治疗餐)
		orderingd.setWphServicetypeFid(wphServicetypeFid);
		// 服务明细(几级护理，办血服务费，办血费用，流餐，半流餐，普餐，回餐，糖餐，肠内)
		orderingd.setUserFid(userFid);
		orderingd.setWphServicedetailsFid(servicedetailsFid);
		orderingd.setOrderingdate(new Date());
		orderingd.setPaytype(payType);
		orderingd.setUsername(username);
		orderingd.setUserrole(userrole);
		orderingd.setNotes(notes);
		orderingd.setWphWardFid(wphWardFid);
		orderingd.setMoney(money);
		mapperCustom.insertOrdering(orderingd);
	}
	//插入护理信息表

	public void insertOrderingnursing(
			String title,
			String depict,
			String oldOrderingnumber,
			Integer wphWardOmFid,
			String nuringName,
			Integer nursingstates,
			Integer customerFid,
			String customerHospitalld,
			Integer nuringType,
			Integer wphOneFid,
			Integer workersFid,
			String customerCarid,
			double customerBalance,
			double money,
			Date Orderingdate,
			String orderingnumber,
			String username,
			String userrole,
			String notes,
			Integer userFid) throws ParseException{
		WphOrderingnursingCustom orderingnursing = new WphOrderingnursingCustom();
		orderingnursing.setOrderingnumber(orderingnumber);// 订单编号
		orderingnursing.setOldOrderingnumber(oldOrderingnumber);
		orderingnursing.setTitle(title);
		orderingnursing.setDepict(depict);
		orderingnursing.setMoney(money);
		orderingnursing.setWphWardOmFid(wphWardOmFid);// 关联表fid
		orderingnursing.setNursingName(nuringName);// 护理名称
		orderingnursing.setNursingstates(nursingstates);// 退费
		orderingnursing.setCustomerFid(customerFid);// 患者fid
		orderingnursing.setCustomerHospitalld(customerHospitalld);// 住院号
		orderingnursing.setNursingType(nuringType);// 护理类型
		orderingnursing.setWphOneFid(wphOneFid);// 一对一护理表Fid
		orderingnursing.setWorkersFid(workersFid);// 护工的Fid
		orderingnursing.setCustomerCardid(customerCarid);// 患者卡号
		orderingnursing.setNursingdate(format.parse(format.format(new Date())));
		orderingnursing.setNotes(notes);//
		orderingnursing.setUserFid(userFid);
		orderingnursing.setUsername(username);
		orderingnursing.setUserrole(userrole);
		mapperCustom.insertWphOrderingnursing(orderingnursing);
		
	}

	private int differentDays(Date date1,Date date2)
	{
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int day1= cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);
		System.out.println("判断day2 - day1 : " + (day2-day1));
		return day2-day1;

	}
}
