package com.slk.wph.module.WPH_Mealgroup.po;

import java.util.List;


public class WphMealgroupCustom extends WphMealgroup {
	private Integer state;

	private String groups;
	
	private List<Integer> fids;
	
	private Integer timeFid;
	
	private Integer mealadd;
	
	private List<WphMealGroupSpread> mealList;

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public List<WphMealGroupSpread> getMealList() {
		return mealList;
	}

	public void setMealList(List<WphMealGroupSpread> mealList) {
		this.mealList = mealList;
	}

	public List<Integer> getFids() {
		return fids;
	}

	public void setFids(List<Integer> fids) {
		this.fids = fids;
	}

	public Integer getTimeFid() {
		return timeFid;
	}

	public void setTimeFid(Integer timeFid) {
		this.timeFid = timeFid;
	}

	public Integer getMealadd() {
		return mealadd;
	}

	public void setMealadd(Integer mealadd) {
		this.mealadd = mealadd;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}