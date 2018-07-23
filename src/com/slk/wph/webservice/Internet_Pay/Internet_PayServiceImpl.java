package com.slk.wph.webservice.Internet_Pay;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.InternetPay.action.AliPay;
import com.slk.InternetPay.info.alipay.PrecreateAliPay;
import com.slk.wph.module.WPH_Cost.mapper.WphCostCustomMapper;

public class Internet_PayServiceImpl implements Internet_PayService {

	@Autowired
	private WphCostCustomMapper costMapper;
	

	@Override
	public String getScanCodePay(String alipays) {
		Map<String,Object> map = new HashMap<String,Object>();

		PrecreateAliPay pay = (PrecreateAliPay) JSONObject.toBean(JSONObject.fromObject(alipays), PrecreateAliPay.class);
		PrecreateAliPay payAili = new AliPay().PayAili(pay);
		
		map.put("pay", payAili);
		
		return JSONObject.fromObject(map).toString();
	}


	@Override
	public String PayCheck() {

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag", costMapper.PayCheck()>0);
		// TODO Auto-generated method stub
		return JSONObject.fromObject(map).toString();
	}

	
	
	
}
