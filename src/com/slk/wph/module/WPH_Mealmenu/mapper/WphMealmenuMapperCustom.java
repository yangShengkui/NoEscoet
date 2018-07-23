package com.slk.wph.module.WPH_Mealmenu.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;


public interface WphMealmenuMapperCustom {
	/**
	 * 描述：第一种通过餐类fid获取菜品的方法（适用于普餐）
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月7日-下午2:09:11
	 */
	public List<WphMealmenuCustom> getMealMenuOneByTypeFid(Integer typeFid);
	/**
	 * 描述：第二种通过餐类fid获取菜品的方法（适用于特餐）
	 *
	 * @param typeFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月12日-下午3:23:16
	 */
	public List<WphMealmenuCustom> getMealMenuTweByTypeFid(Integer typeFid);
	/**
	 * 描述：第三种通过大于此fid的fid获取菜品的方法（适用于其他）
	 *
	 * @param typeFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午5:26:09
	 */
	public List<WphMealmenuCustom> getMealMenuThreeByTypeFid(Integer typeFid);
	/**
	 * 描述：根据多个mealTypefid获取mealMenu集合 
	 *
	 * @param mealmenu
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午3:42:09
	 */
	public List<WphMealmenuCustom> getMenuOrdinaryMealTypeFid(WphMealmenuCustom mealmenu);
	/**
	 * 描述：根据星期和mealType获取特餐菜品 
	 *
	 * @param MealTypeFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月21日-上午10:52:45
	 */
	public List<WphMealmenuCustom> getMenuBySpecialMealWeek(Integer week);
	/**
	 * 描述：根据typefid获取大于此id的所有数据
	 *
	 * @param mealmenu
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午3:42:09
	 */
	public List<WphMealmenuCustom> getMenuByOtherMealTypeFid(Integer MealTypeFid);

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
	 * 描述：根据fids获取菜品集合
	 *
	 * @param fids
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月16日-下午1:20:10
	 */
	public List<WphMealmenu> getMealMenuListByFids(Integer[] fids);
	/**
	 * 通过mealType获取mealmenu集合
	 * @param typeFid
	 * @return
	 */
	public List<WphMealmenuCustom> getMealMenuByTypeFid(Integer typeFid);
}