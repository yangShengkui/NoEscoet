package com.slk.wph.controller.WPH_NursingGrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggrade;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_NursingGrade.service.WPH_NursingGradeService;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;

@Controller
@RequestMapping(value="/WphWphNursingGrade")
public class WphNursingGradeController {
	@Autowired
	private WPH_NursingGradeService service;
	
	
	@RequestMapping(value = "/wphSelectAll")
	public String selectAll(Model model,String message){
		List<WphNursinggradeCustom> list=service.selectAllNursing();
		List<WphWardCustom> wardList=service.getWardList();
		model.addAttribute("list", list);
		model.addAttribute("wardList", wardList);
		model.addAttribute("message", message);
		
		return "WphNursing/wphNursing";
	}
	@RequestMapping(value = "/saveNursingGrade")
	public String saveNursingGrade(WphNursinggradeCustom custom,RedirectAttributes redirect){
		if(custom.getFid()!=null){
			//service.updateByPrimaryKeySelective(custom);
			WphWardOmCustom wwd=new WphWardOmCustom();
			wwd.setWphNursinggradeFid(custom.getFid());
			wwd.setOmName(custom.getName());
			//service.updateWardOmName(wwd);
		}else{
			service.insertSelective(custom);//添加护理等级
			List<WphWardOmCustom> list=new ArrayList<WphWardOmCustom>();
			List<WphWardCustom> wardlist=service.getWphWardList();
			for (int i = 0,x=wardlist.size(); i < x; i++) {
				Integer wardFid = wardlist.get(i).getFid();
			WphWardOmCustom wphWardOmCustom=new WphWardOmCustom();
			wphWardOmCustom.setWphNursinggradeFid(custom.getFid());
			wphWardOmCustom.setOmName(custom.getName());
			wphWardOmCustom.setWphNursinggradeType(custom.getType());
			wphWardOmCustom.setWphWardFid(wardFid);
			list.add(wphWardOmCustom);
		}
			service.saveWphWardOmCustomList(list);
		}
		redirect.addAttribute("message", "恭喜你操作成功");
		return "redirect:wphSelectAll";
	}
	@RequestMapping(value = "/updateNursingWard")
	public String updateNursingWard(HttpServletRequest request,RedirectAttributes redirect,String ids,String fid){
		String[] id=ids.split(",");
		//删除
		WphNursinggrade custom=service.getByFid(Integer.parseInt(fid));
		//根据护理等级查询 该护理等级下所有病区
		//判断护理等级及病区下是否有 护理
		List<String> list=service.selecetWardOmByGradeFid(Integer.parseInt(fid));
		if(id[0].length()!=0){
			for (String wardFid:id ) {
				if(!list.contains(wardFid)){
					//判断  原有关联病区    是否包含   勾选病区
					//新增
					WphWardOmCustom wphWardOmCustom=new WphWardOmCustom();
					wphWardOmCustom.setWphNursinggradeFid(Integer.parseInt(fid));
					wphWardOmCustom.setOmName(custom.getName());
					wphWardOmCustom.setWphNursinggradeType(custom.getType());
					wphWardOmCustom.setWphWardFid(Integer.parseInt(wardFid));
					service.saveWphWardOmCustom(wphWardOmCustom);
				}
			}
			for(String wardFid2:list){
				if(!Arrays.asList(id).contains(wardFid2)){
					//判断  勾选病区是否包含   已关联病区
					//删除
					service.deleteByNursingFid(Integer.parseInt(fid),Integer.parseInt(wardFid2));
				}
			}
		}else{
			for(String wardFid2:list){
				service.deleteByNursingFid(Integer.parseInt(fid),Integer.parseInt(wardFid2));
			}
		}
		redirect.addAttribute("message", "恭喜您操作成功！");
		return "redirect:wphSelectAll";
	}

	@RequestMapping(value = "/selectNursingForWard")
	@ResponseBody
	public Integer selectNursingForWard(String fid,String notIds){
		String[] wardFid=notIds.split(",");
		//护理等级 和病区
		int count= service.selectNursingForWard(fid,wardFid);
		return count;
	}
	
	
	/***********************************************************************/
	/**
	 * 
	 *描述:病区/等级 金额列表
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	@RequestMapping(value = "/wardNursingMoney")
	public String wardNursingMoney(Model model,String message){
		List<WphNursinggradeCustom> nursinglist=service.selectNursing(1);
		List<WphWardCustom> listMo =service.getWardNursingMoney(1);
		model.addAttribute("nursinglist", nursinglist);
		model.addAttribute("list", listMo);
		model.addAttribute("message", message);
		return "NusringWardMoney/NusringWardMoney";
	}
	
	
	/**
	 * 
	 *描述:病区/等级 金额列表
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	@RequestMapping(value = "/wardNursingMoneyMany")
	public String wardNursingMoneyMany(Model model,String message){
		List<WphNursinggradeCustom> nursinglist=service.selectNursing(2);
		List<WphWardCustom> listMo =service.getWardNursingMoney(2);
		model.addAttribute("nursinglist", nursinglist);
		model.addAttribute("list", listMo);
		model.addAttribute("message", message);
		return "NusringWardMoney/NusringWardMoneyMany";
	}
	
	
	/**
	 * 
	 *描述: 修改金额
	 *@param omCustom
	 *@param redirect
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	@RequestMapping(value = "/updateMoney")
	public String updateMoney(WphWardOmCustom omCustom,RedirectAttributes redirect,HttpServletRequest request){
		String flag=request.getParameter("flag");
		service.updateOmMoney(omCustom);
		redirect.addAttribute("message", "恭喜您操作成功！");
		if("1".equals(flag)){
			return "redirect:wardNursingMoney";
		}else{
			return "redirect:wardNursingMoneyMany";
		}
		
	}
}
