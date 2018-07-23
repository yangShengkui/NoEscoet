package com.slk.wph.controller.WPH_UserCodeId;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.module.WPH_Blood.service.WPH_BloodService;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;
import com.slk.wph.module.WPH_UserCodeId.service.Wph_UserCodeIdService;

@Controller
@RequestMapping(value = "WphUserCodeId")
public class WphUserCodeIdController {

	@Autowired
	private Wph_UserCodeIdService wphUserCodeIdService;
	@Autowired
	private WPH_BloodService wphBloodService;

	/**
	 * 
	 * 描述: 通过一卡通number获取card
	 * 
	 * @param cardId
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping("/getCardByCardId")
	@ResponseBody
	public WphCard getCardByCardId(String cardId) {
		WphCard card = wphUserCodeIdService.getCardByCardId(cardId);
		return card;
	}

	/**
	 * 
	 * 描述:通过一卡通获取患者信息
	 * 
	 * @param request
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping(value = "/getCustomerInfoByCodeFid")
	@ResponseBody
	public Map getCustomerInfo(HttpServletRequest request) {
		String cardFid = request.getParameter("cardFid");
		Map map = new HashMap();
		int flag = 0;
		WphCustomerCustom customer = null;
		if (cardFid != null && !"".equals(cardFid)) {
			customer = wphUserCodeIdService.selectByCardFid(cardFid);
			if (customer == null) {
				flag = 1;
			}
		} else {
			flag = 1;
		}
		map.put("customer", customer);
		map.put("flag", flag);
		return map;
	}

	/**
	 * 
	 * 描述:根据身份证号查询库中是否有存在。 如果不存在 修改或生成一条
	 * 
	 * @param request
	 * @param session
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping(value = "/getWphUserCodeIdByCodeId")
	@ResponseBody
	public Map getWphUserCodeIdByCodeId(HttpServletRequest request,
			HttpSession session) {
		String cardId = request.getParameter("cardId");
		Map map = new HashMap();
		int flag = 0;
		WphUsercodeidCustom wphUsercode = null;
		if (cardId != null && !"".equals(cardId)) {
			wphUsercode = wphUserCodeIdService.getWphUserCodeList(cardId);
			if (wphUsercode == null) {
				WphUsercodeidCustom xz = wphBloodService.selectByWphUserCode();
				wphUsercode = xz;
				// 无闲置位置号，生成一个新的位置号
				/*if (xz == null) {
					WphUsercodeidCustom wuc = new WphUsercodeidCustom();
					Integer fid = (Integer) session.getAttribute("userFID");
					WphUserCustom wphUserCustom = new WphUserCustom();
					wphUserCustom.setFid(fid);
					WphUserCustom roleAndUserByUser = wphUserCodeIdService
							.getRoleAndUserByUser(wphUserCustom);
					String username = roleAndUserByUser.getName();
					wuc.setUsername(username);
					wuc.setUserFid(fid);
					wuc.setUserrole(roleAndUserByUser.getRoleName());
					// wphUserCustomMapper.getRoleAndUserByUser(wphUserCustom);
					int x = (int) (Math.random() * 5400);
					wuc.setCodenumber(String.valueOf(x));
					wuc.setCodestatus(1);
					wphUserCodeIdService.save(wuc);
					wphUsercode = wphUserCodeIdService.getWphUserCodeIdByFid(wuc.getFid());
				} else {
					wphUsercode = xz;
				}*/
			}
			map.put("codestatus", wphUsercode.getCodestatus());
			map.put("codenumber", wphUsercode.getCodenumber());
			flag = 1;
		}
		map.put("flag", flag);
		return map;
	}

	/**
	 * 
	 * 描述:
	 * 
	 * @param
	 * @param model
	 * @return
	 * @throws Exception
	 *             创建人:赵福岭 2017年6月21日
	 */
	@RequestMapping(value = "/WphUserCodeIdForm")
	@Token(save=true)
	public String WphUserForm(HttpSession session, Model model,String message)
			throws Exception {

		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = wphUserCodeIdService
				.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();

		//model.addAttribute("username", username);
		double kpyj = wphBloodService.selectWphCostByFid(1).getMoney();
		model.addAttribute("username", username);
		model.addAttribute("kpyj", kpyj);
		model.addAttribute("message", message);
		return "WphUserCardId/WphUserCardIdForm";
	}

	/**
	 * 
	 * 描述: 获取身份证号和状态，修改新生成的位置号的身份证号
	 * 
	 * @param request
	 * @param session
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping(value = "/updateCodeIdStatusByCodeId")
	@Token(remove=true)
	public String updateUserCodeId(HttpServletRequest request,HttpSession session,RedirectAttributes attributes) {
		String cardId = request.getParameter("certNumber");
		String status = request.getParameter("status");
		String codenumber=request.getParameter("codenumber");
		String customFid=request.getParameter("customFid");
		
		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = wphUserCodeIdService.getRoleAndUserByUser(wphUserCustom);
		
		WphUsercodeidCustom wphUsercodeidCustom=new WphUsercodeidCustom();
		wphUsercodeidCustom.setCodenumber(codenumber);
		wphUsercodeidCustom.setCodestatus(Integer.parseInt(status));
		wphUsercodeidCustom.setTypes(1);
		wphUsercodeidCustom.setCodeid(cardId);
		wphUsercodeidCustom.setcustomerfid(customFid);
		wphUsercodeidCustom.setUsername(roleAndUserByUser.getName());
		wphUsercodeidCustom.setUserFid(fid);
		wphUsercodeidCustom.setUserrole(roleAndUserByUser.getRoleName());
		wphUserCodeIdService.update(wphUsercodeidCustom);
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:WphUserCodeIdForm";
	}

}
