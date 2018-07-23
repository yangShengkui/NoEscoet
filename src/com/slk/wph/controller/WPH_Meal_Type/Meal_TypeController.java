package com.slk.wph.controller.WPH_Meal_Type;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;

@Controller
@RequestMapping("/MealType")
public class Meal_TypeController {
	
	@Autowired
	private WPH_MealmenuService service;
	
	
	/**
	 * 描述：获取普餐菜品列表
	 *
	 * @param model
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月7日-上午11:59:17
	 */
	@RequestMapping("/getOrdinaryList")
	public String getOrdinaryList(Model model, String message, HttpSession session){
		
		List<WphMealmenuCustom> mealMenuList = service.getMealMenuByFid(2);//餐类别fid
		
		model.addAttribute("mealMenuList", mealMenuList);
		model.addAttribute("message", message);
		model.addAttribute("mealMenuTypeFid", 2);//餐类别fid
		
		return "Meal_Type/OrdinaryList";
	}
	
	
	
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
	@RequestMapping("/getSpecialList")
	public String getSpecialList(Model model, String message, HttpSession session){
		
		List<WphMealmenuCustom> mealMenuList = service.getMealMenuByFid(5);//餐类别fid
		
		model.addAttribute("mealMenuList", mealMenuList);
		model.addAttribute("message", message);
		model.addAttribute("mealMenuTypeFid", 5);//餐类别fid
		
		return "Meal_Type/SpecialList";
	}
	
	
	
	/**
	 * 描述：对特餐列表中的复选框进行操作
	 *
	 * @param mealmenuTime
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午3:26:18
	 */
	@RequestMapping("/getdeleteOrCreateByMealMenuTime")
	@ResponseBody
	public Boolean getDeleteOrCreateByMealMenuTime(WphMealmenuTimeCustom mealmenuTime){
		
		Boolean flag = false;
		if(0!= service.getDeleteOrCreateByMealMenuTime(mealmenuTime))flag = true;
		
		return flag;
	}
	
	
	
	
	/**
	 * 描述：获取其他列表
	 *
	 * @param model
	 * @param message
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午1:20:21
	 */
	@RequestMapping("/getOtherList")
	public String getOtherList(Model model, String message, HttpSession session){
		
		List<WphMealmenuCustom> mealMenuList = service.getMealMenuByFid(6);//餐类别fid
		List<WphMealtype> mealTypeList = service.getMealTypeByGreaterThanFid(6);//获取类型
		
		model.addAttribute("mealMenuList", mealMenuList);
		model.addAttribute("mealTypeList", mealTypeList);
		model.addAttribute("message", message);
		
		return "Meal_Type/OtherList";
	}
	
	
	
	
	
	/**
	 * 描述：其他管理-添加类别（WphMealtype）
	 *
	 * @param mealType
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午4:41:29
	 */
	@RequestMapping("/InsertMealTypeByInfo")
	public String InsertMealTypeByInfo(WphMealtype mealType, RedirectAttributes attributes){
		
		service.InsertMealTypeByInfo(mealType);
		attributes.addAttribute("message", "操作成功");
		return "redirect:getOtherList";
	}
	
	
	
	/**
	 * 描述：添加 or 修改 菜品
	 *
	 * @param custom 传递的参数
	 * @param url 返回的链接
	 * @param attributes
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月11日-下午5:03:05
	 */
	@RequestMapping("/setOrdinaryByInfo")
	public String setOrdinaryByInfo(WphMealmenuCustom custom, String url,RedirectAttributes attributes){
		service.setOrdinaryByInfo(custom);
		attributes.addAttribute("message", "操作成功");
		return url;
	}
	
	
	
	
	

}
