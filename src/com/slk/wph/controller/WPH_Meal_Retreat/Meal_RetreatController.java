package com.slk.wph.controller.WPH_Meal_Retreat;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping("/MealRetreat")
public class Meal_RetreatController {


	@Autowired
	WPH_MealmenuService service;

	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");


	/**
	 * 描述：进入普餐-退费
	 *
	 * @param message
	 * @param mdoel
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午10:27:50
	 */
	@RequestMapping("/OrdinaryRetreat")
	public String OrdinaryRetreat(String message, Model mdoel){
		if(null != message)mdoel.addAttribute("message", message);
		return "Meal_Retreat/OrdinaryRetreat";
	}



	/**
	 * 描述：通过属性获取餐类订单信息
	 *
	 * @param orderingfood
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月31日-下午4:26:28
	 */
	@ResponseBody
	@RequestMapping("/getfoodRetreatByInfo")
	public List<WphOrderingfoodCustom> getfoodRetreatByInfo(WphOrderingfoodCustom orderingfood){

		try {
			orderingfood.setMealdate(sdf.parse(orderingfood.getDatetime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<WphOrderingfoodCustom>  foodList = service.getfoodRetreatByInfo(orderingfood);

		return foodList;
	}



	/**
	 * 描述：进行普餐-退费
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午9:56:33
	 */
	@ResponseBody
	@RequestMapping("/OrdinaryRetreatIng")
	public Boolean OrdinaryRetreatIng(WphOrderingfoodCustom custom, HttpSession session, RedirectAttributes attr){
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
		custom.setMealstatse(2);//退
		service.updateFoodByInfo(custom);

		WphOrderingfoodCustom food = new WphOrderingfoodCustom();
		food.setOrderingnumber(custom.getOrderingnumber());
		food.setMealstatse(1);
		List<WphOrderingfoodCustom> foodList = service.getFoodListByInfo(food);

		if(foodList.size() == 0 && !service.getOrderingByOldOrderNumber(custom.getOrderingnumber())){

			WphOrdering ordering = new WphOrdering();
			ordering.setOrderingnumber(custom.getOrderingnumber());
			ordering = service.getOrderingByInfo(ordering);

			Double balance =  Double.valueOf(new DecimalFormat("#.00").format((service.getCustomerByHospitalFid(ordering.getCustomerHospitalld())//从数据库里获取患者余额
					.getBalance()+ordering.getMoney())));//消费后的患者余额
			ordering.setFid(null);
			ordering.setOrderingstatse(2);
			ordering.setCustomerBalance(balance);
			/*ordering.setMoney(custom.getMoney());*/
			ordering.setOldorderingnumber(ordering.getOrderingnumber());
			ordering.setOrderingnumber("std_"+(int) ((Math.random() * 9 + 1) * 10000000)+ordering.getCustomerFid());
			ordering.setUserFid(user.getFid());
			ordering.setUsername(user.getName());
			ordering.setUserrole(user.getRoleName());
			ordering.setOrderingdate(ordering.getOrderingdate());
			service.insertOrderingByInfo(ordering);

			WphCustomerCustom customer = new WphCustomerCustom();
			customer.setFid(ordering.getCustomerFid());
			customer.setBalance(balance);
			service.updateCustomerByFid(customer);
		}
		return true;
	}




	/**
	 * 描述：进入普餐-退费
	 *
	 * @param message
	 * @param mdoel
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月1日-上午10:27:50
	 */
	@RequestMapping("/ManyRetreat")
	public String ManyRetreat(String message, Model mdoel){
		if(null != message)mdoel.addAttribute("message", message);
		return "Meal_Retreat/ManyRetreat";
	}




	/**
	 * 描述：通过属性获取餐类订单信息
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月31日-下午4:26:28
	 */
	@RequestMapping("/getManyRetreatByInfo")
	public String getManyRetreatByInfo(WphOrderingfoodCustom food,Model model){
		List<WphOrderingfoodCustom>  foodList = service.getManyFoodListByInfo(food);
		model.addAttribute("food",food);
		model.addAttribute("foodList",foodList);
		return "Meal_Retreat/ManyRetreat";
	}


	/**
	 * 进行多类型退餐
	 * @param orderingNumber
	 * @param hospitalld
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getMantRetreatIng")
	public Boolean getMantRetreatIng(String orderingNumber,String hospitalld){
		WphCustomerCustom customer = service.getCustomerByHospitalFid(hospitalld);
		List<WphOrderingCustom> orderList = service.getManyRetreatListByOrderNumber(new String[]{orderingNumber});
		Double mm = 0.0;
		for(int i=0;i<orderList.size();i++){
			mm += i==0? mm = orderList.get(i).getMoney()+customer.getBalance():orderList.get(i).getMoney();
			orderList.get(i).setCustomerBalance(mm);
		}
		Integer ordercount = service.insertOrderList(orderList);
		Integer foodcount = service.updateFoodByOrderNumber(2, new String[]{orderingNumber});
		customer.setBalance(orderList.get(orderList.size()-1).getCustomerBalance());
		Integer customercount = service.updateCustomerByFid(customer);
		if((ordercount+foodcount+customercount)>=3)return true;
		return false;
	}




}
