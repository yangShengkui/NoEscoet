package com.slk.wph.module.WPH_Summary_Navigation.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Summary_Navigation.mapper.WphSummaryNavigationMapperCustom;
import com.slk.wph.module.WPH_Summary_Navigation.po.WphSummaryNavigationCustom;
import com.slk.wph.module.WPH_Summary_Navigation.service.WPH_SummaryNavigationService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
 public class  WPH_SummaryNavigationServiceImpl implements WPH_SummaryNavigationService  {
	
	@Autowired
	private WphSummaryNavigationMapperCustom mapperCustom;
	@Autowired
	private WphWardMapperCustom wphWardCustomMapper;
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
	@Override
	public List<WphSummaryNavigationCustom> selectSummaryNavigationState() {
		// TODO Auto-generated method stub
		return mapperCustom.selectSummaryNavigationState();
	}

	@Override
	public List<WphSummaryNavigationCustom> selectSummaryNavigationAll() {
		// TODO Auto-generated method stub
		return mapperCustom.selectSummaryNavigationAll();
	}

	@Override
	public void insertSummaryNavigation(
			WphSummaryNavigationCustom summaryNavigationCustom) {
		// TODO Auto-generated method stub
		mapperCustom.insertSummaryNavigation(summaryNavigationCustom);
	}

	@Override
	public int updateSummaryNavigation(
			WphSummaryNavigationCustom summaryNavigationCustom) {
		// TODO Auto-generated method stub
		return mapperCustom.updateSummaryNavigation(summaryNavigationCustom);
	}
	@Override
	public List<WphWardCustom> getWphWardListByStatus() {
		// TODO Auto-generated method stub
		return wphWardCustomMapper.getWphWardListByStatus();
	}
	
}