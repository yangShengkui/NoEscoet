package com.slk.wph.module.WPH_Card_Relation.po;

public class WphCardRelation {
    private Integer fid;

    private String cardid;

    private String cardnumber;

    private String newcardid;

    private String newcardnumber;

    private String hospitalld;

    private Integer customerFid;

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

    public String getNewcardid() {
        return newcardid;
    }

    public void setNewcardid(String newcardid) {
        this.newcardid = newcardid == null ? null : newcardid.trim();
    }

    public String getNewcardnumber() {
        return newcardnumber;
    }

    public void setNewcardnumber(String newcardnumber) {
        this.newcardnumber = newcardnumber == null ? null : newcardnumber.trim();
    }

    public String getHospitalld() {
        return hospitalld;
    }

    public void setHospitalld(String hospitalld) {
        this.hospitalld = hospitalld == null ? null : hospitalld.trim();
    }

    public Integer getCustomerFid() {
        return customerFid;
    }

    public void setCustomerFid(Integer customerFid) {
        this.customerFid = customerFid;
    }
}