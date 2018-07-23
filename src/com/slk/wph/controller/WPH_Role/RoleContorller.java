package com.slk.wph.controller.WPH_Role;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_App.po.WphAppCustom;
import com.slk.wph.module.WPH_App.service.WPH_AppService;
import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;
import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;
import com.slk.wph.module.WPH_Role.service.WPH_RoleService;


@Controller
@RequestMapping("/Roles")
public class RoleContorller {
	
	@Autowired
	private WPH_RoleService roleService;
	
	@Autowired
	private WPH_MenuService menuService;
	
	@Autowired
	private WPH_AppService appService;
	
	
	/**
	 * 根据用户能查看的Role返回Role若该用户属于超级管理员角色则返回所有角色
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2016年6月29日 下午3:37:19 
	 *@comment
	 */
	@RequestMapping("findRoles")
	public String findRoles(Model model,Integer roletype,HttpSession session)throws Exception{
		Integer userFid=(Integer) session.getAttribute("userFID");
		WphRoleCustom role = new WphRoleCustom();
		role.setUserFid(userFid);
//		role.setRoletype(roletype);
		List<WphRoleCustom> list = this.roleService.findRoleByUserFid(role);
		model.addAttribute("roleList", list);
//		model.addAttribute("roleStatType", roletype);
		
		return "Role/Role_List";
		
	}
	
	
	
	/**
	 * 角色菜单赋权时返回的菜单及按钮信息、根据用户的菜单权限返回用户能看到的菜单、根据角色ID默认选中改角色已有的菜单
	 * @param zdyhRoleCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2016年6月30日 下午1:19:11 
	 *@comment
	 */
	@RequestMapping("RoleByMenuAndApp")
	public String RoleByMenuAndApp(Integer roleFid, Integer roleStatType, Model model,HttpSession session)throws Exception{
		String url = "Role/Roles_Menu_List";
		Integer userFid=(Integer)session.getAttribute("userFID");
		if(roleStatType == 1){
			WphMenuCustom custom = new WphMenuCustom();
			custom.setRoleFid(roleFid);
			custom.setUserFid(userFid);
			List<WphMenuCustom> menuCustoms =menuService.getMenuListCheckByMenu(custom);
			model.addAttribute("menuCustoms", menuCustoms);
		}else{
			WphAppCustom custom = new WphAppCustom();
			custom.setRoleFid(roleFid);
			custom.setUserFid(userFid);
			List<WphAppCustom> appList = appService.getAppListCheckByApp(custom);
			model.addAttribute("appCustoms", appList);
			url =  "Role/Roles_App_List";
		}
		model.addAttribute("RoleFid", roleFid);
		return url;
	}
	
	
	
	/**
	 * 添加角色
	 * @param zdyhRoleCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2016年6月30日 下午1:17:56 
	 *@comment
	 */
	
	@RequestMapping("insertSelective")
	@ResponseBody
	public Boolean insertSelective(WphRoleCustom zdyhRoleCustom,Model model,HttpSession session)throws Exception{
		Integer userFid=(Integer)session.getAttribute("userFID");
		Boolean boolean1=false;
		zdyhRoleCustom.setCreateuserid(userFid);
		if(roleService.insertSelective(zdyhRoleCustom)!=0)
			boolean1=true;
		return boolean1;
	}
	
	/**
	 * 修改角色信息
	 * @param zdyhRoleCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2016年6月30日 下午1:18:17 
	 *@comment
	 */
	
	@RequestMapping("updateByIdByuserFid")
	@ResponseBody
	public Boolean updateByIdByuserFid(WphRoleCustom zdyhRoleCustom,Model model,HttpSession session)throws Exception{
		Integer userFid=(Integer)session.getAttribute("userFID");
		
		zdyhRoleCustom.setUserFid(userFid);
		zdyhRoleCustom.setCreateuserid(userFid);
		Boolean boolean1=false;
		zdyhRoleCustom.setCreateuserid(userFid);
		if(roleService.updateByIdByuserFid(zdyhRoleCustom)!=0)
			boolean1=true;
		return boolean1;
	}
	
	/**
	 * 删除角色、只有角色创建者或者拥有该角色权限的管理员才可删除
	 * @param zdyhRoleCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2016年6月30日 下午1:18:28 
	 *@comment
	 */
	
	@RequestMapping("deleteByIdByUserId")
	@ResponseBody
	public Boolean deleteByIdByUserId(WphRoleCustom zdyhRoleCustom,Model model,HttpSession session)throws Exception{
		
		if(zdyhRoleCustom!=null && (zdyhRoleCustom.getFid()==1 || zdyhRoleCustom.getFid()==2)){
			return false;
		
		}
		
		Integer userFid=(Integer)session.getAttribute("userFID");
		Boolean boolean1=false;
		zdyhRoleCustom.setCreateuserid(userFid);
		zdyhRoleCustom.setUserFid(userFid);
		if(roleService.deleteByIdByUserId(zdyhRoleCustom)!=0){
			boolean1=true;
		}
			
		return boolean1;
	}
	
	
	
	/**
	 * 修改角色菜单权限
	 * @return
	 *@author 隋乔镇
	 *@date 2016年6月30日 下午2:06:13 
	 *@comment
	 */
	@RequestMapping("RoleUpdate")
	@ResponseBody
	public Boolean RoleUpdateMenu(WphRoleCustom RoleCustom,String flage,Model model,HttpSession session)throws Exception{
		Integer userFid=(Integer)session.getAttribute("userFID");
		RoleCustom.setUserFid(userFid);
		RoleCustom.setCreateuserid(userFid);
		if(flage.equals("menuIds")&&(RoleCustom.getMenuIds()==null||RoleCustom.getMenuIds().length<=0)){
			Integer[] x={0};
			RoleCustom.setMenuIds(x);
		}
		if(flage.equals("appIds")&&(RoleCustom.getAppIds()==null||RoleCustom.getAppIds().length<=0)){
			Integer[] x={0};
			RoleCustom.setAppIds(x);
		}
		
		roleService.deletePrivilege(RoleCustom);
		
		roleService.insertPrivilege(RoleCustom);
	
		return true;
	}
	
	


}
