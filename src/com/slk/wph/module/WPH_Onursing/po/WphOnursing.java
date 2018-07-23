package com.slk.wph.module.WPH_Onursing.po;
import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.util.JSONUtils;

public class WphOnursing {

	private Integer userFid;//当前用户
	private Integer wphNursinggradeFid;//护理等级
	private String notes;//备注
	private String date;//日期
	private Integer[] customerFid;//患者

	private Integer flag;
	private String startDate;//护理开始日期
	private String endDate;//护理预计结束日期
	private Integer workerFid;//护工fid
	private Double money;
	static{
        String[] dateFormats = new String[] {"yyyy-MM-dd"};  
        JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(dateFormats));  
   }
	public Integer getUserFid() {
		return userFid;
	}
	public void setUserFid(Integer userFid) {
		this.userFid = userFid;
	}
	public Integer getWphNursinggradeFid() {
		return wphNursinggradeFid;
	}
	public void setWphNursinggradeFid(Integer wphNursinggradeFid) {
		this.wphNursinggradeFid = wphNursinggradeFid;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer[] getCustomerFid() {
		return customerFid;
	}
	public void setCustomerFid(Integer[] customerFid) {
		this.customerFid = customerFid;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public void setWorkerFid(Integer workerFid) {
		this.workerFid = workerFid;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getWorkerFid() {
		return workerFid;
	}
	
	

	
}
