package com.slk.wph.module.WPH_User_Role.po;

import java.util.Date;

public class WphUserRole {
    private Integer fid;

    private Integer roleFid;

    private Integer userFid;

    private Integer modifyUserfid;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getRoleFid() {
        return roleFid;
    }

    public void setRoleFid(Integer roleFid) {
        this.roleFid = roleFid;
    }

    public Integer getUserFid() {
        return userFid;
    }

    public void setUserFid(Integer userFid) {
        this.userFid = userFid;
    }

    public Integer getModifyUserfid() {
        return modifyUserfid;
    }

    public void setModifyUserfid(Integer modifyUserfid) {
        this.modifyUserfid = modifyUserfid;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}