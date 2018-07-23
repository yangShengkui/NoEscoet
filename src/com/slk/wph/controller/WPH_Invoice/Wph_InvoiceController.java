package com.slk.wph.controller.WPH_Invoice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Invoice.po.WphInvoiceCustom;
import com.slk.wph.module.WPH_Invoice.service.WPH_InvoiceService;
import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Controller
@RequestMapping(value="WphInvoice")
public class Wph_InvoiceController {
	@Autowired
	private WPH_InvoiceService service;
/*--------------------------------------财务--------------------------------------------------*/
	@RequestMapping(value="getWphInvoiceManger")
	public String getWphInvoiceManger(Model model,String hospitalld,String success){
		WphCustomerCustom customer=service.getWphInvoiceManger(hospitalld);
		model.addAttribute("customer", customer);
		model.addAttribute("hospitalld", hospitalld);
		int flag=0;
		if(customer!=null){
			List<WphInvoiceCustom> invoiceList=service.selectWphInvoiceByHospitalld(hospitalld);
			switch (invoiceList.size()) {
			    case 0:
			    	flag=0;//未在处置室办理过
			    	break;
				case 1://如果只有一条数据说明：是在财务端办理的
					flag=2;
					break;
				case 2://如果只有二条数据说明：是在财务端办理的
					int count=0;
					for (int i = 0,x=invoiceList.size(); i < x; i++) {
						int rateFid=invoiceList.get(i).getWphInvoicerateFid();
						if(rateFid==1||rateFid==4){
							 count++;
						}else{
							//如果没办理过一对一或者一对多，说明是在财务端办理的
							//直接退出循环
							flag=2;
							break;
						}
					}
					//说明办理了一个一对一，一个一对多，（只可能是在处置室办理）
					if(count==2){
						flag=1;
					}
					break;
				default://超过两条数据的，全部都在财务端办理过
					flag=2;
					break;
			}
			//flag:  0未办理过  1 在处置办理过，2已在财务端办理过
			
			//所有费率\
			if(flag!=2){
				WphInvoicerateCustom cf=service.getInvoicerateByFid(2);
				model.addAttribute("cf", cf);
				WphInvoicerateCustom oneAndOne=service.getInvoicerateByFid(1);
				model.addAttribute("oneAndOne", oneAndOne);
				WphInvoicerateCustom oneAndMany=service.getInvoicerateByFid(4);
				model.addAttribute("oneAndMany", oneAndMany);
				WphInvoicerateCustom qt=service.getInvoicerateByFid(3);
				model.addAttribute("qt", qt);
			}
			
		}
		model.addAttribute("message", success);
		model.addAttribute("flag", flag);
		return "WphInvoice/Invoicemanger";
	}
	
	@RequestMapping(value="saveWphInvoice")
	@ResponseBody
	public Map<String,Object> saveWphInvoice(String json,HttpSession session){
		
		Map<String,Object> maps= new HashMap<String,Object>();
		try {
			JSONObject jsons=JSONObject.fromObject(json);
			Integer customerFid=Integer.parseInt(jsons.get("customerFid").toString());
			WphCustomerCustom customer=service.getCustomerByFid(customerFid);
			
			Integer userFid = (Integer) session.getAttribute("userFID");
			WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(userFid);
			
			JSONArray jsonArray = jsons.getJSONArray("data");
			List<Map<String,String>> mapListJson = (List)jsonArray;
			
			for (Map<String, String> map : mapListJson) {
				int fid=Integer.parseInt(map.get("fid"));
				WphInvoiceCustom custom=new WphInvoiceCustom();
				custom.setCustomerFid(customerFid);
				WphInvoicerateCustom ic=service.getInvoicerateByFid(fid);
				custom.setWphInvoicerateFid(fid);
				custom.setMoney(Double.parseDouble(map.get("fy")));    
				custom.setTaxation(Double.parseDouble(map.get("sf")));
				custom.setRate(ic.getRate());
				custom.setName(ic.getName());
				custom.setCustomerHospitalld(customer.getHospitalld());
				//custom.setCustomerCardid(customer.getWphCardNumber());
				custom.setUserFid(roleAndUserByUser.getFid());
				custom.setUserrole(roleAndUserByUser.getRoleName());
				custom.setUsername(roleAndUserByUser.getName());
				service.insertWphInvoice(custom);
				
			}
			maps.put("data","success" );
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			maps.put("data","fail" );
			e.printStackTrace();
		}
		return maps;
	}
	/*--------------------------------------处置室--------------------------------------------------*/	
	@RequestMapping(value="getWphInvoiceMangerC")
	public String getWphInvoiceMangerC(Model model,String hospitalld,HttpSession session,String success){
		WphCustomerCustom customer=service.getWphInvoiceManger(hospitalld);
		model.addAttribute("customer", customer);
		model.addAttribute("hospitalld", hospitalld);
		
		Integer userFid = (Integer) session.getAttribute("userFID");
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(userFid);
		int flag=0;
		if(customer!=null){
			List<WphInvoiceCustom> invoiceList=service.selectWphInvoiceByHospitalld(hospitalld);
			if(invoiceList.size()>0){
				flag=1;//已办
			}
			//所有费率
			if(flag!=1){
				WphInvoicerateCustom oneAndOne=service.getInvoicerateByFid(1);
				model.addAttribute("oneAndOne", oneAndOne);
				WphInvoicerateCustom oneAndMany=service.getInvoicerateByFid(4);
				model.addAttribute("oneAndMany", oneAndMany);
			}
			
		}
		model.addAttribute("message", success);
		model.addAttribute("username", roleAndUserByUser.getName());
		model.addAttribute("flag", flag);
		return "WphInvoice/InvoicemangerC";
	}
	
	@RequestMapping(value="saveWphInvoiceC")
	@ResponseBody
	public Map<String,Object> saveWphInvoiceC(String json,HttpSession session){
		
		Map<String,Object> maps= new HashMap<String,Object>();
		try {
			JSONObject jsons=JSONObject.fromObject(json);
			Integer customerFid=Integer.parseInt(jsons.get("customerFid").toString());
			WphCustomerCustom customer=service.getCustomerByFid(customerFid);
			
			Integer userFid = (Integer) session.getAttribute("userFID");
			WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(userFid);
			
			JSONArray jsonArray = jsons.getJSONArray("data");
			List<Map<String,String>> mapListJson = (List)jsonArray;
			
			for (Map<String, String> map : mapListJson) {
				int fid=Integer.parseInt(map.get("fid"));
				WphInvoiceCustom custom=new WphInvoiceCustom();
				custom.setCustomerFid(customerFid);
				WphInvoicerateCustom ic=service.getInvoicerateByFid(fid);
				custom.setWphInvoicerateFid(fid);
				custom.setMoney(Double.parseDouble(map.get("fy")));    
				custom.setTaxation(Double.parseDouble(map.get("sf")));
				custom.setRate(ic.getRate());
				custom.setName(ic.getName());
				custom.setCustomerHospitalld(customer.getHospitalld());
				//custom.setCustomerCardid(customer.getWphCardNumber());
				custom.setUserFid(roleAndUserByUser.getFid());
				custom.setUserrole(roleAndUserByUser.getRoleName());
				custom.setUsername(roleAndUserByUser.getName());
				service.insertWphInvoice(custom);
				
			}
			maps.put("data","success" );
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			maps.put("data","fail" );
			e.printStackTrace();
		}
		return maps;
	}
	/**
	 * @throws ParseException ***************************************************************************************/
	@RequestMapping(value="selectInvoice")
	public String selectInvoice(String startDate,String endDate,Integer wardFid,String name,Model model,HttpSession session) throws ParseException{
		model.addAttribute("invoicerateList", service.selectInvoicerate());
		model.addAttribute("wardList", service.getWphWardListByStatus());
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
		
		Integer userFid = (Integer) session.getAttribute("userFID");
		WphUserCustom roleAndUserByUser = service.getRoleAndUserByUser(userFid);
		model.addAttribute("list", service.selectInvoice(starttime,endtime, wardFid, name));	
		model.addAttribute("startDate", format.format(starttime));
		model.addAttribute("endDate", format.format(endtime));
		model.addAttribute("wardFid", wardFid);
		model.addAttribute("name", name);
		model.addAttribute("username", roleAndUserByUser.getName());
		return "WphInvoice/InvoiceList";
	}
}
