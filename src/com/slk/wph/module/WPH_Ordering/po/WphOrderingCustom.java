package com.slk.wph.module.WPH_Ordering.po;

import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
public class WphOrderingCustom extends WphOrdering {
	private Date nursingDate;
	private String customerName;
	private String wardName;
	private String workName;
	private Double price;
	private Double totalMoney;
	private Integer nursingType;
	private Integer count;
	
	private String datetime;
	private String detalisName;
	private String queryName;
	
	private String datetime2;

	private Date startDate;
	private Date endDate;
	
	private Double price2;
	private Double price3;
	private Double price4;
	private Double price5;
	private Double price6;
	private Double price7;
	private Double price8;

	private List<WphOrdering> orderList;
	private List<WphOrderingfood> foodList;
	
	
	public List<WphOrdering> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<WphOrdering> orderList) {
		this.orderList = orderList;
	}
	public Date getNursingDate() {
		return nursingDate;
	}
	public void setNursingDate(Date nursingDate) {
		this.nursingDate = nursingDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public Integer getNursingType() {
		return nursingType;
	}
	public void setNursingType(Integer nursingType) {
		this.nursingType = nursingType;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getDetalisName() {
		return detalisName;
	}
	public void setDetalisName(String detalisName) {
		this.detalisName = detalisName;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getDatetime2() {
		return datetime2;
	}
	public void setDatetime2(String datetime2) {
		this.datetime2 = datetime2;
	}
	public Double getPrice2() {
		return price2;
	}
	public void setPrice2(Double price2) {
		this.price2 = price2;
	}
	public Double getPrice3() {
		return price3;
	}
	public void setPrice3(Double price3) {
		this.price3 = price3;
	}
	public Double getPrice4() {
		return price4;
	}
	public void setPrice4(Double price4) {
		this.price4 = price4;
	}
	public Double getPrice5() {
		return price5;
	}
	public void setPrice5(Double price5) {
		this.price5 = price5;
	}
	public Double getPrice6() {
		return price6;
	}
	public void setPrice6(Double price6) {
		this.price6 = price6;
	}
	public Double getPrice7() {
		return price7;
	}
	public void setPrice7(Double price7) {
		this.price7 = price7;
	}
	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public List<WphOrderingfood> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<WphOrderingfood> foodList) {
		this.foodList = foodList;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    public Double getPrice8() {
        return price8;
    }

    public void setPrice8(Double price8) {
        this.price8 = price8;
    }
}