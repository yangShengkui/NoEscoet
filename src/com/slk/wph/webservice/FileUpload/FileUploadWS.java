package com.slk.wph.webservice.FileUpload;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface FileUploadWS {
	/**
	 * 
	 *描述:图片上传
	 *@param file
	 *@return
	 *创建人:赵福岭
	 *2017年7月4日
	 */
	@WebMethod
	public String fileUpload(@WebParam( name = "imgStr")String imgStr,@WebParam(name = "moduleName")String moduleName,
			@WebParam(name = "customerFid")String customerFid);
}
