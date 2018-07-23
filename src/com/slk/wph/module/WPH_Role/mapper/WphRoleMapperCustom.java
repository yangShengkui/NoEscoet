package com.slk.wph.module.WPH_Role.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Role.po.WphRole;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;


public interface WphRoleMapperCustom {
	
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
	/**
	 * 
	 *描述:根据用户id查询权限   可能有多个
	 *@param userFid
	 *@return
	 *创建人:赵福岭
	 *2017年6月19日
	 */
	public List<WphRole> getRoleListByUserId(Integer userFid);
}
