package com.slk.wph.module.WPH_Invoice.po;

import java.util.Date;

public class WphInvoice {
    private Integer fid;

    private String name;

    private Integer customerFid;

    private String customerCardid;

    private String customerHospitalld;

    private Integer wphInvoicerateFid;

    private Double rate;

    private Double money;

    private Double taxation;

    private Integer userFid;

    private String userrole;

    private String username;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCustomerFid() {
        return customerFid;
    }

    public void setCustomerFid(Integer customerFid) {
        this.customerFid = customerFid;
    }

    public String getCustomerCardid() {
        return customerCardid;
    }

    public void setCustomerCardid(String customerCardid) {
        this.customerCardid = customerCardid == null ? null : customerCardid.trim();
    }

    public String getCustomerHospitalld() {
        return customerHospitalld;
    }

    public void setCustomerHospitalld(String customerHospitalld) {
        this.customerHospitalld = customerHospitalld == null ? null : customerHospitalld.trim();
    }

    public Integer getWphInvoicerateFid() {
        return wphInvoicerateFid;
    }

    public void setWphInvoicerateFid(Integer wphInvoicerateFid) {
        this.wphInvoicerateFid = wphInvoicerateFid;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getTaxation() {
        return taxation;
    }

    public void setTaxation(Double taxation) {
        this.taxation = taxation;
    }

    public Integer getUserFid() {
        return userFid;
    }

    public void setUserFid(Integer userFid) {
        this.userFid = userFid;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole == null ? null : userrole.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}