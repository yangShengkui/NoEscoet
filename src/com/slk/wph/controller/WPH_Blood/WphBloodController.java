package com.slk.wph.controller.WPH_Blood;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;
import com.slk.wph.module.WPH_Blood.service.WPH_BloodService;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;

@Controller
@RequestMapping(value = "WphBlood")
public class WphBloodController {
	DecimalFormat df = new java.text.DecimalFormat("#0.00");
	// WphBlood/WphBloodForm
	@Autowired
	private WPH_BloodService wphBloodService;

	/**
	 * 
	 * 描述: 通过一卡通number获取card
	 * 
	 * @param
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping("/getCardByCardId")
	@ResponseBody
	public WphCard getCardByCardId(String bdCard) {
		WphCard card = wphBloodService.getCardByCardId(bdCard);
		return card;
	}

	/**
	 * 
	 * 描述:返回视图
	 * 
	 * @param session
	 * @param model
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping(value = "wphBloodForm")
	@Token(save=true)
	public String wphBloodForm(HttpSession session, Model model,String message) {

		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = wphBloodService
				.getRoleAndUserByUser(wphUserCustom);
		String username = roleAndUserByUser.getName();
		double bxyj = wphBloodService.selectWphCostByFid(5).getMoney();
		double bxfwf = wphBloodService.selectWphCostByFid(2).getMoney();
		double kpyj = wphBloodService.selectWphCostByFid(1).getMoney();
		model.addAttribute("username", username);
		model.addAttribute("bxyj", bxyj);
		model.addAttribute("bxfwf", bxfwf);
		model.addAttribute("kpyj", kpyj);
		model.addAttribute("message", message);
		return "WphBlood/WphBloodForm";
	}

	/**
	 * 
	 * 描述:根据身份证号查询库中是否有存在。 如果不存在 修改或生成一条
	 * 
	 * @param request
	 * @param session
	 * @return 创建人:赵福岭 2017年6月22日
	 */
	@RequestMapping(value = "getWphUserCodeIdByCodeId")
	@ResponseBody
	public Map<String, Object> getWphUserCodeIdByCodeId(
			HttpServletRequest request, HttpSession session) {
		// 获取身份证号
		String cardId = request.getParameter("cardId");
		Map<String, Object> map = new HashMap<String, Object>();
		int flag = 0;
		WphUsercodeidCustom wphUsercode = null;
		// 如果身份证号不为空
		if (cardId != null && !"".equals(cardId)) {
			// 获取血务证件仓库信息
			wphUsercode = wphBloodService.getWphUserCodeList(cardId);
			// 如果获取不到
			if (wphUsercode == null) {
				// 查询是否有闲置的
				WphUsercodeidCustom xz = wphBloodService.selectByWphUserCode();
				wphUsercode = xz;
				// 无闲置位置号，生成一个新的位置号
				/*if (xz == null) {
					WphUsercodeidCustom wuc = new WphUsercodeidCustom();
					Integer fid = (Integer) session.getAttribute("userFID");
					WphUserCustom wphUserCustom = new WphUserCustom();
					wphUserCustom.setFid(fid);
					WphUserCustom roleAndUserByUser = wphBloodService
							.getRoleAndUserByUser(wphUserCustom);
					String username = roleAndUserByUser.getName();
					wuc.setUsername(username);
					wuc.setUserFid(fid);
					wuc.setUserrole(roleAndUserByUser.getRoleName());
					// wphUserCustomMapper.getRoleAndUserByUser(wphUserCustom);
					int x = (int) (Math.random() * 10000000);
					wuc.setCodenumber(String.valueOf(x));
					wuc.setCodestatus(1);
					wphBloodService.saveWphUsercodeid(wuc);
					wphUsercode = wphBloodService.getWphUserCodeIdByFid(wuc
							.getFid());
				} else {
					wphUsercode = xz;
				}*/

			}
			map.put("codenumber", wphUsercode.getCodenumber());
			map.put("codeStatus", wphUsercode.getCodestatus());
			flag = 1;
		}
		map.put("flag", flag);
		// 杩斿洖瀵硅薄
		return map;

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
	public Map<String, Object> getCustomerInfo(HttpServletRequest request) {
		String data="success";
		String cardFid = request.getParameter("bdCard");
		Map<String, Object> map = new HashMap<String, Object>();
		WphCustomerCustom customer =wphBloodService.selectByCardFid(cardFid);
		if(customer!=null){
			map.put("customer", customer);
		}else{
			data="";
		}
		map.put("data", data);
		return map;
	}

	/**
	 * 
	 * 描述: 获取身份证号和状态，修改新生成的位置号的身份证号
	 * 
	 * @param request
	 * @param session
	 * @return 创建人:赵福岭 2017年6月22日
	 * @throws Exception
	 */
	
	@RequestMapping(value = "/updateCodeIdStatusByCodeId")
	@Token(remove=true)
	public String updateUserCodeId(HttpServletRequest request,
			HttpSession session,RedirectAttributes attributes) throws Exception {
		String bloodType = request.getParameter("BloodType");
		String customFid = request.getParameter("customFid");
		String notes = request.getParameter("notes");
		//String solde = request.getParameter("solde");
		String bdCard = request.getParameter("bdCard");
		String dosage = request.getParameter("dosage");
		String certNumber = request.getParameter("certNumber");//身份证号
		String codenumber = request.getParameter("codenumber");//身份证位置号
		String fileImg = request.getParameter("img");// 图片路径
		String CodeStatus=request.getParameter("CodeStatus");//身份证是否在库
		
		String ording = "bxfw_" + randmon();
		
		Integer fid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(fid);
		WphUserCustom roleAndUserByUser = wphBloodService.getRoleAndUserByUser(wphUserCustom);
		//修改身份位置好
		WphUsercodeidCustom wphUsercodeidCustom=new WphUsercodeidCustom();
		wphUsercodeidCustom.setCodenumber(codenumber);
		wphUsercodeidCustom.setCodestatus(Integer.parseInt(CodeStatus));
		wphUsercodeidCustom.setTypes(1);
		wphUsercodeidCustom.setCodeid(certNumber);
		wphUsercodeidCustom.setcustomerfid(customFid);
		wphUsercodeidCustom.setUsername(roleAndUserByUser.getName());
		wphUsercodeidCustom.setUserFid(fid);
		wphUsercodeidCustom.setUserrole(roleAndUserByUser.getRoleName());
		wphBloodService.updateWphUsercodeid(wphUsercodeidCustom);
		
		WphCustomerCustom wcc=wphBloodService.getWphCustomerCustomByFid(Integer.parseInt(customFid));
		
		double ye = wcc.getBalance();
		//是否办过护理
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		int isN=wphBloodService.selectNursing(wcc.getFid(), format.parse(format.format(date)));
		double yj=0.0;
		if(isN!=0){
			yj=wphBloodService.selectWphCostByFid(8).getMoney();
		}else{
			yj=wphBloodService.selectWphCostByFid(2).getMoney();
		}
		wcc.getBalance();
		WphBloodCustom blood = new WphBloodCustom();
		blood.setCustomerCardid(bdCard);// 卡号
		blood.setBloodtype(bloodType);// 血型
		blood.setCustomerFid(Integer.parseInt(customFid));// 患者fid
		blood.setCustmerName(wcc.getName());// 患者姓名
		blood.setNotes(notes);// 备注
		blood.setDosage(Double.valueOf(dosage));// 预存血量
		blood.setCustomerHospitalid(wcc.getHospitalld());// 住院号
		blood.setUsername(roleAndUserByUser.getName());
		blood.setUserFid(fid);
		blood.setUserrole(roleAndUserByUser.getRoleName());
		blood.setCodeNumber(codenumber);
		if(!"".equals(fileImg)){
			blood.setPicture(FileUtil.FileByteImgUp(fileImg, "wph/Photograph"));
		}
		// 每次都执行插入操作
		wphBloodService.insertWphBloodCustom(blood);
		// 存储到消费信息表

		WphOrdering wphOrdering = new WphOrdering();
		wphOrdering.setTitle("血务办理服务费");
		wphOrdering.setDepict("血务办理服务费自动扣除");
		wphOrdering.setMoney(yj);
		wphOrdering.setOrderingstatse(1);
		wphOrdering.setCustomerFid(Integer.parseInt(customFid));
		wphOrdering.setCustomerCarid(bdCard);
		wphOrdering.setCustomerHospitalld(wcc.getHospitalld());
		wphOrdering.setOrderingnumber(ording);
		Double f = Double.valueOf(df.format((ye - yj)));
		wcc.setBalance(f);
		wphOrdering.setCustomerBalance(f);
		wphOrdering.setWphQueryFid(2);
		wphOrdering.setWphServicetypeFid(3);
		wphOrdering.setWphServicedetailsFid(1);
		wphOrdering.setOrderingdate(new Date());
		wphOrdering.setPaytype(5);
		wphOrdering.setUserFid(fid);
		wphOrdering.setUserrole(roleAndUserByUser.getRoleName());
		wphOrdering.setUsername(roleAndUserByUser.getName());
		wphOrdering.setWphWardFid(wphBloodService.selectByCardFid(bdCard)
				.getWphWardFid());
		wphBloodService.insertWphOrding(wphOrdering);
		wphBloodService.updateCustom(wcc);
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:wphBloodForm";
	}

	/**
	 * 
	 * 描述:查询所有的血务
	 * 
	 * @param model
	 * @return 视图 创建人:赵福岭 2017年6月23日
	 */
	@RequestMapping(value = "/wphBooldList")
	@Token(save=true)
	public String wphBooldList(Model model, HttpServletRequest request,String message) {
		// String search=request.getParameter("search");
		List<WphBloodCustom> blood = wphBloodService.selectAll();
		double bxje = wphBloodService.selectWphCostByFid(5).getMoney();
		model.addAttribute("list", blood);
		model.addAttribute("bxje", bxje);
		model.addAttribute("message", message);
		return "WphBlood/WphBooldList";
	}

	/**
	 * 
	 * 描述:修改血务信息和余额
	 * 
	 * @param model
	 * @return 视图 创建人:赵福岭 2017年6月23日
	 */
	@RequestMapping(value = "/updateWphBooldAndBalance")
	@Token(remove=true) 
	public String updateBooldList(Model model, 
			HttpSession session, HttpServletRequest request,RedirectAttributes attributes) {
		String fid=request.getParameter("fid");
		String nowdosage=request.getParameter("nowdosage");
		
		WphBloodCustom wphBloodCustom=wphBloodService.selectWphBloodCustomByFid(Integer.parseInt(fid));
		
		String ording = "bxfw_" + randmon();
		
		double bxfy = wphBloodService.selectWphCostByFid(5).getMoney();
		WphBloodCustom wbc = wphBloodService
				.selectWphBloodCustomByFid(wphBloodCustom.getFid());
		WphCustomerCustom customer = wphBloodService.getWphCustomerCustomByFid(wbc.getCustomerFid());
		Double f = Double
				.valueOf(df.format((customer.getBalance() - Double.valueOf(nowdosage) * bxfy)));
		customer.setBalance(f);//
		int status=wbc.getStatus();
		wbc.setNowdosagemoney(Double.valueOf(nowdosage) * bxfy);
		wbc.setNowdosage(Double.valueOf(nowdosage));
		wbc.setOrderingnumber(ording);
		wbc.setUpdatedate(new Date());
		if(status==0){
			wbc.setStatus(1);
			wphBloodService.updateWphBloodCustom(wbc);// 
		}else{
			WphBloodCustom bloodC =new WphBloodCustom();
			bloodC=wbc;
			bloodC.setFid(null);
			wphBloodService.insertWphBloodCustom(bloodC);
			
		}
		/*wbc.setStatus(1);
		wbc.setNowdosagemoney(Double.valueOf(nowdosage) * bxfy);
		wbc.setNowdosage(Double.valueOf(nowdosage));
		//wbc.setDosage(Double.valueOf(wbc.getDosage()- Double.valueOf(nowdosage)));
		wbc.setOrderingnumber(ording);
		wbc.setUpdatedate(new Date());*/
		 
		wphBloodService.updateCustom(customer);//

		

		Integer userfid = (Integer) session.getAttribute("userFID");
		WphUserCustom wphUserCustom = new WphUserCustom();
		wphUserCustom.setFid(userfid);
		WphUserCustom roleAndUserByUser = wphBloodService
				.getRoleAndUserByUser(wphUserCustom);

		WphOrdering wphOrdering = new WphOrdering();
		wphOrdering.setTitle("办血费用");
		wphOrdering.setDepict("办血费用自动扣除");
		wphOrdering.setMoney(wbc.getNowdosage() * bxfy);
		wphOrdering.setOrderingstatse(1);
		wphOrdering.setCustomerFid(wbc.getCustomerFid());
		wphOrdering.setCustomerCarid(wbc.getCustomerCardid());
		wphOrdering.setCustomerHospitalld(wbc.getCustomerHospitalid());
		wphOrdering.setCustomerBalance(customer.getBalance());
		wphOrdering.setWphQueryFid(2);
		wphOrdering.setWphServicetypeFid(4);
		wphOrdering.setWphServicedetailsFid(2);
		wphOrdering.setOrderingdate(new Date());
		wphOrdering.setPaytype(5); 
		wphOrdering.setUserFid(userfid);
		wphOrdering.setUserrole(roleAndUserByUser.getRoleName());
		wphOrdering.setUsername(roleAndUserByUser.getName());
		wphOrdering.setWphWardFid(customer.getWphWardFid());
		wphOrdering.setOrderingnumber(ording);
		wphBloodService.insertWphOrding(wphOrdering);
		attributes.addAttribute("message", "恭喜您操作成功！");
		return "redirect:wphBooldList";
	}

	@RequestMapping(value = "/checkYj")
	@ResponseBody
	public Map<String, Object> checkYj(HttpServletRequest request) {
		String fid = request.getParameter("fid");
		String nowDosage = request.getParameter("nowDosage");

		WphBloodCustom wphBlood = wphBloodService
				.selectWphBloodCustomByFid(Integer.parseInt(fid));
		Double ye = wphBlood.getBalance();

		Double bxje = wphBloodService.selectWphCostByFid(5).getMoney();
		Double countTitle = bxje * (Double.valueOf(nowDosage));
		Map<String, Object> map = new HashMap<String, Object>();
		int flag = 0;
		if (ye >= countTitle) {
			flag = 1;
		}
		map.put("bxje", bxje);
		map.put("flag", flag); 
		return map;
	}
	
	
	
	/**
	 * @throws  **********************************************************************************/
	public String randmon() {
		StringBuilder str = new StringBuilder();// 定义变长字符串
		Random random = new Random();
		// 随机生成数字，并添加到字符串
		for (int i = 0; i < 8; i++) {
			str.append(random.nextInt(10));
		}
		// 将字符串转换为数字并输出
		return str.toString();
	}
}
