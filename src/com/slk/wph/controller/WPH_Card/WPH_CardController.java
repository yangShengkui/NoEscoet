package com.slk.wph.controller.WPH_Card;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_Card.service.WPH_CardService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping("/WphCard")
public class WPH_CardController {
	@Autowired
	private WPH_CardService service;
	/** 卡片管理 */
	/**
	 * 
	 * 描述:更新或保存 创建人:赵福岭
	 * 
	 * @param 实体类
	 * @param model
	 * @return 视图 创建人:赵福岭 2017年6月7日
	 */
	
	
	
	
	@RequestMapping(value = "/wphCardUpdateAndSave")
	@Token(remove=true)
	public String UpdateAndSave(WphCard wphCard, HttpServletResponse response,RedirectAttributes attributes) {
		if(wphCard!=null){
			if(wphCard.getCardnumber()!=null&&wphCard.getCardid()!=null)
				service.UpdateAndSaveCard(wphCard);
		}
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:wphCardForm";//redirect
	}

	/**
	 * 
	 * 描述:保存验证 创建人:赵福岭
	 * 
	 * @return
	 */
	@RequestMapping(value = "/checkWphCard", method = RequestMethod.POST)
	@ResponseBody
	public String checkWphCard( HttpServletResponse response,HttpServletRequest request) {
		String cardid=request.getParameter("cardid");
		String cardnumber=request.getParameter("cardnumber");
		int count= service.getWphCardByCardIdOrCardNumber(cardid,cardnumber);
		if(count>0){
			return "fail";
		}else{
			return "success";
		}
	}

	/**
	 * 
	 * 描述:根据fid获取WphCard 创建人:赵福岭
	 * 
	 * @param wphCard
	 * @param model
	 * @return 将实体类返回到视图 创建人:赵福岭 2017年6月8日
	 */
	@RequestMapping(value = "/wphCardForm")
	@Token(save=true)
	public String getWphCardByFid(Model model,HttpSession session,String message) {
		Integer userFid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(userFid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		model.addAttribute("username", username);
		model.addAttribute("message", message);
		return "WphCard/WphCardForm";
	}
	
	/**
	 * 
	 *描述:处置室  查询卡片
	 *@param model
	 *@param cardstatus
	 *@param request
	 *@return
	 *创建人:赵福岭
	 *2017年8月7日
	 */
	@RequestMapping(value="/selectCustomerAndCard")
	public String selectCustomerAndCard(Model model,Integer cardstatus,HttpSession session){
		Integer userFid = (Integer) session.getAttribute("userFID");
		Integer status = cardstatus;
		List<WphCardCustom> list=service.selectCustomerAndCard(status,null,null);
		model.addAttribute("list", list);
		model.addAttribute("cardstatus", cardstatus);
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(userFid);
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(wphUserCustom);
		model.addAttribute("username", roleAndUserByUser.getName());
		return "WphCard/Norefund";
	}
	/**
	 * 
	 *描述:财务  查询卡片
	 *@param model
	 *@param cardstatus
	 *@param request
	 *@return
	 *创建人:赵福岭
	 *2017年8月7日
	 * @throws ParseException 
	 */
	@RequestMapping(value="/selectCustomerAndCardc")
	public String selectCustomerAndCardc(Model model,Integer cardstatus,String startDate,String endDate) throws ParseException{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date starttime=null;
		Date endtime=null;
		if(null!=startDate &&!"".equals(startDate)){
			starttime=format.parse(startDate);
		}else{
			starttime=format.parse(format.format(new Date()));
		}
		if(null!=endDate &&!"".equals(endDate)){
			endtime=format.parse(endDate);
		}else{
			endtime=format.parse(format.format(new Date()));
		}
		List<WphCardCustom> list=service.selectCustomerAndCard(cardstatus,null,null);
		model.addAttribute("list", list);
		model.addAttribute("startDate", format.format(starttime));
		model.addAttribute("endDate", format.format(endtime));
		model.addAttribute("cardstatus", cardstatus);
		return "WphCard/NorefundC";
	}
}
