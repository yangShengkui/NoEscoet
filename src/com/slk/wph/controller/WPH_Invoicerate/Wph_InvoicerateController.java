package com.slk.wph.controller.WPH_Invoicerate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;
import com.slk.wph.module.WPH_Invoicerate.service.WPH_InvoicerateService;

@Controller
@RequestMapping(value="invoicerate")
public class Wph_InvoicerateController {
	
	@Autowired
	private WPH_InvoicerateService service;
	
	@RequestMapping(value="invoicerateList")
	public String invoicerateList(Model model){
		List<WphInvoicerateCustom> list=service.selectInvoicerate();
		model.addAttribute("list", list);
		return "WphInvoicerate/WphInvoicerateList";
	}
	@RequestMapping(value="updateInvoicerate")
	@ResponseBody
	public Map<String,Object> updateInvoicerate(WphInvoicerateCustom custom){
		Map<String,Object> map=new HashMap<String,Object>();
		service.updateWphInvoicerate(custom);
		map.put("data", "success");
		return map;
	}
	
}
