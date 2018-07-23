package com.slk.wph.controller.WPH_Summary;

import java.util.*;


import com.slk.wph.module.WPH_Summary_Expert.po.WphSummaryExpertCustom;
import com.slk.wph.module.WPH_Summary_Navigation.po.WphSummaryNavigationCustom;
import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanoramaCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Summary_Equipment.service.WPH_SummaryEquipmentService;
import com.slk.wph.module.WPH_Summary_Expert.service.WPH_SummaryExpertService;
import com.slk.wph.module.WPH_Summary_Navigation.service.WPH_SummaryNavigationService;
import com.slk.wph.module.WPH_Summary_Panorama.service.WPH_SummaryPanoramaService;
import com.slk.wph.module.WPH_Summary_Synopsis.service.WPH_SummarySynopsisService;

@Controller
@RequestMapping(value="/Screen/Summary")
public class SummaryController {
	
	@Autowired
	private WPH_SummarySynopsisService synopsisservice;
	@Autowired
	private WPH_SummaryNavigationService navigationService;
	@Autowired
	private WPH_SummaryExpertService expertService;
	@Autowired
	private WPH_SummaryEquipmentService equipmentService;
	@Autowired
	private WPH_SummaryPanoramaService panoramaService;

	Map<String,Object> map=new HashMap();

	@RequestMapping(value="selectSynopsis")
	public String selectSynopsis(Model model){
		model.addAttribute("list", synopsisservice.selectSummarySynopsis().get(0));
		return "Screen/HospitalOverview/Brief_introduction";
	}
	
	@RequestMapping(value="selectNavigation")
	public String selectNavigation(Model model){
		List<WphSummaryNavigationCustom> list= navigationService.selectSummaryNavigationState();

		for (int i=0;i<list.size();i++){
			if(null!=list.get(i).getImgs()&&!"".equals(list.get(i).getImgs())){
				String []img=list.get(i).getImgs().split(";");
				List<String> imgList=Arrays.asList(img);
				list.get(i).setImgList(imgList);
			}
		}
		model.addAttribute("list", list);
		return "Screen/HospitalOverview/Department_navigation";
	}
	
	@RequestMapping(value="selectExpert")
	public String selectExpert(Model model,Integer wardfid){
		List<WphWardCustom> list= expertService.getWphWardListByStatus();
		model.addAttribute("wardList",list);
		List<WphSummaryExpertCustom>  expertList= expertService.selectSummaryExpertState(wardfid);
		model.addAttribute("list",expertList);
		return "Screen/HospitalOverview/Expert_introduction";
	}

	@RequestMapping(value="selectExpertWard")
	@ResponseBody
	public String selectExpertWard(Model model,Integer wardfid){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("list",expertService.selectSummaryExpertState(wardfid));
		return JSONObject.fromObject(map).toString();
	}
	
	/*@RequestMapping(value="selectExpertWard")
	public String selectExpertWard(Model model,Integer wardfid){
		model.addAttribute("list", expertService.getWphWardListByStatus());
		return "Screen/HospitalOverview/Expert_introduction";
	}*/
		
	@RequestMapping(value="selectExpertDetails")
	public String selectExpertDetails(Model model,Integer fid){
		model.addAttribute("model", expertService.selectSummaryExpertByFid(fid));
		return "Screen/HospitalOverview/Details";
	}
	
	@RequestMapping(value="selectEquipment")
	public String selectEquipment(Model model){
		model.addAttribute("list", equipmentService.selectSummaryEquipmentState());
		return "Screen/HospitalOverview/Advanced_equipment";
	}


	@RequestMapping(value="selectPanorama")
	public String selectPanorama(){
		return "Screen/HospitalOverview/Panoramic_guide";
}

	/**
	 * 获取楼层
	 * @param
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="selectPanoramaType")
	public String selectPanoramaType(){
		map.clear();
		List<String> typeList=panoramaService.selectType();
		map.put("list",typeList);
		return JSONObject.fromObject(map).toString();
	}
	/**
	 * 通过楼层获取详细数据
	 * @param
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="selectSummaryPanoramaByType")
	public String selectSummaryPanoramaByType(Integer type){
		map.clear();
		List<WphSummaryPanoramaCustom> typeList=panoramaService.selectSummaryPanoramaByType(type,0);
		for (int i=0,x=typeList.size();i<x;i++){
			String imgs= typeList.get(i).getImgs();
			if(null!=imgs&&!"".equals(imgs)){
				String[] img=imgs.split(";");
				typeList.get(i).setImgList(Arrays.asList(img));
			}
		}
		map.put("list",typeList);
		return JSONObject.fromObject(map).toString();
	}


	
	@RequestMapping(value="selectPanoramaByFid")
	@ResponseBody
	public Map<String, Object> selectPanoramaFid(Integer fid){
		Map<String, Object> map=new HashMap<String, Object>();
		String imgs=panoramaService.selectSummaryPanoramaByFid(fid).get(0).getImgs();
		map.put("imgs",imgs);
		return map;
	}
}
