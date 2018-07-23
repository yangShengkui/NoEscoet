package com.slk.wph.module.WPH_Mealmenu.po;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.slk.wph.module.WPH_Mealweek.po.WphMealweekCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;


public class WphMealmenuCustom extends WphMealmenu {
	
	private Integer week;
	
	private Integer mealTimeFid;
	
	private String mtName;
	
	private MultipartFile multipartFile;
	
	private List<Integer> fids;
	
	private WphOrderingfoodCustom food;
	
	private List<WphMealweekCustom> mealWeekTimeList;

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

	public List<WphMealweekCustom> getMealWeekTimeList() {
		return mealWeekTimeList;
	}

	public void setMealWeekTimeList(List<WphMealweekCustom> mealWeekTimeList) {
		this.mealWeekTimeList = mealWeekTimeList;
	}

	public String getMtName() {
		return mtName;
	}

	public void setMtName(String mtName) {
		this.mtName = mtName;
	}

	public List<Integer> getFids() {
		return fids;
	}

	public void setFids(List<Integer> fids) {
		this.fids = fids;
	}

	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public Integer getMealTimeFid() {
		return mealTimeFid;
	}

	public void setMealTimeFid(Integer mealTimeFid) {
		this.mealTimeFid = mealTimeFid;
	}

	public WphOrderingfoodCustom getFood() {
		return food;
	}

	public void setFood(WphOrderingfoodCustom food) {
		this.food = food;
	}

	
}