package com.slk.wph.module.WPH_Summary_Synopsis.mapper;

import com.slk.wph.module.WPH_Summary_Synopsis.po.WphSummarySynopsis;
import com.slk.wph.module.WPH_Summary_Synopsis.po.WphSummarySynopsisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphSummarySynopsisMapper {
    int countByExample(WphSummarySynopsisExample example);

    int deleteByExample(WphSummarySynopsisExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphSummarySynopsis record);

    int insertSelective(WphSummarySynopsis record);

    List<WphSummarySynopsis> selectByExample(WphSummarySynopsisExample example);

    WphSummarySynopsis selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphSummarySynopsis record, @Param("example") WphSummarySynopsisExample example);

    int updateByExample(@Param("record") WphSummarySynopsis record, @Param("example") WphSummarySynopsisExample example);

    int updateByPrimaryKeySelective(WphSummarySynopsis record);

    int updateByPrimaryKey(WphSummarySynopsis record);
}