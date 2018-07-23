package com.slk.wph.module.WPH_Summary_Expert.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Summary_Expert.mapper.WphSummaryExpertMapperCustom;
import com.slk.wph.module.WPH_Summary_Expert.po.WphSummaryExpertCustom;
import com.slk.wph.module.WPH_Summary_Expert.service.WPH_SummaryExpertService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
 public class  WPH_SummaryExpertServiceImpl implements WPH_SummaryExpertService  {
	@Autowired
	 private WphSummaryExpertMapperCustom mapperCustom;
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Autowired
	private WphWardMapperCustom wphWardCustomMapper;
	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
	@Override
	public List<WphSummaryExpertCustom> selectSummaryExpertAll() {
		// TODO Auto-generated method stub
		return mapperCustom.selectSummaryExpertAll();
	}

	@Override
	public List<WphSummaryExpertCustom> selectSummaryExpertState(Integer wardfid) {
		// TODO Auto-generated method stub
		return mapperCustom.selectSummaryExpertState(wardfid);
	}

	@Override
	public WphSummaryExpertCustom selectSummaryExpertByFid(Integer fid) {
		// TODO Auto-generated method stub
		return mapperCustom.selectSummaryExpertByFid(fid);
	}

	@Override
	public void insertSummaryExpert(WphSummaryExpertCustom summaryExpertCustom) {
		// TODO Auto-generated method stub
		mapperCustom.insertSummaryExpert(summaryExpertCustom);
	}

	@Override
	public int updateSummaryExpert(WphSummaryExpertCustom summaryExpertCustom) {
		// TODO Auto-generated method stub
		return mapperCustom.updateSummaryExpert(summaryExpertCustom);
	}
	@Override
	public List<WphWardCustom> getWphWardListByStatus() {
		// TODO Auto-generated method stub
		return wphWardCustomMapper.getWphWardListByStatus();
	}
}