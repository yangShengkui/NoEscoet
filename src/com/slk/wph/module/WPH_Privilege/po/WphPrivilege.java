package com.slk.wph.module.WPH_Privilege.po;

import java.util.Date;

public class WphPrivilege {
    private Integer fid;

    private String privilegemaster;

    private Integer privilegemastervalue;

    private String privilegeaccess;

    private Integer privilegeaccessvalue;

    private String privilegeaccesscodeorurl;

    private String privilegeoperation;

    private Integer modifyUserfid;

    private Date modifydate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getPrivilegemaster() {
        return privilegemaster;
    }

    public void setPrivilegemaster(String privilegemaster) {
        this.privilegemaster = privilegemaster == null ? null : privilegemaster.trim();
    }

    public Integer getPrivilegemastervalue() {
        return privilegemastervalue;
    }

    public void setPrivilegemastervalue(Integer privilegemastervalue) {
        this.privilegemastervalue = privilegemastervalue;
    }

    public String getPrivilegeaccess() {
        return privilegeaccess;
    }

    public void setPrivilegeaccess(String privilegeaccess) {
        this.privilegeaccess = privilegeaccess == null ? null : privilegeaccess.trim();
    }

    public Integer getPrivilegeaccessvalue() {
        return privilegeaccessvalue;
    }

    public void setPrivilegeaccessvalue(Integer privilegeaccessvalue) {
        this.privilegeaccessvalue = privilegeaccessvalue;
    }

    public String getPrivilegeaccesscodeorurl() {
        return privilegeaccesscodeorurl;
    }

    public void setPrivilegeaccesscodeorurl(String privilegeaccesscodeorurl) {
        this.privilegeaccesscodeorurl = privilegeaccesscodeorurl == null ? null : privilegeaccesscodeorurl.trim();
    }

    public String getPrivilegeoperation() {
        return privilegeoperation;
    }

    public void setPrivilegeoperation(String privilegeoperation) {
        this.privilegeoperation = privilegeoperation == null ? null : privilegeoperation.trim();
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