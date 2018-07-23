package com.slk.wph.module.WPH_Customer.po;
/**
 * APP获取订餐查询使用
 */
public class WphMealCustomerApp {
	private String name;
	private String wph_Card_Number;
	private Integer checkstate;
	private String wph_MealType_Name;
	private Integer wph_MealType_Fid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCheckstate() {
		return checkstate;
	}
	public void setCheckstate(Integer checkstate) {
		this.checkstate = checkstate;
	}
	public String getWph_MealType_Name() {
		return wph_MealType_Name;
	}
	public void setWph_MealType_Name(String wph_MealType_Name) {
		this.wph_MealType_Name = wph_MealType_Name;
	}
	public Integer getWph_MealType_Fid() {
		return wph_MealType_Fid;
	}
	public void setWph_MealType_Fid(Integer wph_MealType_Fid) {
		this.wph_MealType_Fid = wph_MealType_Fid;
	}

	public String getWph_Card_Number() {
		return wph_Card_Number;
	}

	public void setWph_Card_Number(String wph_Card_Number) {
		this.wph_Card_Number = wph_Card_Number;
	}
}
