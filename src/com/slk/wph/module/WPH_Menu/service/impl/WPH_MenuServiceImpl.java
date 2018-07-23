package com.slk.wph.module.WPH_Menu.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.framework.Exception.CustomException;
import com.slk.wph.module.WPH_App.mapper.WphAppMapperCustom;
import com.slk.wph.module.WPH_Menu.mapper.WphMenuCustomMapper;
import com.slk.wph.module.WPH_Menu.mapper.WphMenuMapper;
import com.slk.wph.module.WPH_Menu.po.WphMenu;
import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;
import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;

@Service
 public class  WPH_MenuServiceImpl implements WPH_MenuService  {
	@Autowired
	private WphMenuCustomMapper MenuCustomMapper;
	
	@Autowired
	private WphMenuMapper menuMapper;
	
	@Autowired
	private WphAppMapperCustom appMapperCustom;
	
	private Integer userFid;
	
	private Integer nowUserFid;
	
	

	public WphMenuCustomMapper getMenuCustomMapper() {
		return MenuCustomMapper;
	}

	public void setMenuCustomMapper(WphMenuCustomMapper MenuCustomMapper) {
		this.MenuCustomMapper = MenuCustomMapper;
	}

	public WphMenuMapper getMenuMapper() {
		return menuMapper;
	}

	public void setMenuMapper(WphMenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}

	public Integer getUserFid() {
		return userFid;
	}

	public void setUserFid(Integer userFid) {
		this.userFid = userFid;
	}

	
	public int insert(WphMenu record) {
		return MenuCustomMapper.insert(record);
	}

	
	public WphMenuCustom findMenuById(WphMenuCustom zdyhMenuCustom) throws Exception {
		
		return MenuCustomMapper.findMenuById(zdyhMenuCustom);
	}

	
	public Integer deleteMenuFindById(WphMenuCustom zdyhMenuCustom) throws Exception {
		return this.MenuCustomMapper.deleteMenuFindById(zdyhMenuCustom);
	}

	
	public Integer deleteMenuById(WphMenuCustom zdyhMenuCustom) throws Exception {
		return MenuCustomMapper.deleteMenuById(zdyhMenuCustom);
	}

	
	public Integer updateMenu(WphMenuCustom zdyhMenuCustom) throws Exception {
		Integer updateMenu = this.MenuCustomMapper.updateMenu(zdyhMenuCustom);
		if(updateMenu==0)
			throw new CustomException("对不起您无权限修改此菜单！");
		
		return updateMenu;
	}

	
	public Boolean deleteMenu(WphMenuCustom zdyhMenuCustom) throws Exception {

		if(deleteMenuFindById(zdyhMenuCustom)!=0)
			return false;
		
		if(deleteMenuById(zdyhMenuCustom)==0)
				throw new CustomException("对不起您无权限删除此菜单！");
		return true;
	}

	
	
	/*宋*/
	public List<WphMenuCustom> getMenuListByParentFid(WphMenuCustom menu){
		if(!priv.license.DecodeLicense.Decode()) 
			return new ArrayList<WphMenuCustom>();
		if(null == menu.getParentFid())menu.setParentFid(0);
		List<WphMenuCustom> menuList = MenuCustomMapper.getMenuListByParentFid(menu);
		
		for(WphMenuCustom custom :menuList ){
			custom.setParentFid(custom.getFid());
			custom.setUserFid(menu.getUserFid());
			custom.setMenuCustomList(getMenuListByParentFid(custom));
		}
		

		
		return menuList;
	}
	
	
	/*宋*/
	@Override
	public List<WphMenuCustom> getMenuListCheckByMenu(WphMenuCustom menu) {
		if(!priv.license.DecodeLicense.Decode()) 
			return new ArrayList<WphMenuCustom>();
		if(null == menu.getParentFid())menu.setParentFid(0);
		List<WphMenuCustom> menuList = MenuCustomMapper.getMenuListCheckByMenu(menu);
		
		for(WphMenuCustom custom :menuList ){
			menu.setParentFid(custom.getFid());
			custom.setMenuCustomList(getMenuListCheckByMenu(menu));
		}

		
		return menuList;
	}

	

	public Integer getNowUserFid() {
		return nowUserFid;
	}

	public void setNowUserFid(Integer nowUserFid) {
		this.nowUserFid = nowUserFid;
	}


	@Override
	public Integer deleteMenusByIdAndUserId(WphMenuCustom custom) {
		// TODO Auto-generated method stub
		return MenuCustomMapper.deleteMenusByIdAndUserId(custom);
	}

	@Override
	public Integer getCountByUrlUserIds(WphMenuCustom custom) {
		// TODO Auto-generated method stub
		if(!priv.license.DecodeLicense.Decode()) 
			return 0;
		return  MenuCustomMapper.getCountByUrlUserIds(custom);
		
		
	}






}