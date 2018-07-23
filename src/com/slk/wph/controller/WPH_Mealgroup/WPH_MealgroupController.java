package com.slk.wph.controller.WPH_Mealgroup;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroup;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroupCustom;
import com.slk.wph.module.WPH_Mealgroup.service.WPH_MealgroupService;


@Controller
@RequestMapping("/Mealgroup")
public class WPH_MealgroupController {

	
	@Autowired
	WPH_MealgroupService service;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	
	
	
	/**
	 * 描述：进入组别管理
	 *
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月9日-上午9:18:17
	 */
	@RequestMapping("/GroupList")
	public String GroupList(Model model){
		
		List<WphMealgroupCustom> groupList = service.getGroupList();
		
		model.addAttribute("groupList", groupList);
		
		return "Meal_Group/GroupMeal";
	}
	
	
	
	/**
	 * 描述：进行修改组别
	 *
	 * @param mealgroup
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月9日-上午9:41:02
	 */
	@ResponseBody
	@RequestMapping("/GroupIng")
	public Boolean GroupIng(WphMealgroup mealgroup){
		Boolean flag = false;
		WphMealgroup group = new WphMealgroup();
		group.setGroup1("0");
		group.setGroup2("0");
		group.setGroup3("0");
		group.setGroup4("0");
		group.setGroup5("0");
		group.setFid(mealgroup.getFid());
		service.UpdateGroupByFid(group);
		if(service.UpdateGroupByFid(mealgroup) !=0)flag = true;
		
		return flag;
	}
	
}
