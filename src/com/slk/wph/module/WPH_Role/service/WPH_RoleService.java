package com.slk.wph.module.WPH_Role.service;

import java.util.List;
import com.slk.wph.module.WPH_Role.po.WphRole;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;

 public interface WPH_RoleService  {
	 public List<WphRoleCustom> findRoleByUserFid(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public int insertSelective(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public int updateByIdByuserFid(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public int deleteByIdByUserId(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public int deletePrivilege(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public int insertPrivilege(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public int deleteUser_Roles(Integer roleFid)throws Exception;
		
		public int deletePrivilege_Roles(Integer roleFid)throws Exception;
		
		public List<WphRoleCustom>  UserIdByRoles(WphRoleCustom Custom)throws Exception;
		
		public int deleteRoleByuser(Integer userFid)throws Exception;
		
		public int UpdateUserByRole(WphRoleCustom zdyhRoleCustom)throws Exception;
		
		public Integer getRoleByUserId(Integer userFid);
		
		public Integer updateRoleByFid(WphRole custom) throws Exception;
		 
		 /**
		  * 根据用户id获取该用户所有角色
		  * 赵福岭
		  */
		 public List<WphRole> getRoleListByUserId(Integer userFid);
	 
}