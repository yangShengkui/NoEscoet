package com.slk.wph.module.WPH_Feedmenu_Time.mapper;

import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTime;
import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTimeCustom;
import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphFeedmenuTimeMapperCustom {

    public Integer deleteFeedMenuTimeByInfo(WphFeedmenuTimeCustom WphFeedmenuTimeCustom);

}