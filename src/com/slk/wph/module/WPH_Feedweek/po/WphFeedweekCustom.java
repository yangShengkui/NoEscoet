package com.slk.wph.module.WPH_Feedweek.po;

import com.slk.wph.module.WPH_Feedtime.po.WphFeedtimeCustom;

import java.util.Date;
import java.util.List;

public class WphFeedweekCustom extends WphFeedweek {


    private Integer mwFid;

    private String mwName;

    private List<WphFeedtimeCustom> feedtimeList;


    public Integer getMwFid() {
        return mwFid;
    }

    public void setMwFid(Integer mwFid) {
        this.mwFid = mwFid;
    }

    public String getMwName() {
        return mwName;
    }

    public void setMwName(String mwName) {
        this.mwName = mwName;
    }

    public List<WphFeedtimeCustom> getFeedtimeList() {
        return feedtimeList;
    }

    public void setFeedtimeList(List<WphFeedtimeCustom> feedtimeList) {
        this.feedtimeList = feedtimeList;
    }
}
