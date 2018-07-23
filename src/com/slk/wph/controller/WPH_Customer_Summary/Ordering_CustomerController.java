package com.slk.wph.controller.WPH_Customer_Summary;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.framework.Util.push.PushUtil;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingConsumeInfo;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping("/Customer_Summary")
public class Ordering_CustomerController {
	
	
	@Autowired
	WPH_CustomerService service;
	
	
	
	
	
	/**
	 * 描述：卡内余额查询
	 *
	 * @param cardStr
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:45:20
	 */
	@RequestMapping("/BalanceInCard")
	public String BalanceInCard(String cardStr, Model model, HttpSession session){
		
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
		model.addAttribute("user", user);
		
		if(null !=  cardStr){
			WphCustomerCustom customer = service.getCustomerByCard(cardStr);
			WphOrderingConsumeInfo consumeInfo = service.getOrderSummaryByHospital(customer.getHospitalld());
			model.addAttribute("customer", customer);
			model.addAttribute("consumeInfo", consumeInfo);
		}
		
		return "Customer_Summary/Customer_CardBalance";
	}
	
	
	
	/***
	 * 描述：余额查询验证患者信息
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:53:25
	 */
	@ResponseBody
	@RequestMapping("/getCustomerByCard")
	public WphCustomer getCustomerByCard(String cardStr){
		
		WphCustomerCustom customer = service.getCustomerByCard(cardStr);
		
		return customer;
	}
	
	
	
	
	
	/**
	 * 描述：出院结算查询
	 *
	 * @param cardStr
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:45:20
	 */
	@RequestMapping("/OutHospital")
	@Token(save=true)
	public String OutHospital(String cardStr, String message, Model model, HttpSession session){
		
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
		model.addAttribute("user", user);
		
		if(null !=  cardStr){
			WphCustomerCustom customer = service.getCustomerByCard(cardStr);
			WphOrderingConsumeInfo consumeInfo = service.getOrderSummaryByHospital2(customer.getHospitalld());
			model.addAttribute("customer", customer);
			model.addAttribute("consumeInfo", consumeInfo);
		}
		model.addAttribute("message", message);
		
		return "Customer_Summary/Customer_OutHospital";
	}
	
	
	
	/***
	 * 描述：出院结算验证患者信息
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:53:25
	 */
	@ResponseBody
	@RequestMapping("/getCustomerByCard2")
	public WphCustomer getCustomerByCard2(String cardStr){
		
		WphCustomerCustom customer = service.getCustomerByCard(cardStr);
		if(null != customer && customer.getHospitalldstatus() != 2 && customer.getWphWardFid() != 1){//ward：1；妇产科//
			WphUserCustom user = service.getUserByRoleWard(customer.getWphWardFid());
			if(null != user){
				//向app传参
				JSONObject json = new JSONObject();
				json.put("hospitalld", customer.getHospitalld());
				//发送推送给此患者所属的护工组长
				PushUtil.sendAndroidUnicastActivityExtra("无陪护-患者需办理出院确认","点击进入", "患者："+customer.getName()+",需办理出院确认。",user.getDeviceTokens(),
													"com.sluoqi.wwb.wph_app.Activtry.HgHead.DisChangeConfirmationNum",json.toString());
				customer.setUser(user);
			}
			
		}
		return customer;
	}
	
	
	/**
	 * 描述：进行出院结算
	 *
	 * @param attr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月22日-下午1:40:42
	 */
	@RequestMapping("/OutHospitalIng")
	@Token(remove=true)
	public String OutHospitalIng(WphCustomerCustom customer, RedirectAttributes attr, HttpSession session){
		if(service.getOutHospitalByHospitalId(customer.getHospitalld())==0){
			String orderingnumber= "";
			String oldOrdernumber = "";
			Double balance = service.getCustomerByInfo(customer).getBalance();
			WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
			//修改患者的消费信息为退费
			String ordernumbers = service.getRetreaOrdernumbers(customer.getHospitalld());
			if(!"".equals(ordernumbers) && null != ordernumbers){
				List<WphOrderingCustom> orderList = service.getRetreatMoneyByHospitalld(ordernumbers.split(","));
				for(WphOrderingCustom order:orderList){
					if(!oldOrdernumber.equals(order.getOrderingnumber())){
						orderingnumber = "std_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid();
						oldOrdernumber = order.getOrderingnumber();
					}
					balance = Double.valueOf(new DecimalFormat("#.00").format(order.getMoney()+balance));
					order.setFid(null);
					order.setCustomerBalance(balance);
					order.setOrderingstatse(2);
					order.setOrderingdate(new Date());
					order.setOldorderingnumber(order.getOrderingnumber());
					order.setOrderingnumber(orderingnumber);
					service.InsertOrderingByInfo(order);
				}
			}

			//修改患者的餐类信息为退餐
			List<WphOrderingfoodCustom> foodList = service.getOrderingfoodRetreatByHospitalId(customer.getHospitalld());
			for(WphOrderingfoodCustom orderFood:foodList){
				orderFood.setMealstatse(2);
				service.updateOrderFoodByFid(orderFood);
			}

			//获取开卡押金原订单号
			WphOrdering deposit = new WphOrdering();
			deposit.setTitle("开卡押金");
			deposit.setCustomerHospitalld(customer.getHospitalld());
			deposit = service.getOrderingByInfo(deposit);

			//进行退卡押金
			WphOrdering ordering = new WphOrdering();
			ordering.setTitle("退卡押金");
			ordering.setDepict("退卡押金");
			ordering.setMoney(deposit.getMoney());
			ordering.setOrderingstatse(2);
			ordering.setCustomerFid(customer.getFid());
			ordering.setCustomerCarid(customer.getWphCardNumber());
			ordering.setCustomerHospitalld(customer.getHospitalld());
			ordering.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(balance+ordering.getMoney())));
			ordering.setOrderingdate(new Date());
			ordering.setPaytype(5);
			ordering.setOrderingnumber("sfzx_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid());
			//原订单号
			WphOrdering order = new WphOrdering();
			order.setTitle("开卡押金");
			order.setCustomerHospitalld(customer.getHospitalld());
			ordering.setOldorderingnumber(deposit.getOrderingnumber());
			ordering.setUserFid(user.getFid());
			ordering.setUsername(user.getName());
			ordering.setUserrole(user.getRoleName());
			ordering.setWphWardFid(customer.getWphWardFid());
			service.InsertOrderingByInfo(ordering);
			//出院结算--继上次insert共同参数不用重复定义
			//修改患者余额--直接从退卡押金中获取卡内余额，无需修改customer患者余额
			ordering.setTitle("出院结算");
			ordering.setDepict("出院结算所退患者金额");
			ordering.setMoney(ordering.getCustomerBalance());
			ordering.setOrderingstatse(4);
			ordering.setOrderingdate(new Date());
			ordering.setOrderingnumber("sfzx_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid());
			ordering.setOldorderingnumber("");
			ordering.setCustomerBalance(0.0);
			service.InsertOrderingByInfo(ordering);
			//将卡号复位，默认0
			WphCard card = new WphCard();
			card.setFid(customer.getWphCardFid());
			card.setCardstatus(0);
			service.updateCardByCardFid(card);
			//清空患者卡信息，余额
			service.getEmptyCustomerByFid(customer.getFid());
			//清除身份证在库信息
			service.cleanCodeidByCustomerFid(customer.getFid());
			attr.addAttribute("message", "操作成功");
		}
		return "redirect:OutHospital";
	}
	
}
