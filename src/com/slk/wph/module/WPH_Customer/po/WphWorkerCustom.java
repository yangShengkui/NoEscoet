package com.slk.wph.module.WPH_Customer.po;

public class WphWorkerCustom extends WphCustomer{
	private Integer wphoneFid;
	private double price;  //单价
	private int duration;  //分钟数
	private double total;  //总价
	
	public Integer getWphoneFid() {
		return wphoneFid;
	}
	public void setWphoneFid(Integer wphoneFid) {
		this.wphoneFid = wphoneFid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
