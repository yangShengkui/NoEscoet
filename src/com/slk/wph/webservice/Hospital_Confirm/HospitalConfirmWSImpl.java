package com.slk.wph.webservice.Hospital_Confirm;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursing;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import org.springframework.transaction.annotation.Transactional;

@WebService
@SOAPBinding(style = Style.RPC)
@Transactional
public class HospitalConfirmWSImpl implements HospitalConfirmWS {

	@Autowired
	private WphOrderingnursingMapperCustom mapperCustom;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat formats = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	DecimalFormat df = new java.text.DecimalFormat("#0.00");

	@Autowired
	private WphWardMapperCustom wardMapperCustom;

	@WebMethod
	public String checkHospital(String userFid, String cardId, String hospitalld) {
		Map<String,Object> map = new HashMap<String,Object>();
		// TODO Auto-generated method stub
		// 根据卡id获取患者信息
		Boolean flag = false;
		String message = "成功";

		if (cardId == null && hospitalld == null) {
			message = "卡号和住院号都为null";
			map.put("DH", 2);
			map.put("flag", flag);
			map.put("message", message);
			return JSONObject.fromObject(map).toString();
		}
		if (userFid == null) {
			message = "userFid为null";
			map.put("DH", 2);
			map.put("flag", flag);
			map.put("message", message);
			return JSONObject.fromObject(map).toString();
		}
		WphCustomerCustom wphCustomerCustom = mapperCustom.selectByCardIdOrHospita(cardId, hospitalld);
		if (wphCustomerCustom == null) {
			message = "未查到患者";
			map.put("DH", 2);
			map.put("flag", flag);
			map.put("message", message);
			return JSONObject.fromObject(map).toString();
		}
		
		if (1 == wphCustomerCustom.getHospitalldstatus()) {
			map.put("DH", 1);
		} else {
			map.put("DH", 0);
		}
		flag = true;
		map.put("wphCustomerCustom", wphCustomerCustom);// 返回患者信息
		map.put("message", message);
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	@WebMethod
	public String receiveHospital(String customerFid,String userFid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		String message = "修改成功";
		try {
			if (customerFid == null) {
				message = "customerFid不能为null";
				map.put("flag", flag);
				map.put("message", message);
				return JSONObject.fromObject(map).toString();
			}
			// 根据卡id获取患者信息
			WphCustomerCustom wphCustomerCustom = mapperCustom
					.getCustomerByFid(Integer.parseInt(customerFid));
			if (wphCustomerCustom == null) {
				message = "未找到该患者";
				map.put("flag", flag);
				map.put("message", message);
				return JSONObject.fromObject(map).toString();
			}
			List<WphWardCustom> list=mapperCustom.selectWardListByUserFid(Integer.parseInt(userFid));
			wphCustomerCustom.setHospitalldstatus(1);// 变更患者状态为住院
			wphCustomerCustom.setWphWardFid(list.get(0).getFid());
			
			//mapperCustom.updateCustomerWard(customer.getFid(),Integer.parseInt(wardFid));
			
			wphCustomerCustom.setHospitallddate(formats.parse(formats.format(new Date())));
			Integer cardFid = wphCustomerCustom.getWphCardFid();
			WphCard wphCard = mapperCustom.getWphCardById(cardFid);
			if (wphCard != null) {
				wphCard.setCardstatus(1);// 变更卡片状态为已发卡
				mapperCustom.updateCard(wphCard);
				mapperCustom.updateCustomer(wphCustomerCustom);
				mapperCustom.updateCustomerWard(wphCustomerCustom.getFid(),list.get(0).getFid());
				flag = true;
			} else {
				message = "该患者未绑定卡号";
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("message", message);
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	/*****************************************************************************************************/
	/**
	 * 出院
	 */
	@Override
	public String leaveHospital(String userFid, String customerFid, String date) {
		// TODO Auto-generated method stub
		Boolean flag = false;
		// 查询是否能查到患者
		Map<String,Object> map = new HashMap<String,Object>();
		String message = "";
		Date fordate;
		WphCustomerCustom customer = mapperCustom.getCustomerByFid(Integer.parseInt(customerFid));
		int count = mapperCustom.selectCountByUserFid(Integer.parseInt(userFid), customer.getWphWardFid());
		if (count == 0) {
			map.put("flag", flag);
			return JSONObject.fromObject(map).toString();
		}
		try {
			fordate = format.parse(date);
			if (customer != null) {
				if (customer.getWorker() != 1&& customer.getHospitalldstatus() == 1) {
					// 该患者今天 的护理消费
					//WphOrderingCustom orderingCustom= mapperCustom.selectOrderingByCustomer(customer.getFid(), fordate,1);
					WphOrderingnursingCustom orderingByCustomer = mapperCustom.selectOrderingBycusFid(customer.getFid(), fordate);
					if (orderingByCustomer != null) {
						if (1 == orderingByCustomer.getNursingType()) {//一对多
							//根据护理表订单好查询   订单表
							WphOrderingCustom orderingCustom= mapperCustom.selectOrderingByCustomer(orderingByCustomer.getOrderingnumber());
							WphUserCustom user = mapperCustom.getRoleAndUserByUser(Integer.parseInt(userFid));
							String ordingN = "phd_" + randmon(customer.getFid());
							//WphNursinggradeCustom wsc = mapperCustom.selectNursingGradeByCustomerFid(customer.getFid(), fordate);
							// 患者的余额 +护理的钱
							Double m = Double.parseDouble(df.format(customer.getBalance()+ orderingCustom.getMoney()));
							// 修改下余额
							// 保存到消费信息表
							WphOrdering ordering = new WphOrdering();
							ordering.setTitle("一对多护理费用");
							ordering.setDepict("一对多护理退费");
							ordering.setOrderingnumber(ordingN);// 订单编号
							ordering.setOldorderingnumber(orderingCustom.getOrderingnumber());
							ordering.setMoney(orderingCustom.getMoney());// 金额
							ordering.setOrderingstatse(2);// 护理消费状态(0-默认 1-定
															// 2-退)
							ordering.setCustomerFid(customer.getFid());
							ordering.setCustomerCarid(customer
									.getWphCardNumber());// 患者卡号
							ordering.setCustomerHospitalld(customer
									.getHospitalld());// 患者住院号
							ordering.setCustomerBalance(m); // 患者余额
							ordering.setWphInvoicerateFid(1);// 所属发票类别(护理、餐费、其他等)
							ordering.setWphQueryFid(orderingCustom.getWphQueryFid());// 消费类型(护理/用血/餐费/延伸服务)
							// 服务类型(一对一，一对多，办血服务费，特餐，普餐，治疗餐)
							ordering.setWphServicetypeFid(orderingCustom.getWphServicetypeFid());
							// 服务明细(几级护理，办血服务费，办血费用，流餐，半流餐，普餐，回餐，糖餐，肠内)
							ordering.setWphServicedetailsFid(orderingCustom.getWphServicedetailsFid());
							ordering.setOrderingdate(new Date());
							ordering.setPaytype(5);
							ordering.setOrderingnumber(ordingN);// 订单号
							ordering.setUserFid(user.getFid());
							ordering.setUsername(user.getName());
							ordering.setUserrole(user.getRoleName());
							ordering.setCreatedate(new Date());
							ordering.setWphWardFid(customer.getWphWardFid());
							// 保存到护理定消费信息表
							WphOrderingnursingCustom orderingnursing = new WphOrderingnursingCustom();
							orderingnursing.setOrderingnumber(ordingN);// 订单编号
							orderingnursing.setOldOrderingnumber(orderingCustom.getOrderingnumber());// 原订单编号
							orderingnursing.setTitle("一对多护理费用");
							orderingnursing.setDepict("一对多护理退费");
							orderingnursing.setWphWardOmFid(orderingCustom.getCount());
							orderingnursing.setNursingName(orderingByCustomer.getNursingName());
							orderingnursing.setMoney(orderingCustom.getMoney());
							orderingnursing.setNursingdate(fordate);
							orderingnursing.setNursingstates(2);
							// 消费状态(0-默认 1-消费 2-退费// 3-预存)
							orderingnursing.setCustomerFid(customer.getFid());
							orderingnursing.setCustomerHospitalld(customer
									.getHospitalld());
							orderingnursing.setNursingType(1);// 护理类型(0-默认 1-对多
																// 2-对一)
							orderingnursing.setCustomerCardid(customer
									.getWphCardNumber());
							orderingnursing.setUserFid(user.getFid());
							orderingnursing.setUsername(user.getName());
							orderingnursing.setUserrole(user.getRoleName());
							// 修改患者余额
							customer.setBalance(m);
							// 总消费信息表
							mapperCustom.insertOrdering(ordering);
							// 护理消费信息表
							mapperCustom
									.insertWphOrderingnursing(orderingnursing);
							flag = true;
						} else {
							message = "请到护理住院处办理一对一退费";
							map.put("message", message);
						}
					}else {
						flag = true;
					}
				} 
				if (flag) {
					WphCard wphCard = mapperCustom.getWphCardById(customer.getWphCardFid());
					wphCard.setCardstatus(2);//
					mapperCustom.updateCard(wphCard);
					customer.setHospitalldstatus(2);
					mapperCustom.updateCustomer(customer);
				}
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
	/*****************************************************************************************************/
	/** 转病区
	 */
	public String changeWard(String userFid, String customerFid, String date,String wardFid){
		
		Boolean flag = false;
		// 查询是否能查到患者
		Map<String,Object> map = new HashMap<String,Object>();
		String message = "";
		Date fordate;
		WphCustomerCustom customer = mapperCustom.getCustomerByFid(Integer.parseInt(customerFid));
		int count = mapperCustom.selectCountByUserFid(
				Integer.parseInt(userFid), customer.getWphWardFid());
		if (count == 0) {
			map.put("flag", flag);
			return JSONObject.fromObject(map).toString();
		}
		try {
			fordate = format.parse(date);
			if (customer != null) {
				if (customer.getWorker() != 1&& customer.getHospitalldstatus() == 1) {
					// 该患者今天 的护理消费
					WphOrderingnursingCustom orderingByCustomer = mapperCustom.selectOrderingBycusFid(customer.getFid(), fordate);
					if (orderingByCustomer != null) {
						if (1 == orderingByCustomer.getNursingType()) {
							WphOrderingCustom orderingCustom= mapperCustom.selectOrderingByCustomer(orderingByCustomer.getOrderingnumber());
							WphUserCustom user = mapperCustom
									.getRoleAndUserByUser(Integer
											.parseInt(userFid));
							String ordingN = "phd_" + randmon(customer.getFid());
							// 患者的余额 +护理的钱
							Double m = Double.parseDouble(df.format(customer
									.getBalance()
									+ orderingCustom.getMoney()));
							// 修改下余额
							// 保存到消费信息表
							WphOrdering ordering = new WphOrdering();
							ordering.setTitle("一对多护理费用");
							ordering.setDepict("一对多护理退费");
							ordering.setOrderingnumber(ordingN);// 订单编号
							ordering.setOldorderingnumber(orderingCustom.getOrderingnumber());
							ordering.setMoney(orderingCustom.getMoney());// 金额
							ordering.setOrderingstatse(2);// 护理消费状态(0-默认 1-定
															// 2-退)
							ordering.setCustomerFid(customer.getFid());
							ordering.setCustomerCarid(customer
									.getWphCardNumber());// 患者卡号
							ordering.setCustomerHospitalld(customer
									.getHospitalld());// 患者住院号
							ordering.setCustomerBalance(m); // 患者余额
							ordering.setWphInvoicerateFid(1);// 所属发票类别(护理、餐费、其他等)
							ordering.setWphQueryFid(orderingCustom.getWphQueryFid());// 消费类型(护理/用血/餐费/延伸服务)
							// 服务类型(一对一，一对多，办血服务费，特餐，普餐，治疗餐)
							ordering.setWphServicetypeFid(orderingCustom.getWphServicetypeFid());
							// 服务明细(几级护理，办血服务费，办血费用，流餐，半流餐，普餐，回餐，糖餐，肠内)
							ordering.setWphServicedetailsFid(orderingCustom.getWphServicedetailsFid());
							ordering.setOrderingdate(new Date());
							ordering.setPaytype(5);
							ordering.setOrderingnumber(ordingN);// 订单号
							ordering.setUserFid(user.getFid());
							ordering.setUsername(user.getName());
							ordering.setUserrole(user.getRoleName());
							ordering.setCreatedate(new Date());
							ordering.setWphWardFid(customer.getWphWardFid());
							// 保存到护理定消费信息表
							WphOrderingnursingCustom orderingnursing = new WphOrderingnursingCustom();
							orderingnursing.setOrderingnumber(ordingN);// 订单编号
							orderingnursing
									.setOldOrderingnumber(orderingCustom
											.getOrderingnumber());// 原订单编号
							orderingnursing.setTitle("一对多护理费用");
							orderingnursing.setDepict("一对多护理退费");
							orderingnursing.setWphWardOmFid(orderingCustom.getCount());
							orderingnursing.setNursingName(orderingByCustomer.getNursingName());
							orderingnursing.setMoney(orderingCustom.getMoney());
							orderingnursing.setNursingdate(fordate);
							orderingnursing.setNursingstates(2);
							// 消费状态(0-默认 1-消费 2-退费// 3-预存)
							orderingnursing.setCustomerFid(customer.getFid());
							orderingnursing.setCustomerHospitalld(customer
									.getHospitalld());
							orderingnursing.setNursingType(1);// 护理类型(0-默认 1-对多
																// 2-对一)
							orderingnursing.setCustomerCardid(customer.getWphCardNumber());
							orderingnursing.setUserFid(user.getFid());
							orderingnursing.setUsername(user.getName());
							orderingnursing.setUserrole(user.getRoleName());
							// 修改患者余额
							customer.setBalance(m);
							// 总消费信息表
							mapperCustom.insertOrdering(ordering);
							// 护理消费信息表
							mapperCustom.insertWphOrderingnursing(orderingnursing);
							flag = true;
						} else {
							WphWardOmCustom wardOm = mapperCustom.selectWardOmCustomByWM(wardFid,orderingByCustomer.getMoney() , 2);
							if(wardOm!=null){
								WphOneCustom one =new WphOneCustom();
								one.setFid(orderingByCustomer.getWphOneFid());
								one.setWphWardFid(wardOm.getWphWardFid());
								one.setWphNursinggradeFid(wardOm.getWphNursinggradeFid());
								WphOrdering ordering = new WphOrdering();
								ordering.setOrderingnumber(orderingByCustomer.getOrderingnumber());
								ordering.setWphWardFid(wardOm.getWphWardFid());
								WphOrderingnursing orderingnursing = new WphOrderingnursing();
								orderingnursing.setFid(orderingByCustomer.getFid());
								orderingnursing.setNursingName(wardOm.getOmName());
								orderingnursing.setWphWardOmFid(wardOm.getFid());
								mapperCustom.updateByWphOne(one);
								mapperCustom.updateOrdering(ordering);
								mapperCustom.updateOrdringnursing(orderingnursing);
								mapperCustom.updateCustomerWard(customer.getFid(),Integer.parseInt(wardFid));
								//清空床号
								String time =date.substring(date.length()-8,date.length()-3 );
								mapperCustom.updateByOrderingfoodFid(fordate, customer.getFid(), time);
								mapperCustom.updateOrderingByOrderingfood(wardFid,fordate,customer.getFid(), time);
								//修改护工餐及病区
								mapperCustom.updateCustomerWard(orderingByCustomer.getWorkersFid(),Integer.parseInt(wardFid));
								mapperCustom.updateByOrderingfoodFid(fordate, orderingByCustomer.getWorkersFid(), time);
								mapperCustom.updateOrderingByOrderingfood(wardFid,fordate, orderingByCustomer.getWorkersFid(), time);
								//修改ording表 餐类病区
								message = "转病区成功";
								map.put("flag", true);
							}else{
								message = "所转病区护理级别不符合，请退订后再转病区";
								map.put("flag", false);
							}
							return JSONObject.fromObject(map).toString();
						}
					}else {
						flag = true;
					}
				}
				if (flag) {
					String time =date.substring(date.length()-8,date.length()-3 );
					customer.setHospitalldstatus(2);
					mapperCustom.updateByOrderingfoodFid(fordate, customer.getFid(), time);
					mapperCustom.updateOrderingByOrderingfood(wardFid,fordate, customer.getFid(), time);
					mapperCustom.updateCustomer(customer);
					mapperCustom.updateCustomerWard(customer.getFid(),Integer.parseInt(wardFid));

				}
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
		
	}
	
	public String selectWardList(){
		// 查询是否能查到患者
		Map<String,Object> map = new HashMap<String,Object>();
		List<WphWardCustom> list=wardMapperCustom.getWphWardListByStatus();
		map.put("wardList", list);
		map.put("flag", true);
		return JSONObject.fromObject(map).toString();
	}
	
	public String randmon(Integer cusFid) {
		StringBuilder str = new StringBuilder();// 定义变长字符串
		Random random = new Random();
		// 随机生成数字，并添加到字符串
		for (int i = 0; i < 8; i++) {
			str.append(random.nextInt(10)); 
		}
		str.append(cusFid);
		// 将字符串转换为数字并输出
		return str.toString();
	}

}
