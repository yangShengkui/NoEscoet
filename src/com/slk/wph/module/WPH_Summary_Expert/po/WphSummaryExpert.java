package com.slk.wph.module.WPH_Summary_Expert.po;

import java.util.Date;

public class WphSummaryExpert {
    private Integer fid;

    private String position;

    private String positiontitle;

    private String name;

    private String outcall;

    private String major;

    private String duties;

    private String education;

    private String achievement;

    private Integer state;

    private String img;

    private String notes;

    private Date createdate;

    private String createuser;
    
    private Integer wardfid;

    private String zjoutcall;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPositiontitle() {
        return positiontitle;
    }

    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle == null ? null : positiontitle.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOutcall() {
        return outcall;
    }

    public void setOutcall(String outcall) {
        this.outcall = outcall == null ? null : outcall.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties == null ? null : duties.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
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

	public Integer getWardfid() {
		return wardfid;
	}

	public void setWardfid(Integer wardfid) {
		this.wardfid = wardfid;
	}

    public String getZjoutcall() {
        return zjoutcall;
    }

    public void setZjoutcall(String zjoutcall) {
        this.zjoutcall = zjoutcall;
    }
}