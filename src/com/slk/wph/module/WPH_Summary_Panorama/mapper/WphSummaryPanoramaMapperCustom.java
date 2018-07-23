package com.slk.wph.module.WPH_Summary_Panorama.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanoramaCustom;
import org.apache.ibatis.annotations.Param;

public interface WphSummaryPanoramaMapperCustom {
	
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaState();
	
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaAll();
	
	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaByFid(Integer fid);
	
	public void insertSummaryPanorama(WphSummaryPanoramaCustom summaryPanoramaCustom);
	
	public int updateSummaryPanorama(WphSummaryPanoramaCustom summaryPanoramaCustom);

	public List<WphSummaryPanoramaCustom> selectSummaryPanoramaByType(@Param("type")Integer type,@Param("state") Integer state);

	public List<String> selectType();
}
