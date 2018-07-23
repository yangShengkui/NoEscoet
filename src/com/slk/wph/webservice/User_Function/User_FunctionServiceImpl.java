package com.slk.wph.webservice.User_Function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.framework.Util.SecretUtil;
import com.slk.wph.module.WPH_App.mapper.WphAppMapperCustom;
import com.slk.wph.module.WPH_App.po.WphAppCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.mapper.WphUserMapper;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User_Ward.mapper.WphUserWardMapperCustom;
import com.slk.wph.module.WPH_User_Ward.po.WphUserWard;

public class User_FunctionServiceImpl implements User_FunctionService {
	
	@Autowired
	private WphUserMapper userMapper;
	@Autowired
	private WphUserCustomMapper userCustomMapper;
	@Autowired
	private WphAppMapperCustom appMapperCustom;
	@Autowired
	private WphUserWardMapperCustom wardMapperCustom;
	

	@Override
	public String UserLogin(String User) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		Boolean loginFlag = false;
		List<WphAppCustom> appList = null;
		List<WphUserWard> wardList = new ArrayList<WphUserWard>();
		WphUserCustom user = (WphUserCustom)JSONObject.toBean(JSONObject.fromObject(User), WphUserCustom.class);
		try {
			
			user.setPassword(new SecretUtil().encrypt(user.getPassword()));
			user = userCustomMapper.getUserByInfo(user);
			if(null != user){
				if(user.getStatus() == 2){
					flag = true;
					loginFlag = true;
				}
			}
			
			WphAppCustom appCustom = new WphAppCustom();
			appCustom.setUserFid(user.getFid());
			appList = getAppListByApp(appCustom);
			
			wardList = wardMapperCustom.getWardListByUser(user.getFid());
			
			
		} catch (Exception e) {
			System.out.println("user获取为：null");
		}
		
		if(flag == true){
			map.put("User", user);
			map.put("AppList", appList);
			map.put("wardList", wardList);
		}
			map.put("flag", flag);
			map.put("loginFlag", loginFlag);
		
		return JSONObject.fromObject(map).toString();
	}
	
	
	
	
	@Override
	public String setUserPushInfo(String User) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphUser user = (WphUser) JSONObject.toBean(JSONObject.fromObject(User), WphUser.class);
		
		int count = userMapper.updateByPrimaryKeySelective(user);
		if(count != 0)flag = true;
		
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}
	
	

	
	/**
	 * 描述：根据userFid和parent_Fid获取APP菜单集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月12日-上午10:17:57
	 */
	private List<WphAppCustom> getAppListByApp(WphAppCustom custom) {
		if(null == custom.getParentFid())custom.setParentFid(0);
		List<WphAppCustom> appList = appMapperCustom.getAppListByApp(custom);
		
		for(WphAppCustom app : appList){
			custom.setParentFid(app.getFid());
			app.setAppCustomList(getAppListByApp(custom));
		}
		
		return appList;
	}


	@Override
	public String updateUserPassword(String userFid, String password) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		try {
			WphUser user=userCustomMapper.getUserByFid(Integer.parseInt(userFid));
			user.setPassword(new SecretUtil().encrypt(password));
			userCustomMapper.updateByPrimaryKeySelective(user);
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}


}
