package com.slk.wph.controller.WPH_AppVersion;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_AppVersion.po.WphAppversion;
import com.slk.wph.module.WPH_AppVersion.service.WPH_AppVersionService;

@Controller
@RequestMapping(value="appVersion")
public class WphAppVersionController {
	
	@Autowired
	private WPH_AppVersionService service;
	
	@RequestMapping(value="insertAppVersion")
	public String insertAppVersion(WphAppversion wphAppversion,RedirectAttributes attributes,@RequestParam("file") MultipartFile file ) throws IOException{
		wphAppversion.setVersionurl(FileUtil.FileUp(file,"wph/APP"));
		service.insertAppVersion(wphAppversion);
		attributes.addAttribute("message", "恭喜您操作成功！");
		//files
		return  "redirect:selectAppVersion";
		
	}
	
	@RequestMapping(value="selectAppVersion")
	public String selectAppVersion(String message,Model model){
		model.addAttribute("message", message);
		model.addAttribute("appVersion", service.selectAppVersion());
		return "AppVersion/appVersion";
	}
}
