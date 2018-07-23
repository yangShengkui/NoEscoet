package com.slk.wph.module.WPH_SupplementNursing.po;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;


import java.util.Random;

public class WPH_SupplementNursing {
    //查询患者信息所需要的参数
    private String customerHospitalld;//后台传送数据   患者住院号
    private String cardNumber;//后台传输8位住院卡号
    //保存扣费信息
    private String notes;//后台传送数据 备注
    private Integer userFid;//后台传送数据 用户fid
    private WphCustomer wphCustom;//后台传输
    private double money;//后台传送数据   金额

    private Integer cusFid;//后台传送数据  患者fid
    private double balance;
    private String cardId;//后台传送数据  患者卡号--6位
    private String orderingNumber;//随机生成订单号
    private String roleName;
    private String userName;
    private Integer wardFid;


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getUserFid() {
        return userFid;
    }

    public void setUserFid(Integer userFid) {
        this.userFid = userFid;
    }

    public String getOrderingNumber() {
        if(wphCustom!=null){
            StringBuilder str = new StringBuilder("phd_");// 定义变长字符串
            Random random = new Random();
            // 随机生成数字，并添加到字符串
            for (int i = 0; i < 8; i++) {
                str.append(random.nextInt(10));
            }
            str.append(wphCustom.getFid());
            orderingNumber = str.toString();
        }
        return orderingNumber;
    }

    public void setOrderingNumber(String orderingNumber) {

        this.orderingNumber=orderingNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCustomerHospitalld() {
        if(wphCustom!=null){
            customerHospitalld= wphCustom.getHospitalld();
        }
        return customerHospitalld;
    }

    public void setCustomerHospitalld(String customerHospitalld) {
        this.customerHospitalld = customerHospitalld;
    }

    public String getCardId() {
        if(wphCustom!=null){
            cardId =wphCustom.getWphCardNumber();
        }
        return cardId;
    }

    public void setCardId(String cardId) {

        this.cardId =cardId;
    }

    public Integer getCusFid() {
        if(wphCustom!=null){
            cusFid =wphCustom.getFid();
        }
        return cusFid;
    }

    public void setCusFid(Integer cusFid) {
        this.cusFid =cusFid;
    }

    public WphCustomer getWphCustom() {
        return wphCustom;
    }

    public void setWphCustom(WphCustomer wphCustom) {
        this.wphCustom = wphCustom;
    }


    public double getBalance() {
        if(wphCustom!=null){
            balance=wphCustom.getBalance()-money;
        }
        return balance;
    }

    public void setBalance(double balance) {
        this.balance =balance;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getWardFid() {
        if(wphCustom!=null){
            wardFid=wphCustom.getWphWardFid();
        }
        return wardFid;
    }

    public void setWardFid(Integer wardFid) {
        this.wardFid = wardFid;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
