package com.slk.wph.controller.WPH_Traffic;
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
import com.slk.wph.module.WPH_Traffic.po.WphTrafficCustom;
import com.slk.wph.module.WPH_Traffic.service.WPH_TrafficService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;


@Controller
@RequestMapping(value="wphTraffic")
public class WphTrafficController {
	
	@Autowired
	private WPH_TrafficService service;
	
	@RequestMapping(value="selectWphTrafficCustomState")
	public String  selectWphTrafficCustomState(Model model,String message,String type){
		if(type==null){
			type="1";
		}
		model.addAttribute("list", service.selectWphTrafficCustomState(Integer.parseInt(type), null));
		model.addAttribute("type", type);
		model.addAttribute("message", message);
		return "WPHTraffic/WphTraffic";
	}
	
	@RequestMapping(value="saveOrUpdateTraffic")
	public String saveOrUpdateTraffic(HttpSession session,RedirectAttributes attributes,
			WphTrafficCustom wphTrafficCustom,@RequestParam("files") MultipartFile[] files,HttpServletRequest request){
		
		String fileIndex= request.getParameter("fileIndex");
		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		////////////////////////////////////////////////////////////////////////
		String username = roleAndUserByUser.getName();
		wphTrafficCustom.setCreateuser(username);
		String url="";
		if(fileIndex!=null&&!"".equals(fileIndex)){
			String[] fileIndexs=fileIndex.split(",");
			for (int i = 0; i < fileIndexs.length; i++) {
				url+=fileIndexs[i]+";";
				wphTrafficCustom.setImgs(url);
			}
		}
		if(files!=null&&files.length>0){  
            //循环获取file数组中得文件  
          for(int i = 0;i<files.length;i++){
              MultipartFile file = files[i];
              if(!"".equals(file)){
            	url+=FileUtil.FileImgUp(file, "wph/Traffic")+";";
            	wphTrafficCustom.setImgs(url);
      		}
           }  
        }  
		
		//System.out.println(fileIndex);
		if(null!=wphTrafficCustom.getFid()&&!"".equals(wphTrafficCustom.getFid())){
			service.updateWphTrafficCustom(wphTrafficCustom);
		}else{
			service.insertWphTrafficCustom(wphTrafficCustom);
		}
 		attributes.addAttribute("message","恭喜您操作成功！" );
 		attributes.addAttribute("type",wphTrafficCustom.getType());
		return "redirect:selectWphTrafficCustomState";
		
	}
}
