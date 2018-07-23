package com.slk.wph.webservice.Unsubscribe_Time;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Unsubscribe_TimeService {
	/**
	 * 描述：订餐时间
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月10日-上午10:56:52
	 */
	public String OrderingTime();
	/**
	 * 描述：退餐时间
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月10日-上午10:56:58
	 */
	public String RetreatTime();

}
