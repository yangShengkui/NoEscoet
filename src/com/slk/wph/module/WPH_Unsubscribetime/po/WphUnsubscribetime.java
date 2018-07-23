package com.slk.wph.module.WPH_Unsubscribetime.po;

import java.util.Date;

public class WphUnsubscribetime {
    private Integer fid;

    private Integer wphMealtimeFid;

    private Integer type;

    private String starttime;

    private String endtime;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphMealtimeFid() {
        return wphMealtimeFid;
    }

    public void setWphMealtimeFid(Integer wphMealtimeFid) {
        this.wphMealtimeFid = wphMealtimeFid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}