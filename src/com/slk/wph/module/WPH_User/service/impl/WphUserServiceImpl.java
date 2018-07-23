package com.slk.wph.module.WPH_User.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Role.mapper.WphRoleMapperCustom;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.mapper.WphUserMapper;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User.service.WphUserService;
@Service
public class WphUserServiceImpl implements WphUserService {
	
	@Autowired
	private WphUserMapper  userMapper;
	@Autowired
	private WphUserCustomMapper customMapper;
	@Autowired
	private WphRoleMapperCustom roleMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}


	@Override
	public int updateByPrimaryKeySelective(WphUser record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public List<WphUserCustom> selectUserListByType()
			throws Exception {
		// TODO Auto-generated method stub
		return customMapper.selectUserListByType();
	}


	@Override
	public void deleteUser_RoleByUserId(Integer userFID) throws Exception {
		// TODO Auto-generated method stub
		customMapper.deleteUser_RoleByUserId(userFID);
	}


	@Override
	public WphUserCustom getUserByInfo(WphUserCustom custom) throws Exception {
		// TODO Auto-generated method stub
		return customMapper.getUserByInfo(custom);
	}


	@Override
	public WphUser getUserByFid(Integer userFid) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userFid);
	}


	@Override
	public Integer setUserByInfo(WphUser user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(user);
	}


	@Override
	public Integer insertUserInfo(WphUser user) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(user);
	}


	@Override
	public List<Integer> getCheckByUserFid(Integer fid) {
		// TODO Auto-generated method stub
		return customMapper.getCheckByUserFid(fid);
	}


	@Override
	public List<WphUserCustom> selectUserByRole(Integer roleFid){
		// TODO Auto-generated method stub
		return customMapper.selectUserByRole(roleFid);
	}


	@Override
	public int checkWphUser(WphUser wphUser) {
		// TODO Auto-generated method stub
		return customMapper.checkWphUser(wphUser);
	}

	@Override
	public int updateAndSaveWphUser(WphUserCustom wphUserCustom, HttpSession session,Integer roleFid) {
		// TODO Auto-generated method stub
		int count = 0;
		if (wphUserCustom.getFid() != null) {
			count = customMapper.updateByPrimaryKeySelective(wphUserCustom);
		} else {
			customMapper.insertSelective(wphUserCustom);
			WphRoleCustom wphRoleCustom = new WphRoleCustom();
			Integer roles[] = { roleFid };
			wphRoleCustom.setRolesFids(roles);
			wphRoleCustom.setUserFid(wphUserCustom.getFid());
			try {
				roleMapper.UpdateUserByRole(wphRoleCustom);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		return count;
	}


	@Override
	public int deleteUserByUserFid(Integer userFid) {
		// TODO Auto-generated method stub
		try {
			userMapper.deleteByPrimaryKey(userFid);
			roleMapper.deleteRoleByuser(userFid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}


}
