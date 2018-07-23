package com.slk.wph.module.WPH_Feedmenu.service;

import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenu;
import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenuCustom;
import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTimeCustom;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtype;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtypeCustom;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;

import java.util.List;

public interface WPH_FeedmenuService {

  public Boolean setFeedType(WphFeedtype type);

  public List<WphFeedtypeCustom> selectFeedtypesByPId();

  public Boolean setFeedmenu(WphFeedmenuCustom feed);

  public List<WphFeedmenuCustom> selectweekFeedAll();

  public Integer getDeleteOrCreateByMealMenuTime(WphFeedmenuTimeCustom mealmenuTime);
}
