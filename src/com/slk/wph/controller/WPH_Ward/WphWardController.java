package com.slk.wph.controller.WPH_Ward;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.module.WPH_Cost.po.WphCostCustom;
import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.service.WPH_HospitaService;
import com.slk.wph.module.WPH_Ward.po.WphWard;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.WPH_Ward.service.WPH_WardService;

@Controller
@RequestMapping("/WphWard")
public class WphWardController {

	@Autowired
	private WPH_WardService wphWardservice;
	@Autowired
	private WPH_HospitaService wphHospitaService;
	/**
	 * 
	 *描述: 获取所有病区及院区
	 *@param model
	 *@return000错6放吧
	 *
	 *创建人:赵福岭
	 *2017年6月13日
	 */
	@RequestMapping(value = "/WphWardList")
	public String wphWardList(Model model,String message) {
		//List<WphWardCustom> list = service.getWphWardList();
		//list.get(0).getWphHospita().getName();
		List<WphWardCustom> list=wphWardservice.getWphWardList();
		List<WphHospita> hospitalist=wphHospitaService.getWphHospitaListByStatus();
		model.addAttribute("hospitalist", hospitalist);
		model.addAttribute("message",message);
		//list.get(0).getWphHospita().getName();
		model.addAttribute("list",list );
		return "WphWard/WphWardList";
	}
	/**
	 * 
	 *描述:  更新并保存病区
	 *@param wphWard
	 *@return
	 *创建人:赵福岭
	 *2017年6月13日
	 */
	@RequestMapping(value = "/WphWardUpdateAndSave")
	public String WphWardUpdateAndSave(WphWard wphWard,RedirectAttributes attributes){
		wphWardservice.updateAndSaveWphHospita(wphWard);
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:WphWardList";
		
	}
	/**
	 * 
	 *描述:病区验证名字是否有重复
	 *@param request
	 *@param response
	 *创建人:赵福岭
	 *2017年6月13日
	 */
	@RequestMapping(value = "/checkWphWard")
	@ResponseBody
	public void checkWphWard(HttpServletRequest request,HttpServletResponse response) {
		PrintWriter out=null;
		String fid=request.getParameter("fid");
		String name=request.getParameter("name");
		int count=0;
		if(fid!=null&&!"".equals(fid)){
			count=wphWardservice.checkWphWard(Integer.parseInt(fid),name);
		}else{
			count=wphWardservice.checkWphWard(name);
		}
		Map map=new HashMap();
		try {
			out=response.getWriter();
			if(count>0){
				map.put("data", "fail");
			}else{
				map.put("data", "success");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print(JSONObject.fromObject(map));
		out.close();
		
	}
	
	
	
	/**
	 * 
	 *描述:查询预存金额
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	@RequestMapping(value = "/WphWardSaveMoney")
	public String WphWardSaveMoney(Model model) {
		List<WphWardCustom> list=wphWardservice.getWphWardList();
		model.addAttribute("list",list );
		return "WphWard/WphSaveMoneyList";
	}
	/**
	 * 
	 *描述:修改预存金额
	 *@param fid
	 *@param money
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	@RequestMapping(value = "/updateSaveMoney")
	@ResponseBody
	public Map<String,String> updateSaveMoney(String fid,String money){
		Map<String,String> map=new HashMap<String,String>();
		WphWard wphWard=new WphWard();
		wphWard.setFid(Integer.parseInt(fid));
		wphWard.setSavemoney(Double.parseDouble(money));
		wphWardservice.updateAndSaveWphHospita(wphWard);
		map.put("data", "success");
		return map;
	}
	
	
	/**
	 * 
	 *描述:查询预存金额
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	@RequestMapping(value = "/WphWardWaringMoney")
	public String WphWardWaringMoney(Model model) {
		List<WphWardCustom> list=wphWardservice.getWphWardList();
		model.addAttribute("list",list );
		return "WphWard/WphWaringMoneyList";
	}
	/**
	 * 
	 *描述:修改预存金额
	 *@param fid
	 *@param money
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	@RequestMapping(value = "/updateWaringMoney")
	@ResponseBody
	public Map<String,String> updateWaringMoney(String fid,String money){
		Map<String,String> map=new HashMap<String,String>();
		WphWard wphWard=new WphWard();
		wphWard.setFid(Integer.parseInt(fid));
		wphWard.setWaringmoney(Double.parseDouble(money));
		wphWardservice.updateAndSaveWphHospita(wphWard);
		map.put("data", "success");
		return map;
	}
}
