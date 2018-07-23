package com.slk.wph.module.WPH_Role.po;

import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;


public class WphRoleCustom extends  WphRole{
	
	private Integer userFid;
	
	private Integer[] menuIds;
	
	private Integer[] appIds;
	
	private String userName;
	
	private WphMenuCustom wphMenuCustom;
	
	
	private String menuType;
	
	private Integer checkOn;
	
	
	private Integer[] rolesFids;
	
	
	
	
	
	
	

	public Integer[] getRolesFids() {
		return rolesFids;
	}

	public void setRolesFids(Integer[] rolesFids) {
		this.rolesFids = rolesFids;
	}

	public Integer getCheckOn() {
		return checkOn;
	}

	public void setCheckOn(Integer checkOn) {
		this.checkOn = checkOn;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer[] getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(Integer[] menuIds) {
		this.menuIds = menuIds;
	}

	public Integer getUserFid() {
		return userFid;
	}

	public void setUserFid(Integer userFid) {
		this.userFid = userFid;
	}

	public WphMenuCustom getWphMenuCustom() {
		return wphMenuCustom;
	}

	public void setWphMenuCustom(WphMenuCustom wphMenuCustom) {
		this.wphMenuCustom = wphMenuCustom;
	}

	public Integer[] getAppIds() {
		return appIds;
	}

	public void setAppIds(Integer[] appIds) {
		this.appIds = appIds;
	}

}
