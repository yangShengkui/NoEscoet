package com.slk.wph.module.WPH_Card.po;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaning;

public class WphCardCustom extends WphCard{
	
	private WphMealcleaning cleaning;
	
	private WphCustomerCustom wphCustomer;

	public WphCustomerCustom getWphCustomer() {
		return wphCustomer;
	}

	public void setWphCustomer(WphCustomerCustom wphCustomer) {
		this.wphCustomer = wphCustomer;
	}

	public WphMealcleaning getCleaning() {
		return cleaning;
	}

	public void setCleaning(WphMealcleaning cleaning) {
		this.cleaning = cleaning;
	}

	
	
}
