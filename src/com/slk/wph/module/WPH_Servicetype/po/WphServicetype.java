package com.slk.wph.module.WPH_Servicetype.po;

import java.util.Date;

public class WphServicetype {
    private Integer fid;

    private String name;

    private Integer wphQueryFid;

    private Date createdate;

    private String joinuuid;

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

    public Integer getWphQueryFid() {
        return wphQueryFid;
    }

    public void setWphQueryFid(Integer wphQueryFid) {
        this.wphQueryFid = wphQueryFid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getJoinuuid() {
        return joinuuid;
    }

    public void setJoinuuid(String joinuuid) {
        this.joinuuid = joinuuid == null ? null : joinuuid.trim();
    }
}