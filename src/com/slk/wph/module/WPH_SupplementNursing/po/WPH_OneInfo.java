package com.slk.wph.module.WPH_SupplementNursing.po;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WPH_OneInfo {
    private String startDate;
    private String endDate;

    private int countDay;
    private int countDayBz;
    private int countMoney;
    private Integer oneFid;//合同id
    private Double subsidy;//补费金额


    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    public  String getStartDate() {
        if(null!=startDate&&!"".equals(startDate)){
            try {
                startDate=format.format(format.parse(startDate));
            } catch (ParseException e) {
                System.out.println("日期格式转换错误");
            }
        }
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        if(null!=endDate&&!"".equals(endDate)){
            try {
                endDate=format.format(format.parse(endDate));
            } catch (ParseException e) {
                System.out.println("日期格式转换错误");
            }
        }
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public int getCountMoney() {
        return countMoney;
    }

    public void setCountMoney(int countMoney) {
        this.countMoney = countMoney;
    }

    public int getCountDayBz() {
        return countDayBz;
    }

    public void setCountDayBz(int countDayBz) {
        this.countDayBz = countDayBz;
    }

    public Integer getOneFid() {
        return oneFid;
    }

    public void setOneFid(Integer oneFid) {
        this.oneFid = oneFid;
    }

    public Double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(Double subsidy) {
        this.subsidy = subsidy;
    }
}
