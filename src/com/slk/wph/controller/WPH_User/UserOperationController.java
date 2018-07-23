package com.slk.wph.controller.WPH_User;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Util.SecretUtil;
import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User.service.WphUserService;

@Controller
@RequestMapping("/User") 
public class UserOperationController {  
	
	
	@Autowired
	private WphUserService userService;
	
	@Autowired
	private WPH_MenuService  menuService;
	
	
	
	
	/**
	 * 获取所有后台管理员集合
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/UserList")
	public String UserList(Model model, HttpSession session ,String message)throws Exception{
		
		List<WphUserCustom> users = userService.selectUserListByType();
		int num = users.size();
		for(WphUserCustom custom : users)
			custom.setNum(num--);
		
		model.addAttribute("UserList", users);
		model.addAttribute("userFid", session.getAttribute("userFID"));
		model.addAttribute("message", message);
		
		return "User/UserList";
	}
	
	
	
	
	/**
	 * 描述：修改密码
	 *
	 * @param custom
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月7日-下午1:45:01
	 */
	@RequestMapping("/UpdateUserPwd")
	@ResponseBody
	public Boolean UpdateUserPwd(WphUserCustom custom) throws Exception{
		if(null != custom.getPassword())
			custom.setPassword(new SecretUtil().encrypt(custom.getPassword()));
		
		userService.updateByPrimaryKeySelective(custom);
		return true;
	}
	
	
	
	
	
	/**
	 * 冻结/恢复管理员账号
	 * @param UserID
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("UserState")
	@ResponseBody
	public Boolean DeleteUser(WphUser user) throws Exception{
		Boolean flag = false;
		if(userService.updateByPrimaryKeySelective(user) != 0)
			flag = true;
		
		return flag;
	}
	
	
	/**
	 * 描述：判断预添加的用户名是否与数据库中的用户名冲突
	 *
	 * @param username
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月12日-下午2:07:58
	 * @throws Exception 
	 */
	@RequestMapping("UserCode")
	@ResponseBody
	public Boolean UserCode(WphUserCustom custom) throws Exception{
		
		Boolean flag = false;	
		if(null == userService.getUserByInfo(custom))flag = true;
		
		return flag;
	}
	
	
	
	/**
	 * 描述：添加用户
	 *
	 * @param user
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月12日-下午2:17:50
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("CreateUser")
	public String CreateUser(WphUser user) throws UnsupportedEncodingException{
		
		user.setStatus(2);
		user.setPassword(new SecretUtil().encrypt(user.getPassword()));
		userService.insertUserInfo(user);
		
		return "redirect:UserList";
	}
	
	
	

	
	
	/**
	 * 描述：删除用户
	 *
	 * @param fid
	 * @param type
	 * @param attributes
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月7日-下午1:43:15
	 */
	@RequestMapping("/DeleteSuperUser")
	public String DeleteSuperUser(Integer fid,Integer type, RedirectAttributes attributes) throws Exception{
		userService.deleteByPrimaryKey(fid);
		userService.deleteUser_RoleByUserId(fid);
		
		attributes.addAttribute("type", type); 
		attributes.addAttribute("message", "操作成功");
		
		return "redirect:UserList"; 
	} 
	
	
	
	
	
	
	
}
