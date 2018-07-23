package com.slk.wph.webservice.Meal_Cleaning;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Meal_CleaningService {
	/**
	 * 描述：订保洁餐
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月15日-上午9:01:53
	 */
	@WebMethod
	public String MealCleaning(@WebParam(name="cardStr")String cardStr);
	
	
}
