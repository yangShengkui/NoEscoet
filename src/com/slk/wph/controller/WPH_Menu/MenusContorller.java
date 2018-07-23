package com.slk.wph.controller.WPH_Menu;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;
import com.slk.wph.module.WPH_Menu.service.WPH_MenuService;


@Controller
@RequestMapping("/Menus")
public class MenusContorller {
	
	@Autowired
	private WPH_MenuService menuService;
	
	/**
	 * 根据用户ID查询出该用户能看到的所有菜单
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2017年6月2日-下午3:08:43 
	 *@comment
	 */
	
	@RequestMapping("findMenusSuper")
	public String findMenusSuper(Model model,HttpSession session) throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		WphMenuCustom custom = new WphMenuCustom();
		custom.setUserFid(userid);
		List<WphMenuCustom> findMenuS = menuService.getMenuListCheckByMenu(custom);
		model.addAttribute("menuList", findMenuS);
		return "Menu/Menus_List";
		
	}
	
	

	/**
	 * 创建或修改菜单前跳转、根据用户ID、菜单ID判断是否有该菜单的修改或创建该菜单下级菜单的权限
	 * @param fid
	 * 菜单ID
	 * @param flag
	 * true标示创建、false标示修改
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2017年6月2日-下午3:08:43
	 *@comment
	 */
	@RequestMapping("/EditMenuSkip/{fid}/{flag}")
	public String createMenuSkip(@PathVariable("fid")Integer fid,@PathVariable("flag")Boolean flag,Model model,HttpSession session) throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		 WphMenuCustom menuCustom = new WphMenuCustom();
		 menuCustom.setFid(fid);
		 menuCustom.setUserFid(userid);
		 menuCustom= menuService.findMenuById(menuCustom);
		 
		 model.addAttribute("menuCustom", menuCustom);
		 model.addAttribute("Create", flag);
		
		return "Menu/Menus_Edit";
	}
	
	/**
	 * 根据对象创建菜单
	 * @param menuCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2017年6月2日-下午3:08:43
	 *@comment
	 */
	@RequestMapping("createMenu")
	public String createMenu(WphMenuCustom menuCustom,Model model,HttpSession session) throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		 menuCustom.setUserFid(userid);
		 
		 menuCustom.setCreateUserfid(userid);
		 menuCustom.setMenutype(1);
		 
		menuService.insert(menuCustom);
		model.addAttribute("message", "添加成功刷新后可以看到效果哦");
		return "promptOK";
	}
	
	/**
	 * 根据对象修改菜单信息
	 * @param menuCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2017年6月2日-下午3:08:43
	 *@comment
	 */
	
	@RequestMapping("updateMenu")
	public String updateMenu(WphMenuCustom menuCustom,Model model,HttpSession session)throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		menuCustom.setUserFid(userid);
		menuCustom.setMenutype(1);//默认为1
		menuService.updateMenu(menuCustom);
		
		return "promptOK";
	}
	
	/**
	 * 根据ID删除菜单、若该菜单有下级菜单则需要先删除下级菜单后才可删除该菜单
	 * @param fid
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2017年6月2日-下午3:08:43 
	 *@comment
	 */
	
	@RequestMapping("/deleteMenu/{fid}")
	public String deleteMenu(@PathVariable("fid")Integer fid,Model model,HttpSession session)throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		 WphMenuCustom menuCustom = new WphMenuCustom();
		 menuCustom.setFid(fid);
		 menuCustom.setUserFid(userid);
		
		Integer menuById = this.menuService.deleteMenusByIdAndUserId(menuCustom);
		model.addAttribute("message", "修改成功刷新后可以看到效果哦");
		return "promptOK";
	}
	
	/**
	 * 删除菜单前先判定是否有下级菜单，若没有可以继续删除，若有则必须先删除下级菜单
	 * @param fid
	 * @param session
	 * @return
	 * @throws Exception
	 *@author 隋乔镇
	 *@date 2017年6月2日-下午3:08:43
	 *@comment
	 */
	
	@RequestMapping("/deleteMenuFindById/{fid}")
	@ResponseBody
	public Boolean deleteMenuFindById(@PathVariable("fid")Integer fid,HttpSession session)throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		 WphMenuCustom menuCustom = new WphMenuCustom();
		 menuCustom.setFid(fid);
		 menuCustom.setUserFid(userid);
		 
		Integer menuById = this.menuService.deleteMenuFindById(menuCustom);
		
		if(menuById==0)
		return true;
		
		return false;
	}
	
	
	
}
