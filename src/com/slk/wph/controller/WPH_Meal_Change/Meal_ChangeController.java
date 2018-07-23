package com.slk.wph.controller.WPH_Meal_Change;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;

@Controller
@RequestMapping("/MealChange")
public class Meal_ChangeController {


	@Autowired
	WPH_MealmenuService service;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



	/**
	 * 描述：进入普餐变糖餐
	 *
	 * @param custom
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:09:11
	 */
	@RequestMapping("/Ordinary_SChange")
	public String Ordinary_SChange(WphOrderingfoodCustom custom, Model model){

		if(custom.getDatetime() == "" || custom.getDatetime() == null){
			custom.setDatetime(sdf.format(new Date()));
			custom.setWphWardFid(1);
		}

		List<Integer> fids = new ArrayList<Integer>();
		fids.add(2);
		fids.add(3);
		custom.setFids(fids);
		try {
			custom.setMealdate(sdf.parse(custom.getDatetime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<WphCustomerCustom> customerList = service.getCustomerAndFoodByFood(custom);
		Integer[] arrayFid = new Integer[]{2,3,30};
		List<WphWardCustom> wardList = service.getNotChildrenWardList(arrayFid);

		model.addAttribute("customer", custom);
		model.addAttribute("wardList", wardList);
		model.addAttribute("customerList", customerList);

		return "Meal_Change/Ordinary_SChange";
	}




	/**
	 * 描述：进行普餐变糖餐 变更
	 *
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月3日-上午10:08:50
	 */
	@ResponseBody
	@RequestMapping("/Ordinary_SChangeIng")
	public Boolean Ordinary_SChangeIng(String orderingnumber, HttpSession session){
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
		WphMealmenu mealmenu = service.selectByPrimaryKey(27);
		WphOrdering order = new WphOrdering();
		order.setOrderingnumber(orderingnumber);
		order = service.getOrderingByInfo(order);
		Double balance =  Double.valueOf(new DecimalFormat("#.00").format((service.getCustomerByHospitalFid(order.getCustomerHospitalld())//从数据库里获取患者余额
						 .getBalance())));//消费后的患者余额

		if(balance<mealmenu.getMoney())return false;

		Double Oldmoney = service.getFoodLimt1ByOrderNumber(orderingnumber).getMoney();//原普餐价格
        WphOrderingfood food2 = new WphOrderingfood();
        food2.setTitle("普餐变糖餐");
        food2.setDepict("普餐变糖餐");
        food2.setWphMealtypeFid(4);
        food2.setWphMealtypeName("治疗餐");
        food2.setWphMealmenuFid(mealmenu.getFid());
        food2.setMoney(mealmenu.getMoney());//普变糖- 糖餐20
        food2.setWphMealnumeName("糖餐");
        food2.setOrderingnumber(orderingnumber);

        food2.setUserFid(user.getFid());
        food2.setUsername(user.getName());
        food2.setUserrole(user.getRoleName());
        service.setFoodByOrderNumber(food2);
		System.out.println("患者余额"+balance+"，原订餐金额-普餐"+Oldmoney+",新订餐金额-糖餐"+mealmenu.getMoney()+"最终结果"+Double.valueOf(new DecimalFormat("#.00").format(balance+Oldmoney-mealmenu.getMoney())));
		//总消费信息表-修改 由普餐修改为糖餐
		order.setTitle("普餐变糖餐");
		order.setDepict("普餐变糖餐");
		order.setMoney(mealmenu.getMoney());//普变糖- 糖餐20
		order.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(balance+Oldmoney-mealmenu.getMoney())));
		WphServicedetails details = service.getServiceDetaolsByUUID(mealmenu.getUuid());
		order.setWphQueryFid(details.getWphQueryFid());
		order.setWphServicetypeFid(details.getWphServicetypeFid());
		order.setWphServicedetailsFid(details.getFid());
		order.setUserFid(user.getFid());
		order.setUsername(user.getName());
		order.setUserrole(user.getRoleName());
		order.setCreatedate(new Date());
		service.updateOrderingByInfo(order);//普变糖 直接修改总消费信息表

		//修改患者 余额
		WphCustomerCustom customer = new WphCustomerCustom();
		customer.setFid(order.getCustomerFid());
		customer.setBalance(order.getCustomerBalance());
		service.updateCustomerByFid(customer);

		return true;
	}






	/**
	 * 描述：进入糖餐变普餐
	 *
	 * @param custom
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:09:11
	 */
	@RequestMapping("/Sugar_OChange")
	public String Sugar_OChange(WphOrderingfoodCustom custom, Model model){

		if(custom.getDatetime() == "" || custom.getDatetime() == null){
			custom.setDatetime(sdf.format(new Date()));
			custom.setWphWardFid(1);
		}

		List<Integer> fids = new ArrayList<Integer>();
		fids.add(4);
		custom.setFids(fids);
		try {
			custom.setMealdate(sdf.parse(custom.getDatetime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WphCustomerCustom> customerList = service.getCustomerAndFoodByFood(custom);

		Integer[] arrayFid = new Integer[]{2,3,30};
		List<WphWardCustom> wardList = service.getNotChildrenWardList(arrayFid);

		model.addAttribute("customer", custom);
		model.addAttribute("wardList", wardList);
		model.addAttribute("customerList", customerList);

		return "Meal_Change/Sugar_OChange";
	}





	/**
	 * 描述：进行糖餐变普餐 变更
	 *
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月3日-上午10:08:50
	 */
	@ResponseBody
	@RequestMapping("/Sugar_OChangeIng")
	public Boolean Sugar_OChangeIng(String orderingnumber, HttpSession session){
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
		//餐类信息表-由普餐修改为糖餐
        //全变
        WphOrderingfood food2 = new WphOrderingfood();
        food2.setWphMealtypeFid(2);
        food2.setWphMealtypeName("普餐");
        food2.setWphMealmenuFid(1);
        food2.setWphMealnumeName("普餐");
        food2.setOrderingnumber(orderingnumber);
        food2.setTitle("糖餐变普餐");
        food2.setDepict("糖餐变普餐");
        food2.setUserFid(user.getFid());
        food2.setUsername(user.getName());
        food2.setUserrole(user.getRoleName());
        service.setFoodByOrderNumber(food2);

        WphOrdering order = new WphOrdering();
        order.setOrderingnumber(orderingnumber);
        order = service.getOrderingByInfo(order);
        //总消费信息表-修改 由普餐修改为糖餐
        order.setTitle("糖餐变普餐");
        order.setDepict("糖餐变普餐");
        //获取details参数，赋值order
        WphMealmenu mealmenu = service.selectByPrimaryKey(1);
        WphServicedetails details = service.getServiceDetaolsByUUID(mealmenu.getUuid());

        order.setWphQueryFid(details.getWphQueryFid());
        order.setWphServicetypeFid(details.getWphServicetypeFid());
        order.setWphServicedetailsFid(details.getFid());
        order.setUserFid(user.getFid());
        order.setUsername(user.getName());
        order.setUserrole(user.getRoleName());
        service.updateOrderingByInfo(order);//糖变普，金额不变，deatis改变

		return true;
	}




	/**
	 * 描述：进入肠内配置
	 *
	 * @param custom
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:09:11
	 */
	@RequestMapping("/IntestinalMeal")
	public String IntestinalMeal(WphOrderingfoodCustom custom, String message, String noMoneryNameList, Model model){

		if(custom.getDatetime() == "" || custom.getDatetime() == null){
			custom.setDatetime(sdf.format(new Date()));
			custom.setWphWardFid(1);
		}

		try {
			custom.setMealdate(sdf.parse(custom.getDatetime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<WphCustomerCustom> customerList = service.getCustomerAndFoodByFood(custom);
		List<WphWardCustom> wardList = service.getWphWardList();

		model.addAttribute("custom", custom);
		model.addAttribute("wardList", wardList);
		model.addAttribute("customerList", customerList);
		model.addAttribute("message", message);
		model.addAttribute("noMoneryNameList", noMoneryNameList);

		return "Meal_Change/IntestinalMeal";
	}


	/**
	 * 描述：进行订制肠内配置
	 *
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月3日-上午10:08:50
	 */
	@RequestMapping("/IntestinalMealIng")
	public String IntestinalMealIng(WphOrderingfoodCustom custom, HttpSession session, RedirectAttributes attr){
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
		WphMealmenuCustom mealmenu = service.getMenuAndTypeNameByFid(28);
		String noMoneryNameList = "以下患者余额不足，不能订购肠内配置餐：";
		for(int i=0;i<custom.getFids().size();i++){
			WphCustomerCustom customer = service.getCustomerByFid(custom.getFids().get(i));
			String orderingnumber =  "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid();
			Double balance =  service.getCustomerByHospitalFid(customer.getHospitalld()).getBalance();//消费后的患者余额

			if(balance<mealmenu.getMoney()){
				noMoneryNameList += customer.getName()+","+customer.getHospitalld()+" &nbsp; ";
			}else{

				//insert餐类消费信息
				WphOrderingfoodCustom food = new WphOrderingfoodCustom();
				try {
					food.setMealdate(sdf.parse(custom.getDatetime()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				food.setOrderingnumber(orderingnumber);
				food.setTitle("肠内配置餐");
				food.setDepict("肠内配置餐");
				food.setNumbers(1);
				food.setMoney(mealmenu.getMoney());
				food.setMealstatse(1);
				food.setCustomerFid(customer.getFid());
				food.setCustomerCardid(customer.getWphCardNumber());
				food.setCustomerHospitalld(customer.getHospitalld());
				food.setWphMealmenuFid(mealmenu.getFid());
				food.setWphMealnumeName(mealmenu.getName());
				food.setWphMealtypeFid(mealmenu.getWphMealtypeFid());
				food.setWphMealtypeName(mealmenu.getMtName());
				food.setUserFid(user.getFid());
				food.setUsername(user.getName());
				food.setUserrole(user.getRoleName());
				service.insertSpecialOrderingFoodByInfo(food);

				//insert总消费信息表
				WphOrdering order = new WphOrdering();
				order.setTitle(food.getTitle());
				order.setDepict(food.getDepict());
				order.setMoney(food.getMoney());
				order.setOrderingstatse(1);
				order.setCustomerFid(food.getCustomerFid());
				order.setCustomerCarid(food.getCustomerCardid());
				order.setCustomerHospitalld(food.getCustomerHospitalld());
				order.setCustomerBalance( Double.valueOf(new DecimalFormat("#.00").format(balance-order.getMoney())));
				WphServicedetails details = service.getServiceDetaolsByUUID(mealmenu.getUuid());
				order.setWphQueryFid(details.getWphQueryFid());
				order.setWphServicetypeFid(details.getWphServicetypeFid());
				order.setWphServicedetailsFid(details.getFid());
				order.setWphInvoicerateFid(2);
				order.setOrderingdate(food.getMealdate());//此时两个表中的字段值相同
				order.setPaytype(5);
				order.setOrderingnumber(orderingnumber);
				order.setUserFid(user.getFid());
				order.setUsername(user.getName());
				order.setUserrole(user.getRoleName());
				order.setWphWardFid(customer.getWphWardFid());
				service.insertOrderingByInfo(order);

				//修改患者余额
				customer = new WphCustomerCustom();
				customer.setFid(order.getCustomerFid());
				customer.setBalance(order.getCustomerBalance());
				service.updateCustomerByFid(customer);
			}
		}

		if(noMoneryNameList.length() > 20)
			attr.addAttribute("noMoneryNameList", noMoneryNameList);
		attr.addAttribute("message", "操作成功");
		attr.addAttribute("datetime", custom.getDatetime());
		attr.addAttribute("wphWardFid", custom.getWphWardFid());

		return "redirect:IntestinalMeal";
	}
	/**
	 *描述
	 *@params
	 *@return
	 *创建人  杨明
	 *创建时间  2018/6/7 0007
	 *修改人和其它信息
	 */
	@ResponseBody
	@RequestMapping("/IntestinalMealIng1")
	public Boolean IntestinalMealIng1(WphOrderingfoodCustom custom, HttpSession session, RedirectAttributes attr) {
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer) session.getAttribute("userFID"));
		WphMealmenuCustom mealmenu = service.getMenuAndTypeNameByFid(28);
		String noMoneryNameList = "以下患者余额不足，不能订购肠内配置餐：";
		for (int i = 0; i < custom.getFids().size(); i++) {
			WphCustomerCustom customer = service.getCustomerByFid(custom.getFids().get(i));
			String orderingnumber = "std_" + (int) ((Math.random() * 9 + 1) * 10000000) + customer.getFid();
			Double balance = service.getCustomerByHospitalFid(customer.getHospitalld()).getBalance();//消费后的患者余额
			if (balance < mealmenu.getMoney()) {
				noMoneryNameList += customer.getName() + "," + customer.getHospitalld() + " &nbsp; ";
			} else {
				//insert餐类消费信息
				WphOrderingfoodCustom food = new WphOrderingfoodCustom();
				try {
					food.setMealdate(sdf.parse(custom.getDatetime()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				food.setOrderingnumber(orderingnumber);
				food.setTitle("肠内配置餐");
				food.setDepict("肠内配置餐");
				food.setNumbers(1);
				food.setMoney(mealmenu.getMoney());
				food.setMealstatse(1);
				food.setCustomerFid(customer.getFid());
				food.setCustomerCardid(customer.getWphCardNumber());
				food.setCustomerHospitalld(customer.getHospitalld());
				food.setWphMealmenuFid(mealmenu.getFid());
				food.setWphMealnumeName(mealmenu.getName());
				food.setWphMealtypeFid(mealmenu.getWphMealtypeFid());
				food.setWphMealtypeName(mealmenu.getMtName());
				food.setUserFid(user.getFid());
				food.setUsername(user.getName());
				food.setUserrole(user.getRoleName());
				service.insertSpecialOrderingFoodByInfo(food);
				//insert总消费信息表
				WphOrdering order = new WphOrdering();
				order.setTitle(food.getTitle());
				order.setDepict(food.getDepict());
				order.setMoney(food.getMoney());
				order.setOrderingstatse(1);
				order.setCustomerFid(food.getCustomerFid());
				order.setCustomerCarid(food.getCustomerCardid());
				order.setCustomerHospitalld(food.getCustomerHospitalld());
				order.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(balance - order.getMoney())));
				WphServicedetails details = service.getServiceDetaolsByUUID(mealmenu.getUuid());
				order.setWphQueryFid(details.getWphQueryFid());
				order.setWphServicetypeFid(details.getWphServicetypeFid());
				order.setWphServicedetailsFid(details.getFid());
				order.setWphInvoicerateFid(2);
				order.setOrderingdate(food.getMealdate());//此时两个表中的字段值相同
				order.setPaytype(5);
				order.setOrderingnumber(orderingnumber);
				order.setUserFid(user.getFid());
				order.setUsername(user.getName());
				order.setUserrole(user.getRoleName());
				order.setWphWardFid(customer.getWphWardFid());
				service.insertOrderingByInfo(order);
				//修改患者余额
				customer = new WphCustomerCustom();
				customer.setFid(order.getCustomerFid());
				customer.setBalance(order.getCustomerBalance());
				service.updateCustomerByFid(customer);
			}
		}
		if(noMoneryNameList.length() > 20) {
			attr.addAttribute("noMoneryNameList", noMoneryNameList);
			return false;
		}
		return true;
	}



	/**
	 * 描述：进入变餐
	 *
	 * @param custom
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:09:11
	 */
	@RequestMapping("/ChangeMeal")
	public String ChangeMeal(WphOrderingfoodCustom custom, Model model){

		if(custom.getDatetime() != "" && custom.getDatetime() != null){
			try {
				custom.setMealdate(sdf.parse(custom.getDatetime()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			WphCustomerCustom customer = service.getCustomerAndFoodCByFood(custom);
			Integer mealTypeFid = 2;
			if(null != customer && customer.getFood().getWphMealnumeName().equals("儿童餐"))mealTypeFid = 3;

			List<WphMealmenuCustom> mealMenuList = service.getMealMenuByFid(mealTypeFid);

			model.addAttribute("food", custom);
			model.addAttribute("customer", customer);
			model.addAttribute("mealMenuList", mealMenuList);
		}

		return "Meal_Change/ChangeMeal";
	}




	/**
	 * 描述：根据foodFid获取餐类信息
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月4日-下午2:30:13
	 */
	@ResponseBody
	@RequestMapping("/getFoodByFid")
	public WphOrderingfood getFoodByFid(Integer fid){

		WphOrderingfood food = service.getOrderingFoodByFid(fid);


		return food;
	}



	/**
	 * 描述：进行变餐
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月4日-下午3:09:48
	 */
	@ResponseBody
	@RequestMapping("/ChangeMealIng")
	public Boolean ChangeMealIng(WphOrderingfoodCustom food){
        Boolean flag = true;
	    try {
            //根据订单号修改food
            service.setFoodByOrderNumber(food);
            //查询mealmenu中与detail对应的参数
            WphServicedetails detail = service.getDetailBymenuFid(food.getWphMealmenuFid());
            //修改order表
            WphOrdering order = new WphOrdering();
            order.setOrderingnumber(food.getOrderingnumber());
            order = service.getOrderingByInfo(order);
            order.setWphServicetypeFid(detail.getWphServicetypeFid());
            order.setWphServicedetailsFid(detail.getFid());
            service.updateOrderingByInfo(order);
        }catch (Exception e){
	        flag = false;
	        //e.printStackTrace();
        }
		return flag;
	}










}
