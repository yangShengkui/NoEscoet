package com.slk.wph.webservice.OneManyNursing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface OneManyNursingWS {
	/**
	 * 
	 *描述:检测患者与用户是否在同一病区
	 *@param userFid
	 *@param cardId
	 *@param hospitalld
	 *@return
	 *创建人:赵福岭
	 *2017年7月17日
	 */
	@WebMethod
	public String checkCustomer(@WebParam(name = "userFid")String userFid,
			@WebParam(name = "cardId")String cardId,
			@WebParam(name = "hospitalld")String hospitalld);
	/**
	 * 
	 *描述:通过用户fid查询管理的病区的护理等级
	 *@param userFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月17日
	 */
	@WebMethod
	public String selectNursingGrade(@WebParam(name = "userFid")String userFid);
	/**
	 * 
	 *描述:查询未办理护理的患者
	 *@param json
	 *@return
	 *创建人:赵福岭
	 *2017年7月17日
	 */
	@WebMethod
	public String selectCustomerNotNursing(@WebParam(name = "date")String date, @WebParam(name = "userFid")String userFid);
	
	/**
	 * 
	 *描述:一对多定护理
	 *@param json
	 *@return
	 *创建人:赵福岭
	 *2017年7月17日
	 */
	@WebMethod
	public String reserveNursing(@WebParam(name = "json")String json);
	/**
	 * 
	 *描述:查询已经定制一对多的患者
	 *@param json
	 *@return
	 *创建人:赵福岭
	 *2017年7月17日
	 */
	@WebMethod
	public String selectCustomerAlreadyNursing(@WebParam(name = "json")String json);
	/**
	 * 
	 *描述:用于退订时查询 患者的信息 退订 ：卡退订和多人退订 修改 通过日期，卡号或者住院号查询患者信息和护理定制信息
	 *@param json
	 *@return
	 *创建人:赵福岭
	 *2017年7月17日
	 */
	@WebMethod
	public String selectCustomerNursing(@WebParam(name = "json")String json);
	
	/**
	 * 刷卡退订
	 *描述:刷卡查询患者是否办理一对多护理        已办理，返回患者信息
	 *@param cardId
	 *@param hospita
	 *@return
	 *创建人:赵福岭
	 *2017年7月21日
	 */
	@WebMethod
	public String selectCustomerNursingGrade(@WebParam(name="userFid")String userFid,
			@WebParam(name="cardId") String cardId,
			@WebParam(name="hospitalld") String hospitalld,
			@WebParam(name="date") String date);
	
	/** 护理汇总 */
	@WebMethod
	public String summaryNursing(@WebParam(name="json")String json);
	
}
