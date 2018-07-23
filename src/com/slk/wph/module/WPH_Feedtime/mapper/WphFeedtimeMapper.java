package com.slk.wph.module.WPH_Feedtime.mapper;

import com.slk.wph.module.WPH_Feedtime.po.WphFeedtime;
import com.slk.wph.module.WPH_Feedtime.po.WphFeedtimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphFeedtimeMapper {
    int countByExample(WphFeedtimeExample example);

    int deleteByExample(WphFeedtimeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphFeedtime record);

    int insertSelective(WphFeedtime record);

    List<WphFeedtime> selectByExample(WphFeedtimeExample example);

    WphFeedtime selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphFeedtime record, @Param("example") WphFeedtimeExample example);

    int updateByExample(@Param("record") WphFeedtime record, @Param("example") WphFeedtimeExample example);

    int updateByPrimaryKeySelective(WphFeedtime record);

    int updateByPrimaryKey(WphFeedtime record);
}