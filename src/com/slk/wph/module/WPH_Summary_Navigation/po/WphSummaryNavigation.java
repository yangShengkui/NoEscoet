package com.slk.wph.module.WPH_Summary_Navigation.po;

import java.util.Date;

public class WphSummaryNavigation {
    private Integer fid;

    private Integer wardFid;

    private String imgs;

    private String notes;

    private Date createdate;

    private String createuser;
    
    private Integer state;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWardFid() {
        return wardFid;
    }

    public void setWardFid(Integer wardFid) {
        this.wardFid = wardFid;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
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