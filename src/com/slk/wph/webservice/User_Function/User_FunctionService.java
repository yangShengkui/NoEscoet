package com.slk.wph.webservice.User_Function;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface User_FunctionService {
	/**
	 * 描述：通过账号和密码获取用户信息
	 *
	 * @param User
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月12日-上午8:50:36
	 */
	@WebMethod
	public String UserLogin(@WebParam(name = "User")String User);
	/**
	 * 描述：给用户添加友盟推送标识：device_tokens，tag
	 *
	 * @param User
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月12日-上午10:45:04
	 */
	@WebMethod
	public String setUserPushInfo(@WebParam(name="User")String User);
	
	/**
	 * 
	 *描述:修改密码
	 *@param userFid
	 *@param password
	 *@return
	 *创建人:赵福岭
	 *2017年9月2日
	 */
	@WebMethod
	public String updateUserPassword(@WebParam(name="userFid")String userFid,@WebParam(name="password")String password);
}
