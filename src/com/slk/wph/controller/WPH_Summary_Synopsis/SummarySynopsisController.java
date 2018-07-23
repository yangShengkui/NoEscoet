package com.slk.wph.controller.WPH_Summary_Synopsis;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Summary_Synopsis.po.WphSummarySynopsisCustom;
import com.slk.wph.module.WPH_Summary_Synopsis.service.WPH_SummarySynopsisService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value="SummarySynopsis")
public class SummarySynopsisController {
	
	@Autowired
	private WPH_SummarySynopsisService service;
	
	@RequestMapping(value="selectSynopsis")
	public String selectSynopsis(Model model,String message){
		model.addAttribute("list", service.selectSummarySynopsis());
		model.addAttribute("message", message);
		return "HospitalIntroduce/WphSummarySynopsis";
	}
	
	@RequestMapping(value="updateSynopsis")
	public String updateSynopsis(WphSummarySynopsisCustom summarySynopsisCustom, RedirectAttributes attributes,
			HttpSession session) throws IOException{
		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		summarySynopsisCustom.setCreateuser(username);
		/*if(!"".equals(summarySynopsisCustom.getFiles())){
			summarySynopsisCustom.setImgs(FileUtil.FileImgUp(summarySynopsisCustom.getFiles(), "wph/Synopsis"));
		}*/
		service.updateSummarySynopsis(summarySynopsisCustom);
		attributes.addAttribute("message","恭喜您操作成功！" );
		return "redirect:selectSynopsis";
	} 
}
