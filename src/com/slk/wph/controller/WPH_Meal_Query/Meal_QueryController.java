package com.slk.wph.controller.WPH_Meal_Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Orderingfood.service.WPH_OrderingfoodService;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Meal_Query")
public class Meal_QueryController {
	
	
	@Autowired
	private WPH_OrderingfoodService service;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 描述：根据餐类信息表属性获取 患者订餐信息
	 *
	 * @param food
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月16日-上午9:04:01
	 */
	@RequestMapping("/getQueryMealMessage")
	public String getQueryMealMessage(WphOrderingfoodCustom food, Model model){
		
		if(food.getDatetime() == "" || food.getDatetime() == null){
			food.setDatetime(sdf.format(new Date()));  
			food.setWphMealtimeFid(1);
		}
		
		try {
			food.setMealdate(sdf.parse(food.getDatetime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		List<WphOrderingfoodCustom> foodList = service.getCustomerOrderingFoodByInfo(food);
		List<WphWardCustom> wardList = service.getWphWardList();
		
		model.addAttribute("food", food);
		model.addAttribute("foodList", foodList);
		model.addAttribute("wardList", wardList);
		
		return "Meal_Query/Query_MealMessage";
	}
	
	
	
	
	
	
	
	/**
	 * 描述：食堂端-订单信息查询
	 *
	 * @param food
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月16日-上午9:04:01
	 */
	@RequestMapping("/getQueryMealOrder")
	public String getQueryMealOrder(WphOrderingfoodCustom food, Model model){
		
		if(food.getDatetime() == "" || food.getDatetime() == null){
			food.setDatetime(sdf.format(new Date()));  
			food.setDatetime2(sdf.format(new Date()));  
			food.setWphMealtypeFid(2);
			food.setWphMealmenuFid(1);
			food.setWphMealtimeFid(1);
			food.setMealadd(null);
		}
		
		try {
			food.setMealdate(sdf.parse(food.getDatetime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		List<WphOrderingfoodCustom> foodList = service.getCustomerOrderingAllByInfo(food);
		List<WphWardCustom> wardList = service.getWphWardList();
		List<WphMealtypeCustom> mealtypeList =	 service.getMealTypeAndMenuAll();
		model.addAttribute("food", food);
		model.addAttribute("foodList", foodList);
		model.addAttribute("wardList", wardList);
		model.addAttribute("mealtypeList", mealtypeList);
		
		return "Meal_Query/Query_MealOrder";
	}


	/**
	 * 获取特餐打印集合
	 * @param food
	 * @param model
	 * @return
	 */
	@RequestMapping("/getSpecialPrintList")
	public String getSpecialPrintList(WphOrderingfoodCustom food,Model model){
		if(null == food.getDatetime() || "".equals(food.getDatetime())){
			food.setDatetime(sdf.format(new Date()));
			food.setWphMealtimeFid(1);
		}
		List<WphWardCustom> wardList = service.getWphWardList();
		List<WphOrderingfoodCustom> foodList = service.getSpecialPrintListByInfo(food);
		model.addAttribute("food",food);
		model.addAttribute("wardList",wardList);
		model.addAttribute("foodList",foodList);
		return "Meal_Query/Query_MealSpecialPrint";
	}


	/**
	 * 2017-12-25
	 * 赵福岭
	 * @return
	 */
	@RequestMapping(value="selectFoodInfoHospitalld")
	public String selectFoodInfoHospitalld(){
		return "Meal_Query/PatientMealDetail";
	}


	/**
	 * 2017-12-25
	 * 赵福岭
	 * @return
	 */
	@RequestMapping(value="selectFoodDetail")
	@ResponseBody
	public List<WphOrderingfoodCustom>  foodDetail(String startDate,String endDate,String hospitalld){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		if(null==startDate||"".equals(startDate)){
			startDate=format.format(new Date());
		}
		if(null==endDate||"".equals(endDate)){
			endDate=format.format(new Date());
		}
		List<WphOrderingfoodCustom> list=service.selectFoodInfoHospitalld(startDate,endDate,hospitalld);
        /*map.put("startDate",startDate);
        map.put("endDate",endDate);
        map.put("hospitalld",hospitalld);*/
		return list;
	}
}
