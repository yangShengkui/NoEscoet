package com.slk.wph.module.WPH_NursingGrade.po;

import java.util.List;

import com.slk.wph.module.WPH_Ward.po.WphWard;

public class WphNursinggradeCustom extends WphNursinggrade {
	private Double nursingMoney;
	private Integer serivceDetailsFid;
	private Integer queryFid;
	private Integer serviceTypeFid;
	private Integer warOmFid;
	private Double wages;
	private List<WphWard> wphWardList;
	
	
	private Integer onCheck;

	public Integer getOnCheck() {
		return onCheck;
	}

	public void setOnCheck(Integer onCheck) {
		this.onCheck = onCheck;
	}
	
	public Double getNursingMoney() {
		return nursingMoney;
	}
	public void setNursingMoney(Double nursingMoney) {
		this.nursingMoney = nursingMoney;
	}
	public Integer getQueryFid() {
		return queryFid;
	}
	public void setQueryFid(Integer queryFid) {
		this.queryFid = queryFid;
	}
	public Integer getServiceTypeFid() {
		return serviceTypeFid;
	}
	public void setServiceTypeFid(Integer serviceTypeFid) {
		this.serviceTypeFid = serviceTypeFid;
	}
	public Integer getSerivceDetailsFid() {
		return serivceDetailsFid;
	}
	public void setSerivceDetailsFid(Integer serivceDetailsFid) {
		this.serivceDetailsFid = serivceDetailsFid;
	}
	public Integer getWarOmFid() {
		return warOmFid;
	}
	public void setWarOmFid(Integer warOmFid) {
		this.warOmFid = warOmFid;
	}
	public List<WphWard> getWphWardList() {
		return wphWardList;
	}
	public void setWphWardList(List<WphWard> wphWardList) {
		this.wphWardList = wphWardList;
	}

	public Double getWages() {
		return wages;
	}

	public void setWages(Double wages) {
		this.wages = wages;
	}
	
}
