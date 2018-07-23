package com.slk.wph.module.WPH_Ordering.po;

import java.util.List;

public class WphMealInfo {
    private String name;
    private String cardnumber;
    private String orderNumber;
    private Double countMoney;
    private List<WphMealInfo> infoList;
    private List<WphMealCollect> mealCollectList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getCountMoney() {
        return countMoney;
    }

    public void setCountMoney(Double countMoney) {
        this.countMoney = countMoney;
    }

    public List<WphMealCollect> getMealCollectList() {
        return mealCollectList;
    }

    public void setMealCollectList(List<WphMealCollect> mealCollectList) {
        this.mealCollectList = mealCollectList;
    }

    public List<WphMealInfo> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<WphMealInfo> infoList) {
        this.infoList = infoList;
    }
}
