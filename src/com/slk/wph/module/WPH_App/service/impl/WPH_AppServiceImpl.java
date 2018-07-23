package com.slk.wph.module.WPH_App.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_App.mapper.WphAppMapper;
import com.slk.wph.module.WPH_App.mapper.WphAppMapperCustom;
import com.slk.wph.module.WPH_App.po.WphApp;
import com.slk.wph.module.WPH_App.po.WphAppCustom;
import com.slk.wph.module.WPH_App.service.WPH_AppService;

@Service
 public class  WPH_AppServiceImpl implements WPH_AppService  {

	@Autowired
	WphAppMapperCustom mapperCustom;
	
	@Autowired
	WphAppMapper mapper;
	
	
	@Override
	public List<WphAppCustom> getAppListByParentFid(WphAppCustom app) {
		if(null == app.getParentFid())app.setParentFid(0);
		List<WphAppCustom> appList = mapperCustom.getAppListByParentFid(app);
		
		for(WphAppCustom custom : appList ){
			custom.setParentFid(custom.getFid());
			custom.setUserFid(app.getUserFid());
			custom.setAppCustomList(getAppListByParentFid(custom));
		}
		
		return appList;
	}

	
	@Override
	public List<WphAppCustom> getAppListCheckByApp(WphAppCustom app) {
		if(null == app.getParentFid())app.setParentFid(0);
		List<WphAppCustom> appList = mapperCustom.getAppListCheckByApp(app);
		
		for(WphAppCustom custom :appList ){
			app.setParentFid(custom.getFid());
			custom.setAppCustomList(getAppListCheckByApp(app));
		}
		return appList;
	}
	
	
	
	@Override
	public WphAppCustom findAppById(Integer appId) {
		return mapperCustom.findAppById(appId);
	}


	@Override
	public Integer insertApp(WphAppCustom custom) {
		return mapper.insertSelective(custom);
	}


	@Override
	public Integer updateApp(WphAppCustom custom) {
		return mapper.updateByPrimaryKeySelective(custom);
	}


	@Override
	public Integer deleteAppFindById(Integer appFid) {
		return mapperCustom.deleteAppFindById(appFid);
	}


	@Override
	public Integer deleteAppById(Integer fid) {
		return mapperCustom.deleteAppById(fid);
	}

}