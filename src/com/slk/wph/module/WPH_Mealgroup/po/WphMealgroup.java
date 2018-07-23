package com.slk.wph.module.WPH_Mealgroup.po;

import java.util.Date;

public class WphMealgroup {
    private Integer fid;

    private Integer wphWardFid;

    private String wphWardName;

    private String group1;

    private String group2;

    private String group3;

    private String group4;

    private String group5;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphWardFid() {
        return wphWardFid;
    }

    public void setWphWardFid(Integer wphWardFid) {
        this.wphWardFid = wphWardFid;
    }

    public String getWphWardName() {
        return wphWardName;
    }

    public void setWphWardName(String wphWardName) {
        this.wphWardName = wphWardName == null ? null : wphWardName.trim();
    }

    public String getGroup1() {
        return group1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1 == null ? null : group1.trim();
    }

    public String getGroup2() {
        return group2;
    }

    public void setGroup2(String group2) {
        this.group2 = group2 == null ? null : group2.trim();
    }

    public String getGroup3() {
        return group3;
    }

    public void setGroup3(String group3) {
        this.group3 = group3 == null ? null : group3.trim();
    }

    public String getGroup4() {
        return group4;
    }

    public void setGroup4(String group4) {
        this.group4 = group4 == null ? null : group4.trim();
    }

    public String getGroup5() {
        return group5;
    }

    public void setGroup5(String group5) {
        this.group5 = group5 == null ? null : group5.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}