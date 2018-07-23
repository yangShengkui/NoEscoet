package com.slk.wph.module.WPH_Menu.po;

import java.io.Serializable;
import java.util.List;

public class WphMenuCustom extends WphMenu implements Serializable{
	
	/**
	 * @Fields serialVersionUID
	 * @作者 隋乔镇 
	 * @创建日期 2016年8月30日 
	 */ 
	
	private static final long serialVersionUID = 1L;


	private List<WphMenu> zdyhMenuList;
	
	
	private List<WphMenuCustom> menuCustomList;
	
	
	private  Integer maxLevels;
	
	
	private Integer userFid;
	
	
	private String parentName;
	
	
	private Integer checkON;
	
	
	private Integer[] fids;
	
	private Integer nowUserFid;
	
	private Integer roleFid;
	
	
	
	

	public Integer getNowUserFid() {
		return nowUserFid;
	}

	public void setNowUserFid(Integer nowUserFid) {
		this.nowUserFid = nowUserFid;
	}

	public Integer[] getFids() {
		return fids;
	}

	public void setFids(Integer[] fids) {
		this.fids = fids;
	}

	public Integer getCheckON() {
		return checkON;
	}

	public void setCheckON(Integer checkON) {
		this.checkON = checkON;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getUserFid() {
		return userFid;
	}

	public void setUserFid(Integer userFid) {
		this.userFid = userFid;
	}

	public Integer getMaxLevels() {
		return maxLevels;
	}

	public void setMaxLevels(Integer maxLevels) {
		this.maxLevels = maxLevels;
	}

	public List<WphMenuCustom> getMenuCustomList() {
		return menuCustomList;
	}

	public void setMenuCustomList(List<WphMenuCustom> menuCustomList) {
		this.menuCustomList = menuCustomList;
	}

	public List<WphMenu> getZdyhMenuList() {
		return zdyhMenuList;
	}

	public void setZdyhMenuList(List<WphMenu> zdyhMenuList) {
		this.zdyhMenuList = zdyhMenuList;
	}

	public Integer getRoleFid() {
		return roleFid;
	}

	public void setRoleFid(Integer roleFid) {
		this.roleFid = roleFid;
	}

	
	
	
	

}
