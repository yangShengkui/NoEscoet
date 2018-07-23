package com.slk.wph.module.WPH_Summary_Equipment.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Summary_Equipment.po.WphSummaryEquipmentCustom;

public interface WphSummaryEquipmentMapperCustom {
	
	/**
	 *  
	 *描述:按类型查询开启状态的数据
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public List<WphSummaryEquipmentCustom> selectSummaryEquipmentState();
	/**
	 * 
	 *描述:查询全部数据
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public List<WphSummaryEquipmentCustom> selectSummaryEquipmentAll();
	/**
	 * 
	 *描述:新增
	 *@param summaryEquipmentCustom
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public void insertSummaryEquipment(WphSummaryEquipmentCustom summaryEquipmentCustom);
	
	/**
	 * 
	 *描述:修改
	 *@param summaryEquipmentCustom
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public int updateSummaryEquipment(WphSummaryEquipmentCustom summaryEquipmentCustom);
}
