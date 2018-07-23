package com.slk.wph.module.WPH_Feedmenu_Time.mapper;

import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTime;
import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphFeedmenuTimeMapper {
    int countByExample(WphFeedmenuTimeExample example);

    int deleteByExample(WphFeedmenuTimeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphFeedmenuTime record);

    int insertSelective(WphFeedmenuTime record);

    List<WphFeedmenuTime> selectByExample(WphFeedmenuTimeExample example);

    WphFeedmenuTime selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphFeedmenuTime record, @Param("example") WphFeedmenuTimeExample example);

    int updateByExample(@Param("record") WphFeedmenuTime record, @Param("example") WphFeedmenuTimeExample example);

    int updateByPrimaryKeySelective(WphFeedmenuTime record);

    int updateByPrimaryKey(WphFeedmenuTime record);
}