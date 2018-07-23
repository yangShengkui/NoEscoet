package com.slk.wph.webservice.Wph_Customer;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
@WebService
@SOAPBinding(style = Style.RPC)
public interface Wph_CustomerService {
	/**
	 * 描述：开卡缴费
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月5日-上午10:46:35
	 */
	@WebMethod
	public String PaymentCard();
	/**
	 * 描述：提交开卡缴费
	 *
	 * @param payMentCard
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月23日-上午10:13:13
	 */
	@WebMethod
	public String PaymentCardIng(@WebParam(name="payMentCard") String payMentCard);
	/**
	 * 描述：通过cardId 获取卡号
	 *
	 * @param cardId 通过读卡器获取的卡ID
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月5日-上午11:06:38
	 */
	public String getCardNumberByCardId(@WebParam(name="cardId") String cardId);
	/**
	 * 描述：通过 cardNum 验证此卡是否已被患者使用
	 *
	 * @param cardNum 卡号
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月5日-上午11:09:01
	 */
	public String getFlagByCardHospital(@WebParam(name="info") String info);
	
	/**
	 * 描述：充值补费--通过卡id or 住院号  获取患者信息
	 *
	 * @param card
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月14日-上午10:01:01
	 */
	public String getCustomerByCardIdOrHospitalld(@WebParam(name="card")String card);
	/**
	 * 描述：进行充值补费
	 *
	 * @param info
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月14日-上午10:14:22
	 */
	public String PaymentAdding(@WebParam(name="info") String info);
	
	/**
	 * 
	 *描述:余额预警
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月21日
	 */
	@WebMethod
	public String getCustomByHospitalldStates(@WebParam(name="wardFid") Integer wardFid);
	
	/**
	 * 
	 *描述:根据userFid获取病区
	 *@param userFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月21日
	 */
	@WebMethod
	public String getWardListByUserFid(@WebParam(name="userFid")Integer userFid);
	/**
	 * 描述：自助开卡汇总
	 *
	 * @param customer
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-下午12:58:23
	 */
	public String getCustomerListByInfo(@WebParam(name="wardFid")String wardFid,@WebParam(name="datetime")String datetime);
	/**
	 * 描述 :根据住院号OR卡号获取打印信息-webservice
	 *
	 * @param value
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月16日-下午4:33:15
	 */
	public String getPSTByCustomerInfo(@WebParam(name="value")String value);
}
