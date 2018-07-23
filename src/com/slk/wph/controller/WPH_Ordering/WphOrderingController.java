package com.slk.wph.controller.WPH_Ordering;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.Demo.mapper.DemoMapper;
import com.slk.wph.module.Demo.po.Demo;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.service.WPH_OrderingService;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
@Controller
@RequestMapping(value="wphOrdering")
public class WphOrderingController {
	
	@Autowired
	private WPH_OrderingService service;
	@Autowired
	private DemoMapper demoMapper;
	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;
	
	
	
	
	@RequestMapping(value = "/wphBloodHZ")
	public String wphBloodHZ(Model model,String startDate,String endDate,Integer wardFid,Integer type) throws ParseException{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date starttime=null;
		Date endtime=null;
		if(null!=startDate &&!"".equals(startDate)){
			starttime=format.parse(startDate);
		}else{
			starttime=format.parse(format.format(new Date()));
		}
		if(null!=endDate &&!"".equals(endDate)){
			endtime=format.parse(endDate);
		}else{
			endtime=format.parse(format.format(new Date()));
		}
		if(type==null||"".equals(type)){
			type=3;
		}
		List<WphOrderingCustom> list=service.selectWphBloodHZ(starttime,endtime, wardFid,type);
		//病区
		List<WphWardCustom> wardList=service.getWphWardListByStatus();
		List<String> hoList=new ArrayList<String>();
		//通过住院号去重复，并求总钱数
		double countMoney=0.0;
		for (int i = 0,x=list.size(); i < x; i++) {
			hoList.add(list.get(i).getCustomerHospitalld());
			countMoney+=list.get(i).getTotalMoney();
		}
		HashSet<String> h  =   new  HashSet<String>(hoList); 
		hoList.clear(); 
		hoList.addAll(h);
		model.addAttribute("mCount", countMoney);
		model.addAttribute("pCount", hoList.size());
		
		model.addAttribute("list", list);
 		model.addAttribute("wardList", wardList);
		model.addAttribute("type", type);
		model.addAttribute("startDate", format.format(starttime));
		model.addAttribute("endDate", format.format(endtime));
		model.addAttribute("wardFid", wardFid);
		return "WphOrderingHZ/WphBloodHZ";
	}
	
	
	
	@RequestMapping(value="selectNursingHZ")
	public String selectWphOrderingnursingHZ(Model model,String startDate,String endDate,Integer wardFid,Integer type) throws ParseException{
		List<WphWardCustom> wardList=service.getWphWardListByStatus();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date starttime=null;
		Date endtime=null;
		if(null!=startDate &&!"".equals(startDate)){
			starttime=format.parse(startDate);
		}else{
			starttime=format.parse(format.format(new Date()));
		}
		if(null!=endDate &&!"".equals(endDate)){
			endtime=format.parse(endDate);
		}else{
			endtime=format.parse(format.format(new Date()));
		}
		if(type==null){
			type=2;
		}
		List<WphOrderingCustom> list=service.selectNursingHZ(starttime,endtime, wardFid, type);
		List<String> hoList=new ArrayList<String>();
		//通过住院号去重复，并求总钱数
		double countMoney=0.0;
		for (int i = 0,x=list.size(); i < x; i++) {
			hoList.add(list.get(i).getCustomerHospitalld());
			countMoney+=list.get(i).getTotalMoney();
		}
		HashSet<String> h  =   new  HashSet<String>(hoList); 
		hoList.clear(); 
		hoList.addAll(h);
		model.addAttribute("mCount", countMoney);
		model.addAttribute("pCount", hoList.size());
		model.addAttribute("wardFid", wardFid);
		model.addAttribute("startDate", format.format(starttime));
		model.addAttribute("endDate", format.format(endtime));
		model.addAttribute("list", list);
		model.addAttribute("type", type);
		model.addAttribute("wardList", wardList);
		
		return "WphOrderingHZ/selectWphOrderingnursingHZ";
	}
	
}
