package com.slk.wph.module.WPH_Summary_Expert.mapper;

import com.slk.wph.module.WPH_Summary_Expert.po.WphSummaryExpert;
import com.slk.wph.module.WPH_Summary_Expert.po.WphSummaryExpertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphSummaryExpertMapper {
    int countByExample(WphSummaryExpertExample example);

    int deleteByExample(WphSummaryExpertExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphSummaryExpert record);

    int insertSelective(WphSummaryExpert record);

    List<WphSummaryExpert> selectByExample(WphSummaryExpertExample example);

    WphSummaryExpert selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphSummaryExpert record, @Param("example") WphSummaryExpertExample example);

    int updateByExample(@Param("record") WphSummaryExpert record, @Param("example") WphSummaryExpertExample example);

    int updateByPrimaryKeySelective(WphSummaryExpert record);

    int updateByPrimaryKey(WphSummaryExpert record);
}