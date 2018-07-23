package com.slk.wph.controller.WPH_Customer;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.InternetPay.action.AliPay;
import com.slk.InternetPay.info.alipay.PrecreateAliPay;
import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.framework.Util.SecretUtil;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.po.WphWorkerCustom;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;
import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	WPH_CustomerService service;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");


	/**
	 * 描述：进入开卡缴费
	 *
	 * @param model
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月14日-下午5:10:58
	 */
	@RequestMapping("/PaymentCard")
	@Token(save=true)
	public String PaymentCard(String message, Model model, HttpSession session){
		
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));

		List<WphHospitaCustom> hospitaList = service.getWphHospitaAndWphWard();
		WphCost cost = service.getCostByFid(1);//卡押金固定fid

        model.addAttribute("payCheck", service.PayCheck());
		model.addAttribute("hospitList", hospitaList);
		model.addAttribute("cardMoney", cost.getMoney());
		model.addAttribute("user", user);
		model.addAttribute("preps", service.getPrepListByNowDate());
		model.addAttribute("message", message);

		return "Customer/Payment_card";
	}
	
	
	/**
	 * 描述：提交开卡缴费
	 *
	 * @param customer
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月19日-下午3:42:30
	 * @throws Exception 
	 */
	@RequestMapping("/PaymentCardIng")
	@Token(remove=true) 
	public String PaymentCardIng(WphCustomerCustom customer, HttpSession session, RedirectAttributes attributes) throws Exception{
		Integer userFID = (Integer)session.getAttribute("userFID");
		
		//获取user信息以及角色名称
		WphUserCustom userCustom = service.getRoleAndUserByUserFid(userFID);
		WphCard card = new WphCard();
		card.setCardnumber(customer.getWphCardNumber());
		card = service.getCardByCardInfo(card);
		
		//insert患者信息
		customer.setWphCardFid(card.getFid());//页面传fid，时有问题，改成直接从数据库获取fid
		customer.setBindingtime(sdf.parse(sdf.format(new Date())));
		customer.setUserFid(userCustom.getFid());
		customer.setUsername(userCustom.getName());
		customer.setUserrole(userCustom.getRoleName());
		//患者密码加密
		if(!"".equals(customer.getPassword())&&customer.getPassword() != null){
			customer.setPassword(new SecretUtil().encrypt(customer.getPassword()));
		}
		if(!"".equals(customer.getImg())){
			customer.setImg(FileUtil.FileByteImgUp(customer.getImg(),"wph/kkjf"));
		}

		try {
			service.InsertCustomerByInfo(customer);

			//修改预备用户状态
            WphPrepcustomer prep = new WphPrepcustomer();
            prep.setHospitalid(customer.getHospitalld());
            prep.setState(1);
			service.setPrepcustomerById(prep);
		}catch (Exception e){
			attributes.addAttribute("message", "操作失败，请重新操作！");
			return "redirect:PaymentCard";
		}

		//更改待发卡状态--已发
		card.setCardstatus(1);
		service.updateCardByCardFid(card);

		String[] title = new String[]{"预存缴费","开卡押金"};
		Integer[] patType = new Integer[]{customer.getOrdering().getPaytype(),5};
		Double[] money = new Double[]{customer.getTotal(),customer.getOrdering().getMoney()};
		Double[] balance = new Double[]{customer.getTotal(),customer.getBalance()};
		Integer[] orderingState = new Integer[]{3,1};
		//insert消费表
		for(int i=0;i<=1; i++){
			WphOrdering order = customer.getOrdering();
			order.setTitle(title[i]);
			order.setDepict(title[i]);
			order.setMoney(money[i]);
			order.setPaytype(patType[i]);
			order.setOrderingstatse(orderingState[i]);
			order.setCustomerFid(customer.getFid());
			order.setCustomerCarid(customer.getWphCardNumber()+"");
			order.setCustomerBalance(balance[i]);
			order.setCustomerHospitalld(customer.getHospitalld());
			order.setOrderingdate(new Date());
			order.setOrderingnumber("sfzx_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid());

			order.setUserFid(userCustom.getFid());
			order.setUserrole(userCustom.getRoleName());
			order.setUsername(userCustom.getName());
			order.setWphWardFid(customer.getWphWardFid());
			
			service.InsertOrderingByInfo(order);
		}
		
		attributes.addAttribute("message", "恭喜您操作成功！");
		
		return "redirect:PaymentCard";
	}
	
	
	
	/**
	 * 描述：充值-补费
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月27日-上午11:25:56
	 */
	@RequestMapping("/PaymentAdd")
	@Token(save=true) 
	public String PaymentAdd(String message,String copyCardNumber, Model model, HttpSession session){
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
		model.addAttribute("payCheck", service.PayCheck());
		model.addAttribute("user", user);
		model.addAttribute("message", message);
		model.addAttribute("copyCardNumber", copyCardNumber);
		return "Customer/Payment_add";
	}
	
	
	
	/**
	 * 描述：进行充值-补费
	 *
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月27日-下午4:19:47
	 */
	@RequestMapping("/PaymentAdding")
	@ResponseBody
	@Token(remove=true) 
	public Boolean PaymentAdding(WphOrdering order, HttpSession session){
		
		try {
			Integer userFID = (Integer)session.getAttribute("userFID");
			String orderingnumber =  "sfzx_"+(int) ((Math.random() * 9 + 1) * 10000000)+order.getCustomerFid();
			//数据库获取余额并加上补费金额
			Double customerBalance = Double.valueOf(new DecimalFormat("#.00").format(order.getMoney()+service.getCustomerByCard(order.getCustomerCarid()).getBalance()));
			//获取user信息以及角色名称
			WphUserCustom userCustom = service.getRoleAndUserByUserFid(userFID);
			//修改customer余额
			WphCustomerCustom customer = new WphCustomerCustom();
			customer.setFid(order.getCustomerFid());
			customer.setBalance(customerBalance);
			service.updateCustomerByFid(customer);
			
			//insert消费表
			order.setCustomerBalance(customerBalance);
			order.setOrderingdate(new Date());
			order.setOrderingnumber(orderingnumber);
			order.setUserFid(userCustom.getFid());
			order.setUserrole(userCustom.getRoleName());
			order.setUsername(userCustom.getName());
			
			service.InsertOrderingByInfo(order);
		} catch ( Exception e) {
			return false;
		}
		
		return true;
	}
	
	
	
	/**
	 * 描述：挂失补卡
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月27日-上午11:25:56
	 */
	@RequestMapping("/PaymentMend")
	@Token(save=true)
	public String PaymentMend(String message ,Model model, HttpSession session){
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
		WphCost cost = service.getCostByFid(1);//挂失补卡工本费固定fid
		model.addAttribute("payCheck", service.PayCheck());
		model.addAttribute("user", user);
		model.addAttribute("cardMoney", cost.getMoney());
		model.addAttribute("message", message);
		return "Customer/Payment_mend";
	}
	
	
	
	
	/**
	 * 描述：进行补卡
	 *
	 * @param customer
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月27日-下午4:19:47
	 */
	@RequestMapping("/PaymentMending")
	@ResponseBody
	@Token(remove=true) 
	public Boolean PaymentMending(WphCustomerCustom customer, HttpSession session, RedirectAttributes attributes){
		//获取user信息以及角色名称
		WphUserCustom userCustom = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
		
		//获取患者余额
		Double balance = service.getCustomerByFid(customer.getFid()).getBalance();
		
		//insertOrder共用参数
		customer.getOrdering().setOrderingdate(new Date());
		customer.getOrdering().setUserFid(userCustom.getFid());
		customer.getOrdering().setUserrole(userCustom.getRoleName());
		customer.getOrdering().setUsername(userCustom.getName());
		
		//5.insert消费表-挂失补费
		WphOrdering orderAdd = customer.getOrdering();
		orderAdd.setTitle("挂失补费");
		orderAdd.setDepict("挂失补费");
		orderAdd.setOrderingstatse(3);
		orderAdd.setOrderingnumber("sfzx_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid());
		orderAdd.setCustomerCarid(customer.getCardRelation().getCardnumber());//旧卡
		orderAdd.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(balance+customer.getOrdering().getMoney())));
		service.InsertOrderingByInfo(orderAdd);
		
		//获取原卡cardid
		WphCard card = new WphCard();
		card.setFid(customer.getWphCardFid());
		String usedCardid = service.getCardByCardInfo(card).getCardid();
		customer.getCardRelation().setCardid(usedCardid);
		
		//1.将原卡状态更改为挂失卡
		card.setCardstatus(3);
		service.updateCardByCardFid(card);
		
		//2.将新卡状态更改为已发卡
		card = new WphCard();
		card.setCardnumber(customer.getWphCardNumber());
		card.setFid(customer.getNewCardFID());
		card.setCardstatus(1);
		service.updateCardByCardFid(card);
		
		//3.更新患者的卡号以及 卡fid（主键）
		customer.setWphCardFid(card.getFid());
		service.updateCustomerByFid(customer);
		
		//4.insert 卡关联表
		service.InsertCardRelationByFid(customer.getCardRelation());
		
		//5.insert消费表-补卡
		WphOrdering orderMend = customer.getOrdering();
		WphServicedetails details = service.selectByQueryFid(6);
		orderMend.setTitle("挂失工本费");
		orderMend.setDepict("挂失工本费");
		orderMend.setOrderingstatse(1);
		orderMend.setOrderingnumber("sfzx_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid());
		orderMend.setCustomerCarid(customer.getCardRelation().getNewcardnumber());//新卡
		orderMend.setPaytype(5);//卡内余额扣除
		orderAdd.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(balance)));
		orderMend.setWphQueryFid(details.getWphQueryFid());
		orderMend.setWphServicetypeFid(details.getWphServicetypeFid());
		orderMend.setWphServicedetailsFid(details.getFid());
		service.InsertOrderingByInfo(orderMend);
		
		return true;
	}
	
	
	
	/**
	 * 描述：根据住院号获取患者信息
	 *
	 * @param customer
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月29日-下午3:43:23
	 */
	@RequestMapping("/getCustomerByhospitalId")
	@ResponseBody
	public WphCustomerCustom getCustomerByhospitalId(WphCustomerCustom customer){
		
		customer = service.getCustomerByInfo(customer);
		
		return customer;
	}
	
	
	
	
	/**
	 * 描述：根据卡片Id OR Number获取患者信息
	 *
	 * @param cardId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月28日-下午3:14:50
	 */
	@RequestMapping("/getCustomerByCard")
	@ResponseBody
	public WphCustomerCustom getCustomerByCard(String cardId){
		
		WphCustomerCustom customer = service.getCustomerByCard(cardId);
		
		return customer;
	}
	
	
	
	
	/**
	 * 描述：通过cardId获取info信息
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月20日-上午9:39:21
	 */
	@RequestMapping("/getCardByCardId")
	@ResponseBody
	public WphCard getCardByCardId(WphCard card){
		
		card = service.getCardByCardInfo(card);
		
		return card;
	}
	
	
	
	/**
	 * 描述：根据cardNumber获取info
	 *
	 * @param card
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月29日-上午9:32:33
	 */
	@RequestMapping("/getCardBoolean")
	@ResponseBody
	public WphCard getCardBoolean(WphCard card){
		
		card = service.getCardByCardInfo(card);
		
		return card;
	}
	
	
	
	/**
	 * 描述：判断住院号是否已被使用
	 *
	 * @param customer
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月21日-下午3:30:16
	 */
	@RequestMapping("/getCustomerByInfo")
	@ResponseBody
	public WphCustomer getCustomerByInfo(WphCustomer customer){
		
		WphCustomerCustom custom = service.getCustomerByInfo(customer);
		
		return custom;
	}
	
	
	
	
	
	/**
	 * 描述：支付宝付款
	 *
	 * @param pa
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月16日-下午12:01:57
	 */
	@RequestMapping("/getScanPayment")
	@ResponseBody
	public PrecreateAliPay getScanPayment(PrecreateAliPay pa){
		
		PrecreateAliPay payAili = new AliPay().PayAili(pa);
		
		return payAili;
	}
	
	
	
	/**
	 * 描述：获取护工组长  
	 * （因每个病区可能会有多个护工组长，所以在此进行了筛选，只获取最新一位为护工组长）
	 *
	 * @param wardFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月28日-下午3:17:01
	 */
	@RequestMapping("/getUserByward")
	@ResponseBody
	public WphUserCustom getUserByward(Integer wardFid){
		
		WphUserCustom user = service.getUserByRoleWard(wardFid);
		
		return user;
	}
	
	/**
	 * 
	 *描述:
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	@RequestMapping("/selectAllCustomer")
	public String selectAllCustomer(Model model,String wardFid,String type,String date){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date newDate=null;
		Integer wardfid = null;
		Integer nursingtype=null;
		try {
			if(date==null||"".equals(date)){
				newDate=format.parse(format.format(new Date()));
			}else{
				newDate=format.parse(date);
			}
			if(wardFid!=null&&!"".equals(wardFid)){
				wardfid=Integer.parseInt(wardFid);
			}
			if(type!=null&&!"".equals(type)){
				nursingtype=Integer.parseInt(type);
			}
			//获取所有已开启病区
			List<WphWardCustom> wardList= service.getWphWardListByStatus();
			List<WphCustomerCustom> list= service.selectAllCustomer(wardfid, nursingtype, newDate);
			model.addAttribute("list", list);
			model.addAttribute("wardList", wardList);
			model.addAttribute("date", format.format(newDate));
			model.addAttribute("type", nursingtype);
			model.addAttribute("wardFid", wardFid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "NursingMessage/NursingMessageList";
	}
	/**
	 * 
	 *描述:查询未结算工资的护工
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年8月3日
	 * @throws ParseException 
	 */
	@RequestMapping("/selectUnAllWorker")
	public String selectAllWorker(Model model,String startDate,String endDate,String state) throws ParseException{
		int st=0;
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
		if(state!=null){
			st=Integer.parseInt(state);
		}
		List<WphWorkerCustom> list=service.selectAllWorker(starttime,endtime,st);
		model.addAttribute("list", list);
		model.addAttribute("startDate", format.format(starttime));
		model.addAttribute("endDate", format.format(endtime));
		model.addAttribute("state", st);
		return "WphWorker/WphUnWorkerList";
		
	}
	/**
	 * 
	 *描述:查询一对一护理的图片
	 *@return
	 *创建人:赵福岭
	 *2017年8月4日
	 */
	@RequestMapping("/getWphOne")
	@ResponseBody
	public Map<String,String> getWphOne(String fid){
		Map<String,String> map=new HashMap<String,String>();
		WphOneCustom wphone=service.getWphOneByFid(Integer.parseInt(fid));
		map.put("imgs", wphone.getImgs());
		return map;
	}
	/**
	 * 
	 *描述:查询一对一护理信息
	 *@param model
	 *@return
	 *创建人:赵福岭
	 *2017年8月4日
	 */
	@RequestMapping("/updateWphOne")
	public String updateWphOne(String fid,String startDates,String endDates,String states,String settlementmoney,RedirectAttributes attributes){
		WphOneCustom wphone=service.getWphOneByFid(Integer.parseInt(fid));
		wphone.setSettlementmoney(Double.parseDouble(settlementmoney.replace(",","")));
		//System.out.print(settlementmoney);
		wphone.setWagesstates(1);
		service.updateWphOne(wphone);
		attributes.addAttribute("startDate", startDates);
		attributes.addAttribute("endDate", endDates);
		attributes.addAttribute("state", states);
		return "redirect:selectUnAllWorker";
	}

	/**
	 * 描述：根据住院号查询患者信息
	 * @param model
	 * @return
	 * 创建人:赵福岭
	 * 2017年12月18日
	 */
	@RequestMapping(value="selectCustomerInfo")
	public String getCustomerByHospitalld(){
		return "Customer/Customer_Info";
	}
	@RequestMapping(value="cutomerInfo")
	@ResponseBody
	public List<WphCustomerCustom> cutomerInfo(String name){
		List<WphCustomerCustom> list = service.getCustomerByName(name);
		return list;

	}
}
