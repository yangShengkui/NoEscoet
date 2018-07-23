package com.slk.wph.module.WPH_Summary_Equipment.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Summary_Equipment.mapper.WphSummaryEquipmentMapperCustom;
import com.slk.wph.module.WPH_Summary_Equipment.po.WphSummaryEquipmentCustom;
import com.slk.wph.module.WPH_Summary_Equipment.service.WPH_SummaryEquipmentService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
 public class  WPH_SummaryEquipmentServiceImpl implements WPH_SummaryEquipmentService  {
	
	@Autowired
	private WphSummaryEquipmentMapperCustom mapper;
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
	public List<WphSummaryEquipmentCustom> selectSummaryEquipmentState() {
		// TODO Auto-generated method stub
		return mapper.selectSummaryEquipmentState();
	}

	@Override
	public List<WphSummaryEquipmentCustom> selectSummaryEquipmentAll() {
		// TODO Auto-generated method stub
		return mapper.selectSummaryEquipmentAll();
	}

	@Override
	public void insertSummaryEquipment(WphSummaryEquipmentCustom summaryEquipmentCustom) {
		// TODO Auto-generated method stub
		mapper.insertSummaryEquipment(summaryEquipmentCustom);
	}

	@Override
	public int updateSummaryEquipment(
			WphSummaryEquipmentCustom summaryEquipmentCustom) {
		// TODO Auto-generated method stub
		return mapper.updateSummaryEquipment(summaryEquipmentCustom);
	}
	@Override
	public List<WphWardCustom> getWphWardListByStatus() {
		// TODO Auto-generated method stub
		return wphWardCustomMapper.getWphWardListByStatus();
	}
}