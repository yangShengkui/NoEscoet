package com.slk.wph.module.WPH_Query.po;

import java.util.List;

import com.slk.wph.module.WPH_Servicetype.po.WphServicetypeCustom;

public class WphQueryCustom extends WphQuery {
	List<WphServicetypeCustom> typeList;

	public List<WphServicetypeCustom> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<WphServicetypeCustom> typeList) {
		this.typeList = typeList;
	}
	
}