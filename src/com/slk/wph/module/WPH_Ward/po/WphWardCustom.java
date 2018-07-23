package com.slk.wph.module.WPH_Ward.po;

import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;

public class WphWardCustom extends WphWard {
	
	
	
	private String hospitaName;
	
	private String datetime;
	
	private List<WphCustomerCustom> customerList;
	
	private List<WphOrderingfoodCustom> foodList;
	

	private List<WphNursinggradeCustom> nursingGradeList;
	
	public List<WphOrderingfoodCustom> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<WphOrderingfoodCustom> foodList) {
		this.foodList = foodList;
	}

	
	public String getHospitaName() {
		return hospitaName;
	}

	public void setHospitaName(String hospitaName) {
		this.hospitaName = hospitaName;
	}

	public List<WphNursinggradeCustom> getNursingGradeList() {
		return nursingGradeList;
	}

	public void setNursingGradeList(List<WphNursinggradeCustom> nursingGradeList) {
		this.nursingGradeList = nursingGradeList;
	}

	public List<WphCustomerCustom> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<WphCustomerCustom> customerList) {
		this.customerList = customerList;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}


	
}
