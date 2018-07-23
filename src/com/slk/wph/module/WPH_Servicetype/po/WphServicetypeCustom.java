package com.slk.wph.module.WPH_Servicetype.po;

import java.util.List;

import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;

public class WphServicetypeCustom extends WphServicetype {
	private List<WphServicedetails> detailsList;

	public List<WphServicedetails> getDetailsList() {
		return detailsList;
	}

	public void setDetailsList(List<WphServicedetails> detailsList) {
		this.detailsList = detailsList;
	}

}