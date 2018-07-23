package com.slk.wph.webservice.AppVersion;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface AppVersionWs {

	/**
	 * 
	 * @Title:             getAppVersion
	 * @param:             @return   
	 * @return:         String   
	 * @throws
	 * 作者: 		隋乔镇
	 * 描述：		 获取最新版本
	 * @date: 2017年9月11日 下午5:35:02
	 */
	@WebMethod
	public String getAppVersion();
}
