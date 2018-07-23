package com.slk.wph.module.Wph_Ward_Om.po;

import java.util.Date;

public class WphWardOm {
    private Integer fid;

    private Integer wphWardFid;

    private String omName;

    private Integer wphNursinggradeType;

    private Integer wphNursinggradeFid;

    private Double money;

    private Date createdate;

    private Double wages;

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

    public String getOmName() {
        return omName;
    }

    public void setOmName(String omName) {
        this.omName = omName == null ? null : omName.trim();
    }

    public Integer getWphNursinggradeType() {
        return wphNursinggradeType;
    }

    public void setWphNursinggradeType(Integer wphNursinggradeType) {
        this.wphNursinggradeType = wphNursinggradeType;
    }

    public Integer getWphNursinggradeFid() {
        return wphNursinggradeFid;
    }

    public void setWphNursinggradeFid(Integer wphNursinggradeFid) {
        this.wphNursinggradeFid = wphNursinggradeFid;
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

    public Double getWages() {
        return wages;
    }

    public void setWages(Double wages) {
        this.wages = wages;
    }
}