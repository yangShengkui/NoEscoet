package com.slk.wph.module.WPH_Card.po;

import java.util.Date;

public class WphCard {
    private Integer fid;

    private String cardid;

    private String cardnumber;

    private Integer cardstatus;

    private Integer type;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public Integer getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(Integer cardstatus) {
        this.cardstatus = cardstatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}