package com.slk.wph.module.WPH_Unsubscribetime.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Unsubscribetime.mapper.WphUnsubscribetimeMapper;
import com.slk.wph.module.WPH_Unsubscribetime.mapper.WphUnsubscribetimeMapperCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetime;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;
import com.slk.wph.module.WPH_Unsubscribetime.service.WPH_UnsubscribetimeService;

@Service
 public class  WPH_UnsubscribetimeServiceImpl implements WPH_UnsubscribetimeService  {
	
	@Autowired
	WphUnsubscribetimeMapper mapper;
	@Autowired
	WphUnsubscribetimeMapperCustom mapperCustom;

	@Override
	public List<WphUnsubscribetimeCustom> getUnsubsbscribetime() {
		return mapperCustom.getUnsubsbscribetime();
	}

	@Override
	public Integer updateTimeByFid(WphUnsubscribetime time) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(time);
	}
	
	
	
	
	
}