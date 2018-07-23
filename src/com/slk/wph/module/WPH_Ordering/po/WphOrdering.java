package com.slk.wph.module.WPH_Ordering.po;

import java.util.Date;

public class WphOrdering {
    private Integer fid;

    private String title;

    private String depict;

    private Double money;

    private Integer orderingstatse;

    private Integer customerFid;

    private String customerCarid;

    private String customerHospitalld;

    private Double customerBalance;

    private Integer wphInvoicerateFid;

    private Integer wphQueryFid;

    private Integer wphServicetypeFid;

    private Integer wphServicedetailsFid;

    private Date orderingdate;

    private Integer paytype;

    private String payordernumber;

    private String orderingnumber;

    private String oldorderingnumber;

    private Integer userFid;

    private String userrole;

    private String username;

    private String notes;

    private Integer wphWardFid;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict == null ? null : depict.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getOrderingstatse() {
        return orderingstatse;
    }

    public void setOrderingstatse(Integer orderingstatse) {
        this.orderingstatse = orderingstatse;
    }

    public Integer getCustomerFid() {
        return customerFid;
    }

    public void setCustomerFid(Integer customerFid) {
        this.customerFid = customerFid;
    }

    public String getCustomerCarid() {
        return customerCarid;
    }

    public void setCustomerCarid(String customerCarid) {
        this.customerCarid = customerCarid == null ? null : customerCarid.trim();
    }

    public String getCustomerHospitalld() {
        return customerHospitalld;
    }

    public void setCustomerHospitalld(String customerHospitalld) {
        this.customerHospitalld = customerHospitalld == null ? null : customerHospitalld.trim();
    }

    public Double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(Double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public Integer getWphInvoicerateFid() {
        return wphInvoicerateFid;
    }

    public void setWphInvoicerateFid(Integer wphInvoicerateFid) {
        this.wphInvoicerateFid = wphInvoicerateFid;
    }

    public Integer getWphQueryFid() {
        return wphQueryFid;
    }

    public void setWphQueryFid(Integer wphQueryFid) {
        this.wphQueryFid = wphQueryFid;
    }

    public Integer getWphServicetypeFid() {
        return wphServicetypeFid;
    }

    public void setWphServicetypeFid(Integer wphServicetypeFid) {
        this.wphServicetypeFid = wphServicetypeFid;
    }

    public Integer getWphServicedetailsFid() {
        return wphServicedetailsFid;
    }

    public void setWphServicedetailsFid(Integer wphServicedetailsFid) {
        this.wphServicedetailsFid = wphServicedetailsFid;
    }

    public Date getOrderingdate() {
        return orderingdate;
    }

    public void setOrderingdate(Date orderingdate) {
        this.orderingdate = orderingdate;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getPayordernumber() {
        return payordernumber;
    }

    public void setPayordernumber(String payordernumber) {
        this.payordernumber = payordernumber == null ? null : payordernumber.trim();
    }

    public String getOrderingnumber() {
        return orderingnumber;
    }

    public void setOrderingnumber(String orderingnumber) {
        this.orderingnumber = orderingnumber == null ? null : orderingnumber.trim();
    }

    public String getOldorderingnumber() {
        return oldorderingnumber;
    }

    public void setOldorderingnumber(String oldorderingnumber) {
        this.oldorderingnumber = oldorderingnumber == null ? null : oldorderingnumber.trim();
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getWphWardFid() {
        return wphWardFid;
    }

    public void setWphWardFid(Integer wphWardFid) {
        this.wphWardFid = wphWardFid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}