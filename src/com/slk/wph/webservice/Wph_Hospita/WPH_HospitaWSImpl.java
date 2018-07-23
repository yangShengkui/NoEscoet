package com.slk.wph.webservice.Wph_Hospita;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_Cost.mapper.WphCostMapper;
import com.slk.wph.module.WPH_Hospita.mapper.WphHospitaMapperCustom;
import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;

@WebService
@SOAPBinding(style = Style.RPC)
public class WPH_HospitaWSImpl implements WPH_HospitaWS {
	@Autowired
	private WphHospitaMapperCustom wphHospitaMapperCustom;
	
	@Autowired
	private WphCostMapper wphCostMapper;


	@WebMethod
	public String getWphHospitaById(Integer fid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphHospita wphHospita = wphHospitaMapperCustom.getWphHospitaByFid(fid);

		if (null != wphHospita) {
			flag = true;
			map.put("wphHospita", wphHospita);
		}
		map.put("flag", flag);

		return JSONObject.fromObject(map).toString();
	}

	@WebMethod
	public String getWphHospitaList() {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphHospitaCustom> list = wphHospitaMapperCustom.getWphHospitaAndWphWard();
		flag = true;
		map.put("flag", flag);
		map.put("wphHospitaList", list);
		map.put("yMoney", wphCostMapper.selectByPrimaryKey(1).getMoney());
		return JSONObject.fromObject(map).toString();
	}

}
