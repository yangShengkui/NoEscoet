package com.slk.wph.controller.WPH_Summary_Equipment;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Summary_Equipment.po.WphSummaryEquipmentCustom;
import com.slk.wph.module.WPH_Summary_Equipment.service.WPH_SummaryEquipmentService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value="SummaryEquipment")
public class SummaryEquipmentController {
	
	@Autowired
	private WPH_SummaryEquipmentService service;
	
	@RequestMapping(value="selectEquipment")
	public String selectEquipment(Model model,String message){
		model.addAttribute("list", service.selectSummaryEquipmentAll());
		model.addAttribute("message", message);
		model.addAttribute("wardList", service.getWphWardListByStatus());
		return "HospitalIntroduce/WphSummaryEquipment";
	}
	
	@RequestMapping(value="saveOrUpdateEquipment")
	public String saveOrUpdateEquipment(WphSummaryEquipmentCustom wphSummaryEquipmentCustom, RedirectAttributes attributes,
			HttpSession session) throws IOException{
		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		wphSummaryEquipmentCustom.setCreateuser(username);
		if(!"".equals(wphSummaryEquipmentCustom.getFiles())){
			if(wphSummaryEquipmentCustom.getFiles().getSize()!=0){
				wphSummaryEquipmentCustom.setImg(FileUtil.FileImgUp(wphSummaryEquipmentCustom.getFiles(), "wph/Synopsis"));
			}
		}
		if(null!=wphSummaryEquipmentCustom.getFid()&&!"".equals(wphSummaryEquipmentCustom.getFid())){
			service.updateSummaryEquipment(wphSummaryEquipmentCustom);
		}else{
			service.insertSummaryEquipment(wphSummaryEquipmentCustom);
		}
		attributes.addAttribute("message","恭喜您操作成功！" );
		return "redirect:selectEquipment";
		
	}
}
