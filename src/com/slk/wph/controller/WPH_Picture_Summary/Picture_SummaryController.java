package com.slk.wph.controller.WPH_Picture_Summary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_One.po.WphOneCustom;


@Controller
@RequestMapping("/Picture_Summary")
public class Picture_SummaryController {

	
	@Autowired
	private WPH_CustomerService service;
	
	
	/**
	 * 描述：入住凭条图片
	 *
	 * @param customer
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月4日-下午4:21:31
	 */
	@RequestMapping("/Hospitalization_picture")
	public String Hospitalization_picture(WphCustomerCustom customer, Model model){
		
		List<WphCustomerCustom> customerList = service.getCustomerListByInfo(customer);
		model.addAttribute("customerList", customerList);
		model.addAttribute("customer", customer);
		
		return "Picture_Summary/Hospitalization_picture";
	}
	
	
	
	
	@RequestMapping(value = "/onePicture")
	public String onePicture(Model model,String hospitalld) {
		List<WphOneCustom> wphonelist=service.selectWphOnePic(hospitalld);
		List<String> list=new ArrayList<String>();
		for (int i = 0,x=wphonelist.size(); i < x; i++) {
			String imgs=wphonelist.get(i).getImgs();
			String[]img=imgs.split(";");
			for (int j = 0; j < img.length; j++) {
				list.add(img[j]);
			}
		}
		model.addAttribute("list", list);
		return "Picture_Summary/WphOnePic";
	}
	
	@RequestMapping(value = "/bloodPicture")
	public String bloodPicture(Model model,String hospitalld) {
		List<WphBloodCustom> list=service.selectAllPic(hospitalld);
		model.addAttribute("list", list);
		
		return "Picture_Summary/WphBooldPic";
	}
	
}
