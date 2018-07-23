package com.slk.wph.module.WPH_Summary_Synopsis.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Summary_Synopsis.mapper.WphSummarySynopsisMapperCustom;
import com.slk.wph.module.WPH_Summary_Synopsis.po.WphSummarySynopsisCustom;
import com.slk.wph.module.WPH_Summary_Synopsis.service.WPH_SummarySynopsisService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Service
 public class  WPH_SummarySynopsisServiceImpl implements WPH_SummarySynopsisService  {
	
	@Autowired
	private WphSummarySynopsisMapperCustom mapperCustom;
	
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
	@Override
	public List<WphSummarySynopsisCustom> selectSummarySynopsis() {
		// TODO Auto-generated method stub
		return mapperCustom.selectSummarySynopsis();
	}
	@Override
	public int updateSummarySynopsis(
			WphSummarySynopsisCustom summarySynopsisCustom) {
		// TODO Auto-generated method stub
		return mapperCustom.updateSummarySynopsis(summarySynopsisCustom);
	}
}