package com.slk.wph.module.WPH_App.po;

import java.util.Date;

public class WphApp {
    private Integer fid;

    private String name;

    private String power;

    private String powerImg;

    private Integer parentFid;

    private Integer levels;

    private Integer orders;

    private Integer createUserfid;

    private Date createtime;

    private String spare;

    private String depict;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getPowerImg() {
        return powerImg;
    }

    public void setPowerImg(String powerImg) {
        this.powerImg = powerImg == null ? null : powerImg.trim();
    }

    public Integer getParentFid() {
        return parentFid;
    }

    public void setParentFid(Integer parentFid) {
        this.parentFid = parentFid;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getCreateUserfid() {
        return createUserfid;
    }

    public void setCreateUserfid(Integer createUserfid) {
        this.createUserfid = createUserfid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict == null ? null : depict.trim();
    }
}