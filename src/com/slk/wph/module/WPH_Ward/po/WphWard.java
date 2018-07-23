package com.slk.wph.module.WPH_Ward.po;

import java.util.Date;

public class WphWard {
    private Integer fid;

    private Integer wphHospitaFid;

    private String name;

    private String abbreviation;

    private Date createdate;

    private String notes;

    private Double savemoney;

    private Double waringmoney;

    private Integer status;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphHospitaFid() {
        return wphHospitaFid;
    }

    public void setWphHospitaFid(Integer wphHospitaFid) {
        this.wphHospitaFid = wphHospitaFid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
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

    public Double getSavemoney() {
        return savemoney;
    }

    public void setSavemoney(Double savemoney) {
        this.savemoney = savemoney;
    }

    public Double getWaringmoney() {
        return waringmoney;
    }

    public void setWaringmoney(Double waringmoney) {
        this.waringmoney = waringmoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}