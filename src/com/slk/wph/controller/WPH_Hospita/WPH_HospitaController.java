package com.slk.wph.controller.WPH_Hospita;

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

import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.service.WPH_HospitaService;

@Controller
@RequestMapping(value="/WphHospita")
public class WPH_HospitaController {
	@Autowired
	private WPH_HospitaService hospitaService;
	
	/**
	 * 
	 *描述:查询全部院区
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年6月12日
	 */
	@RequestMapping(value="/WphHospitaList")
	public String getWphHospitaList(Model model,String message){
		List<WphHospita> list= hospitaService.getWphHospitaList();
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		return "WphHospita/WphHospitaList";
	}
	
	@RequestMapping(value="/checkWphHospita")
	@ResponseBody
	public void checkWphHospita(HttpServletRequest request,HttpServletResponse response){
		PrintWriter out=null;
		String fid=request.getParameter("fid");
		String name=request.getParameter("name");
		int count=0;
		if(fid!=null&&!"".equals(fid)){
			count=hospitaService.checkWphHospita(Integer.parseInt(fid),name);
		}else{
			count=hospitaService.checkWphHospita(name);
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
	 *描述:根据fid查找院区
	 *@param fid
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年6月12日
	 */
	@RequestMapping(value="/WphHospitaForm")
	public String wphHospitaForm(Integer fid,Model model){
		WphHospita wphHospita=hospitaService.getWphHospitaById(fid);
		model.addAttribute("wphHospita", wphHospita);
		return "WphHospita/WphHospitaForm";
	}
	
	/**
	 * 
	 *描述:更新并保存院区
	 *@param fid
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年6月12日
	 */
	@RequestMapping(value="/WphHospitaUpdateAndSave")
	public String saveWphHospita(WphHospita wphHospita,RedirectAttributes attributes){
		if(hospitaService.getWardCountStatus(wphHospita.getFid())==0){
			hospitaService.updateAndSaveWphHospita(wphHospita);
			attributes.addAttribute("message", "恭喜您操作成功！");
		}else{
			attributes.addAttribute("message", "有未停用的病区！");
		}
		
		return "redirect:WphHospitaList";
	}
}
