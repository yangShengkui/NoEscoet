package com.slk.wph.controller.WPH_Customer;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Controller
@RequestMapping(value="CustomerBalance")
public class CustomerBalanceController {
	@Autowired
	private WPH_CustomerService service;
	
	
	@RequestMapping(value="/selectCustomerBalanceByWardFid")
	public String selectCustomerBalanceByWardFid(Model model,Integer wardFid,Integer flag,HttpSession session){
		int count=0;
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
		model.addAttribute("username", user.getName());
		List<WphWardCustom> wardList=service.getWphWardListByStatus();
		if(null==wardFid){
			wardFid=wardList.get(0).getFid();
		}else{
			List<WphCustomerCustom> list=service.selectCustomerBalanceByWardFid(wardFid);
			count=list.size();
			model.addAttribute("list",list);
		}
		if(null==flag){
			flag=0;
		}
		model.addAttribute("pCount", count);
		model.addAttribute("flag", flag);
		model.addAttribute("wardList", wardList);
		model.addAttribute("wardFid", wardFid);
		return "Balance/Balance";
	}
}
