package com.slk.wph.webservice.AppVersion;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_AppVersion.mapper.WphAppversionCustomMapper;
import com.slk.wph.module.WPH_AppVersion.po.WphAppversion;

public class AppVersionWsImpl implements AppVersionWs {

	@Autowired
	private WphAppversionCustomMapper mapper;
	private Map<String, Object> map = new HashMap<String, Object>();
	
	@Override
	public String getAppVersion() {
		map.clear();
		map.put("flag", false);
		// TODO Auto-generated method stub
		WphAppversion selectAppVersion = mapper.selectAppVersion();
		if(selectAppVersion!=null){
			map.put("flag", true);
			map.put("AppVersion", selectAppVersion);
		}
		 return JSONObject.fromObject(map).toString();
	}
 
	
}
