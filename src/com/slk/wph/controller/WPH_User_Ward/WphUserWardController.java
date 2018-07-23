package com.slk.wph.controller.WPH_User_Ward;

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
import com.slk.wph.module.WPH_User_Ward.service.WPH_User_WardService;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Controller
@RequestMapping(value="/WphUserWard")
public class WphUserWardController {
	@Autowired
	private WPH_User_WardService wphUserWardService;
	

	/**
	 * 
	 *描述:查询所有  护工主管角色的用户
	 *@param model
	 *@return 视图
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	@RequestMapping(value="/getWphUserWardList")
	public String getWphUserWardList(Model model,String message){
		List<WphWardCustom> list=wphUserWardService.getUserListByRoleFid(34,1);
		List<WphWardCustom> wardList=wphUserWardService.getWardList();
		model.addAttribute("list", list);
		model.addAttribute("wardList", wardList);
		model.addAttribute("message", message);
		return "WphUserWard/WphUserWardList";
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
		if(null==wphUser.getFid()||"".equals(wphUser.getFid())){
			wphUser.setUsername(wphUser.getPhone());
			wphUser.setPassword(new SecretUtil().encrypt("123456"));
		}
		if(wphUser.getStatus()==null){
			wphUser.setStatus(2);
		}
		wphUserWardService.updateAndSaveWphUser(wphUser,session,34);
		attributes.addAttribute("message", "恭喜您操作成功！");
		//存入用户 _病区表
		return "redirect:getWphUserWardList";
	}
	@RequestMapping(value="/saveWphUserWard")
	public String saveWphUserWard(HttpServletRequest request,HttpSession session,RedirectAttributes attributes){
		String ids=request.getParameter("ids");
		String userFid=request.getParameter("userFid");

		String[] id=ids.split(",");
		wphUserWardService.saveUserWardArray(Integer.parseInt(userFid), id, session);
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:getWphUserWardList";
	}
	
	
	
	/**
	 * 
	 *描述:验证姓名和手机号是否重复
	 *@param model
	 *@param
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
		count=wphUserWardService.checkWphUser(wphUser);
		if(count==0){
			map.put("data", "success");
		}else{
			map.put("data", "fail");
		}
		return map;
	}
	
	/*——————————————————————————————————————————————————————————————————————————————————————————————————————————*/
	//陪护端 护工组长
	
	/**
	 * 陪护端  护工组长
	 *描述:查询所有护工组长    
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年6月16日
	 */
	@RequestMapping(value="/getWphUserWardListPh")
	public String getWphUserWardListPh(Model model,String message){
		List<WphWardCustom> list=wphUserWardService.getUserListByRoleFid(25,1);
		List<WphWardCustom> wardList=wphUserWardService.getWardList(); 
		List<WphWardCustom> managerList=wphUserWardService.getUserListByRoleFid(34,2);
		model.addAttribute("list", list);
		model.addAttribute("wardList", wardList);
		model.addAttribute("managerList", managerList);
		model.addAttribute("message", message);
		return "WphUserWard/WphUserWardListPh";
	}
	
	/**
	 * 
	 *描述:更新并保存护工组长
	 *@param model
	 *@param wphUser
	 *@param session
	 *@return
	 *@throws UnsupportedEncodingException
	 *创建人:赵福岭
	 *2017年6月16日
	 */
	@RequestMapping(value="/saveWphUserPh")
	
	public String saveWphUserPh(Model model,WphUserCustom wphUser,HttpSession session,HttpServletRequest request,RedirectAttributes attributes) throws UnsupportedEncodingException{
		//String userFid=request.getParameter("userFid");
		String wardfid=request.getParameter("wardfid");
		if(null==wphUser.getFid()||"".equals(wphUser.getFid())){
			wphUser.setUsername(wphUser.getPhone());
			wphUser.setPassword(new SecretUtil().encrypt("123456"));
		}
		if(wphUser.getStatus()==null){
			wphUser.setStatus(2);
		}
		wphUserWardService.updateAndSaveWphUser(wphUser,session,25);
		String[] wardFid=new String[]{wardfid};
		wphUserWardService.saveUserWardArray(wphUser.getFid(), wardFid, session);
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:getWphUserWardListPh";
	}

	@RequestMapping(value="/managerByWardFid")
	@ResponseBody
	public Map<String,Object> managerByWardFid(HttpServletRequest request){
		String wardFid=request.getParameter("wardFid");
		List<WphUserCustom> list=wphUserWardService.selectByWardFid(Integer.parseInt(wardFid));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("list", list);
		return map;
	}

}
