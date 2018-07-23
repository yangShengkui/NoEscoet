package com.slk.wph.controller.WPH_One_Machine;

import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.slk.wph.framework.Util.SMSCodeUtil;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slk.InternetPay.action.AliPay;
import com.slk.InternetPay.info.alipay.PrecreateAliPay;
import com.slk.wph.framework.Util.SecretUtil;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
//一体机
@Controller
@RequestMapping("/Screen/One_Machine")
public class One_MachineController  {

	
	@Autowired
	private WPH_CustomerService service;
	
	private SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	
	private Map<String,Object> map = new HashMap<String,Object>();
	private DecimalFormat  retain   = new DecimalFormat("######0.00");


	/**
	 * 描述：支付宝限额验证与时间限制
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月11日-下午2:03:27
	 * @throws ParseException 
	 */
	@ResponseBody
	@RequestMapping("/BeforePay")
	public Integer BeforePay() throws ParseException{
		Integer state = 0;
		long nowDate = sdf.parse(sdf.format(new Date())).getTime();
		long startDate = sdf.parse("7:00:00").getTime();
		long endDate = sdf.parse("17:00:00").getTime();
		/*if(nowDate> startDate && nowDate<endDate)state=1;//时间限制验证  正常是1 规定7点到17点不能访问
		else if(service.PayCheck() == 0)state=2;//支付宝限制验证  正常是2*/
		return state;
	}
	
	
	
	/**
	 * 描述：进入开卡缴费
	 *
	 * @param model
	 * @param session
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-上午11:41:06
	 */
	@RequestMapping("/Payment_card")
	public String Payment_card(Model model, HttpSession session){
		WphUserCustom user = service.getuserById((Integer)session.getAttribute("userFID"));
		List<WphWardCustom> wardList = service.getWphWardListByStatus();
		model.addAttribute("wardList", wardList);
		model.addAttribute("cardMoney", service.getCostByFid(1).getMoney());//卡押金固定fid
		model.addAttribute("user", user);
		return "One_Machine/Payment_card";
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
	 * 描述：提交开卡缴费
	 *
	 * @param customer
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月19日-下午3:42:30
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping("/PaymentCardIng")
	public Boolean PaymentCardIng(WphCustomerCustom customer, HttpSession session, RedirectAttributes attributes, HttpServletRequest request) throws Exception{
		//获取user信息以及角色名称
		WphUserCustom userCustom = service.getRoleAndUserByUserFid(136);//大屏幕虚拟账号136
		
		//更改待发卡状态--已发
		WphCard card = new WphCard();
		card.setFid(customer.getWphCardFid());
		card.setCardstatus(1);
		service.updateCardByCardFid(card);
		
		//insert患者信息
		customer.setUserFid(userCustom.getFid());
		customer.setUserrole(userCustom.getRoleName());
		customer.setUsername(userCustom.getRoleName());
		customer.setBindingtime(sdf2.parse(sdf2.format(new Date())));
		//患者密码加密
		if(!"".equals(customer.getPassword())&&customer.getPassword() != null){
			customer.setPassword(new SecretUtil().encrypt(customer.getPassword()));
		}
		service.InsertCustomerByInfo(customer);
		String[] title = new String[]{"预存缴费","开卡押金"};
		Double[] money = new Double[]{customer.getTotal(),customer.getOrdering().getMoney()};
		Double[] balance = new Double[]{customer.getTotal(),customer.getBalance()};
		Integer[] payType = new Integer[]{2,5};
		Integer[] orderingState = new Integer[]{3,1};
		//insert消费表
		for(int i=0;i<=1; i++){
			WphOrdering order = customer.getOrdering();
			order.setTitle(title[i]);
			order.setDepict(title[i]);
			order.setMoney(money[i]);
			order.setOrderingstatse(orderingState[i]);
			order.setPaytype(payType[i]);
			order.setWphWardFid(customer.getWphWardFid());
			order.setCustomerFid(customer.getFid());
			order.setCustomerCarid(customer.getWphCardNumber());
			order.setCustomerBalance(balance[i]);
			order.setCustomerHospitalld(customer.getHospitalld());
			order.setOrderingdate(new Date());
			order.setOrderingnumber("ytj_"+(int) ((Math.random() * 9 + 1) * 10000000)+customer.getFid());
			if(i==1)order.setPayordernumber(null);//开卡押金属于卡内余额扣除

			order.setUserFid(userCustom.getFid());
			order.setUserrole(userCustom.getRoleName());
			order.setUsername(userCustom.getName());
			order.setWphWardFid(customer.getWphWardFid());
			
			service.InsertOrderingByInfo(order);
		}

		//发送短息提醒
		String message = "恭喜您开卡成功，您的卡号为："+customer.getWphCardNumber();
		//SMSCodeUtil.SendTextMessages(customer.getPhone(),message);

		attributes.addAttribute("message", "恭喜您操作成功！");
		
		return true;
	}




	/**
	 *	补费
	 * Create by song on 2018-01-15 14:45:39
	 */
	@ResponseBody
	@RequestMapping("/PaymentAdd")
	public String PaymentAdd(String number){
		map.clear();
		Boolean flag = false;
		WphCustomer customer = service.getCustomerByNumber(number);
		if(null != customer){
			flag = true;
			map.put("customer",customer);
		}
		map.put("flag",flag);
		return JSONObject.fromObject(map).toString();
	}
	


	/**
	 * 进行补费
	 * Create by song on 2018-01-15 14:46:15
	 */
	@ResponseBody
	@RequestMapping("/PaymentAddIng")
	public String PaymentAddIng(WphOrdering ordering, HttpSession session){
		map.clear();
		WphCustomer customer = service.getCustomerByFid(ordering.getCustomerFid());
		WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
		Double customer_balane = Double.valueOf(retain.format(customer.getBalance()+ordering.getMoney()));
		//修改患者余额
		customer.setBalance(customer_balane);
		service.updateCustomerByFid(customer);
		//添加消费信息
		ordering.setUserFid(user.getFid());
		ordering.setUsername(user.getName());
		ordering.setUserrole(user.getRoleName());
		ordering.setCustomerBalance(customer_balane);
		ordering.setOrderingnumber("ytj_"+(int) ((Math.random() * 9 + 1) * 10000000)+ordering.getCustomerFid());
		service.InsertOrderingByInfo(ordering);

		map.put("flag",true);
		return JSONObject.fromObject(map).toString();
	}

	
	
	/**
	 * 描述：获取-待发卡卡号
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-下午1:35:24
	 */
	@ResponseBody
	@RequestMapping("/getUnusedCardOne")
	public WphCard getUnusedCardOne(){
		
		WphCard card = service.getUnusedCardOne();
		
		return card;
	}
	
	
	
	/**
	 * 描述：生成二维码
	 *
	 * @param pay
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月6日-上午10:22:48
	 */
	@RequestMapping("/Generate_pay")
	@ResponseBody
	public PrecreateAliPay Generate_pay(PrecreateAliPay pay ,HttpServletRequest request ){
		
		PrecreateAliPay ali = new AliPay().PrecreateAli(pay, request.getSession().getServletContext().getRealPath("/"));

		return ali;
	}
	
	
	/**
	 * 描述：确认扫码是否成功 
	 * 		失败：flag：false;
	 * 		成功：flag：true;
	 * 			out_trade_no:订单号
	 *
	 * @param pay
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月6日-上午10:25:39
	 */
	@RequestMapping("/Confirm_pay")
	@ResponseBody
	public PrecreateAliPay confirm_pay(PrecreateAliPay pay){
//		pay.setOut_trade_no("123456Precreate9382455");
		
		pay = new AliPay().QueryAli(pay);

		return pay;
	}
	
	
	
	/**
	 * 描述：删除二维码
	 *
	 * @param url
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月4日-上午9:02:11
	 */
	@ResponseBody
	@RequestMapping("/deleteFileQR")
	public Boolean deleteFileQR(String url,HttpServletRequest request){
		//删除二维码
		if(!"".equals(url)){
			new File(request.getSession().getServletContext().getRealPath("/")+"/"+url).delete();
		}
		
		return true;
	}


	
	/**
	 * 获取用户须知
	 * Create by song on 2018-01-23 13:42:04
	 */
	@ResponseBody
	@RequestMapping("/getNotice")
	public String getNotice(){
		map.clear();
		WphWarmprompt mprompt = service.getCustomerNotice(5);
		map.put("mprompt",mprompt);
		return JSONObject.fromObject(map).toString();
	}
	
	
}
