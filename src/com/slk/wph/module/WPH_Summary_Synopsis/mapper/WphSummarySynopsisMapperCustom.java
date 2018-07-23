package com.slk.wph.module.WPH_Summary_Synopsis.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Summary_Synopsis.po.WphSummarySynopsisCustom;

public interface WphSummarySynopsisMapperCustom {
	
	/**
	 * 
	 *描述:查询全部数据
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public List<WphSummarySynopsisCustom> selectSummarySynopsis();
	/**
	 * 
	 *描述:修改数据
	 *@param summarySynopsisCustom
	 *@return
	 *创建人:赵福岭
	 *2017年9月25日
	 */
	public int updateSummarySynopsis(WphSummarySynopsisCustom summarySynopsisCustom);
}
