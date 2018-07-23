package com.slk.wph.controller.WPH_Traffic;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.WPH_Traffic.po.WphTrafficCustom;
import com.slk.wph.module.WPH_Traffic.service.WPH_TrafficService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/Screen/wphTrafficCenter")
public class WphTrafficCenterController {
	@Autowired
	private  WPH_TrafficService service;
	
	@RequestMapping(value="selectWphTrafficCustomState")
	public String selectWphTrafficCustomState(Model model,HttpServletRequest request){
		String types=request.getParameter("type");
		Integer type=null;
		if(types!=null){
			type=Integer.parseInt(types);
		}else{
			type=1;
		}
		
		if(type==1){
			model.addAttribute("list", service.selectWphTrafficCustomState(type, 1));
			return "/Screen/TrafficGuide/CityFace";
		}else if(type==2){
			model.addAttribute("list", service.selectWphTrafficCustomState(type, 1));
			return "/Screen/TrafficGuide/SubwayMap";
		}else{
			List<WphTrafficCustom> wtcList= service.selectWphTrafficCustomState(type, 1);
			for (int i = 0; i < wtcList.size(); i++) {
				String imgs=wtcList.get(i).getImgs();
				String[] img=imgs.split(";");
				if(img.length!=0){
					wtcList.get(i).setImgs(img[0]);
				}
			}
			model.addAttribute("list", wtcList);
			return "/Screen/TrafficGuide/ScenicIntroduction";
		}
		 
	}
	@RequestMapping(value="selectWphTrafficCustomByFid")
	public String selectWphTrafficCustomByFid(Model model,Integer fid){
		WphTrafficCustom wtc=service.selectWphTrafficCustomByFid(fid);
		if(wtc.getType()==3){
			String imgs=wtc.getImgs();
			String[] img=imgs.split(";");
			if(img.length!=0){
				wtc.setImgs(img[0]);
			}
		}
		model.addAttribute("wphTrafficCustom",wtc );
		return "/Screen/TrafficGuide/ScenicIntroduction";
	}
	@ResponseBody
	@RequestMapping(value="selectDTMap")
	public String selectDTMap(){
		Map<String,Object> map=new HashMap<String,Object>();
		List<WphTrafficCustom> wtcList=service.selectWphTrafficCustomState(2,0);
		String mapFile="";
		if(wtcList.size()!=0){
			WphTrafficCustom wtc=wtcList.get(0);
			if(null!=wtc.getImgs()&&!"".equals(wtc.getImgs())){
				mapFile= wtc.getImgs().split(";")[0];
			}
		}
		map.put("mapFile",mapFile);
		return JSONObject.fromObject(map).toString();
	}
}
