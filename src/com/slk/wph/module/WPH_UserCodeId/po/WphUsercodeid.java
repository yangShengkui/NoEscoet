package com.slk.wph.module.WPH_UserCodeId.po;

import java.util.Date;

public class WphUsercodeid {
    private Integer fid;

    private String codenumber;

    private Integer codestatus;

    private String codeid;

    private Integer types;

    private Integer userFid;

    private String userrole;

    private String username;

    private Date createdate;
    
    private String customerfid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getCodenumber() {
        return codenumber;
    }

    public void setCodenumber(String codenumber) {
        this.codenumber = codenumber == null ? null : codenumber.trim();
    }

    public Integer getCodestatus() {
        return codestatus;
    }

    public void setCodestatus(Integer codestatus) {
        this.codestatus = codestatus;
    }

    public String getCodeid() {
        return codeid;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid == null ? null : codeid.trim();
    }

    public Integer getTypes() {
        return types;
    }

    public void setTypes(Integer types) {
        this.types = types;
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	public String getcustomerfid() {
		return customerfid;
	}

	public void setcustomerfid(String customerfid) {
		this.customerfid = customerfid;
	}
    
}