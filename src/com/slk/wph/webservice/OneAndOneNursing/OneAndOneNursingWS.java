package com.slk.wph.webservice.OneAndOneNursing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface OneAndOneNursingWS {

	/**
	 * HospitalConfirmWSImpl接口中checkHospital方法验证 用户与患者是否在同一个病区 描述:
	 * 方法描述: 根据卡号或者住院号 查询患者
	 * 注:患者未办护理 ，查询出患者信息
	 *   患者已办护理，查询出患者信息，护理等级，护理类型，开始日期，结束日期，护工名称
	 * @param cardNumber
	 * @param hospita
	 * @param date
	 * @return 创建人:赵福岭 2017年7月12日
	 */
	@WebMethod
	public String selectCustomerNursingType(
			@WebParam(name = "userFid")String userFid,
			@WebParam(name = "cardNumber") String cardNumber,
			@WebParam(name = "hospita") String hospita,
			@WebParam(name = "date") String date);
	
	/**
	 * 
	 *描述:办理护理
	 *@return
	 *创建人:赵福岭
	 *2017年7月13日
	 */
	@WebMethod
	public String reserveNursing(@WebParam(name = "json") String json,@WebParam(name = "imgs")String imgs);
	
	/**
	 * 
	 *描述:获取用户管辖病区
	 *@param userFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日 
	 */
	@WebMethod
	public String selectWardList(@WebParam(name = "userFid") String userFid);
	
	/**
	 * 
	 *描述:根据日期和病区查询办理一对一的用户
	 *@param wardFid
	 *@param date
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	@WebMethod
	public String selectCustomerByWardAndDate(@WebParam(name = "wardFid") String wardFid,@WebParam(name = "date") String date);
	
	
	/**
	 * 
	 *描述:根据日期和病区查询办理一对一的用户
	 *@param
	 *@param date
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	@WebMethod
	public String selectWphNursingMessage(@WebParam(name = "customerfid") String customerFid,@WebParam(name = "date") String date);
	
	/**
	 * 
	 *描述:一对一退订
	 *@return
	 *创建人:赵福岭
	 *2017年7月21日
	 */
	@WebMethod
	public String unsubscribe(@WebParam(name = "json") String json);
}
