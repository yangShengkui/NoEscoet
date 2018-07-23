package com.slk.wph.module.WPH_Pcservicedetails.po;

import java.util.Date;

public class WphPcservicedetails {
    private Integer fid;

    private Integer pcservicetypeFid;

    private String name;

    private String img;

    private String detail;

    private String note;

    private Date createdate;

    private String createuser;

    private Integer state;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getPcservicetypeFid() {
        return pcservicetypeFid;
    }

    public void setPcservicetypeFid(Integer pcservicetypeFid) {
        this.pcservicetypeFid = pcservicetypeFid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}