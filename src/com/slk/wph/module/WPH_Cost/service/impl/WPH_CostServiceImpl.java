package com.slk.wph.module.WPH_Cost.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Cost.mapper.WphCostCustomMapper;
import com.slk.wph.module.WPH_Cost.po.WphCostCustom;
import com.slk.wph.module.WPH_Cost.service.WPH_CostService;

@Service
 public class  WPH_CostServiceImpl implements WPH_CostService  {
	
	@Autowired
	private WphCostCustomMapper customMapper;
	
	@Override
	public List<WphCostCustom> selectAllCost() {
		// TODO Auto-generated method stub
		return customMapper.selectAllCost();
	}

	@Override
	public int updateCost(WphCostCustom custom) {
		// TODO Auto-generated method stub
		return customMapper.updateCost(custom);
	}
}