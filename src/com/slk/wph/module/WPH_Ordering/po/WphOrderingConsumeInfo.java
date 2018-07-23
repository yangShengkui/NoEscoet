package com.slk.wph.module.WPH_Ordering.po;

public class WphOrderingConsumeInfo {
	//缴费金额
	private Double pay;
	//开卡押金
	private Double deposit;
	//护理金额
	private Double nursing;
	//餐类金额
	private Double meal;
	//血务金额
	private Double blood;
	//其他金额
	private Double other;
	//消费总金额
	private Double total;
	//退费金额
	private Double refund;
	
	public Double getPay() {
		return pay;
	}
	public void setPay(Double pay) {
		this.pay = pay;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getNursing() {
		return nursing;
	}
	public void setNursing(Double nursing) {
		this.nursing = nursing;
	}
	public Double getMeal() {
		return meal;
	}
	public void setMeal(Double meal) {
		this.meal = meal;
	}
	public Double getBlood() {
		return blood;
	}
	public void setBlood(Double blood) {
		this.blood = blood;
	}
	public Double getOther() {
		return other;
	}
	public void setOther(Double other) {
		this.other = other;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getRefund() {
		return refund;
	}
	public void setRefund(Double refund) {
		this.refund = refund;
	}
	
}
