package com.slk.wph.module.WPH_Summary_Panorama.mapper;

import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanorama;
import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanoramaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphSummaryPanoramaMapper {
    int countByExample(WphSummaryPanoramaExample example);

    int deleteByExample(WphSummaryPanoramaExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphSummaryPanorama record);

    int insertSelective(WphSummaryPanorama record);

    List<WphSummaryPanorama> selectByExample(WphSummaryPanoramaExample example);

    WphSummaryPanorama selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphSummaryPanorama record, @Param("example") WphSummaryPanoramaExample example);

    int updateByExample(@Param("record") WphSummaryPanorama record, @Param("example") WphSummaryPanoramaExample example);

    int updateByPrimaryKeySelective(WphSummaryPanorama record);

    int updateByPrimaryKey(WphSummaryPanorama record);
}