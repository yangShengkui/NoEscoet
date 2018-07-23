package com.slk.wph.controller.WPH_Meal_Reserve;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import net.sf.json.JSONObject;
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
import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;

@Controller
@RequestMapping("/MealReserve")
public class Meal_ReserveController {


	@Autowired
	private WPH_MealmenuService service;

	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 描述：进入订餐--普餐
	 *
	 * @param message
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月17日-上午9:52:34
	 */
	@RequestMapping("/OrdinaryReserve")
	public String OrdinaryReserve( String message, Integer type, HttpSession session,Model model){
		model.addAttribute("privilegeType", type);
		model.addAttribute("message", message);
		return "Meal_Reserve/OrdinaryReserve";
	}


	/**
	 * 描述：订餐管理-普餐  获取普餐，儿童餐，治疗餐
	 *
	 * @param hospitalId
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午4:34:01
	 */
	@Token(save=true)
	@RequestMapping("/getOrdinaryReserveByHospitalId")
	public String getOrdinaryReserveByHospitalId(String hospitalId, String datetime ,Integer nursingState, Model model){
		WphCustomerCustom customer = service.getCustomerByHospitalFid(hospitalId);

		List<Integer> fids = new ArrayList<Integer>();
		if(nursingState == 1)fids.add(2);
		if(nursingState == 2)fids.add(3);

 		WphMealmenuCustom mealmenu = new WphMealmenuCustom();
		mealmenu.setFids(fids);
		List<WphMealmenuCustom> mealMenuList = service.getMenuByAboutMealTypeFid(mealmenu);

		model.addAttribute("datetime", datetime);
		model.addAttribute("customer", customer);
		model.addAttribute("nursingState", nursingState);
		model.addAttribute("mealMenuList", mealMenuList);
		return "Meal_Reserve/OrdinaryReserve";
	}



	/**
	 * 描述：订餐管理-普餐进行订餐
	 *
	 * @param food
	 * @param attr
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月20日-下午2:03:47
	 */
	@Token(remove=true)
	@RequestMapping("/OrdinaryReserveIng")
	public String OrdinaryreserveIng(WphOrderingfoodCustom food, RedirectAttributes attr, HttpSession session){
		Double balance =  Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
				 (service.getCustomerByHospitalFid(food.getCustomerHospitalld())//从数据库里获取患者余额
						 .getBalance()-food.getMoney())));//消费后的患者余额
		String orderingnumber =  "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+food.getCustomerFid();
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));

		if(balance<0){
	 		 attr.addAttribute("message", "操作失败，余额不足");
			 return "redirect:OrdinaryReserve";
	 	 }
		//修改患者余额
		WphCustomerCustom customer = new WphCustomerCustom();
		customer.setFid(food.getCustomerFid());
		customer.setBalance(balance);
		service.updateCustomerByFid(customer);

		//添加餐类消费信息表以及总消费信息表
		try {
			food.setMealdate(sdf.parse(food.getDatetime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		food.setCustomerBalance(balance);
		food.setUserFid(user.getFid());
		food.setUsername(user.getName());
		food.setUserrole(user.getRoleName());

		food.setOrderingnumber(orderingnumber);
		service.insertOrdinaryOrderingByInfo(food);

		attr.addAttribute("message", "操作成功");
		return "redirect:OrdinaryReserve";
	}





	/**
	 * 描述：订餐管理-普餐  验证此患者在当前选择的时间内是否定普餐
	 *
	 * @param orderingfood
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月21日-上午10:42:36
	 */
	@ResponseBody
	@RequestMapping("/getDateTimeByMeal")
	public Integer getDateTimeByMeal(WphOrderingfoodCustom orderingfood){
		Integer state = 0;

		try {
			orderingfood.setMealdate(sdf.parse(orderingfood.getDatetime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if(service.getOrderingCountByInfo(orderingfood) != 0){
			state = 1;//选择时间已定餐
		}else{
			state = 2;//通过
		}
		return state;
	}





	/**
	 * 描述：进入订餐--特餐
	 *
	 * @param message
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月17日-上午9:56:05
	 */
	@RequestMapping("/SpecialReserve")
	public String SpecialReserve(String message, Model model){
		model.addAttribute("message", message);
		return "Meal_Reserve/SpecialReserve";
	}





	/**
	 * 描述：订餐管理-特餐  获取特餐，其他
	 *
	 * @param hospitalId
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午4:34:01
	 */
	@Token(save=true)
	@RequestMapping("/getSpecialReserveByHospitalId")
	public String getSpecialReserveByHospitalId(String hospitalId, String datetime , Model model){
		WphCustomerCustom customer = service.getCustomerByHospitalFid(hospitalId);

		//其他餐类型
		List<WphMealtype> mealTypeList = service.getMealTypeByGreaterThanFid(6);

 		WphMealmenuCustom mealmenu = new WphMealmenuCustom();
 		//特餐
 		mealmenu.setWeek(getWeekByNextDate(new Date()));
		mealmenu.setWphMealtypeFid(5);
		List<WphMealmenuCustom> specialList = service.getMenuByAboutMealTypeFid(mealmenu);
		//其他
		mealmenu.setWphMealtypeFid(7);
		List<WphMealmenuCustom> otherMenuList = service.getMenuByAboutMealTypeFid(mealmenu);

		model.addAttribute("datetime", datetime);
		model.addAttribute("customer", customer);
		model.addAttribute("mealTypeList", mealTypeList);
		model.addAttribute("specialList", specialList);
		model.addAttribute("otherMenuList", otherMenuList);
		return "Meal_Reserve/SpecialReserve";
	}




	/**
	 * 描述：根据fid获取餐对象
	 *
	 * @param fid
	 * @return WphMealmenu
	 *
	 * @author 宋现亮
	 * @time 2017年10月11日-下午3:15:07
	 */
	@ResponseBody
	@RequestMapping("/getMealmenuByFid")
	public WphMealmenu getMealmenuByFid(Integer fid){

		WphMealmenu mealmenu = service.selectByPrimaryKey(fid);

		return mealmenu;
	}



	/**
	 * 描述：特餐管理-进行订餐
	 *
	 * @param custom
	 * @param model
	 * @param attr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月25日-下午1:48:34
	 */
	 @Token(remove=true)
	 @RequestMapping("/SpecialReserveIng")
	 public String SpecialReserveIng(WphOrderingfoodCustom custom, Model model, HttpSession session, RedirectAttributes attr){
		 String orderingnumber =  "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+custom.getCustomerFid();
	 	 WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
	 	 Double balance = Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
				 (service.getCustomerByHospitalFid(custom.getCustomerHospitalld()).getBalance())));//从数据库里获取患者余额

	 	 if(custom.getTotalamount()>balance){
	 		 attr.addAttribute("message", "操作失败，余额不足");
			 return "redirect:SpecialReserve";
	 	 }

		 //insert 餐类信息表
		 for(WphOrderingfoodCustom food :  custom.getFood())
			 if(null != food.getTitle()){
				 try {
					food.setMealdate(sdf.parse(food.getDatetime()));
				 } catch (ParseException e) {
					e.printStackTrace();
				 }
				 food.setUserFid(user.getFid());
				 food.setUsername(user.getName());
				 food.setUserrole(user.getRoleName());
				 food.setOrderingnumber(orderingnumber);
				 service.insertSpecialOrderingFoodByInfo(food);

				 WphOrdering ordering = new WphOrdering();
				 ordering.setTitle(food.getTitle());
				 ordering.setDepict(food.getDepict());
				 ordering.setMoney(food.getMoney());
				 ordering.setOrderingstatse(1);
				 ordering.setCustomerFid(food.getCustomerFid());
				 ordering.setCustomerCarid(food.getCustomerCardid());
				 ordering.setCustomerHospitalld(food.getCustomerHospitalld());
				 balance = Double.valueOf(new DecimalFormat("#.00").format(balance-food.getMoney()));
				 ordering.setCustomerBalance(balance);
				 WphServicedetails details = service.getServiceDetaolsByUUID(food.getUuid());
				 ordering.setWphQueryFid(details.getWphQueryFid());
				 ordering.setWphServicetypeFid(details.getWphServicetypeFid());
				 ordering.setWphServicedetailsFid(details.getFid());
				 ordering.setOrderingdate(food.getMealdate());//两个表中的字段值相同
				 ordering.setPaytype(5);
				 ordering.setOrderingnumber(orderingnumber);
				 ordering.setUserFid(user.getFid());
				 ordering.setUsername(user.getName());
				 ordering.setUserrole(user.getRoleName());
				 ordering.setWphWardFid(custom.getWphWardFid());
				 service.insertOrderingByInfo(ordering);
				 //insert总消费信息表  二期
				 /* WphMealmenuCustom mealmenu = new WphMealmenuCustom();
				 mealmenu.setFid(food.getWphMealmenuFid());
				 mealmenu.setNownum(food.getNownum());
				 service.setOrdinaryByInfo(mealmenu);*/
			 }

			 //修改患者余额
			 WphCustomerCustom customer = new WphCustomerCustom();
			 customer.setFid(custom.getCustomerFid());
			 customer.setBalance(balance);
			 service.updateCustomerByFid(customer);

		 attr.addAttribute("message", "操作成功");
		 return "redirect:SpecialReserve";
	 }


	/**
	 * 进入订餐-VIP餐
	 * @param model
	 * @return
	 * song xian liang
	 */
	@RequestMapping("/VIPReserve")
 	public String VIPReserve(Model model){
		List<WphMealmenuCustom> mealMenuList = service.getMealMenuByTypeFid(15);
		model.addAttribute("mealMenuList",mealMenuList);
		return "Meal_Reserve/VIPReserve";
	 }


	/**
	 *  查询VIP用户信息
	 * @param hospitalId
	 * @return Customer
	 * song xian liang
	 */
	@Token(save=true)
	@ResponseBody
	@RequestMapping(value= "/getVIPReserve")
 	public String getVIPReserve(String hospitalId, HttpServletRequest request) throws IOException {
		WphCustomerCustom customer = service.getVIPReserve(hospitalId);
		Map<String,Object> map = new HashMap<String,Object>();
		map.clear();
		map.put("customer",customer);
		map.put("token",request.getSession(true).getAttribute("token"));//重复提交验证token
		return JSONObject.fromObject(map).toString();
	 }


	/**
	 * 进行订VIP餐
	 * @param food
	 * @param session
	 * @return Boolean
	 * song xian liang
	 */

	 @ResponseBody
	 @Token(remove=true)
	 @RequestMapping("/getVIPReserveIng")
	 public Integer getVIPReserveIng(WphOrderingfoodCustom food,HttpSession session){
	 	 Integer foodState = 0;//默认订餐失败，获取不到患者的数据信息
		 WphUserCustom user = service.getRoleAndUserByUserFid((Integer) session.getAttribute("userFID"));
		 food.setWphMealtypeFid(15);
		 food.setUserFid(user.getFid());
		 food.setUsername(user.getName());
		 food.setUserrole(user.getRoleName());
		 //通过查询汇总出所有订VIP所需要插入的数据
		 WphOrderingfoodCustom foodCustom = service.getVIPReserveIngBefore(food);
		 if(null != foodCustom){
		 	if (foodCustom.getCustomer().getBalance()>=0){
				foodState = 1;
				//进行订VIP餐操作
				service.insertSpecialOrderingFoodByInfo(foodCustom);
				service.insertOrderingByInfo(foodCustom.getOrder());
				service.updateCustomerByFid2(foodCustom.getCustomer());
			}else{
				foodState = 2;//余额不足，不能订餐
			}
		 }
		 return foodState;
}



	/**
	 * 描述：普餐-验证住院号
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午4:38:26
	 */
	@ResponseBody
	@RequestMapping("/getCustomerOrdinaryByhospitalId")
	public Integer getCustomerOrdinaryByhospitalId(WphOrderingfoodCustom orderingfood){
		Integer state = 0;//默认未查询到用户
		WphCustomerCustom customer = service.getCustomerByHospitalFid(orderingfood.getCustomerHospitalld());
		if(null != customer){
			Integer count = service.getBoolNursingByCustomerFid(customer.getFid());
			if(count == 0 ) {
				if (customer.getHospitalldstatus() != 1) {
					state = 4;
				} else if (customer.getWphWardFid() == 2 || customer.getWphWardFid() == 3) {
					state = 2;//没订护理，但它是儿童科，不能订普餐,可以订糖餐，儿童餐
				} else {
					state = 3;//没订护理，不能订餐
				}
			}else if(customer.getWphWardFid() == 30){
					state = 5;//国际诊疗病区不能订
			}else{
				state = 1;//已订护理
			}
		}



		return state;
	}


	/**
	 * 描述：糖餐-验证住院号
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月18日-下午4:38:26
	 */
	@ResponseBody
	@RequestMapping("/getCustomerByhospitalId")
	public Integer getCustomerByhospitalId(WphOrderingfoodCustom orderingfood){
		Integer state = 0;//默认未查询到用户
		WphCustomerCustom customer = service.getCustomerByHospitalFid(orderingfood.getCustomerHospitalld());
		if(null != customer){
			if(customer.getWphWardFid() == 1){
				state = 3;//state = 3;妇产科，无需接收患者确认直接订餐
			}else if(customer.getHospitalldstatus() != 1 && customer.getWorker() ==0){
				state = 2;//不在住院状态
			}else{
				state = 1;
			}

		}
		return state;
	}


	/**
	 * 获取空腹餐集合
	 * @param food
	 * @param model
	 * @return
	 */
	@RequestMapping("/getInputFactList")
	public String getInputFactList(WphOrderingfoodCustom food,Model model){
		if(null == food.getDatetime() || "".equals(food.getDatetime())){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
			food.setDatetime(df.format(new Date()));
		}
		food.setMealstatse(1);
		List<WphWardCustom> wardList = service.getNotChildrenWardList( new Integer[]{30});
		List<WphCustomerCustom> customerList = service.getInputFactFoodListByInfo(food);
		model.addAttribute("food",food);
		model.addAttribute("wardList",wardList);
		model.addAttribute("customerList",customerList);
		return "Meal_Reserve/InputFasting";
	}


	/**
	 * 进行空腹餐选中,或者取消
	 * @param food
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getInputFactIng")
	public Boolean getInputFactIng(WphOrderingfood food){
		if(service.updateFoodByInfo(food)!=0) return true;
		return false;
	}





	/**
	  * 描述：根据当前时间获取明天的星期数（数字）
	  *
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年7月21日-下午3:59:03
	  */
	 private static Integer getWeekByNextDate(Date date){

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
