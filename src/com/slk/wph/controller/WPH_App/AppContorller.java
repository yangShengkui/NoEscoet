package com.slk.wph.controller.WPH_App;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_App.po.WphAppCustom;
import com.slk.wph.module.WPH_App.service.WPH_AppService;


@Controller
@RequestMapping("/App")
public class AppContorller {
	
	
	@Autowired WPH_AppService appService;
	
	/**
	 * 描述：根据用户ID查询出该用户能看到的所有菜单
	 *
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月7日-上午11:22:03
	 */
	
	@RequestMapping("findApp")
	public String findMenusSuper(Model model,HttpSession session) throws Exception{
		System.out.println("7777777");
		Integer userid=(Integer) session.getAttribute("userFID");
		WphAppCustom custom = new WphAppCustom();
		custom.setUserFid(userid);
		List<WphAppCustom> AppList = appService.getAppListCheckByApp(custom);
		model.addAttribute("appList", AppList);
		return "App/App_List";

	}
	
	

	/**
	 * 描述：查看app图标
	 *		根据APP图标FID获取对象，并判断访问者是否拥有查看or修改的权限
	 * @param fid
	 * @param flag
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月5日-下午3:24:22
	 */
	@RequestMapping("/EditAppSkip/{fid}/{flag}")
	public String createMenuSkip(@PathVariable("fid")Integer fid,@PathVariable("flag")Boolean flag,Model model,HttpSession session) throws Exception{
		 
		 model.addAttribute("appCustom", appService.findAppById(fid));
		 model.addAttribute("Create", flag);
		
		return "App/App_Edit";
	}
	
	/**
	 * 描述：添加APP图标对象
	 *
	 * @param appCustom
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月5日-下午3:36:04
	 */
	@RequestMapping("createApp")
	public String createMenu(WphAppCustom appCustom,Model model,HttpSession session) throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		appCustom.setCreateUserfid(userid);
		 appService.insertApp(appCustom);
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
	
	@RequestMapping("updateApp")
	public String updateMenu(WphAppCustom appCustom,Model model,HttpSession session)throws Exception{
		Integer userid=(Integer) session.getAttribute("userFID");
		 appCustom.setCreateUserfid(userid);
		 appService.updateApp(appCustom);
		
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
	
	@RequestMapping("/deleteApp/{fid}")
	public String deleteApp(@PathVariable("fid")Integer fid,Model model,HttpSession session)throws Exception{
		
		 appService.deleteAppById(fid);
		 
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
	
	@RequestMapping("/deleteAppFindById/{fid}")
	@ResponseBody
	public Boolean deleteMenuFindById(@PathVariable("fid")Integer fid,HttpSession session)throws Exception{
		Integer count = this.appService.deleteAppFindById(fid);
		
		if(count==0)return true;
		
		return false;
	}
	

}
