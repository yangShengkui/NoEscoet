package com.slk.wph.controller.WPH_Cost;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Cost.po.WphCostCustom;
import com.slk.wph.module.WPH_Cost.service.WPH_CostService;

@Controller
@RequestMapping(value="wphCost")
public class WphCostController {
	
	@Autowired
	private WPH_CostService service;
	
	@RequestMapping(value="selectAllCost")
	public String selectAllCost(Model model){
		List<WphCostCustom> list=service.selectAllCost();
		model.addAttribute("list", list);
		return "WphCost/WphCostList";
	}
	@RequestMapping(value="updateCost")
	@ResponseBody
	public Map<String,String> updateCost(String fid,String money){
		Map<String,String> map=new HashMap<String,String>();
		WphCostCustom custom=new WphCostCustom();
		custom.setFid(Integer.parseInt(fid));
		custom.setMoney(Double.parseDouble(money));
		service.updateCost(custom);
		map.put("data", "success");
		return map;
	}
}
