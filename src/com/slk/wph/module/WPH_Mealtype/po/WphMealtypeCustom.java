package com.slk.wph.module.WPH_Mealtype.po;

import java.util.List;

import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;


public class WphMealtypeCustom extends WphMealtype {
	
	private List<WphMealmenuCustom> mealmenuList;

	public List<WphMealmenuCustom> getMealmenuList() {
		return mealmenuList;
	}

	public void setMealmenuList(List<WphMealmenuCustom> mealmenuList) {
		this.mealmenuList = mealmenuList;
	}

}