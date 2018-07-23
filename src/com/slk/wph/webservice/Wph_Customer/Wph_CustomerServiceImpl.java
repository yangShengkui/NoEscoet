package com.slk.wph.webservice.Wph_Customer;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Cost.mapper.WphCostMapper;
import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Hospita.mapper.WphHospitaMapperCustom;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapper;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

public class Wph_CustomerServiceImpl implements Wph_CustomerService {

	@Autowired
	private WphCustomerMapperCustom mapperCustom;
	@Autowired
	private WphOrderingMapper orderingMapper;
	@Autowired
	private WphCostMapper costMapper;
	@Autowired
	private WphHospitaMapperCustom hospitaMapperCustom;
	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	@Autowired
	private WphWardMapperCustom wardMapperCustom;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public String PaymentCard() {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		
		List<WphHospitaCustom> hospitaAndWard = hospitaMapperCustom.getWphHospitaAndWphWard();
		WphCost cost = costMapper.selectByPrimaryKey(1);
		
		if(hospitaAndWard.size()!= 0 && null != cost){
			map.put("hospitaAndWardList", hospitaAndWard);
			map.put("cashPledge", cost.getMoney());
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}
	
	

	@Override
	public String PaymentCardIng(String payMentCard) {

		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		
		JSONObject objects = JSONObject.fromObject(payMentCard);
		WphCustomer Customer = (WphCustomer)JSONObject.toBean(objects.getJSONObject("Customer"), WphCustomer.class);
		WphOrdering Ordering1 = (WphOrdering)JSONObject.toBean(objects.getJSONObject("Ordering1"), WphOrdering.class);
		WphOrdering Ordering2 = (WphOrdering)JSONObject.toBean(objects.getJSONObject("Ordering2"), WphOrdering.class);

		WphCustomerCustom existence = mapperCustom.getCustomerByHospitalld(Customer.getHospitalld());
		if(null == existence){
			try {
				Customer.setBindingtime(sdf.parse(sdf.format(new Date())));//自行传值-卡号绑定时间 2017-11-10 09:51
			} catch (ParseException e) {
				e.printStackTrace();
				System.out.println("---------------------------提交开卡缴费日期转换错误");
			}
			//获取卡的fid（主键）
			WphCard card = new WphCard();
			card.setCardnumber(Customer.getWphCardNumber());
			card = cardMapperCustom.getCardByCardInfo(card);
			Integer c = 0;
			try {
				//创建患者
				Customer.setWphCardFid(card.getFid());
				Customer.setCreatetype(1);//移动收费
				c = mapperCustom.insertCustomerByInfo(Customer);
			}catch (Exception e){
				map.put("flag", flag);
				return JSONObject.fromObject(map).toString();
			}

			//修改卡号状态
			card.setCardstatus(1);
			card.setType(1);
			cardMapperCustom.updateCard(card);

			//预存
			Ordering1.setCustomerFid(Customer.getFid());
			Ordering1.setOrderingdate(new Date());
			Ordering1.setOrderingnumber("kkjf_"+(int) ((Math.random() * 9 + 1) * 10000000)+Customer.getFid());
			Integer o1 = orderingMapper.insertSelective(Ordering1);
			//押金
			Ordering2.setCustomerFid(Customer.getFid());
			Ordering2.setOrderingdate(new Date());
			Ordering2.setOrderingnumber("kkjf_"+(int) ((Math.random() * 9 + 1) * 10000000)+Customer.getFid());

			Integer o2 = orderingMapper.insertSelective(Ordering2);
			if((c+o1+o2)== 3)flag = true;
		}
		map.put("flag", flag);

		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String getCardNumberByCardId(String cardId) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphCard card = new WphCard();
		card.setCardid(cardId);
		card.setCardstatus(0);
		card = cardMapperCustom.getCardByCardInfo(card);
		
		if(null != card){
			map.put("cardNum", card.getCardnumber());
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String getFlagByCardHospital(String info) {
		String cardNum = JSONObject.fromObject(info).getString("cardNum");
		String hospitalId = JSONObject.fromObject(info).getString("hospitalId");

		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flagCard = false;
		Boolean flagHospital = false;
		//验证卡号
		WphCard card = new WphCard();
		card.setCardnumber(cardNum);
		card.setCardstatus(0);
		card = cardMapperCustom.getCardByCardInfo(card);
		//验证住院号
		WphCustomer customer = new WphCustomer();
		customer.setHospitalld(hospitalId);
		customer = mapperCustom.getCustomerByInfo(customer);
		
		if(null != card) flagCard = true;
		if(null == customer) flagHospital = true;
		
		map.put("flagCard", flagCard);
		map.put("flagHospital", flagHospital);
		
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String getCustomerByCardIdOrHospitalld(String card) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphCustomer customer = new WphCustomer();
		if(card.length() == 10)
			customer = mapperCustom.getCustomerByCardId(card);//根据卡id
		else
			customer = mapperCustom.getCustomerByHospitalld(card);//根据住院号
		
		if(null != customer){
			map.put("customer", customer);
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String PaymentAdding(String info) {
		Map<String,Object> map = new HashMap<String,Object>();
		Integer count = 0;
		Boolean flag = false;
		WphOrdering ordering = (WphOrdering)JSONObject.toBean(JSONObject.fromObject(info), WphOrdering.class);
		String orderingnumber =  "kkjf_"+(int) ((Math.random() * 9 + 1) * 10000000)+ordering.getCustomerFid();

		Double balance = mapperCustom.getCustomerByHospitalld(ordering.getCustomerHospitalld()).getBalance();
		Double total =  Double.valueOf(new DecimalFormat("#.00").format(balance + ordering.getMoney()));

		//update患者信息表余额
		WphCustomerCustom customer = new WphCustomerCustom();
		customer.setFid(ordering.getCustomerFid());
		customer.setBalance(total);
		count = mapperCustom.updateCustomer(customer);
		
		//insert消费表
		ordering.setOrderingdate(new Date());
		ordering.setOrderingnumber(orderingnumber);
		ordering.setCustomerBalance(total);
		count += orderingMapper.insertSelective(ordering);
		
		if(count == 2)flag = true;
		
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String getCustomByHospitalldStates(Integer wardFid) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag=false;
		List<WphCustomerCustom> list=mapperCustom.getCustomByHospitalldStates(wardFid);
		if(list.size()>0){
			flag=true;
		}
		map.put("list", list);
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	
	@Override
	public String getWardListByUserFid(Integer userFid){
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag=false;
		List<WphWardCustom> list=wardMapperCustom.getWphWardListByStatus();
		if(list.size()>0){
			flag=true;
		}
		map.put("list", list);
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}



	@Override
	public String getCustomerListByInfo(String wardFid,String datetime) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphCustomer customer = new WphCustomer();
		try {
			customer.setBindingtime(sdf.parse(datetime));
		} catch (ParseException e) {
			System.out.println("---------自助开卡，日期转换报错");
			e.printStackTrace();
		}
		customer.setWphWardFid(Integer.valueOf(wardFid));
		customer.setCreatetype(2);
		
		List<WphCustomerCustom> List = mapperCustom.getCustomerListByInfo(customer);
		if(null != List && List.size()>0){
			map.put("customerList", List);
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}


	
	@Override
	public String getPSTByCustomerInfo(String value) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphCustomerCustom> customer = mapperCustom.getPSTByCustomerInfo(value);
		if(null != customer){
			map.put("customer", customer);
			flag = true;
		}
		map.put("flag", flag);
		
		return JSONObject.fromObject(map).toString();
	}
	
	
	

}
