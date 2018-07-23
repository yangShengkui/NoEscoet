package com.slk.wph.module.WPH_Feedweek.mapper;

import com.slk.wph.module.WPH_Feedweek.po.WphFeedweek;
import com.slk.wph.module.WPH_Feedweek.po.WphFeedweekExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphFeedweekMapper {
    int countByExample(WphFeedweekExample example);

    int deleteByExample(WphFeedweekExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphFeedweek record);

    int insertSelective(WphFeedweek record);

    List<WphFeedweek> selectByExample(WphFeedweekExample example);

    WphFeedweek selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphFeedweek record, @Param("example") WphFeedweekExample example);

    int updateByExample(@Param("record") WphFeedweek record, @Param("example") WphFeedweekExample example);

    int updateByPrimaryKeySelective(WphFeedweek record);

    int updateByPrimaryKey(WphFeedweek record);
}