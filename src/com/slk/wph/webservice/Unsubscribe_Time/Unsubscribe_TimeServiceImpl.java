package com.slk.wph.webservice.Unsubscribe_Time;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_Unsubscribetime.mapper.WphUnsubscribetimeMapperCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;

public class Unsubscribe_TimeServiceImpl implements Unsubscribe_TimeService {

	
	@Autowired
	WphUnsubscribetimeMapperCustom mapperCustom;
	
	

	@Override
	public String OrderingTime() {
		Map<String,Object> map = new HashMap<String,Object>();
		List<Integer> fids = new ArrayList<Integer>();
		fids.add(1);
		fids.add(2);
		fids.add(3);
		List<WphUnsubscribetimeCustom> timeList = mapperCustom.getTimeByFids(fids);
		map.put("timeList", timeList);
		return JSONObject.fromObject(map).toString();
	}

	
	@Override
	public String RetreatTime() {
		Map<String,Object> map = new HashMap<String,Object>();
		List<Integer> fids = new ArrayList<Integer>();
		fids.add(4);
		fids.add(5);
		fids.add(6);
		List<WphUnsubscribetimeCustom> timeList = mapperCustom.getTimeByFids(fids);
		map.put("timeList", timeList);
		return JSONObject.fromObject(map).toString();
	}

}
