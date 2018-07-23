package com.slk.wph.webservice.Wph_Customer;

import java.util.HashMap;
import java.util.Map;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

import net.sf.json.JSONObject;

public class TestService {

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		
		WphCustomer customer = new WphCustomer();
		customer.setFid(1);
		
		WphCustomer customer2 = new WphCustomer();
		customer.setFid(2);
		
		map.put("A",customer);
		map.put("B", customer2);
		String str = JSONObject.fromObject(map).toString();
		
		
		JSONObject fromObject = JSONObject.fromObject(str);
		JSONObject jsonObject = fromObject.getJSONObject("A");
		
		WphCustomer bean = (WphCustomer)JSONObject.toBean(fromObject.getJSONObject("A"), WphCustomer.class);
		
		
//		WphCustomer customer3 = (WphCustomer) object2;
		
//		WphCustomer a = (WphCustomer)JSONObject.toBean( fromObject.get("A"), WphCustomer.class);
		
		
//		WphUserCustom user = (WphUserCustom)JSONObject.toBean(JSONObject.fromObject(User), WphUserCustom.class);
//		JSONObject.f
		
		

	}

}
