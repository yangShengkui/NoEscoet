package com.slk.wph.module.WPH_Summary_Panorama.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Summary_Panorama.mapper.WphSummaryPanoramaMapperCustom;
import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanoramaCustom;
import com.slk.wph.module.WPH_Summary_Panorama.service.WPH_SummaryPanoramaService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Service
 public class  WPH_SummaryPanoramaServiceImpl implements WPH_SummaryPanoramaService  {
	
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Autowired
	private WphSummaryPanoramaMapperCustom custom;
	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
	@Override
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaState() {
		// TODO Auto-generated method stub
		return custom.selectSummaryPanoramaState();
	}
	@Override
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaAll() {
		// TODO Auto-generated method stub
		return custom.selectSummaryPanoramaAll();
	}
	@Override
	public void insertSummaryPanorama(
			WphSummaryPanoramaCustom summaryPanoramaCustom) {
		// TODO Auto-generated method stub
		custom.insertSummaryPanorama(summaryPanoramaCustom);
	}
	@Override
	public int updateSummaryPanorama(
			WphSummaryPanoramaCustom summaryPanoramaCustom) {
		// TODO Auto-generated method stub
		return custom.updateSummaryPanorama(summaryPanoramaCustom);
	}
	@Override
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaByFid(Integer fid) {
		// TODO Auto-generated method stub
		return custom.selectSummaryPanoramaByFid(fid);
	}

	@Override
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaByType(Integer type,Integer state) {
		return custom.selectSummaryPanoramaByType(type,state);
	}


	@Override
	public List<String> selectType() {
		return custom.selectType();
	}
}