package com.slk.wph.controller.WPH_User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Cache.MemcachedUtil;
import com.slk.wph.framework.Util.SecretUtil;
import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;
import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;
import com.slk.wph.module.WPH_Role.service.WPH_RoleService;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User.service.WphUserService;

@Controller
@RequestMapping("/UserLogin")
public class UserLoginController implements Serializable{
	
	/**  
	  * @Fields serialVersionUID :            TODO
	  */  
	private static final long serialVersionUID = -3872938337222250664L;

	@Autowired
	WphUserService userService;
	
	@Autowired
	private WPH_MenuService menuService;
	@Autowired
	private WPH_RoleService wphRoleService;
	
	
	@RequestMapping("/demo")
	@ResponseBody
	public boolean demo(HttpSession session){
		boolean b =false;
		
		Object userfid=session.getAttribute("userFID");
		if(null == userfid){
			b = true;
		}else if(null !=userfid&&session.getId().equals(MemcachedUtil.get(session.getAttribute("userFID").toString()+"UserSessionId")))
			b=true;
		return b;
	}
	
	/**
	 * 描述：用户进行登录
	 *
	 * @param custom
	 * @param session
	 * @param response
	 * @param attributes
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-下午1:48:14
	 */
	@RequestMapping("/Login")
	public String login(WphUserCustom custom ,HttpSession session ,HttpServletResponse response ,RedirectAttributes attributes) throws Exception{
		String url = "redirect:LoginHandle";//登录页面
		String message = null;
		attributes.addFlashAttribute("username", custom.getUsername());
		
		try {
			custom.setPassword(new SecretUtil().encrypt(custom.getPassword()));
		} catch (Exception e) {
		 System.out.println("--SecretUtil--passworderro----");
		}
		custom = userService.getUserByInfo(custom);
		if(null == custom){
			message = "用户名或密码错误";
		}else if(custom.getStatus() == 1){
			message ="账号已被冻结，请联系客服人员";
		}else if(custom.getStatus() == 2){
			session.removeAttribute("userFID");
			session.setAttribute("userFID", custom.getFid());
			MemcachedUtil.put(custom.getFid()+"UserSessionId", session.getId().toString());
			session.setMaxInactiveInterval(24*60*60);
			url = "redirect:HomePage";
		}
		
		attributes.addFlashAttribute("message", message);
		
		return url;
	}
	
	
	
	/**
	 * 描述：登录不成功处理
	 *
	 * @param message
	 * @param username
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-下午2:11:01
	 */
	@RequestMapping("/LoginHandle")
	public String LoginHandle(@ModelAttribute("message") String message,@ModelAttribute("username") String username){
		return "forward:/login.jsp";
	}
	
	
	
	/**
	 * 描述：登录成功进入管理系统
	 *
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-下午1:47:53
	 */
	@RequestMapping("/HomePage")
	public String SuperLoginJumpPage(Model model, HttpSession session) throws Exception{
		String url = "/User/index";
		Integer userFID = (Integer)session.getAttribute("userFID");
		
		if(null == userFID){return "forward:/login.jsp";}
		
		WphMenuCustom custom = new WphMenuCustom();
		custom.setUserFid(userFID);
		
		List<WphMenuCustom> menuList= menuService.getMenuListByParentFid(custom);
		
		List<Integer> check = userService.getCheckByUserFid(userFID);
		//用户跳转收费中心
		if(check.size() == 1 && check.get(0) == 1){
			menuList = menuList.get(0).getMenuCustomList();
			url = "/User/index-TollCenter";
		}
		
		
		model.addAttribute("menuList", menuList);
		model.addAttribute("userFID", userFID);
		model.addAttribute("name", userService.getUserByFid(userFID).getName());
		
		return url;
	}
	
	
	
	
	/**
	 * 描述：查看信息
	 *
	 * @param type
	 * @param message
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-下午2:36:12
	 */
	@RequestMapping("/getInfoByFid")
	public String getInfoByFid(Integer type ,String message ,Model model ,HttpSession session) throws Exception{
		WphUser user = userService.getUserByFid((Integer)session.getAttribute("userFID"));
		model.addAttribute("User", user);
		model.addAttribute("type", type);
		model.addAttribute("message", message);
		return "User/UserSetup";
	}
	
	
	
	
	
	/**
	 * 
	 * @功能：原密码验证
	 * @param custom
	 * @return
	 * @throws Exception
	 * @作者 宋现亮
	 * @date: 日期：2016年11月30日 时间：上午9:59:47
	 */
	@RequestMapping(value="pwdCode",method=RequestMethod.POST)
	@ResponseBody
	public WphUserCustom pwdCode(WphUserCustom custom) throws Exception{
		custom.setPassword(new SecretUtil().encrypt(custom.getPassword()));
		return userService.getUserByInfo(custom);
	}
	
	
	
	
	
	/**
	 * 描述：管理员修改功能均调用此方法
	 *
	 * @param custom
	 * @param messagetype
	 * @param attr
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-下午2:51:20
	 */
	@RequestMapping(value="setUserById",method=RequestMethod.POST)
	public String setCustomerById(WphUserCustom custom ,Integer messagetype ,RedirectAttributes attr,HttpSession session) throws Exception{
		
		
		if(session.getAttribute("userFID")!=null){
		if(null != custom.getPassword())
			custom.setPassword(new SecretUtil().encrypt(custom.getPassword()));
		userService.setUserByInfo(custom);
		attr.addAttribute("type", messagetype);
		attr.addAttribute("userId", custom.getFid());
		attr.addAttribute("message", "操作成功");
		}
		return "redirect:getInfoByFid";
	}
	
	
	
	
	
	/**
	 * 描述：收费中心修改密码
	 *
	 * @param custom
	 * @return 
	 * @throws Exception
	 *
	 * @author 宋现亮
	 * @time 2017年10月18日-下午3:49:25
	 */
	@ResponseBody
	@RequestMapping("/tollCenterUpdatePWD")
	public Integer tollCenterUpdatePWD(WphUserCustom custom) throws Exception{
		if(null != custom.getPassword())
			custom.setPassword(new SecretUtil().encrypt(custom.getPassword()));
		return userService.setUserByInfo(custom);
	}
	
	
	
	
	
	/**
	 * 描述：退出系统
	 *
	 * @param session
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月8日-下午2:14:36
	 */
	@RequestMapping("/SignOut")
	public String SignOut(HttpSession session ,String message ,HttpServletResponse response) throws Exception{
		session.setAttribute("userFID", "");
		session.removeAttribute("userFID");
		
		return "forward:/login.jsp";
	}

	
	
}
