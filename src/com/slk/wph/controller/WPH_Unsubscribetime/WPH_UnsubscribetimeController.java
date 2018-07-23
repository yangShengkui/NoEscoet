package com.slk.wph.controller.WPH_Unsubscribetime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetime;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;
import com.slk.wph.module.WPH_Unsubscribetime.service.WPH_UnsubscribetimeService;

@Controller
@RequestMapping("/Unsubscribetime")
public class WPH_UnsubscribetimeController {

	
	@Autowired
	WPH_UnsubscribetimeService service;
	
	
	@RequestMapping("/getTimeList")
	public String Unsubscribetime(Model model){
		
		List<WphUnsubscribetimeCustom> timeList = service.getUnsubsbscribetime();
		
		model.addAttribute("timeList", timeList);
		
		return "Unsubscribetime/Unsubscribe_Time";
	}
	
	
	
	/**
	 * 描述：修改时间信息
	 *
	 * @param time
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月7日-下午1:55:13
	 */
	@ResponseBody
	@RequestMapping("/updateTimeByFid")
	public Boolean updateTimeByFid(WphUnsubscribetime time){
		Boolean flag = false;
		
		Integer count = service.updateTimeByFid(time);
		if(count != 0)flag = true;
		
		return flag;
	}
	
}
