package com.slk.wph.module.WPH_Orderingnursing.po;

import java.util.Date;

public class WphOrderingnursing {
    private Integer fid;

    private String orderingnumber;
    
    private String oldOrderingnumber;

    private String title;

    private String depict;

    private Integer wphWardOmFid;

    private String nursingName;

    private Double money;

    private Date nursingdate;

    private Integer nursingstates;

    private Integer customerFid;

    private String customerHospitalld;

    private Integer nursingType;

    private Integer wphOneFid;

    private Integer workersFid;

    private String customerCardid;

    private Integer userFid;

    private String userrole;

    private String username;

    private String notes;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getOrderingnumber() {
        return orderingnumber;
    }

    public void setOrderingnumber(String orderingnumber) {
        this.orderingnumber = orderingnumber == null ? null : orderingnumber.trim();
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

    public Integer getWphWardOmFid() {
        return wphWardOmFid;
    }

    public void setWphWardOmFid(Integer wphWardOmFid) {
        this.wphWardOmFid = wphWardOmFid;
    }

    public String getNursingName() {
        return nursingName;
    }

    public void setNursingName(String nursingName) {
        this.nursingName = nursingName == null ? null : nursingName.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getNursingdate() {
        return nursingdate;
    }

    public void setNursingdate(Date nursingdate) {
        this.nursingdate = nursingdate;
    }

    public Integer getNursingstates() {
        return nursingstates;
    }

    public void setNursingstates(Integer nursingstates) {
        this.nursingstates = nursingstates;
    }

    public Integer getCustomerFid() {
        return customerFid;
    }

    public void setCustomerFid(Integer customerFid) {
        this.customerFid = customerFid;
    }

    public String getCustomerHospitalld() {
        return customerHospitalld;
    }

    public void setCustomerHospitalld(String customerHospitalld) {
        this.customerHospitalld = customerHospitalld == null ? null : customerHospitalld.trim();
    }

    public Integer getNursingType() {
        return nursingType;
    }

    public void setNursingType(Integer nursingType) {
        this.nursingType = nursingType;
    }

    public Integer getWphOneFid() {
        return wphOneFid;
    }

    public void setWphOneFid(Integer wphOneFid) {
        this.wphOneFid = wphOneFid;
    }

    public Integer getWorkersFid() {
        return workersFid;
    }

    public void setWorkersFid(Integer workersFid) {
        this.workersFid = workersFid;
    }

    public String getCustomerCardid() {
        return customerCardid;
    }

    public void setCustomerCardid(String customerCardid) {
        this.customerCardid = customerCardid == null ? null : customerCardid.trim();
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	public String getOldOrderingnumber() {
		return oldOrderingnumber;
	}

	public void setOldOrderingnumber(String oldOrderingnumber) {
		this.oldOrderingnumber = oldOrderingnumber == null ? null : oldOrderingnumber.trim();
	}
    
}