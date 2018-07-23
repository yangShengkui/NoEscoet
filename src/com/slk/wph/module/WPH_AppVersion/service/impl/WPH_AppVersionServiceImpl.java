package com.slk.wph.module.WPH_AppVersion.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_AppVersion.mapper.WphAppversionCustomMapper;
import com.slk.wph.module.WPH_AppVersion.po.WphAppversion;
import com.slk.wph.module.WPH_AppVersion.service.WPH_AppVersionService;

@Service
 public class  WPH_AppVersionServiceImpl implements WPH_AppVersionService  {
	
	@Autowired
	private  WphAppversionCustomMapper mapper;
	@Override
	public WphAppversion selectAppVersion() {
		// TODO Auto-generated method stub
		return mapper.selectAppVersion();
	}

	@Override
	public void insertAppVersion(WphAppversion wphAppversion) {
		// TODO Auto-generated method stub
		mapper.insertAppVersion(wphAppversion);
	}
}