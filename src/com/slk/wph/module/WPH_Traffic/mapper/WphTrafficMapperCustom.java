package com.slk.wph.module.WPH_Traffic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Traffic.po.WphTrafficCustom;

public interface WphTrafficMapperCustom {
	
	public List<WphTrafficCustom> selectWphTrafficCustomState(@Param("type")Integer type,@Param("state")Integer state);
	
	public WphTrafficCustom selectWphTrafficCustomByFid(Integer fid);
	
	public int updateWphTrafficCustom(WphTrafficCustom wphTrafficCustom);
	
	public int insertWphTrafficCustom(WphTrafficCustom wphTrafficCustom);
}
