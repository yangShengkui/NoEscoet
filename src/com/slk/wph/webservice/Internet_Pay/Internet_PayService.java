package com.slk.wph.webservice.Internet_Pay;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC) 
public interface Internet_PayService {
	/**
	 * 描述：扫码支付
	 *		APP扫描客户二维码获取 付款码(auth_Code)以及金额(total_amount)完成支付
	 *		支付成功：flag：true
	 *			   outTradeNo: 订单号
	 *			   total_amount：所收金额
	 *		支付失败：flag：false
	 * @param pay
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-上午8:59:08
	 */
	@WebMethod
	public String getScanCodePay(@WebParam(name="alipays")String alipays);
	
	/**
	 * 
	 * @Title:             PayCheck
	 * @param:             @return   
	 * @return:         String   
	 * @throws
	 * 作者: 		隋乔镇
	 * 描述：限制支付宝付款是否可用
	 */
	@WebMethod
	public String PayCheck();

}
