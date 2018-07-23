package com.slk.wph.controller.WPH_Summary_Expert;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Summary_Expert.po.WphSummaryExpertCustom;
import com.slk.wph.module.WPH_Summary_Expert.service.WPH_SummaryExpertService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value="SummaryExpert")
public class SummaryExpertController {
	@Autowired
	private WPH_SummaryExpertService service;
	
	
	@RequestMapping(value="selectExpert")
	public String selectExpert(Model model,String message){
		model.addAttribute("list", service.selectSummaryExpertAll());
		model.addAttribute("wardList", service.getWphWardListByStatus());
		model.addAttribute("message", message);
		return "HospitalIntroduce/WphSummaryExpert";
	}
	
	@RequestMapping(value="saveOrUpdateExpert")
	public String saveOrUpdateExpert(WphSummaryExpertCustom wphSummaryExpertCustom, RedirectAttributes attributes,
			HttpSession session,HttpServletRequest request) throws IOException{
		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		wphSummaryExpertCustom.setCreateuser(username);
		if(!"".equals(wphSummaryExpertCustom.getFiles())){
			if(wphSummaryExpertCustom.getFiles().getSize()!=0) {
				wphSummaryExpertCustom.setImg(FileUtil.FileImgUp(wphSummaryExpertCustom.getFiles(), "wph/Synopsis"));
			}
		}
		if(null!=wphSummaryExpertCustom.getFid()&&!"".equals(wphSummaryExpertCustom.getFid())){
			service.updateSummaryExpert(wphSummaryExpertCustom);
		}else{
			service.insertSummaryExpert(wphSummaryExpertCustom);
		}
		attributes.addAttribute("message","恭喜您操作成功！" );
		return "redirect:selectExpert";
		
	}
}
