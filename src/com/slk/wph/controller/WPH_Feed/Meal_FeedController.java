package com.slk.wph.controller.WPH_Feed;

import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenu;
import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenuCustom;
import com.slk.wph.module.WPH_Feedmenu.service.WPH_FeedmenuService;
import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTimeCustom;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtype;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtypeCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Feed")
public class Meal_FeedController {
	
	@Autowired
	private WPH_FeedmenuService service;
	


	
	/**
	 * 描述：获取特餐菜品列表
	 *
	 * @param model
	 * @param message
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午1:20:21
	 */
	@RequestMapping("/getFeedList")
	public String getSpecialList(Model model, String message, HttpSession session){
		
		List<WphFeedmenuCustom> feedMenus= service.selectweekFeedAll();
		List<WphFeedtypeCustom> wphFeedtypes = service.selectFeedtypesByPId();
		model.addAttribute("feedMenuList", feedMenus);
		model.addAttribute("types", wphFeedtypes);
		model.addAttribute("message", message);
		model.addAttribute("feedMenuTypeFid", 5);//餐类别fid
		
		return "Meal_Type/FeedList";
	}
	
	
	
	/**
	 *
	 * 对餐列表中的复选框进行操作
	 * Create by song-xl on 2018-05-26 09:31:42
	 */
	@RequestMapping("/getdeleteOrCreateByFeedMenuTime")
	@ResponseBody
	public Boolean getDeleteOrCreateByMealMenuTime(WphFeedmenuTimeCustom feedmenuTime){
		return service.getDeleteOrCreateByMealMenuTime(feedmenuTime)>0;
	}
	




	/**
	 *
	 * 描述：添加 or 修改 菜品
	 * Create by song-xl on 2018-05-25 04:07:22
	 */
	@RequestMapping("/setFeedmenu")
	public String setFeedmenu(WphFeedmenuCustom feed, RedirectAttributes attributes){
		Boolean aBoolean = service.setFeedmenu(feed);
		attributes.addAttribute("message", "操作成功");
		return "redirect:getFeedList";
	}



	/**
	 *
	 * 添加or修改feedtype类型
	 * Create by song-xl on 2018-05-25 03:40:51
	 */
	@RequestMapping("/setFeedType")
	public String setFeedType(WphFeedtype type){
		service.setFeedType(type);
		return "redirect:getFeedList";
	}


}
