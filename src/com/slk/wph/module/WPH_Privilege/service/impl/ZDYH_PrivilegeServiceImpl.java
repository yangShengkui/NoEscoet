package com.slk.wph.module.WPH_Privilege.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Privilege.mapper.WphPrivilegeMapper;
import com.slk.wph.module.WPH_Privilege.po.WphPrivilegeExample;
import com.slk.wph.module.WPH_Privilege.service.ZDYH_PrivilegeService;

@Service
 public class  ZDYH_PrivilegeServiceImpl implements ZDYH_PrivilegeService  {
	@Autowired
	private WphPrivilegeMapper mapper;

	@Override
	public int deleteByExample(WphPrivilegeExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	public WphPrivilegeMapper getMapper() {
		return mapper;
	}

	public void setMapper(WphPrivilegeMapper mapper) {
		this.mapper = mapper;
	}
	
	
	
}