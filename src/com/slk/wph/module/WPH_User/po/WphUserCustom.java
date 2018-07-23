package com.slk.wph.module.WPH_User.po;

import java.util.List;

import com.slk.wph.module.WPH_Role.po.WphRole;
import com.slk.wph.module.WPH_Ward.po.WphWard;



public class WphUserCustom extends WphUser{
	
	private Integer state;
	
	private String password2;
	
	private String roleName;
	
	private String roleFid;
	
	private Integer num;
	
	private List<WphRole> zdyhRoles ; 
	//赵福岭       所属主管名称         所属病区名称
	private String managerName;
	
	/*private String wardName;*/
	/**
	 * 用户所包含的病区
	 */
	private List<WphWard> wphWardList;
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public List<WphRole> getZdyhRoles() {
		return zdyhRoles;
	}

	public void setZdyhRoles(List<WphRole> zdyhRoles) {
		this.zdyhRoles = zdyhRoles;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<WphWard> getWphWardList() {
		return wphWardList;
	}

	public void setWphWardList(List<WphWard> wphWardList) {
		this.wphWardList = wphWardList;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getRoleFid() {
		return roleFid;
	}

	public void setRoleFid(String roleFid) {
		this.roleFid = roleFid;
	}
	

/*	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}*/

	

}
