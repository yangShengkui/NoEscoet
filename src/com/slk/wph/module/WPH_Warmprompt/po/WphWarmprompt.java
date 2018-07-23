package com.slk.wph.module.WPH_Warmprompt.po;

public class WphWarmprompt {
    private Integer fid;

    private Integer type;

    private String notes;

    private Integer ztype;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getZtype() {
        return ztype;
    }

    public void setZtype(Integer ztype) {
        this.ztype = ztype;
    }
}