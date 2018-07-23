package com.slk.wph.module.WPH_Orderingnursing.po;

import java.util.Date;

public class WphOrderingnursingCustom extends WphOrderingnursing{
	
	private double cBalance;//患者余额
	
	private Integer wphWardFid;
	
	private double newBalance;// 订护理后余额
	
	private Integer cfid;
	
	private Integer ofid;
	
	private Date oendDate;

	private Integer wardOMFid;

	private Double newMoney;

	private Integer detailsFid;

	private Integer queryFid;

	private Integer serviceFid;

	private String newOrdering;

	private String orderDate;

	private String newCardId;

	public String getNewCardId() {
		return newCardId;
	}

	public void setNewCardId(String newCardId) {
		this.newCardId = newCardId;
	}


	public Integer getWardOMFid() {
		return wardOMFid;
	}

	public void setWardOMFid(Integer wardOMFid) {
		this.wardOMFid = wardOMFid;
	}

	public Double getNewMoney() {
		return newMoney;
	}

	public void setNewMoney(Double newMoney) {
		this.newMoney = newMoney;
	}

	public Integer getDetailsFid() {
		return detailsFid;
	}

	public void setDetailsFid(Integer detailsFid) {
		this.detailsFid = detailsFid;
	}

	public Integer getQueryFid() {
		return queryFid;
	}

	public void setQueryFid(Integer queryFid) {
		this.queryFid = queryFid;
	}

	public Integer getServiceFid() {
		return serviceFid;
	}

	public void setServiceFid(Integer serviceFid) {
		this.serviceFid = serviceFid;
	}

	public String getNewOrdering() {
		return newOrdering;
	}

	public void setNewOrdering(String newOrdering) {
		this.newOrdering = newOrdering;
	}





	public double getcBalance() {
		return cBalance;
	}

	public void setcBalance(double cBalance) {
		this.cBalance = cBalance;
	}

	public Integer getWphWardFid() {
		return wphWardFid;
	}

	public void setWphWardFid(Integer wphWardFid) {
		this.wphWardFid = wphWardFid;
	}

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}

	public Integer getCfid() {
		return cfid;
	}

	public void setCfid(Integer cfid) {
		this.cfid = cfid;
	}

	public Integer getOfid() {
		return ofid;
	}

	public void setOfid(Integer ofid) {
		this.ofid = ofid;
	}

	public Date getOendDate() {
		return oendDate;
	}

	public void setOendDate(Date oendDate) {
		this.oendDate = oendDate;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}
