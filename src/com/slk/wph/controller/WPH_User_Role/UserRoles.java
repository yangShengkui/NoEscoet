package com.slk.wph.controller.WPH_User_Role;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;
import com.slk.wph.module.WPH_Role.po.WphRoleCustom;
import com.slk.wph.module.WPH_Role.service.WPH_RoleService;


@Controller
@RequestMapping("/User") 
public class UserRoles {
	@Autowired
	private WPH_RoleService roleSerivce;
	
	@Autowired
	private WPH_MenuService menuService;
	
	
	
	/**
	 * 描述：user给角色分配-查询
	 *
	 * @param rolesCustom
	 * @param session
	 * @param model
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月7日-下午1:31:31
	 */
	@RequestMapping("UserFindRole")
	public String UserFindRole(WphRoleCustom rolesCustom ,HttpSession session ,Model model) throws Exception{
		
		rolesCustom.setCreateuserid((Integer)session.getAttribute("userFID"));
		
		List<WphRoleCustom> roles = roleSerivce.UserIdByRoles(rolesCustom);
		
		model.addAttribute("roles", roles);
		model.addAttribute("userFid", rolesCustom.getUserFid());
		
		return "User/UserByRole";
		
	}
	
	
	/**
	 * 描述：用户 角色分配
	 *
	 * @param zdyhRoleCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月7日-下午1:32:30
	 */
	@RequestMapping("UserUpdateByRole")
	@ResponseBody
	public Boolean UserUpdateByRole(WphRoleCustom RoleCustom,Model model,HttpSession session)throws Exception{
		
		roleSerivce.deleteRoleByuser(RoleCustom.getUserFid());
		if(RoleCustom.getRolesFids().length != 0)
			roleSerivce.UpdateUserByRole(RoleCustom);
		
		return true;
		
	}
	
}
