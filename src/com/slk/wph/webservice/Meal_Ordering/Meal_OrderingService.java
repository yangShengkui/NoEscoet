package com.slk.wph.webservice.Meal_Ordering;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.slk.wph.framework.Exception.CustomException;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Meal_OrderingService {
	
	
	/**
	 * 描述：餐品预定
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午2:41:49
	 */
	@WebMethod
	public String getMealAll();
	/**
	 * 描述：通过住院号OR卡ID获取患者信息，并获取当前患者的最近一次普餐消费记录
	 * 		1.验证当前患者是否符合订制普餐OR儿童餐的要求
	 * 			1.1 没定护理的患者不能订制普餐。
	 * 			1.2 儿童科（不用定护理）除普餐之外都能订制
	 * 			1.3 定过护理的患者并且病区不属于儿童科的 除儿童餐以外都能订制
	 *
	 * @param number       住院号 OR kaID
	 * @param ordinaryType 普餐中的分类（普餐，儿童餐，糖餐）
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午3:03:24
	 */
	@WebMethod
	public String getHospitalOrCardByCustomerMealOrdinary(@WebParam(name="number")String number,@WebParam(name="menuFid")String menuFid);
	/**
	 * 描述：订制普餐
	 *
	 * @param info
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午2:44:31
	 */
	@WebMethod
	public String PaymentMealOrdinaryIng(@WebParam(name="info")String info,@WebParam(name="UUID") String UUID);
	/**
	 * 描述：订制特餐and其他
	 *
	 * @param info
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午2:45:30
	 */
	@WebMethod
	public String PaymentMealSpecialIng(@WebParam(name="info")String info);
	/**
	 * 描述：进入退餐
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月8日-上午9:24:44
	 */
	@WebMethod
	public String getfoodRetreatByhospitalFid(@WebParam(name="hospitalFid")String hospitalFid);
	/**
	 * 描述：进行普餐退餐
	 *
	 * @param foodFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月8日-上午9:27:24
	 */
	@WebMethod
	public String FoodRetreatIng(@WebParam(name="fids")String fids,@WebParam(name="userFid")Integer userFid,@WebParam(name="ordernumber")String ordernumber);
	/**
	 * 描述：获取变餐集合   变餐
	 *
	 * @param mealdate
	 * @param hospitalFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月8日-下午3:17:45
	 */
	@WebMethod
	public String getFoodChangeListByInfo(@WebParam(name="datetime")String datetime, @WebParam(name="hospitalFid")String hospitalFid);
	/**
	 * 描述：进行变餐
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月8日-下午3:38:55
	 */
	@WebMethod
	public String ChangeMealIng(@WebParam(name="info")String info);
	/**
	 * 描述：订餐信息汇总
	 *
	 * @param datetime
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月25日-下午4:35:18
	 */
	@WebMethod
	public String MealReserveSummary(@WebParam(name="datetime")String datetime,@WebParam(name="wardFid")String wardFid);


	/**
	 * 特餐订餐信息汇总
	 * @param datetime
	 * @param wardFid
	 * @return
	 * 赵福岭
	 */
	@WebMethod
	public String selectMealTcInfo(@WebParam(name="datetime")String datetime,@WebParam(name="wardFid")String wardFid);
	/**
	 * 普餐订餐信息汇总
	 * @param datetime
	 * @param wardFid
	 * @return
	 * 赵福岭
	 */

	@WebMethod
	public String selectMealPcInfo(@WebParam(name="datetime")String datetime,@WebParam(name="wardFid")String wardFid,@WebParam(name="mealTimeFid")String mealTimeFid);
	/**
	 * 描述：根据fids获取餐集合
	 *
	 * @param fids
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月13日-下午3:46:33
	 */
	@WebMethod
	public String getMealMenuListByFids(@WebParam(name="fids")String fids);

	/**
	 *	通过住院号获取今天和明天的可退特餐集合
	 * @param hospitalld
	 * @return
	 */
	public String getSpecialList(@WebParam(name="hospitalld") String hospitalld);

	/**
	 * 进行特餐退餐
	 * @param ordernumber
	 * @param hospitalld
	 * @return
	 */
	public String getSpecialListIng(@WebParam(name="ordernumber") String ordernumber,@WebParam(name="hospitalld") String hospitalld);

	/**
	 *
	 * 个人特餐汇总
	 * Create by song-xl on 2018-06-14 10:45:23
	 */
	public String getCountByUserFid(@WebParam(name="userFid") String userFid,@WebParam(name="datetime") String datetime);
}
