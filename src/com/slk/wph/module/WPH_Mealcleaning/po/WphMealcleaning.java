package com.slk.wph.module.WPH_Mealcleaning.po;

public class WphMealcleaning {
    private Integer fid;

    private Integer wphCardFid;

    private String wphCardNumber;

    private Integer cleanstate;

    private Integer count;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphCardFid() {
        return wphCardFid;
    }

    public void setWphCardFid(Integer wphCardFid) {
        this.wphCardFid = wphCardFid;
    }

    public String getWphCardNumber() {
        return wphCardNumber;
    }

    public void setWphCardNumber(String wphCardNumber) {
        this.wphCardNumber = wphCardNumber == null ? null : wphCardNumber.trim();
    }

    public Integer getCleanstate() {
        return cleanstate;
    }

    public void setCleanstate(Integer cleanstate) {
        this.cleanstate = cleanstate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}