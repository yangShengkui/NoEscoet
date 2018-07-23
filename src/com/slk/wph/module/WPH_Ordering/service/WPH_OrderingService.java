package com.slk.wph.module.WPH_Ordering.service;

import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Query.po.WphQuery;
import com.slk.wph.module.WPH_Query.po.WphQueryCustom;
import com.slk.wph.module.WPH_Servicetype.po.WphServicetypeCustom;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

public interface WPH_OrderingService {
	/**
	 * 
	 * 描述:实收陪护汇总
	 * 
	 * @param date
	 * @param wardFid
	 * @param type
	 * @return 创建人:赵福岭 2017年8月18日
	 */
	public List<WphOrderingCustom> selectNursingHZ(Date startDate,Date endDate,Integer wardFid,Integer type);

	/**
	 * 
	 * 描述:根据日期，病区查询办血服务信息
	 * 
	 * @param date
	 * @param wardFid
	 * @return 创建人:赵福岭 2017年8月22日
	 */
	public List<WphOrderingCustom> selectWphBloodHZ(Date startDate,Date endDate,Integer wardFid,Integer type);
	
	/**
	 * 
	 *描述:一对一明细查询
	 *@param date
	 *@param wardFid
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年8月24日
	 */

	public List<WphOrderingCustom>selectOnephmx(Date startDate,Date endDate,Integer wardFid,Integer type);
	
	/**
	 * 
	 *描述:
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年8月24日
	 */
	public List<WphNursinggradeCustom> selectNursing(Integer type);
	/**
	 * 获取所有已开启的病区
	 *描述:
	 *@return
	 *创建人:赵福岭
	 *2017年8月22日
	 */
	public  List<WphWardCustom> getWphWardListByStatus();
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
	 * 描述：通过userFid获取user信息
	 *
	 * @param userFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月23日-下午5:21:54
	 */
	public WphUser getUserByFid(Integer userFid);
	/**
	 * 描述：获取消费类型
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月23日-下午5:27:44
	 */
	List<WphQuery> getQueryAll();
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
 	 * 描述：通过roleFids获取user用户集合
 	 *
 	 * @param roleFids
 	 * @return
 	 *
 	 * 创  建  人：宋现亮
 	 * 创建时间：2017年8月25日-上午11:57:19
 	 */
 	public List<WphUser> getUserListByRoleFids(List<Integer> roleFids);
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
	 * 描述：通过query获取服务类型以及服务明细集合
	 *
	 * @param queryFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-下午5:19:15
	 */
	public List<WphServicetypeCustom> getServiceTypeAndDetailsByQuery(Integer queryFid);
	/**
	 * 描述：获取所有服务类型以及服务明细集合
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月1日-上午9:42:05
	 */
	public List<WphServicetypeCustom> getServiceTypeAndDetailsByQueryAll();
	/**
	 * 描述：获取消费类型集合以及子集合
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月1日-上午9:57:50
	 */
	List<WphQueryCustom> getQueryAllSubordinate();
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
	 * 描述：通过住院号获取自动退卡退费的患者
	 *
	 * @param hospitalld
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午4:10:34
	 */
	public WphCustomerCustom getRetreatCardFeeCustomerByhos(String hospitalld);
	/**
	 * 描述：退卡退费信息汇总
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午5:19:37
	 */
	public List<WphCustomerCustom> RetreatCardFee_Summary(WphOrderingCustom order);
}