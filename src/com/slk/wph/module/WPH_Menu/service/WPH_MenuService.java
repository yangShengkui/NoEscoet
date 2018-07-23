package com.slk.wph.module.WPH_Menu.service;

import com.slk.wph.module.WPH_Menu.mapper.WphMenuCustomMapper;
import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;

 public interface WPH_MenuService extends WphMenuCustomMapper {
	 
	 
	 public Boolean deleteMenu(WphMenuCustom zdyhMenuCustom) throws Exception;
	 
}