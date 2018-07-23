package com.slk.wph.module.WPH_Feedtype.po;

import java.util.Date;

public class WphFeedtype {
    private Integer fid;

    private Integer parentFid;

    private String name;

    private Date createdate;

    private String uuid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getParentFid() {
        return parentFid;
    }

    public void setParentFid(Integer parentFid) {
        this.parentFid = parentFid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }
}