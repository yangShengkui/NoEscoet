package com.slk.wph.module.WPH_Ward.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWard;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.WPH_Ward.service.WPH_WardService;

@Service
 public class  WPH_WardServiceImpl implements WPH_WardService  {
	
	@Autowired
	private WphWardMapperCustom wphWardMapperCustom;
	
	@Override
	public List<WphWardCustom> getWphWardList() {
		// TODO Auto-generated method stub
		return wphWardMapperCustom.getWphWardList();
	}

	@Override
	public void updateAndSaveWphHospita(WphWard wphWard) {
		// TODO Auto-generated method stub
		if(wphWard.getFid()!=null&&!"".equals(wphWard.getFid())){
			wphWardMapperCustom.updateWphWard(wphWard);
		}else{
			wphWard.setStatus(0);
			wphWardMapperCustom.saveWphWard(wphWard);
		}
	}

	
	
	
	@Override
	public int checkWphWard(String name) {
		// TODO Auto-generated method stub
		return wphWardMapperCustom.checkWphWard(name);
	}

	@Override
	public int checkWphWard(Integer fid, String name) {
		// TODO Auto-generated method stub
		return wphWardMapperCustom.checkWphWard_(fid,name);
	}

	
}