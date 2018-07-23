package com.slk.wph.controller.WPH_Toll;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Util.SecretUtil;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User.service.WphUserService;

@Controller
@RequestMapping(value="tollCenter")
public class WphTollCenterController {
	
	@Autowired
	private WphUserService service;
	/**
	 * 
	 *描述:查询所有  护工主管角色的用户
	 *@param model
	 *@return 视图
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	@RequestMapping(value="/getWphTollCenterList")
	public String getWphUserWardList(Model model,String message){
		List<WphUserCustom> list=service.selectUserByRole(36);
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		return "TollCenter/TollCenterList";
	} 
	
	
	/**
	 * 
	 *描述:更新并保存
	 *@param model
	 *@param wphUser
	 *@return 视图
	 *创建人:赵福岭
	 *2017年6月14日
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="/saveWphUser")
	public String saveWphUser(Model model,WphUserCustom wphUser,HttpSession session,RedirectAttributes attributes) throws UnsupportedEncodingException{
		if(wphUser.getFid()==null){
			wphUser.setUsername(wphUser.getPhone());
			wphUser.setPassword(new SecretUtil().encrypt("123456"));
		}
		if(wphUser.getStatus()==null){
			wphUser.setStatus(2);
		}
		service.updateAndSaveWphUser(wphUser,session,36);
		attributes.addAttribute("message", "恭喜您操作成功！");
		//存入用户 _病区表
		return "redirect:getWphTollCenterList";
	}
	
	
	
	/**
	 * 
	 *描述:验证姓名和手机号是否重复
	 *@param model
	 *@param wphUser
	 *@return 视图
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	@RequestMapping(value="/checkWphUser")
	@ResponseBody
	public Map<String,Object> checkWphUser(Model model,HttpServletRequest request,HttpServletResponse response){
		String fid=request.getParameter("fid");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		int count=0;
		Map<String,Object> map=new HashMap<String,Object>();
		WphUser wphUser=new WphUser();
		
		if(fid!=null&&!"".equals(fid)){
			wphUser.setFid(Integer.parseInt(fid));
		}
		wphUser.setUsername(phone);
		wphUser.setName(name);
		count=service.checkWphUser(wphUser);
		if(count==0){
			map.put("data", "success");
		}else{
			map.put("data", "fail");
		}
		return map;
	}
	
	
	/**
	 * 
	 *描述:验证姓名和手机号是否重复
	 *@param model
	 *@param wphUser
	 *@return 视图
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	@RequestMapping(value="/deleteWphUser")
	public String deleteWphUser(Model model,Integer deleteUserFid,RedirectAttributes attributes){
		service.deleteUserByUserFid(deleteUserFid);
		attributes.addAttribute("message", "恭喜您操作成功！");
		//存入用户 _病区表
		return "redirect:getWphTollCenterList";
	}
}
