package com.slk.wph.module.WPH_User_Ward.po;

import java.util.List;

import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_Ward.po.WphWard;

public class WphUserWardCustom extends WphUserWard{
	
	private WphUser wphUser;
	
	public WphUser getWphUser() {
		return wphUser;
	}
	public void setWphUser(WphUser wphUser) {
		this.wphUser = wphUser;
	}
	private List<WphWard> wardList;

	public List<WphWard> getWardList() {
		return wardList;
	}
	public void setWardList(List<WphWard> wardList) {
		this.wardList = wardList;
	}
	
	
	
}
