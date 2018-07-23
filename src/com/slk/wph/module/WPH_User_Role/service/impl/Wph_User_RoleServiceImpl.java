package com.slk.wph.module.WPH_User_Role.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_User_Role.mapper.WphUserRoleMapper;
import com.slk.wph.module.WPH_User_Role.po.WphUserRole;
import com.slk.wph.module.WPH_User_Role.po.WphUserRoleExample;
import com.slk.wph.module.WPH_User_Role.service.Wph_User_RoleService;

@Service
 public class  Wph_User_RoleServiceImpl implements Wph_User_RoleService  {
	
	@Autowired
	private WphUserRoleMapper mapper;

	public WphUserRoleMapper getMapper() {
		
		return mapper;
	}

	public void setMapper(WphUserRoleMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public int countByExample(WphUserRoleExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(WphUserRoleExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer fid) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(fid);
	}

	@Override
	public int insert(WphUserRole record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WphUserRole record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<WphUserRole> selectByExample(WphUserRoleExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public WphUserRole selectByPrimaryKey(Integer fid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(fid);
	}

	@Override
	public int updateByExampleSelective(WphUserRole record,
			WphUserRoleExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(WphUserRole record, WphUserRoleExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(WphUserRole record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(WphUserRole record) {
		// TODO Auto-generated method stub
		return 0;
	}

}