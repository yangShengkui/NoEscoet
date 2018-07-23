package com.slk.wph.controller.WPH_Summary_Navigation;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Summary_Navigation.po.WphSummaryNavigationCustom;
import com.slk.wph.module.WPH_Summary_Navigation.service.WPH_SummaryNavigationService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value="SummaryNavigation")
public class SummaryNavigationController {
	
	@Autowired
	private WPH_SummaryNavigationService service;
	
	@RequestMapping(value="selectNavigation")
	public String selectNavigation(Model model,String message){
		model.addAttribute("list", service.selectSummaryNavigationAll());
		model.addAttribute("wardList", service.getWphWardListByStatus());
		model.addAttribute("message", message);
		return "HospitalIntroduce/WphSummaryNavigation";
	}
	
	@RequestMapping(value="saveOrUpdateNavigation")
	public String saveOrUpdateNavigation(WphSummaryNavigationCustom summaryNavigationCustom, RedirectAttributes attributes,
			HttpSession session,@RequestParam("files") MultipartFile[] files,HttpServletRequest request) throws IOException{
		Integer fid = (Integer) session.getAttribute("userFID");
		String fileIndex= request.getParameter("fileIndex");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		summaryNavigationCustom.setCreateuser(username);
		String url="";
		if(fileIndex!=null&&!"".equals(fileIndex)){
			String[] fileIndexs=fileIndex.split(",");
			for (int i = 0; i < fileIndexs.length; i++) {
				url+=fileIndexs[i]+";";
				summaryNavigationCustom.setImgs(url);
			}
		}
		if(files!=null&&files.length>0){  
            //循环获取file数组中得文件  
          for(int i = 0;i<files.length;i++){
              MultipartFile file = files[i];
              if(!"".equals(file)){
            	url+=FileUtil.FileImgUp(file, "wph/Synopsis")+";";
      			summaryNavigationCustom.setImgs(url);
      		}
           }  
        }  
		
		//System.out.println(fileIndex);
		if(null!=summaryNavigationCustom.getFid()&&!"".equals(summaryNavigationCustom.getFid())){
			service.updateSummaryNavigation(summaryNavigationCustom);
		}else{
			service.insertSummaryNavigation(summaryNavigationCustom);
		}
 		attributes.addAttribute("message","恭喜您操作成功！" );
		return "redirect:selectNavigation";
	}
	
	
}
