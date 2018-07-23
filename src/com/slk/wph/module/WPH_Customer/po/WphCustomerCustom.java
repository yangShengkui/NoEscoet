package com.slk.wph.module.WPH_Customer.po;

import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Card_Relation.po.WphCardRelation;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUser;

public class WphCustomerCustom extends WphCustomer {
	private Integer state;//通用
	
	private String hospitaName;

	private String wardName;
	
	private String orderingNumber;
	
	private WphUser user;
	
	private WphCardRelation cardRelation;
	
	private WphOrdering ordering;
	
	private WphOrderingfoodCustom food;
	
	private List<WphOrderingfoodCustom> foodList;
	
	private Integer newCardFID;

	private Double total;
    
	private Integer nursingFid;
	
	private String nursingGType;
	
	private String nursingName;
	
	private String workerName;
	
	private String nursingNotes;
	
	private Date startDate;
	
	private Date endDate;
	
	private Double cf;
	private Double ph;
	private Double qt;
	private Double oneAndOne;
	private Double oneAndMany;
	
	
	public String getHospitaName() {
		return hospitaName;
	}

	
	public void setHospitaName(String hospitaName) {
		this.hospitaName = hospitaName;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public WphOrdering getOrdering() {
		return ordering;
	}

	public void setOrdering(WphOrdering ordering) {
		this.ordering = ordering;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public WphCardRelation getCardRelation() {
		return cardRelation;
	}

	public void setCardRelation(WphCardRelation cardRelation) {
		this.cardRelation = cardRelation;
	}

	public Integer getNewCardFID() {
		return newCardFID;
	}

	public void setNewCardFID(Integer newCardFID) {
		this.newCardFID = newCardFID;
	}

	public Integer getNursingFid() {
		return nursingFid;
	}

	public void setNursingFid(Integer nursingFid) {
		this.nursingFid = nursingFid;
	}

	public String getNursingName() {
		return nursingName;
	}

	public void setNursingName(String nursingName) {
		this.nursingName = nursingName;
	}


	public String getNursingGType() {
		return nursingGType;
	}


	public void setNursingGType(String nursingGType) {
		this.nursingGType = nursingGType;
	}


	public String getWorkerName() {
		return workerName;
	}


	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public List<WphOrderingfoodCustom> getFoodList() {
		return foodList;
	}


	public void setFoodList(List<WphOrderingfoodCustom> foodList) {
		this.foodList = foodList;
	}


	public String getOrderingNumber() {
		return orderingNumber;
	}


	public void setOrderingNumber(String orderingNumber) {
		this.orderingNumber = orderingNumber;
	}


	public WphOrderingfoodCustom getFood() {
		return food;
	}


	public void setFood(WphOrderingfoodCustom food) {
		this.food = food;
	}


	public Double getCf() {
		return cf;
	}


	public void setCf(Double cf) {
		this.cf = cf;
	}


	public Double getPh() {
		return ph;
	}


	public void setPh(Double ph) {
		this.ph = ph;
	}


	public Double getQt() {
		return qt;
	}


	public void setQt(Double qt) {
		this.qt = qt;
	}


	public Double getOneAndOne() {
		return oneAndOne;
	}


	public void setOneAndOne(Double oneAndOne) {
		this.oneAndOne = oneAndOne;
	}


	public Double getOneAndMany() {
		return oneAndMany;
	}


	public void setOneAndMany(Double oneAndMany) {
		this.oneAndMany = oneAndMany;
	}


	public String getNursingNotes() {
		return nursingNotes;
	}


	public void setNursingNotes(String nursingNotes) {
		this.nursingNotes = nursingNotes;
	}


	public Integer getState() {
		return state;
	}


	public void setState(Integer state) {
		this.state = state;
	}


	public WphUser getUser() {
		return user;
	}


	public void setUser(WphUser user) {
		this.user = user;
	}


	
}
