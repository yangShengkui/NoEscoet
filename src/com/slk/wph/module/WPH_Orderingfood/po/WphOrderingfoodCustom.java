package com.slk.wph.module.WPH_Orderingfood.po;

import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;


public class WphOrderingfoodCustom  extends WphOrderingfood {
	private Integer checkOn;

	private String name ;
	
	private Double customerBalance;
	
	private Double totalamount;
	
	private String wardName;
	
	private Integer wphWardFid;
	
	private String datetime;
	
	private String datetime2;
	
	private Integer nownum;
	
    private List<Integer> fids;
    
    private WphOrdering order;
    
    private String uuid;
    
    private WphCustomer customer;
    
    private List<WphOrderingfoodCustom> food;

	public List<Integer> getFids() {
		return fids;
	}

	public void setFids(List<Integer> fids) {
		this.fids = fids;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Integer getWphWardFid() {
		return wphWardFid;
	}

	public void setWphWardFid(Integer wphWardFid) {
		this.wphWardFid = wphWardFid;
	}

	public Double getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(Double customerBalance) {
		this.customerBalance = customerBalance;
	}

	public List<WphOrderingfoodCustom> getFood() {
		return food;
	}

	public void setFood(List<WphOrderingfoodCustom> food) {
		this.food = food;
	}

	public WphOrdering getOrder() {
		return order;
	}

	public void setOrder(WphOrdering order) {
		this.order = order;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(Double totalamount) {
		this.totalamount = totalamount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCheckOn() {
		return checkOn;
	}

	public void setCheckOn(Integer checkOn) {
		this.checkOn = checkOn;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public WphCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(WphCustomer customer) {
		this.customer = customer;
	}

	public String getDatetime2() {
		return datetime2;
	}

	public void setDatetime2(String datetime2) {
		this.datetime2 = datetime2;
	}

	public Integer getNownum() {
		return nownum;
	}

	public void setNownum(Integer nownum) {
		this.nownum = nownum;
	}

    
    
    
    
}