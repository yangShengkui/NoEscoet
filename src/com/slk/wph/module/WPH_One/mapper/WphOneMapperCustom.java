package com.slk.wph.module.WPH_One.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_One.po.WphOneCustom;

public interface WphOneMapperCustom {
	
	public List<WphOneCustom> selectWphOnePic(@Param("hospitalld")String hospitalld);
	
	public WphOneCustom getWphOneByFid(Integer fid);
	
	public int updateWphOne(WphOneCustom wphone);

	public Integer getOneCountByWorkId(Integer wordId);
}
