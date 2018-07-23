package com.slk.wph.module.WPH_One.po;

import java.util.Date;

public class WphOne {
    private Integer fid;

    private Integer wphWardFid;

    private Integer wphNursinggradeFid;

    private Integer customerFid;

    private Integer workersFid;

    private Date startdate;

    private Date enddate;

    private Double money;

    private Date createdate;

    private Integer userFid;

    private Integer statse;

    private String imgs;

    private Date trueenddate;

    private Integer wagesstates;

    private Double settlementmoney;
    
    private Double workermoney;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphWardFid() {
        return wphWardFid;
    }

    public void setWphWardFid(Integer wphWardFid) {
        this.wphWardFid = wphWardFid;
    }

    public Integer getWphNursinggradeFid() {
        return wphNursinggradeFid;
    }

    public void setWphNursinggradeFid(Integer wphNursinggradeFid) {
        this.wphNursinggradeFid = wphNursinggradeFid;
    }

    public Integer getCustomerFid() {
        return customerFid;
    }

    public void setCustomerFid(Integer customerFid) {
        this.customerFid = customerFid;
    }

    public Integer getWorkersFid() {
        return workersFid;
    }

    public void setWorkersFid(Integer workersFid) {
        this.workersFid = workersFid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUserFid() {
        return userFid;
    }

    public void setUserFid(Integer userFid) {
        this.userFid = userFid;
    }

    public Integer getStatse() {
        return statse;
    }

    public void setStatse(Integer statse) {
        this.statse = statse;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public Date getTrueenddate() {
        return trueenddate;
    }

    public void setTrueenddate(Date trueenddate) {
        this.trueenddate = trueenddate;
    }

    public Integer getWagesstates() {
        return wagesstates;
    }

    public void setWagesstates(Integer wagesstates) {
        this.wagesstates = wagesstates;
    }

    public Double getSettlementmoney() {
        return settlementmoney;
    }

    public void setSettlementmoney(Double settlementmoney) {
        this.settlementmoney = settlementmoney;
    }

	public Double getWorkermoney() {
		return workermoney;
	}

	public void setWorkermoney(Double workermoney) {
		this.workermoney = workermoney;
	}
    
    
}