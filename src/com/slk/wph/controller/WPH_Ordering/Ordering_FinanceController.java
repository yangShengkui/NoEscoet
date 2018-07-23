package com.slk.wph.controller.WPH_Ordering;

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

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.service.WPH_OrderingService;
import com.slk.wph.module.WPH_User.po.WphUser;
/**财务端*/
@Controller
@RequestMapping("/Ordering_Finance")
public class Ordering_FinanceController {
	@Autowired
	WPH_OrderingService service;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 描述：单个患者明细查询
	 *
	 * @param ordering
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月23日-下午1:16:02
	 */
	@RequestMapping("/CustomerSingle_details")
	public String Customer_details(WphOrderingCustom order, Model model){
		
		if(null!=order.getCustomerHospitalld()){
			List<WphOrderingCustom> orderList = service.getOrderListByInfo(order);
			model.addAttribute("orderList", orderList);
			model.addAttribute("order", order);
		}
		model.addAttribute("queryList", service.getQueryAll());
		
		return "Ordering_Finance/CustomerSingle_details";
	}
	
	
	
	
	/**
	 * 描述：患者明细查询汇总
	 *
	 * @param order
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月1日-上午9:30:23
	 */
	@RequestMapping("/Customer_Patientdetails")
	public String Customer_Patientdetails(WphOrderingCustom order, Model model){
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
			order.setWphQueryFid(1);
			order.setWphServicetypeFid(1);
			order.setWphServicedetailsFid(14);
		}
		if(order.getWphQueryFid()==1 && order.getWphServicetypeFid() == 2){
			model.addAttribute("orderList", service.getPatientdetailsNursing(order));//如果是查询一对一护理，调用此方法
		}else{
			model.addAttribute("orderList", service.getPatientdetails(order));
		}
		model.addAttribute("order", order);
		model.addAttribute("wardList", service.getWphWardListByStatus());
		model.addAttribute("queryList", service.getQueryAllSubordinate());
		return "Ordering_Finance/Customer_Patientdetails";
	}
	
	
	
	
	/**
	 * 描述：处置室收费查询汇总
	 *
	 * @param order
	 * @param model
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月25日-上午9:29:51
	 */
	@RequestMapping("/Toll_inquiry")
	public String Toll_inquiry(WphOrderingCustom order, Model model, HttpSession session){
		List<Integer> roleFids = new ArrayList<Integer>();
		roleFids.add(27); roleFids.add(36); roleFids.add(44);
		List<WphUser> userList = service.getUserListByRoleFids(roleFids);
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
			order.setUserFid(userList.get(0).getFid());
		}
		List<WphOrderingCustom> orderList = service.tollInquirySummary(order);
		model.addAttribute("order", order);
		model.addAttribute("orderList", orderList);
		
		model.addAttribute("userList", userList);
		
		return "Ordering_Finance/Toll_inquiry";
	}

	
	/**
	 * 描述：预收信息汇总
	 *
	 * @param order
	 * @param model
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月25日-上午9:29:51
	 */
	@RequestMapping("/In_Summary")
	public String In_Summary(WphOrderingCustom order, Model model){
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
		}
		order.setOrderingstatse(3);//只获取预存
		List<WphOrderingCustom> orderList = service.tollInquirySummary(order);
		model.addAttribute("order", order);
		model.addAttribute("orderList", orderList);
		
		model.addAttribute("wardList", service.getWphWardListByStatus());
		return "Ordering_Finance/In_summary";
	}
	
	
	
	/**
	 * 描述：实收总汇总
	 *
	 * @param order
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-上午9:27:07
	 */
	@RequestMapping("/Total_collection")
	public String Total_collection(WphOrderingCustom order,Model model){
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
		}
		model.addAttribute("orderList", service.getTotalCollection(order));
		model.addAttribute("order", order);
		model.addAttribute("wardList", service.getWphWardListByStatus());
		return "Ordering_Finance/Total_collection";
	}
	
	
	
	
	/**
	 * 描述：实收餐费汇总
	 *
	 * @param order
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-下午4:34:47
	 */
	@RequestMapping("/Meal_collection")
	public String Meal_collection(WphOrderingCustom order, Model model){
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
			order.setWphQueryFid(3);
			order.setWphServicetypeFid(8);
			order.setWphServicedetailsFid(9);
		}
		
		model.addAttribute("orderList", service.getMeal_collection(order));
		model.addAttribute("order", order);
		model.addAttribute("wardList", service.getWphWardListByStatus());
		model.addAttribute("typeList", service.getServiceTypeAndDetailsByQuery(3));
		return "Ordering_Finance/Meal_collection";
	}
	
	
	/**
	 * 描述：退卡退费查询
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午4:25:09
	 */
	@RequestMapping("/RetreatCardFee")
	public String RetreatCardFee(){
		return "Ordering_Finance/RetreatCardFee";
	}
	
	
	
	
	/**
	 * 描述：进行退卡退费查询
	 *
	 * @param hospitalld
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午4:15:24
	 */
	@ResponseBody
	@RequestMapping("/RetreatCardFeeing")
	public WphCustomerCustom RetreatCardFeeing(String hospitalld){
		
		WphCustomerCustom customer = service.getRetreatCardFeeCustomerByhos(hospitalld);
		
		return customer;
	}
	
	
	
	/**
	 * 描述：退卡退费信息汇总
	 *
	 * @param order
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-上午10:40:51
	 */
	@RequestMapping("/RetreatCardFee_Summary")
	public String RetreatCardFee_Summary(WphOrderingCustom order, Model model){
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
		}
		
		List<WphCustomerCustom> customerList = service.RetreatCardFee_Summary(order);
		model.addAttribute("customerList", customerList);
		model.addAttribute("order", order);
		return "Ordering_Finance/RetreatCardFee_Summary";
	}
	
}
