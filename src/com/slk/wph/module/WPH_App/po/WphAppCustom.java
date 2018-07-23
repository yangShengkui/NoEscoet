package com.slk.wph.module.WPH_App.po;

import java.util.List;


public class WphAppCustom extends WphApp {
   
	public Integer userFid;
	
	public List<WphAppCustom> appCustomList;
	
	public String parentName;
	
	public Integer roleFid;
	
	public Integer checkON;

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getUserFid() {
		return userFid;
	}

	public void setUserFid(Integer userFid) {
		this.userFid = userFid;
	}

	public List<WphAppCustom> getAppCustomList() {
		return appCustomList;
	}

	public void setAppCustomList(List<WphAppCustom> appCustomList) {
		this.appCustomList = appCustomList;
	}

	public Integer getRoleFid() {
		return roleFid;
	}

	public void setRoleFid(Integer roleFid) {
		this.roleFid = roleFid;
	}

	public Integer getCheckON() {
		return checkON;
	}

	public void setCheckON(Integer checkON) {
		this.checkON = checkON;
	}

	
}