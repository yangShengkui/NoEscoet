package com.slk.wph.module.WPH_Role.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.wph.module.WPH_Role.mapper.WphRoleMapper;
import com.slk.wph.module.WPH_Role.mapper.WphRoleMapperCustom;
import com.slk.wph.module.WPH_Role.po.WphRole;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;
import com.slk.wph.module.WPH_Role.service.WPH_RoleService;

@Service
 public class  WPH_RoleServiceImpl implements WPH_RoleService  {
	
	@Autowired
	private WphRoleMapper roleMapper;
	
	@Autowired
	private WphRoleMapperCustom  mapperCustom;
	
	private Integer userFid;
	

	
	public List<WphRoleCustom> findRoleByUserFid(WphRoleCustom zdyhRoleCustom)
			throws Exception {
		return this.mapperCustom.findRoleByUserFid(zdyhRoleCustom);
	}



	
	public int insertSelective(WphRoleCustom zdyhRoleCustom) throws Exception {
		return mapperCustom.insertSelective(zdyhRoleCustom);
	}




	
	public int updateByIdByuserFid(WphRoleCustom zdyhRoleCustom)
			throws Exception {
		return this.mapperCustom.updateByIdByuserFid(zdyhRoleCustom);
	}



	@Override
	public int deleteByIdByUserId(WphRoleCustom zdyhRoleCustom)
			throws Exception {
		int x=this.mapperCustom.deleteByIdByUserId(zdyhRoleCustom);
		mapperCustom.deletePrivilege_Roles(zdyhRoleCustom.getFid());
		
		mapperCustom.deleteUser_Roles(zdyhRoleCustom.getFid());
		return x;
	}



	@Override
	public int deletePrivilege(WphRoleCustom zdyhRoleCustom) throws Exception {
		return this.mapperCustom.deletePrivilege(zdyhRoleCustom);
	}



	@Override
	public int insertPrivilege(WphRoleCustom zdyhRoleCustom) throws Exception {
		return this.mapperCustom.insertPrivilege(zdyhRoleCustom);
	}
	


	public WphRoleMapper getRoleMapper() {
		return roleMapper;
	}



	public void setRoleMapper(WphRoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}



	public WphRoleMapperCustom getMapperCustom() {
		return mapperCustom;
	}



	public void setMapperCustom(WphRoleMapperCustom mapperCustom) {
		this.mapperCustom = mapperCustom;
	}



	public Integer getUserFid() {
		return userFid;
	}



	public void setUserFid(Integer userFid) {
		this.userFid = userFid;
	}



	@Override
	public int deleteUser_Roles(Integer roleFid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int deletePrivilege_Roles(Integer roleFid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<WphRoleCustom>  UserIdByRoles(WphRoleCustom Custom) throws Exception {
		// TODO Auto-generated method stub
		return this.mapperCustom.UserIdByRoles(Custom);
	}



	@Override
	public int deleteRoleByuser(Integer roleFid) throws Exception {
		
		
		
		// TODO Auto-generated method stub
		return this.mapperCustom.deleteRoleByuser(roleFid);
	}



	@Override
	public int UpdateUserByRole(WphRoleCustom zdyhRoleCustom) throws Exception {
		// TODO Auto-generated method stub
		return this.mapperCustom.UpdateUserByRole(zdyhRoleCustom);
	}



	@Override
	public Integer updateRoleByFid(WphRole custom) throws Exception {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKeySelective(custom);
	}



	@Override
	public Integer getRoleByUserId(Integer userFid) {
		// TODO Auto-generated method stub
		return mapperCustom.getRoleByUserId(userFid);
	}



	@Override
	public List<WphRole> getRoleListByUserId(Integer userFid) {
		// TODO Auto-generated method stub
		return mapperCustom.getRoleListByUserId(userFid);
	}
	
}