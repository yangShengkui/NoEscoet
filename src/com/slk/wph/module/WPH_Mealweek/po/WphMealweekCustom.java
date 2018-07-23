package com.slk.wph.module.WPH_Mealweek.po;

import java.util.List;

import com.slk.wph.module.WPH_Mealtime.po.WphMealtimeCustom;


public class WphMealweekCustom extends WphMealweek {

	private List<WphMealtimeCustom> mealtimeList;

	public List<WphMealtimeCustom> getMealtimeList() {
		return mealtimeList;
	}

	public void setMealtimeList(List<WphMealtimeCustom> mealtimeList) {
		this.mealtimeList = mealtimeList;
	}
	
}