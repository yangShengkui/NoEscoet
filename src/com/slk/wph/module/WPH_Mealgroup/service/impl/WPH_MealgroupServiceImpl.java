package com.slk.wph.module.WPH_Mealgroup.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Mealgroup.mapper.WphMealgroupMapper;
import com.slk.wph.module.WPH_Mealgroup.mapper.WphMealgroupMapperCustom;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealGroupSpread;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroup;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroupCustom;
import com.slk.wph.module.WPH_Mealgroup.service.WPH_MealgroupService;
import com.slk.wph.module.WPH_Unsubscribetime.mapper.WphUnsubscribetimeMapperCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetime;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;

@Service
 public class  WPH_MealgroupServiceImpl implements WPH_MealgroupService  {
	
	@Autowired
	WphMealgroupMapperCustom mapperCustom;
	@Autowired
	WphMealgroupMapper mapper;
	@Autowired
	WphUnsubscribetimeMapperCustom timeMapperCustom;

	@Override
	public List<WphMealgroupCustom> getGroupList() {
		// TODO Auto-generated method stub
		return mapperCustom.getGroupList();
	}

	@Override
	public Integer UpdateGroupByFid(WphMealgroup mealgroup) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(mealgroup);
	}

    @Override
	public List<WphMealGroupSpread> getGroupMealByGroup(WphMealgroupCustom group){
		// TODO Auto-generated method stub
		return mapperCustom.getGroupMealByGroup(group);
	}

	@Override
	public List<WphMealGroupSpread> getGroupMealByGroupCollect(WphMealgroupCustom group){
		// TODO Auto-generated method stub
		return mapperCustom.getGroupMealByGroupCollect(group);
	}

	@Override
	public List<WphUnsubscribetimeCustom> getTimeByFids(List<Integer> fids) {
		// TODO Auto-generated method stub
		return timeMapperCustom.getTimeByFids(fids);
	}
	
	



}