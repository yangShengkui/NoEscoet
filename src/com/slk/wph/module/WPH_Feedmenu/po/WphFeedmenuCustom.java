package com.slk.wph.module.WPH_Feedmenu.po;

import com.slk.wph.module.WPH_Mealweek.po.WphMealweekCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

public class WphFeedmenuCustom extends WphFeedmenu {

    private String typeName;

    private String type2Name;

    private String type2Fid;

    private List<WphMealweekCustom> feedWeekTimeList;

    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getType2Name() {
        return type2Name;
    }

    public void setType2Name(String type2Name) {
        this.type2Name = type2Name;
    }

    public List<WphMealweekCustom> getFeedWeekTimeList() {
        return feedWeekTimeList;
    }

    public void setFeedWeekTimeList(List<WphMealweekCustom> feedWeekTimeList) {
        this.feedWeekTimeList = feedWeekTimeList;
    }

    public String getType2Fid() {
        return type2Fid;
    }

    public void setType2Fid(String type2Fid) {
        this.type2Fid = type2Fid;
    }
}