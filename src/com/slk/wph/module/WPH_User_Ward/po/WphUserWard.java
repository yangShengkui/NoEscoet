package com.slk.wph.module.WPH_User_Ward.po;

import java.util.Date;

public class WphUserWard {
    private Integer fid;

    private Integer wphUserFid;

    private Integer wphWardFid;

    private Date createdate;

    private Integer userFid;

    private String userrole;

    private String username;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphUserFid() {
        return wphUserFid;
    }

    public void setWphUserFid(Integer wphUserFid) {
        this.wphUserFid = wphUserFid;
    }

    public Integer getWphWardFid() {
        return wphWardFid;
    }

    public void setWphWardFid(Integer wphWardFid) {
        this.wphWardFid = wphWardFid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
}