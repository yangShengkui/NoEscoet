package com.slk.wph.module.WPH_Screensaver.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Screensaver.mapper.WphScreensaverMapperCustom;
import com.slk.wph.module.WPH_Screensaver.po.WphScreensaver;
import com.slk.wph.module.WPH_Screensaver.po.WphScreensaverCustom;
import com.slk.wph.module.WPH_Screensaver.service.WPH_ScreensaverService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Service
 public class  WPH_ScreensaverServiceImpl implements WPH_ScreensaverService  {
	@Autowired
	private WphScreensaverMapperCustom mapper;
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Override
	public List<WphScreensaverCustom> selectScreensaver() {
		// TODO Auto-generated method stub
		return mapper.selectScreensaver();
	}

	@Override
	public List<WphScreensaverCustom> selectScreensaverByStatus() {
		// TODO Auto-generated method stub
		return mapper.selectScreensaverByStatus();
	}

	@Override
	public int updateByFid(WphScreensaver screensaver) {
		// TODO Auto-generated method stub
		return mapper.updateByFid(screensaver);
	}

	@Override
	public int insertScreensaver(WphScreensaver screensaver) {
		// TODO Auto-generated method stub
		return mapper.insertScreensaver(screensaver);
	}

	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
}