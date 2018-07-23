package com.slk.wph.module.WPH_Blood.po;

import java.util.Date;

public class WphBlood {
    private Integer fid;

    private Integer customerFid;

    private String customerCardid;

    private String customerHospitalid;

    private String custmerName;

    private String bloodtype;

    private String picture;

    private Double dosage;

    private Double nowdosagemoney;

    private Double nowdosage;

    private Integer status;

    private Integer userFid;

    private String userrole;

    private String username;

    private Date createdate;

    private String notes;

    private String orderingnumber;
    
    private Date updatedate;
    
    private String codeNumber;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public String getCustomerHospitalid() {
        return customerHospitalid;
    }

    public void setCustomerHospitalid(String customerHospitalid) {
        this.customerHospitalid = customerHospitalid == null ? null : customerHospitalid.trim();
    }

    public String getCustmerName() {
        return custmerName;
    }

    public void setCustmerName(String custmerName) {
        this.custmerName = custmerName == null ? null : custmerName.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public Double getNowdosagemoney() {
        return nowdosagemoney;
    }

    public void setNowdosagemoney(Double nowdosagemoney) {
        this.nowdosagemoney = nowdosagemoney;
    }

    public Double getNowdosage() {
        return nowdosage;
    }

    public void setNowdosage(Double nowdosage) {
        this.nowdosage = nowdosage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getOrderingnumber() {
        return orderingnumber;
    }

    public void setOrderingnumber(String orderingnumber) {
        this.orderingnumber = orderingnumber == null ? null : orderingnumber.trim();
    }

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}
    
    
}