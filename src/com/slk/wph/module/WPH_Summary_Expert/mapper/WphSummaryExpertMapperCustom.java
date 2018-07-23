package com.slk.wph.module.WPH_Summary_Expert.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Summary_Expert.po.WphSummaryExpertCustom;

public interface WphSummaryExpertMapperCustom {
	
	/**
	 * 
	 *描述:查询所有数据
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public List<WphSummaryExpertCustom> selectSummaryExpertAll();
	/**
	 * 
	 *描述:查询开启状态的数据
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public List<WphSummaryExpertCustom>selectSummaryExpertState(Integer wardfid);
	/**
	 * 
	 *描述:通过fid查询数据
	 *@param fid
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public WphSummaryExpertCustom selectSummaryExpertByFid(Integer fid);
	/**
	 * 
	 *描述:插入数据
	 *@param summaryExpertCustom
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public void insertSummaryExpert(WphSummaryExpertCustom summaryExpertCustom);
	/**
	 * 
	 *描述:修改数据
	 *@param summaryExpertCustom
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public int updateSummaryExpert(WphSummaryExpertCustom summaryExpertCustom);
	
}
