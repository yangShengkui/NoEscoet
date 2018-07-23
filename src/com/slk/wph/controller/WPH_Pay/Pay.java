package com.slk.wph.controller.WPH_Pay;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.InternetPay.action.AliPay;
import com.slk.InternetPay.info.alipay.PrecreateAliPay;
import com.slk.wph.module.WPH_Pay.po.WPH_Pay;

@Controller
@RequestMapping("/Pay")
public class Pay {

	
	
	
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
		
		pay.setOut_trade_no(pay.getOut_trade_no()+"_"+(int) ((Math.random() * 9 + 1) * 100000));
		
		PrecreateAliPay ali = new AliPay().PrecreateAli(pay, null);

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
	 * 描述：插入数据库
	 *
	 * @param wphpay
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月6日-上午11:34:14
	 */
	@RequestMapping("/Insert_Pay")
	public String Insert_Pay(WPH_Pay wphpay){
		
		String imgUrl = "qr-123456Precreate5428144.png";
		
		new File("E://workspace//Wph//WebRoot//qr//"+imgUrl).delete();
		
		
		return "Payment/Generate_pay";
	}
	
	
	
}
