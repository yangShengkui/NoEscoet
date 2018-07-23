package com.slk.wph.module.WPH_Orderingfood.service;

import java.util.List;

import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

 public interface WPH_OrderingfoodService {
	/**
	 * 描述：根据餐类信息表属性获取 患者订餐信息
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月15日-下午4:57:31
	 */
	public List<WphOrderingfoodCustom> getCustomerOrderingFoodByInfo(WphOrderingfoodCustom food);
	/**
	 * 描述：根据餐类信息表属性获取 患者所有订单信息
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月15日-下午4:57:31
	 */
	public List<WphOrderingfoodCustom> getCustomerOrderingAllByInfo(WphOrderingfoodCustom food);
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
	 * 描述：通过餐类类型获取餐品集合
	 *
	 * @param typeFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月16日-下午3:49:28
	 */
	public List<WphMealmenuCustom> getMealMenuByTypeFid(Integer typeFid);
	/**
	 * 描述：获取餐类型以及餐品（所有）
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午4:22:18
	 */
	public List<WphMealtypeCustom> getMealTypeAndMenuAll();
	 /**
	  * 获取特餐打印集合
	  * @param food
	  * @return
	  */
	 public List<WphOrderingfoodCustom> getSpecialPrintListByInfo(WphOrderingfoodCustom food);
	 /**
	  * 描述：根据住院号、日期 查询 患者的餐品信息
	  * @return
	  */
	 public List<WphOrderingfoodCustom> selectFoodInfoHospitalld(String startDate, String endDate, String hospitalld);

}