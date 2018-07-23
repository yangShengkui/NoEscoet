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

import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.service.WPH_OrderingService;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Controller
@RequestMapping(value="OrderingCustomerDetail")
public class OrderingCustomerDetail {
	@Autowired
	private WPH_OrderingService service;
	
	@RequestMapping(value = "/selectOnephmx")
	public String selectOnephmx(Model model,String startDate,String endDate,Integer wardFid,Integer type) throws ParseException{
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

		List<WphOrderingCustom> list=service.selectOnephmx(starttime,endtime, wardFid,type);
		//病区
		List<WphWardCustom> wardList=service.getWphWardListByStatus();
		//一对一护理等级
		List<WphNursinggradeCustom> nursingGradeList=service.selectNursing(2);
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
		model.addAttribute("nursingGradeList", nursingGradeList);
		model.addAttribute("type", type);
		model.addAttribute("startDate", format.format(starttime));
		model.addAttribute("endDate", format.format(endtime));
		model.addAttribute("wardFid", wardFid);
		return "CustomerDetailHZ/oneAndOneHZ";
	}
}
