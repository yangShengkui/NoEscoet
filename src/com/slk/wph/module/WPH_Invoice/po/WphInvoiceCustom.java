package com.slk.wph.module.WPH_Invoice.po;

public class WphInvoiceCustom extends WphInvoice{
	private String customerName;//患者名称
	private String wardName;//病区名称
	private String username;//办理人
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
