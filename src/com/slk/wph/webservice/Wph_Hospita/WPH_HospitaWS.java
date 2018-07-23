package com.slk.wph.webservice.Wph_Hospita;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style = Style.RPC)

public interface WPH_HospitaWS {
	
	/**
	 * 
	 * 描述:获取院区
	 * 
	 * @param fid
	 * @return WphHospita 创建人:赵福岭 2017年6月13日
	 */
	@WebMethod
	public String getWphHospitaById(@WebParam(name = "fid")Integer fid);

	/**
	 * 
	 * 描述:查询全部院区
	 * 
	 * @return List<WphHospita> 创建人:赵福岭 2017年6月13日
	 */
	@WebMethod
	public String getWphHospitaList();



	
}