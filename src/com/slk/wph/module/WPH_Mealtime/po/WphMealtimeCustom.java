package com.slk.wph.module.WPH_Mealtime.po;

import java.util.List;

import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;


public class WphMealtimeCustom extends WphMealtime {
	private Integer onCheck;

	private List<WphMealmenuCustom> menuList;
	
	public Integer getOnCheck() {
		return onCheck;
	}

	public void setOnCheck(Integer onCheck) {
		this.onCheck = onCheck;
	}

	public List<WphMealmenuCustom> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<WphMealmenuCustom> menuList) {
		this.menuList = menuList;
	}
	
	
}