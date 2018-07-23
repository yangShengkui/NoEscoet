package com.slk.wph.controller.WPH_Screensaver;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Screensaver.po.WphScreensaverCustom;
import com.slk.wph.module.WPH_Screensaver.service.WPH_ScreensaverService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value="wphScreensaver")
public class WphScreensaverController {
	
	@Autowired
	private WPH_ScreensaverService service;
	
	@RequestMapping(value="/selectScreenSaver")
	public String selectScreenSaver(Model model,HttpSession session){
		List<WphScreensaverCustom> list= service.selectScreensaver();
		model.addAttribute("list", list);
		return "Screen/WphScreensaver/WphScreensaver";
	}
	
	@RequestMapping(value="/insertAndUpdateScreenSaver")
	public String updateScreenSaver(Model model,WphScreensaverCustom wphScreensaver,RedirectAttributes attributes,HttpSession session){

		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		wphScreensaver.setCreateuser(username);
		if(wphScreensaver.getFiles()!=null){
			if(wphScreensaver.getFiles().getSize()!=0){
				wphScreensaver.setUrl(FileUtil.FileImgUp(wphScreensaver.getFiles(), "wph/Screensaver"));
			}
		}
		if(null != wphScreensaver.getFid()){
			service.updateByFid(wphScreensaver);
		}else{
			service.insertScreensaver(wphScreensaver);
		}
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:selectScreenSaver";
	}
	
	
	@RequestMapping(value="/selectScreenSaverByStatus")
	public String selectScreenSaverByStatus(Model model){
		List<WphScreensaverCustom> list= service.selectScreensaverByStatus();
		model.addAttribute("list", list);
		return "Screen/Carousel/WphScreensaverStatus";
	}
}
