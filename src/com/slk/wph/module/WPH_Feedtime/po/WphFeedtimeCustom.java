package com.slk.wph.module.WPH_Feedtime.po;

import java.util.Date;

public class WphFeedtimeCustom extends WphFeedtime {


    private Integer mtFid;

    private String mtName;

    private Integer onCheck;


    public Integer getMtFid() {
        return mtFid;
    }

    public void setMtFid(Integer mtFid) {
        this.mtFid = mtFid;
    }

    public String getMtName() {
        return mtName;
    }

    public void setMtName(String mtName) {
        this.mtName = mtName;
    }

    public Integer getOnCheck() {
        return onCheck;
    }

    public void setOnCheck(Integer onCheck) {
        this.onCheck = onCheck;
    }
}