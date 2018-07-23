package com.slk.wph.module.WPH_User_Ward.service.impl;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.wph.module.WPH_Role.mapper.WphRoleMapperCustom;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User_Ward.mapper.WphUserWardMapperCustom;
import com.slk.wph.module.WPH_User_Ward.po.WphUserWard;
import com.slk.wph.module.WPH_User_Ward.po.WphUserWardCustom;
import com.slk.wph.module.WPH_User_Ward.service.WPH_User_WardService;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
public class WPH_User_WardServiceImpl implements WPH_User_WardService {

	@Autowired
	private WphUserWardMapperCustom wphUserWardMapperCustom;

	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;

	@Autowired
	private WphRoleMapperCustom wphRoleMapperCustom;
	
	@Autowired
	private WphWardMapperCustom wphWardMapperCustom;


	@Override
	public List<WphUserWardCustom> getWphUserWardList() {
		// TODO Auto-generated method stub
		return wphUserWardMapperCustom.getWphUserWardList();
	}
	
	@Override
	public int updateAndSaveWphUser(WphUserCustom wphUserCustom, HttpSession session,Integer roleFid) {
		// TODO Auto-generated method stub

		int count = 0;
		if (null!=wphUserCustom.getFid()) {
			count = wphUserCustomMapper.updateByPrimaryKeySelective(wphUserCustom);
		} else {
			wphUserCustomMapper.insertSelective(wphUserCustom);
			WphRoleCustom wphRoleCustom = new WphRoleCustom();
			Integer roles[] = { roleFid };
			wphRoleCustom.setRolesFids(roles);
			wphRoleCustom.setUserFid(wphUserCustom.getFid());

			//WphUserWard wphUserWard = new WphUserWard();
			//wphUserWard.setWphUserFid(wphUserCustom.getFid());
			
			//Integer fid=(Integer)session.getAttribute("userFID");
			//WphUserCustom roleAndUserByUser = wphUserCustomMapper.getRoleAndUserByUserFid(fid);
			//wphUserWard.setUserrole(roleAndUserByUser.getRoleName());
 			//wphUserWard.setUserFid(roleAndUserByUser.getFid());
			//wphUserWard.setUsername(roleAndUserByUser.getName());
		
			//wphUserWardMapperCustom.saveWphUserWard(wphUserWard);
			try {
				wphRoleMapperCustom.UpdateUserByRole(wphRoleCustom);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}


	@Override
	public int checkWphUser(WphUser wphUser) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.checkWphUser(wphUser);
	}

	@Override
	public List<WphWardCustom> getWardList() {
		// TODO Auto-generated method stub
		return wphWardMapperCustom.getWphWardListByStatus();
	}

	@Override
	public void saveUserWardArray(Integer userId,String[] ids, HttpSession session) {
		// TODO Auto-generated method stub
		//根据userId查询    wardid  

		//根据用户fid获取所管理的病区

		List<String> list=wphUserWardMapperCustom.selectWardListByUser(userId);
		//判断护理等级及病区下是否有 护理
		if(ids[0].length()!=0){
			for (String wardFid:ids ) {
				if(!list.contains(wardFid)){
					//判断  原有关联病区    是否包含   勾选病区
					//新增
					WphUserWard wphUserWard = new WphUserWard();
					wphUserWard.setWphUserFid(userId);
					Integer fid=(Integer)session.getAttribute("userFID");
					WphUserCustom roleAndUserByUser = wphUserCustomMapper.getRoleAndUserByUserFid(fid);
					wphUserWard.setUserrole(roleAndUserByUser.getRoleName());
					wphUserWard.setUserFid(roleAndUserByUser.getFid());
					wphUserWard.setUsername(roleAndUserByUser.getName());
					wphUserWard.setWphWardFid(Integer.parseInt(wardFid));
					wphUserWardMapperCustom.saveWphUserWard(wphUserWard);
				}

			}
			for(String wardFid2:list){
				if(!Arrays.asList(ids).contains(wardFid2)){
					//判断  勾选病区是否包含   已关联病区
					//删除
					wphUserWardMapperCustom.deleteUserWardByUserId(userId,Integer.parseInt(wardFid2));
				}
			}
		}else{
			for(String wardFid2:list){
				wphUserWardMapperCustom.deleteUserWardByUserId(userId,Integer.parseInt(wardFid2));
			}
		}


	}



	@Override
	public List<WphWardCustom> getUserListByRoleFid(Integer roleFid,Integer status) {
		// TODO Auto-generated method stub
		
		return wphUserCustomMapper.getUserListByRoleFid(roleFid,status);
	}

	@Override
	public List<WphUserCustom> selectByWardFid(Integer wardFid) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.selectByWardFid(wardFid);
	}
}