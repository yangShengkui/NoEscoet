package com.slk.wph.webservice.Hospital_Confirm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HospitalConfirmWS {
	/**
	 * 
	 * 描述:患者住院验证 (辨别登录用户与患者是否同一病区)
	 * 
	 * @param userFid
	 * @param cardId
	 * @param hospitalld
	 * @return 创建人:赵福岭 2017年6月26日
	 */
	@WebMethod
	public String checkHospital(@WebParam(name = "userFid") String userFid,
			@WebParam(name = "cardId") String cardId,
			@WebParam(name = "hospitalld") String hospitalld);
	/**
	 * 
	 *描述:通过患者的fid 修改患者状态和卡片状态
	 *@param customerFid
	 *@return
	 *创建人:赵福岭
	 *2017年6月26日
	 */
	@WebMethod
	public String receiveHospital(@WebParam(name = "customerFid") String customerFid,@WebParam(name="userFid") String userFid);
/********************************************************************************************************/	
	/**
	 * 
	 *描述:出院
	 *@param userFid
	 *@param cardId
	 *@param hospitalld
	 *@param date
	 *@return
	 *创建人:赵福岭
	 *2017年7月31日
	 */
	@WebMethod
	public String leaveHospital(@WebParam(name = "userFid") String userFid,
			@WebParam(name = "customerFid") String customerFid,
			@WebParam(name = "date") String date
			);
	/**
	 * 
	 *描述:转病区
	 *@param userFid
	 *@param customerFid
	 *@param date
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月28日
	 */
	@WebMethod
	public String changeWard(@WebParam(name = "userFid")String userFid, 
			@WebParam(name = "customerFid")String customerFid,
			@WebParam(name = "date")String date,
			@WebParam(name = "wardFid")String wardFid);
	/**
	 * 
	 *描述:查询所有 开启的病区
	 *@return
	 *创建人:赵福岭
	 *2017年8月30日
	 */
	@WebMethod
	public String selectWardList();
}
