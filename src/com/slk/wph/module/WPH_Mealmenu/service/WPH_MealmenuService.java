package com.slk.wph.module.WPH_Mealmenu.service;

import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;

 public interface WPH_MealmenuService {
	 /**
	  * 描述：根据 餐类类型Fid 获取菜品集合
	  * 	Impl内有区分餐类的 mapper 方法
	  *
	  * @param fid
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月7日-下午2:03:10
	  */
	 public List<WphMealmenuCustom> getMealMenuByFid(Integer typeFid);
	 /**
	  * 描述：添加 or 修改 菜品
	  *
	  * @param custom
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月11日-下午4:59:12
	  */
	 public Integer setOrdinaryByInfo(WphMealmenuCustom custom);
	 /**
	  * 描述：根据 mealmenuTime 中的 state 判断是进行删除 OR 添加数据
	  *
	  * @param mealmenuTime
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月13日-下午3:05:37
	  */
	 public Integer getDeleteOrCreateByMealMenuTime(WphMealmenuTimeCustom mealmenuTime);
	 /**
	  * 描述：获取大于输入fid的fid的数据
	  *
	  * @param fid
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月13日-下午5:04:59
	  */
	 public List<WphMealtype> getMealTypeByGreaterThanFid(Integer fid);
	 /**
	  * 描述：添加类型 WphMealtype
	  *
	  * @param mealtype
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月13日-下午4:36:31
	  */
	 public Integer InsertMealTypeByInfo(WphMealtype mealtype);
	 /**
	  * 描述：根据住院号获取患者信息
	  *
	  * @param hospitalFid
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月17日-下午4:22:27
	  */
	 public WphCustomerCustom getCustomerByHospitalFid(String hospitalId);
	/**
	 * 描述：根据多个mealTypefid获取mealMenu集合 
	 *
	 * @param mealmenu
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午3:42:09
	 */
	public List<WphMealmenuCustom> getMenuByAboutMealTypeFid(WphMealmenuCustom mealmenu);
	/**
	 * 描述：根据 住院号，送餐时间获取 数量
	 *
	 * @param orderingfood
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月19日-上午11:14:24
	 */
	public Integer getOrderingCountByInfo(WphOrderingfood orderingfood);
	/**
	 * 描述：添加普餐类消费信息表以及总消费信息表
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月20日-上午11:47:52
	 */
	public Integer insertOrdinaryOrderingByInfo(WphOrderingfoodCustom food);
	/**
	 * 描述：根据fid获取的角色名称
	 *
	 * @param userFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月20日-上午11:57:48
	 */
	public WphUserCustom getRoleAndUserByUserFid(Integer userFid);
	/**
	 * 描述：更新customer患者信息
	 *
	 * @param customerFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月20日-下午1:17:47
	 */
	public Integer updateCustomerByFid(WphCustomerCustom customer);
	/**
	 * 描述：添加特餐类消费信息表
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月26日-上午10:39:50
	 */
	public Integer insertSpecialOrderingFoodByInfo(WphOrderingfoodCustom food);
	/**
	 * 描述：添加总消费信息表
	 *
	 * @param ordering
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月26日-上午10:40:25
	 */
	public Integer insertOrderingByInfo(WphOrdering ordering);
	/**
	 * 描述：通过患者fid查询是否定制护理（0-否，1-是）
	 *
	 * @param customerFId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月26日-下午4:20:12
	 */
	public Integer getBoolNursingByCustomerFid(Integer customerFId);
	/**
	 * 描述：通过UUID获取对象信息
	 *
	 * @param uuid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-上午10:25:09
	 */
	public WphServicedetails getServiceDetaolsByUUID(String uuid);
	/**
	 * 描述：根据属性获取餐类订单信息
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月31日-下午4:29:50
	 */
	public List<WphOrderingfoodCustom> getfoodRetreatByInfo(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据属性获取餐类信息集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午9:12:02
	 */
	public List<WphOrderingfoodCustom> getFoodListByInfo(WphOrderingfoodCustom custom);
	/**
	 * 描述：修改餐类信息表
	 *
	 * @param food2
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午9:17:35
	 */
	public Integer updateFoodByInfo(WphOrderingfood food2);
	/**
	 * 描述：修改总消费信息表
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午9:19:04
	 */
	public Integer updateOrderingByInfo(WphOrdering custom);
	/**
	 * 描述：根据属性获取总消费信息
	 *
	 * @param ordering
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午9:38:30
	 */
	public WphOrdering getOrderingByInfo(WphOrdering ordering);
	/**
	 * 描述：获取所有病区
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-下午3:02:53
	 */
	public List<WphWardCustom> getWphWardList();
	/**
	 * 描述：根据food信息获取患者集合以及餐类信息集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:04:02
	 */
	public List<WphCustomerCustom> getCustomerAndFoodByFood(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据菜品fid获取菜品
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-下午1:54:07
	 */
	public WphMealmenu selectByPrimaryKey(Integer fid);
	/**
	 * 描述：通过fid获取餐类信息对象
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-下午2:54:42
	 */
	public WphOrderingfood getOrderingFoodByFid(Integer fid);
	/**
	 * 描述：根据fid获取患者信息
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月3日-下午5:34:22
	 */
	public WphCustomerCustom getCustomerByFid(Integer fid);
	/**
	 * 描述：根据food信息获取患者能变普餐的信息
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:04:02
	 */
	public WphCustomerCustom getCustomerAndFoodCByFood(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据fid获取餐品信息，并附带餐类name
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月17日-上午10:48:54
	 */
	public WphMealmenuCustom getMenuAndTypeNameByFid(Integer fid);
	/**
	 * 描述：修改订餐信息orderingfoodcustommapper
	 *
	 * @param food
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月12日-下午5:18:07
	 */
	public Integer updateFoodByInfo2(WphOrderingfood food);

	 /**
	  * 获取VIP国际诊疗中心的用户信息
	  * @param hospitalId 住院号
	  * @param detetime	 时间
	  * @return
	  */
	 public WphCustomerCustom getVIPReserve(String hospitalId);
	 /**
	  * 通过mealType获取mealmenu集合
	  * @param typeFid
	  * @return
	  */
	 public List<WphMealmenuCustom> getMealMenuByTypeFid(Integer typeFid);
	 /**
	  * 进行订VIP餐前的查询
	  * @param food
	  * @return
	  */
	 public WphOrderingfoodCustom getVIPReserveIngBefore(WphOrderingfood food);
	 /**
	  * 通过fid修改患者信息-类型为WphCustomer，不是扩展类
	  * @param customer
	  * @return
	  */
	 public Integer updateCustomerByFid2(WphCustomer customer);
	 /**
	  * 获取所有启用病区，根据fids数组排除fid
	  * @return
	  */
	 public List<WphWardCustom> getNotChildrenWardList(Integer[] fids);
	 /**
	  * 根据属性获取患者订餐的信息（空腹）
	  * @param food
	  * @return
	  */
	 public List<WphCustomerCustom> getInputFactFoodListByInfo(WphOrderingfoodCustom food);
	 /**
	  * 根据时间和住院号获取多类型退餐集合
	  * @param food
	  * @return
	  */
	 public List<WphOrderingfoodCustom> getManyFoodListByInfo(WphOrderingfoodCustom food);
	 /**
	  * 根据订单号获取应退订单（或者集合）
	  * @param orderingNumber
	  * @return
	  */
	 public List<WphOrderingCustom> getManyRetreatListByOrderNumber(String[] orderingNumber);
	 /**
	  *	批量插入order
	  * @param orderList
	  * @return
	  */
	 public Integer insertOrderList(List<WphOrderingCustom> orderList);
	 /**
	  * 根据ordernumber修改food mealstatse状态
	  * @param mealstatse
	  * @param orderingnumber
	  * @return
	  */
	 public Integer updateFoodByOrderNumber(Integer mealstatse, String[] orderingnumber);
	 /**
	  * 通过卡ID或者卡号或者住院号获取患者信息
	  * Create by song on 2018-01-16 16:51:06
	  */
	 public WphCustomerCustom getCustomerByNumber(String number);
	 /**
	  *	根据患者fid和时间，判断患者在指定的时间有没有订普餐
	  * Create by song on 2018-01-16 17:29:07
	  */
	 public Integer getOrdinaryFoodCodeByFid(Integer customerFid,String datetime);

	 public Boolean getOrderingByOldOrderNumber(String number);

     public Integer setFoodByOrderNumber(WphOrderingfood food);

     public WphServicedetails getDetailBymenuFid(Integer menuFid);

     public  WphOrderingfood getFoodLimt1ByOrderNumber(String orderingnumber);
 }