package com.slk.wph.module.WPH_Feedmenu.mapper;

import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenu;
import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphFeedmenuMapper {
    int countByExample(WphFeedmenuExample example);

    int deleteByExample(WphFeedmenuExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphFeedmenu record);

    int insertSelective(WphFeedmenu record);

    List<WphFeedmenu> selectByExample(WphFeedmenuExample example);

    WphFeedmenu selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphFeedmenu record, @Param("example") WphFeedmenuExample example);

    int updateByExample(@Param("record") WphFeedmenu record, @Param("example") WphFeedmenuExample example);

    int updateByPrimaryKeySelective(WphFeedmenu record);

    int updateByPrimaryKey(WphFeedmenu record);
}