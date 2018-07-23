package com.slk.wph.module.WPH_Ordering.mapper;

import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Ordering.po.*;
import org.apache.ibatis.annotations.Param;

public interface WphOrderingMapperCustom {
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
	 * 描述：通过住院号获取总消费信息
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:28:22
	 */
	public WphOrderingConsumeInfo getOrderSummaryByHospital(String hospitalId);
	/**
	 * 描述：通过住院号获取总消费信息
	 * 		1.计算当天早上倘若在退餐（早餐）时间之外出院，将当天的餐费以及明天所有类型的的餐费退换到卡内余额
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:28:22
	 */
	public WphOrderingConsumeInfo getOrderSummaryByHospital2(String hospitalId);
	/**
	 * 描述：通过住院号显示要退费的订单信息
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月22日-下午1:48:14
	 */
	public List<WphOrderingCustom> getRetreatMoneyByHospitalld(String[] ordernumbers);
	/**
	 * 
	 *描述:护理汇总
	 *@param date
	 *@param wardFid
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年8月21日
	 */
	public List<WphOrderingCustom> selectNursingHZ(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("wardFid")Integer wardFid,@Param("type")Integer type);
	
	/**
	 * 
	 *描述:办血费用汇总
	 *@param date
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月22日
	 */
	public List<WphOrderingCustom> selectWphBloodHZ(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("wardFid")Integer wardFid,@Param("type")Integer type);
	/**
	 * 
	 *描述:一对一明细
	 *@param date
	 *@param wardFid
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年8月24日
	 */
	public List<WphOrderingCustom>selectOnephmx(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("wardFid")Integer wardFid,@Param("type")Integer type);
	/**
	 * 描述：患者明细查询
	 *
	 * @param ordering
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月23日-下午1:52:43
	 */
	public List<WphOrderingCustom> getOrderListByInfo(WphOrdering ordering);
	/**
	 * 描述：收费查询汇总
	 *
	 * @param ordering
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月25日-上午9:05:45
	 */
	public List<WphOrderingCustom> tollInquirySummary(WphOrdering ordering);
	/**
	 * 描述：实收总汇总
	 *
	 * @param orderingCustom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-上午10:40:41
	 */
	public List<WphOrderingCustom> getTotalCollection(WphOrdering orderingCustom);
	/**
	 * 描述：实收餐费汇总
	 *
	 * @param orderingCustom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-上午10:40:41
	 */
	public List<WphOrderingCustom> getMeal_collection(WphOrdering orderingCustom);
	/**
	 * 描述：患者明细查询汇总
	 *
	 * @param orderingCustom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-上午10:40:41
	 */
	public List<WphOrderingCustom> getPatientdetails(WphOrdering orderingCustom);
	/**
	 * 描述：患者明细查询汇总-专对护理
	 *
	 * @param orderingCustom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-上午10:40:41
	 */
	public List<WphOrderingCustom> getPatientdetailsNursing(WphOrdering orderingCustom);
	/**
	 * 描述：获取自动订糖餐集合2
	 *
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月27日-下午4:09:09
	 */
	public List<WphOrderingCustom> getSugarMealList();
	/**
	 * 描述：批量订糖餐-总消费信息表
	 *
	 * @param orderList
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月30日-下午4:44:09
	 */
	public Integer insertSugarMealOrderList(List<WphOrderingCustom> orderList);
	/**
	 * 描述：批量订糖餐-餐消费信息表
	 *
	 * @param orderList
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月30日-下午4:44:09
	 */
	public Integer insertSugarMealFoodList(List<WphOrderingCustom> orderList);
	/**
	 * 描述：批量修改患者余额
	 *
	 * @param orderList
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月30日-下午4:44:31
	 */
	public Integer updateSugarCustomerList(List<WphOrderingCustom> orderList);
	/**
	 * 通过住院号获取患者是否出院
	 * @param HospitalId
	 * @return
	 */
	public Integer getOutHospitalByHospitalId(String HospitalId);
	/**
	 * 根据订单号获取应退订单（或者集合）
	 * @param orderingNumber
	 * @return
	 */
	public List<WphOrderingCustom> getManyRetreatListByOrderNumber(String[] orderingnumber);

	/**
	 *
	 * @param ordernumbers
	 * @return
	 */
	public String getRetreaOrdernumbers(String hospitalld);
	/**
	 * 获取连续三天订理信息
	 * Create by song on 2018-02-10 15:57:52
	 */
	public List<WphOrdering> selectThreeOrding();

	/**
	 * 特餐汇总 ---app
	 * @param userFid
	 * @return
	 */
	public WphMealCollect getCountByUserFid(@Param("userFid")String userFid,@Param("datetime")String datetime);

    public List<WphMealInfo> mealInfoByCardNumber(@Param("datetime") String datetime, @Param("cardNumber")String cardNumber);
}