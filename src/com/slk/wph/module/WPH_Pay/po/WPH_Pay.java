package com.slk.wph.module.WPH_Pay.po;

import com.slk.InternetPay.info.alipay.PrecreateAliPay;

public class WPH_Pay {
	
	
	private String name;
	
	private String zyh;
	
	private String ddh;
	
	private PrecreateAliPay aliPay;
	
	private String cardNum;
	
	private Double je;

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public PrecreateAliPay getAliPay() {
		return aliPay;
	}

	public void setAliPay(PrecreateAliPay aliPay) {
		this.aliPay = aliPay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZyh() {
		return zyh;
	}

	public void setZyh(String zyh) {
		this.zyh = zyh;
	}

	public String getDdh() {
		return ddh;
	}

	public void setDdh(String ddh) {
		this.ddh = ddh;
	}

	public Double getJe() {
		return je;
	}

	public void setJe(Double je) {
		this.je = je;
	}
	
	
}
