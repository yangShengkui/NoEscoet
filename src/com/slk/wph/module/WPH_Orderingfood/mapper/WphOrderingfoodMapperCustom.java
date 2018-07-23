package com.slk.wph.module.WPH_Orderingfood.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphMealCollect;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphMealPcCollect;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import org.apache.ibatis.annotations.Param;

import javax.jws.WebParam;

public interface WphOrderingfoodMapperCustom {
	/**
	 * 描述：根据患者fid and 菜品fid 获取最新的一条信息
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午4:49:49
	 */
	public WphOrderingfoodCustom getHistoryByInfo(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据属性获取餐类订单信息
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月31日-下午4:29:50
	 */
	public List<WphOrderingfoodCustom>  getfoodRetreatByInfo(WphOrderingfoodCustom custom);
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
	 * 描述：通过退餐时间限制  and fids获取能退餐的集合
	 * 
	 * @param fids
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月7日-下午5:04:56
	 */
	public List<WphOrderingfoodCustom> getFidsTimeLimtByFids(List<Integer> fids);
	/**
	 * 描述：根据住院号获取当前今天和明天能退餐的普餐
	 *
	 * @param hospitaFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月8日-上午8:58:56
	 */
	public List<WphOrderingfoodCustom> getCurrentTweFoodByHospitaFid(String hospitaFid);
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
	 * 描述：获取出院结算应退的餐类集合
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-下午4:19:43
	 */
	public List<WphOrderingfoodCustom> getOrderingfoodRetreatByHospitalId(String hospitalId);
	/**
	 * 描述：根据订单号修改addFood（是否加主食）
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月29日-下午5:26:20
	 */
	public Integer updateAddFoodByOrderNumber(WphOrderingfood food);
	/**
	 * 描述：获取可以自动定糖餐的
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月4日-上午11:03:01
	 */
	public List<WphOrderingfoodCustom> getSugarMealList();
	/**
	 * 描述：修改订餐信息表
	 *
	 * @param food
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月12日-下午4:54:51
	 */
	public Integer updateByPrimaryKeySelective(WphOrderingfood food);
	/**
	 * 进行订VIP餐前的查询
	 * @param food
	 * @return
	 */
	public WphOrderingfoodCustom getVIPReserveIngBefore(WphOrderingfood food);
	/**
	 * 根据时间和住院号获取多类型退餐集合
	 * @param food
	 * @return
	 */
	public List<WphOrderingfoodCustom> getManyFoodListByInfo(WphOrderingfoodCustom food);
	/**
	 * APP根据时间和住院号获取多类型退餐集合
	 * @param hospitalld
	 * @return
	 */
	public List<WphOrderingfoodCustom> getspecialListByInfo(String hospitalld);
	/**
	 * 根据ordernumber修改food mealstatse状态
	 * @param mealstatse
	 * @param orderingnumber
	 * @return
	 */
	public Integer updateFoodByOrderNumber(@Param("mealstatse") Integer mealstatse, @Param("orderingnumber") String[] orderingnumber);
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
	public List<WphOrderingfoodCustom> selectFoodInfoHospitalld(@Param("startDate") String startDate, @Param("endDate")String endDate,  @Param("hospitalld")String hospitalld);
	/**
	 *	根据fids修改food-->mealState为2
	 * @param fidsArr
	 * @return
	 */
	public Integer updateFoodStateByFidsArr(String[] fidsArr);

	/**
	 * 查询普餐汇总信息
	 * @param datetime
	 * @param wardFid
	 * @param mealTimeFid
	 * @return
	 */
	public List<WphMealPcCollect> selectMealPcInfo(@Param("datetime") String datetime, @Param("wardFid")String wardFid, @Param("mealTimeFid")String mealTimeFid);
}