package com.slk.wph.controller.WPH_Mealcleaning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaning;
import com.slk.wph.module.WPH_Mealcleaning.service.WPH_MealcleaningService;

@Controller
@RequestMapping("/Mealcleaning")
public class WPH_MealcleaningController {

	
	@Autowired
	private WPH_MealcleaningService service;
	
	
	
	/**
	 * 描述：进入保洁餐管理
	 *
	 * @param message
	 * @param model
	 * @return
	 *
	 * 创  建  人： 宋现亮
	 * 创建时间：2017年8月14日-下午5:26:26
	 */
	@RequestMapping("/MealClen")
	public String MealClen(String message, Model model){
		
		model.addAttribute("message", message);
		
		return "Meal_Cleaning/CleaningMeal";
	}
	
	
	/**
	 * 描述：验证卡是否存在（10：读卡器，6：人工）
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月14日-上午11:38:05
	 */
	@ResponseBody
	@RequestMapping("/getredingByCard")
	public WphCardCustom getredingByCard(String cardStr){
		
		WphCardCustom card = service.getredingByCard(cardStr);
		
		return card;
	}
	
	
	
	/**
	 * 描述：进行添加保洁餐次数（有卡号就行修改，无卡号进行添加）
	 *
	 * @param cleaning
	 * @param attributes
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月14日-下午5:24:37
	 */
	@RequestMapping("/MealClenIng")
	public String MealClenIng(WphMealcleaning cleaning ,RedirectAttributes attributes){
		
		service.setMealCleanByInfo(cleaning);
		
		attributes.addAttribute("message", "恭喜您！操作成功！");
		
		return "redirect:MealClen";
	}
	
}
