package com.slk.wph.controller.WPH_Meal_H5;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/Meal_H5APP")
public class Meal_H5Controller {

	@Autowired
	private  WPH_MealmenuService service;


	private  Map<String,Object> map = new HashMap<String,Object>();

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");

	/*@ResponseBody
	@RequestMapping("/getMealList")
	public String getMealList(){
		map.clear();
		Boolean flag = false;

		*//*List<WphMealtypeCustom> menuOne = service.getMealTypeAndMenu();

		List<WphMealmenuCustom> menuTwe = service.getMenuBySpecialMealWeek(getWeekByNextDate(new Date()));*//*
		if(menuOne.size()+menuTwe.size() != 0){
			map.put("menuOneList", menuOne);
			map.put("menuTweList", menuTwe);
			flag = true;
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}



	@ResponseBody
	@RequestMapping("/getCustomerByMealOrdinary")
	public String getCustomerByMealOrdinary(String number,String menuFid) {
		map.clear();
		Boolean flag = false;
		Integer customerState = 0;//患者 获取不到患者
		Integer nursingState = 0; //护理  没定护理，也不是儿童科
		Integer historyState = 0; //历史  获取不到历史
		WphCustomerCustom customer;
		if(number.length() == 10) customer = service.getCustomerByCardId(number);//根据卡id
		else 					  customer = service.getCustomerByHospitalFid(number);//根据住院号

		if(null != customer){
			customerState = 1;//换获取到患者
			map.put("customer", customer);

			if(service.getBoolNursingByCustomerFid(customer.getFid()) == 0){
				if(customer.getWphWardFid() == 2 || customer.getWphWardFid() == 3){
					nursingState = 2;//没订护理，但它是儿童科，不能订普餐,可以订糖餐，儿童餐
				}
			}else{
				nursingState = 1;//已订护理
			}
			if(nursingState != 0){
				WphOrderingfoodCustom food = new WphOrderingfoodCustom();
				food.setCustomerFid(customer.getFid());
				food.setWphMealmenuFid(Integer.valueOf(menuFid));
				List<Integer> fids = new ArrayList<Integer>();
				fids.add(Integer.valueOf(menuFid));fids.add(27);
				food.setFids(fids);
				WphOrderingfoodCustom history = service.getHistoryByInfo(food);
				if(null != history){
					flag = true;
					historyState = 1;//能获取历史记录
					map.put("history", history);
				}
			}
		}

		map.put("flag", flag);
		map.put("customerState", customerState);
		map.put("nursingState", nursingState);
		map.put("historyState", historyState);

		return JSONObject.fromObject(map).toString();
	}




	@ResponseBody
	@RequestMapping("/PaymentMealOrdinaryIng")
	public String PaymentMealOrdinaryIng(String info ,String UUID) {
		map.clear();
		Integer count = 0;
		Boolean flag = false;
		Boolean moneyFlag = true;//判断金额是否充足
		Boolean bookedFlag = false;

		JSONObject objects = JSONObject.fromObject(info);
		WphOrderingfoodCustom food = (WphOrderingfoodCustom)JSONObject.toBean(objects.getJSONObject("orderingFood"), WphOrderingfoodCustom.class);
		WphOrdering ordering = (WphOrdering)JSONObject.toBean(objects.getJSONObject("ordering"), WphOrdering.class);
		String orderingnumber =  "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+food.getCustomerFid();
		try {
			//第一个判断：该患者是否已订餐 第二个判断：该患者属于儿童科，直接可以订多份
			if(service.getOrderingCountByInfo(food) == 0 || (ordering.getWphWardFid() == 2 || ordering.getWphWardFid() == 3 ) ){
				bookedFlag = true;//当前时间没有订过普餐类
				if(null != food.getMoney()){//金额为null时，不提交订单
					WphCustomerCustom customer = service.getCustomerByFid(food.getCustomerFid());
					if(customer.getBalance()<ordering.getMoney()){
						map.put("flag", flag);
						map.put("moneyFlag", moneyFlag);//余额不足
						return JSONObject.fromObject(map).toString();
					}
					WphServicedetailsCustom details = service.selectByUUid(UUID);
					food.setMealstatse(1);
					food.setOrderingnumber(orderingnumber);
					food.setMealdate(sdf.parse(food.getDatetime()));
					String[] meal = new String[]{"早餐","午餐","晚餐"};
					for(int i=0;i<meal.length;i++){
						food.setWphMealtimeName(meal[i]);
						food.setWphMealtimeFid(i+1);
						service.insertSpecialOrderingFoodByInfo(food);
					}

					ordering.setWphQueryFid(details.getWphQueryFid());
					ordering.setWphServicetypeFid(details.getWphServicetypeFid());
					ordering.setWphServicedetailsFid(details.getFid());
					ordering.setWphInvoicerateFid(2);
					ordering.setOrderingdate(food.getMealdate());
					ordering.setOrderingnumber(orderingnumber);
					ordering.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(customer.getBalance()-food.getMoney())));
					count += service.insertOrderingByInfo(ordering);

					//修改患者余额
					customer.setBalance(ordering.getCustomerBalance());
					service.updateCustomerByFid2(customer);

					if(count != 0)flag = true;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("H5----订餐日期转换错误");
		}

		map.put("bookedFlag", bookedFlag);
		map.put("flag", flag);

		return JSONObject.fromObject(map).toString();
	}




*/





	/**
	 * 描述：根据当前时间获取明天的星期数（数字）
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月21日-下午3:59:03
	 */
	private Integer getWeekByNextDate(Date date){

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, +1);//+1今天的时间加一天

		SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
		String format = dateFm.format(calendar.getTime());

		if ("星期一".equalsIgnoreCase(format)||"Monday".equals(format))
			return 1;
		else if ("星期二".equalsIgnoreCase(format)||"Tuesday".equals(format))
			return 2;
		else if ("星期三".equalsIgnoreCase(format)||"Wednesday".equals(format))
			return 3;
		else if ("星期四".equalsIgnoreCase(format)||"Thursday".equals(format))
			return 4;
		else if ("星期五".equalsIgnoreCase(format)||"Friday".equals(format))
			return 5;
		else if ("星期六".equalsIgnoreCase(format)||"Saturday".equals(format))
			return 6;
		else if ("星期日".equalsIgnoreCase(format)||"Sunday".equals(format))
			return 7;
		return 0;
	}

}
