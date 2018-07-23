package com.slk.wph.module.WPH_Mealmenu.service.impl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapper;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingExample;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.mapper.WphMealmenuMapper;
import com.slk.wph.module.WPH_Mealmenu.mapper.WphMealmenuMapperCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Mealmenu_Time.mapper.WphMealmenuTimeMapperCustom;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;
import com.slk.wph.module.WPH_Mealtype.mapper.WphMealtypeMapperCustom;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapper;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapper;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapperCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Unsubscribetime.mapper.WphUnsubscribetimeMapperCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.mapper.WphServicedetailsMapperCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;

@Service
 public class  WPH_MealmenuServiceImpl implements WPH_MealmenuService  {

	@Autowired
	private WphMealmenuMapperCustom mapperCustom;
	@Autowired 
	private WphMealmenuMapper mapper;
	@Autowired
	private WphMealmenuTimeMapperCustom mealmenuTimeMapper;
	@Autowired
	private WphMealtypeMapperCustom mealtypeMapper;
	@Autowired
	private WphCustomerMapper customerMapper;
	@Autowired
	private WphCustomerMapperCustom customerMapperCustom;
	@Autowired
	private WphOrderingMapper orderingMapper;
	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;
	@Autowired
	private WphOrderingfoodMapper orderingfoodMapper;
	@Autowired
	private WphOrderingfoodMapperCustom orderingfoodMapperCustom;
	@Autowired
	private WphUserCustomMapper userMapper;
	@Autowired
	private WphServicedetailsMapperCustom servicedetailsCustom;
	@Autowired
	private WphWardMapperCustom wardMapperCustom;
	@Autowired
	private WphUnsubscribetimeMapperCustom unsubscribetimeMapperCustom;



	private  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	
	
	@Override
	public List<WphMealmenuCustom> getMealMenuByFid(Integer typeFid) {
		//获取菜品的方法共有两种 第一种适用于普餐，儿童餐，治疗餐，第二种适用于特餐 第三种适用于其他
		List<WphMealmenuCustom> mealMenuList = new ArrayList<WphMealmenuCustom>();
		if(typeFid == 2 || typeFid == 3){
			mealMenuList = mapperCustom.getMealMenuOneByTypeFid(typeFid);
		}else if(typeFid == 5){
			mealMenuList = mapperCustom.getMealMenuTweByTypeFid(typeFid);
		}else if(typeFid >= 6){
			mealMenuList = mapperCustom.getMealMenuThreeByTypeFid(typeFid);
		}
		return mealMenuList;
	}

	

	
	@Override
	public Integer setOrdinaryByInfo(WphMealmenuCustom custom) {
		Integer count = 0;
		try {
			if(null == custom.getFid()){
				custom.setImgs(FileUtil.FileImgUp(custom.getMultipartFile(),"wph/std" ));
				count = mapper.insertSelective(custom);
			}else{
				if(!"".equals(custom.getImgs())&&null!=custom.getImgs()){
					custom.setImgs(FileUtil.FileImgUp(custom.getMultipartFile(),"wph/std" ));
				}else{
					custom.setImgs(null);
				}
				count = mapper.updateByPrimaryKeySelective(custom); 
			} 				
		} catch (IllegalStateException e) {
			System.out.println("普餐管理中的上传or修改图片--------------------抛出异常");
			e.printStackTrace();
		}
				
		return count;
	}




	@Override
	public Integer getDeleteOrCreateByMealMenuTime(WphMealmenuTimeCustom mealmenuTime) {
		Integer count = 0;
		if(mealmenuTime.getState() == 0){
			count = mealmenuTimeMapper.deleteMealMenuTimeByInfo(mealmenuTime);//删除
		}else{
			count = mealmenuTimeMapper.insertMealmenuTimeByInfo(mealmenuTime);//插入
		}
		return count;
	}



	@Override
	public Integer InsertMealTypeByInfo(WphMealtype mealtype) {
		int count = mealtypeMapper.InsertMealTypeByInfo(mealtype);
		return count;
	}




	@Override
	public List<WphMealtype> getMealTypeByGreaterThanFid(Integer fid) {
		// TODO Auto-generated method stub
		return mealtypeMapper.getMealTypeByGreaterThanFid(fid);
	}




	@Override
	public WphCustomerCustom getCustomerByHospitalFid(String hospitalId) {
		WphCustomer customer = new WphCustomer();
		customer.setHospitalld(hospitalId);
		return customerMapperCustom.getCustomerByInfo(customer);
	}




	@Override
	public List<WphMealmenuCustom> getMenuByAboutMealTypeFid(WphMealmenuCustom mealmenu) {
		List<WphMealmenuCustom> mealMenuList = new ArrayList<WphMealmenuCustom>();
		//订餐管理-获取 1普餐订餐列表     2获取特餐订餐列表 3获取其他
		if(null != mealmenu.getFids()){
			mealMenuList = mapperCustom.getMenuOrdinaryMealTypeFid(mealmenu);
		}else if(mealmenu.getWphMealtypeFid() == 5){
			mealMenuList = mapperCustom.getMenuBySpecialMealWeek(mealmenu.getWeek());
		}else{
			mealMenuList = mapperCustom.getMenuByOtherMealTypeFid(mealmenu.getWphMealtypeFid());
		}
		return mealMenuList;
	}




	@Override
	public Integer getOrderingCountByInfo(WphOrderingfood orderingfood) {
		// TODO Auto-generated method stub
		return mapperCustom.getOrderingCountByInfo(orderingfood);
	}




	@Override
	public Integer insertOrdinaryOrderingByInfo(WphOrderingfoodCustom food) {
		
		
		List<Integer> fids = new ArrayList<Integer>();
		fids.add(11);
		fids.add(12);
		fids.add(13);
		List<WphUnsubscribetimeCustom> timeList = unsubscribetimeMapperCustom.getTimeByFids(fids);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		WphServicedetailsCustom details = servicedetailsCustom.selectByUUid(food.getUuid());
		
		WphOrdering order = new WphOrdering();
		order.setTitle(food.getTitle());
		order.setDepict(food.getDepict());
		order.setMoney(food.getMoney());
		order.setOrderingstatse(1);
		order.setCustomerFid(food.getCustomerFid());
		order.setCustomerCarid(food.getCustomerCardid());
		order.setCustomerHospitalld(food.getCustomerHospitalld());
		order.setCustomerBalance(food.getCustomerBalance());
		order.setWphInvoicerateFid(2);
		order.setWphQueryFid(details.getWphQueryFid());
		order.setWphServicetypeFid(details.getWphServicetypeFid());
		order.setWphServicedetailsFid(details.getFid());
		order.setOrderingdate(food.getMealdate());//此处ordering表中的orderingdate字段与orderingFood表中的mealdate相同
		order.setPaytype(5);
		order.setOrderingnumber(food.getOrderingnumber());
		order.setUserFid(food.getUserFid());
		order.setUsername(food.getUsername());
		order.setUserrole(food.getUserrole());
		order.setWphWardFid(food.getWphWardFid());
		
		int count = orderingMapper.insertSelective(order);
		
		for(int i=1;i<=3;i++){
			food.setWphMealtimeFid(i);
			if(i == 1)food.setWphMealtimeName("早餐");
			if(i == 2)food.setWphMealtimeName("午餐");
			if(i == 3)food.setWphMealtimeName("晚餐");
				/*food.setLunchfood(food.getDinnerfood());//午餐，晚餐主食通用一个字段Lunchfood   不用了*/

			try {
				if(food.getMealdate().getTime() == sdf2.parse(sdf2.format(new Date())).getTime()){
					long current = sdf.parse(sdf.format(new Date())).getTime();
					long start = sdf.parse(timeList.get(i-1).getStarttime()+":00").getTime();
					long end = sdf.parse(timeList.get(i-1).getEndtime()+":00").getTime();
					if(start<current && current<end)
						food.setMealadd(1); //加餐时间
					else 
						food.setMealadd(0);
				}else{
					food.setMealadd(0);
				}
				
			} catch (Exception e) {
				System.out.println("-------------加餐时间转换出错");
			}
			orderingfoodMapper.insertSelective(food);
		}
		
		return count;
	}




	@Override
	public WphUserCustom getRoleAndUserByUserFid(Integer userFid) {
		// TODO Auto-generated method stub
		return userMapper.getRoleAndUserByUserFid(userFid);
	}




	@Override
	public Integer updateCustomerByFid(WphCustomerCustom customer) {
		// TODO Auto-generated method stub
		return customerMapperCustom.updateCustomer(customer);
	}




	@Override
	public Integer insertSpecialOrderingFoodByInfo(WphOrderingfoodCustom food) {
		// TODO Auto-generated method stub
		return orderingfoodMapper.insertSelective(food);
	}




	@Override
	public Integer insertOrderingByInfo(WphOrdering ordering) {
		// TODO Auto-generated method stub
		return orderingMapper.insertSelective(ordering);
	}




	@Override
	public Integer getBoolNursingByCustomerFid(Integer customerFId) {
		// TODO Auto-generated method stub
		return mapperCustom.getBoolNursingByCustomerFid(customerFId);
	}




	@Override
	public WphServicedetails getServiceDetaolsByUUID(String uuid) {
		// TODO Auto-generated method stub
		return servicedetailsCustom.selectByUUid(uuid);
	}




	@Override
	public List<WphOrderingfoodCustom>  getfoodRetreatByInfo( WphOrderingfoodCustom custom) {
		// TODO Auto-generated method stub
		return orderingfoodMapperCustom.getfoodRetreatByInfo(custom);
	}




	@Override
	public List<WphOrderingfoodCustom> getFoodListByInfo( WphOrderingfoodCustom custom) {
		// TODO Auto-generated method stub
		return orderingfoodMapperCustom.getFoodListByInfo(custom);
	}




	@Override
	public Integer updateFoodByInfo(WphOrderingfood custom) {
		// TODO Auto-generated method stub
		return orderingfoodMapper.updateByPrimaryKeySelective(custom);
	}




	@Override
	public Integer updateOrderingByInfo(WphOrdering custom) {
		// TODO Auto-generated method stub
		return orderingMapper.updateByPrimaryKeySelective(custom);
	}




	@Override
	public WphOrdering getOrderingByInfo(WphOrdering ordering) {
		// TODO Auto-generated method stub
		return orderingMapperCustom.getOrderingByInfo(ordering);
	}




	@Override
	public List<WphWardCustom> getWphWardList() {
		// TODO Auto-generated method stub
		return wardMapperCustom.getWphWardListByStatus();
	}




	@Override
	public List<WphCustomerCustom> getCustomerAndFoodByFood(WphOrderingfoodCustom custom) {
		List<WphCustomerCustom> customerList = new ArrayList<>();
		if(null == custom.getFids()){
			customerList = customerMapperCustom.getCustomerAndFoodIByFood(custom);
		}else if(custom.getFids().get(0) == 4){
			customerList = customerMapperCustom.getCustomerAndFoodSByFood(custom);
		}else{
			customerList = customerMapperCustom.getCustomerAndFoodOByFood(custom);
		}
		
		return customerList;
	}




	@Override
	public WphMealmenu selectByPrimaryKey(Integer fid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(fid);
	}




	@Override
	public WphOrderingfood getOrderingFoodByFid(Integer fid) {
		// TODO Auto-generated method stub
		return  orderingfoodMapper.selectByPrimaryKey(fid);
	}




	@Override
	public WphCustomerCustom getCustomerByFid(Integer fid) {
		// TODO Auto-generated method stub
		return customerMapperCustom.getCustomerByFid(fid);
	}




	@Override
	public WphCustomerCustom getCustomerAndFoodCByFood(WphOrderingfoodCustom custom) {
		// TODO Auto-generated method stub
		return customerMapperCustom.getCustomerAndFoodCByFood(custom);
	}




	@Override
	public WphMealmenuCustom getMenuAndTypeNameByFid(Integer fid) {
		// TODO Auto-generated method stub
		return mapperCustom.getMenuAndTypeNameByFid(fid);
	}




	@Override
	public Integer updateFoodByInfo2(WphOrderingfood food) {
		// TODO Auto-generated method stub
		return orderingfoodMapperCustom.updateByPrimaryKeySelective(food);
	}

	@Override
	public WphCustomerCustom getVIPReserve(String hospitalId) {
		return customerMapperCustom.getVIPReserve(hospitalId);
	}

	@Override
	public List<WphMealmenuCustom> getMealMenuByTypeFid(Integer typeFid) {
		return mapperCustom.getMealMenuByTypeFid(typeFid);
	}
	@Override
	public WphOrderingfoodCustom getVIPReserveIngBefore(WphOrderingfood food) {
		return orderingfoodMapperCustom.getVIPReserveIngBefore(food);
	}

	@Override
	public Integer updateCustomerByFid2(WphCustomer customer) {
		return customerMapper.updateByPrimaryKeySelective(customer);
	}

	@Override
	public List<WphWardCustom> getNotChildrenWardList(Integer[] fids) {
		return wardMapperCustom.getNotChildrenWardList(fids);
	}

	@Override
	public List<WphCustomerCustom> getInputFactFoodListByInfo(WphOrderingfoodCustom food) {
		return customerMapperCustom.getInputFactFoodListByInfo(food);
	}

	@Override
	public List<WphOrderingfoodCustom> getManyFoodListByInfo(WphOrderingfoodCustom food) {
		return orderingfoodMapperCustom.getManyFoodListByInfo(food);
	}

	@Override
	public List<WphOrderingCustom> getManyRetreatListByOrderNumber(String[] orderingNumber) {
		return orderingMapperCustom.getManyRetreatListByOrderNumber(orderingNumber);
	}

	@Override
	public Integer insertOrderList(List<WphOrderingCustom> orderList) {
		return orderingMapperCustom.insertSugarMealOrderList(orderList);
	}

	@Override
	public Integer updateFoodByOrderNumber(Integer mealstatse, String[] orderingnumber) {
		return orderingfoodMapperCustom.updateFoodByOrderNumber(mealstatse,orderingnumber);
	}

	@Override
	public WphCustomerCustom getCustomerByNumber(String number) {
		WphCustomerCustom customer = new WphCustomerCustom();
		if(number.length() == 10){
			customer = customerMapperCustom.getCustomerByCardId(number);
		}else if(number.length() == 8){
			customer = customerMapperCustom.getCustomerByHospitalld(number);
		}else if(number.length() == 6){
			customer = customerMapperCustom.getCustomerByCardNumber(number);
		}
		return customer;
	}

	@Override
	public Integer getOrdinaryFoodCodeByFid(Integer customerFid, String datetime) {
		WphOrderingfoodExample food = new WphOrderingfoodExample();
		WphOrderingfoodExample.Criteria criteria = food.createCriteria();
		criteria.andCustomerFidEqualTo(customerFid);
		criteria.andMealstatseEqualTo(1);
		try {
			criteria.andMealdateEqualTo(df.parse(datetime));
		} catch (ParseException e) {
			System.out.println("getOrdinaryFoodCodeByFid---datetime转换异常-------");
		}
		Integer foodcount = orderingfoodMapper.countByExample(food);
		return foodcount;
	}

    @Override
    public Boolean getOrderingByOldOrderNumber(String number) {
        WphOrderingExample example = new WphOrderingExample();
        WphOrderingExample.Criteria criteria = example.createCriteria();
        criteria.andOldorderingnumberEqualTo(number);
        return orderingMapper.countByExample(example)>0;
    }

    @Override
    public Integer setFoodByOrderNumber(WphOrderingfood food) {
        WphOrderingfoodExample example = new WphOrderingfoodExample();
        WphOrderingfoodExample.Criteria criteria = example.createCriteria();
        criteria.andOrderingnumberEqualTo(food.getOrderingnumber());
        return orderingfoodMapper.updateByExampleSelective(food,example);
    }




    @Override
    public WphServicedetails getDetailBymenuFid(Integer menuFid) {
        return servicedetailsCustom.getDetailBymenuFid(menuFid);
    }

    @Override
    public WphOrderingfood getFoodLimt1ByOrderNumber(String orderingnumber) {
	    WphOrderingfoodExample example = new WphOrderingfoodExample();
        WphOrderingfoodExample.Criteria criteria = example.createCriteria();
        criteria.andOrderingnumberEqualTo(orderingnumber);
        List<WphOrderingfood> foods = orderingfoodMapper.selectByExample(example);
        return foods.get(0);
    }

}