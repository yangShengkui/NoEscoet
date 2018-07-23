package com.slk.wph.controller.WPH_Ordering;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.service.WPH_OrderingService;

/**处置室*/
@Controller
@RequestMapping("/Ordering_Disposal")
public class Ordering_DisposalController {

	
	
	@Autowired
	WPH_OrderingService service;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 描述：患者明细查询
	 *
	 * @param ordering
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月23日-下午1:16:02
	 */
	@RequestMapping("/Customer_details")
	public String Customer_details(WphOrderingCustom order, Model model, HttpSession session){
		if(null!=order.getCustomerHospitalld()){
			List<WphOrderingCustom> orderList = service.getOrderListByInfo(order);
			model.addAttribute("order", order);
			model.addAttribute("orderList", orderList);
		}
		model.addAttribute("queryList", service.getQueryAll());
		model.addAttribute("user", service.getUserByFid((Integer)session.getAttribute("userFID")));
		
		return "Ordering_Disposal/Customer_details";
	}
	
	
	
	
	/**
	 * 描述：本机收支明细汇总
	 *
	 * @param order
	 * @param model
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月25日-上午9:29:51
	 */
	@RequestMapping("/Customer_collectBranch")
	public String Ordering_disposal(WphOrderingCustom order, Model model, HttpSession session) throws Exception{
		Integer userFID = (Integer)session.getAttribute("userFID");
		if("".equals(order.getDatetime()) || null == order.getDatetime()){
			order.setDatetime(sdf.format(new Date()));
			order.setDatetime2(sdf.format(new Date()));
		}
		order.setUserFid(userFID);
		List<WphOrderingCustom> orderList = service.tollInquirySummary(order);
		model.addAttribute("order", order);
		model.addAttribute("orderList", orderList);
		model.addAttribute("user", service.getUserByFid(userFID));
		
		model.addAttribute("wardList", service.getWphWardListByStatus());
		return "Ordering_Disposal/Customer_collectBranch";
	}
	
	
}
