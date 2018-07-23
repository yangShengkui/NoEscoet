package com.slk.wph.controller.WPH_Summary_Panorama;

import java.io.IOException;
import java.util.List;

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
import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanoramaCustom;
import com.slk.wph.module.WPH_Summary_Panorama.service.WPH_SummaryPanoramaService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value = "SummaryPanorama")
public class SummaryPanoramaController {
	@Autowired
	private WPH_SummaryPanoramaService service;

	@RequestMapping(value = "selectPanorama")
	public String selectNavigation(Model model, String message,Integer type) {
		List<String> typelist=service.selectType();
		model.addAttribute("typelist", typelist);
		if(null==type){
			type=1;
		}
		List<WphSummaryPanoramaCustom> list=service.selectSummaryPanoramaByType(type,null);
		model.addAttribute("list", list);
		model.addAttribute("type",type);
		model.addAttribute("message", message);
		return "HospitalIntroduce/WphSummaryPanorama";
	}

	@RequestMapping(value = "saveOrUpdatePanorama")
	public String saveOrUpdatePanorama(
			WphSummaryPanoramaCustom wphSummaryPanoramaCustom,
			RedirectAttributes attributes, HttpSession session,
			@RequestParam("files") MultipartFile[] files,
			HttpServletRequest request) throws IOException {
		Integer fid = (Integer) session.getAttribute("userFID");
		String fileIndex = request.getParameter("fileIndex");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = service
				.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		wphSummaryPanoramaCustom.setCreateuser(username);
		String url = "";
		if (fileIndex != null && !"".equals(fileIndex)) {
			String[] fileIndexs = fileIndex.split(",");
			for (int i = 0; i < fileIndexs.length; i++) {
				url += fileIndexs[i] + ";";
				wphSummaryPanoramaCustom.setImgs(url);
			}
		}
		if (files != null && files.length > 0) {
			// 循环获取file数组中得文件
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				if (!"".equals(file)) {
					url += FileUtil.FileImgUp(file, "wph/Synopsis") + ";";
					wphSummaryPanoramaCustom.setImgs(url);
				}
			}
		}
		if (null != wphSummaryPanoramaCustom.getFid()
				&& !"".equals(wphSummaryPanoramaCustom.getFid())) {
			service.updateSummaryPanorama(wphSummaryPanoramaCustom);
		} else {
			service.insertSummaryPanorama(wphSummaryPanoramaCustom);
		}
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:selectPanorama";
	}

}
