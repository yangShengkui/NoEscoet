package com.slk.wph.module.WPH_Mealmenu.po;

import java.util.Date;

public class WphMealmenu {
    private Integer fid;

    private Integer wphMealtypeFid;

    private String name;

    private Integer status;

    private Integer type;

    private String imgs;

    private Double money;

    private String depict;

    private Integer meterage;

    private Date createdate;

    private String uuid;

    private Integer maxnum;

    private Integer nownum;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getWphMealtypeFid() {
        return wphMealtypeFid;
    }

    public void setWphMealtypeFid(Integer wphMealtypeFid) {
        this.wphMealtypeFid = wphMealtypeFid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict == null ? null : depict.trim();
    }

    public Integer getMeterage() {
        return meterage;
    }

    public void setMeterage(Integer meterage) {
        this.meterage = meterage;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
    }

    public Integer getNownum() {
        return nownum;
    }

    public void setNownum(Integer nownum) {
        this.nownum = nownum;
    }
}