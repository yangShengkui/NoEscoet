package com.slk.wph.module.Demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.Demo.mapper.DemoMapper;
import com.slk.wph.module.Demo.po.Demo;
import com.slk.wph.module.Demo.service.DemoService;

@Service
 public class  DemoServiceImpl implements DemoService  {

	@Autowired
	DemoMapper mapper;
	
	
	@Override
	public Demo getDemoByFid(Integer fid) {
		return mapper.selectByPrimaryKey(fid);
	}
}