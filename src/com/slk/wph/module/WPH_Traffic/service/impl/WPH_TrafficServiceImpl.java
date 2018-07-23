package com.slk.wph.module.WPH_Traffic.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Traffic.mapper.WphTrafficMapperCustom;
import com.slk.wph.module.WPH_Traffic.po.WphTrafficCustom;
import com.slk.wph.module.WPH_Traffic.service.WPH_TrafficService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Service
 public class  WPH_TrafficServiceImpl implements WPH_TrafficService  {
	@Autowired
	private WphTrafficMapperCustom custom;
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Override
	public List<WphTrafficCustom> selectWphTrafficCustomState(Integer type,
			Integer state) {
		// TODO Auto-generated method stub
		return custom.selectWphTrafficCustomState(type, state);
	}

	@Override
	public WphTrafficCustom selectWphTrafficCustomByFid(Integer fid) {
		// TODO Auto-generated method stub
		return custom.selectWphTrafficCustomByFid(fid);
	}

	@Override
	public int updateWphTrafficCustom(WphTrafficCustom wphTrafficCustom) {
		// TODO Auto-generated method stub
		return custom.updateWphTrafficCustom(wphTrafficCustom);
	}

	@Override
	public int insertWphTrafficCustom(WphTrafficCustom wphTrafficCustom) {
		// TODO Auto-generated method stub
		return custom.insertWphTrafficCustom(wphTrafficCustom);
	}

	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
}