package com.slk.wph.webservice.OneManyNursing;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_Onursing.po.WphOnursing;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;

@WebService
@SOAPBinding(style = Style.RPC)
public class OneManyNursingWSImpl implements OneManyNursingWS {

	DecimalFormat df = new java.text.DecimalFormat("#0.00");
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	@Autowired
	private WphOrderingnursingMapperCustom mapperCustom;
	public Date fordate(String date){
		Date newdate=null;
		try {
			newdate=format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newdate;
	} 
	// 查询用户权限 与 患者是否在同一病区，且是否已办理住院
	public String checkCustomer(String userFid, String cardId, String hospitalld) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		WphCustomerCustom wphCustomerCustom = mapperCustom
				.selectByCardIdOrHospita(cardId, hospitalld);
		if (wphCustomerCustom != null) {
			map.put("wphCustomerCustom", wphCustomerCustom);
			if (mapperCustom.selectCountByUserFid(Integer.parseInt(userFid),
					wphCustomerCustom.getWphWardFid()) > 0
					&& wphCustomerCustom.getHospitalldstatus() == 1) {
				flag = true;
			}
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	// 查询护理等级
	@WebMethod
	public String selectNursingGrade(String userFid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		List<WphNursinggradeCustom> list = mapperCustom
				.selectNursingGradeByUserFid(Integer.parseInt(userFid), 1);
		if (list.size() > 0) {
			flag = true;
			map.put("wphNursinggradeList", list);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	// 查询未办理护理的患者
	@WebMethod
	public String selectCustomerNotNursing(String date, String userFid) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		/*Date nurDate = null;*/
		/*try {
			System.out.println("---com.slk.wph.webservice.OneManyNursing.OneManyNursingWSImpl--手机传入日期格式1---"+date);


		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("---com.slk.wph.webservice.OneManyNursing.OneManyNursingWSImpl--手机传入日期格式2---"+date);
			try {
				nurDate=new Date();
				System.out.println("new date----------------------------------------------------------------------"+nurDate);
			} catch (Exception ex){

				System.out.println("---com.slk.wph.webservice.OneManyNursing.OneManyNursingWSImpl--日期格式错误--format.parse(format.format( new Date()))");
			}
		}*/
		List<WphCustomerCustom> customerList = mapperCustom.selectNotNursing(Integer.parseInt(userFid), date);
		if (customerList.size() > 0) {
			flag = true;
			map.put("customerList", customerList);
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	// 订护理 一对多
	@WebMethod
	public String reserveNursing(String json) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		StringBuffer sb = new StringBuffer("");
		try {
			WphOnursing unur = (WphOnursing) JSONObject.toBean(
					JSONObject.fromObject(json), WphOnursing.class);
			// 获取登录用户信息
			WphUserCustom user = mapperCustom.getRoleAndUserByUser(unur
					.getUserFid());
			Integer[] customFid = unur.getCustomerFid();
			// 保存每个患者的定制信息
			for (int i = 0, x = customFid.length; i < x; i++) {
				// phd_+10位随机数
				String ordingN = "phd_" + randmon(customFid[i]);
				// 获取患者
				WphCustomerCustom customer = mapperCustom.getCustomerByFid(customFid[i]);
				if (customer.getHospitalldstatus() != 1) {
					map.put("message", customer.getName() + "该患者未办理住院");
					map.put("flag", false);
					return JSONObject.fromObject(map).toString();
				}
				if (i == 0) {
					if (mapperCustom.selectNursinggradeByCusFidAndDate(customer.getFid(),fordate(unur.getDate())) > 0) {
						map.put("message", customer.getName() + "该患者已订护理");
						map.put("flag", false);
						return JSONObject.fromObject(map).toString();
					}
				}
				WphNursinggradeCustom wngc = mapperCustom.selectNursingGradeByFid(unur.getWphNursinggradeFid(),customer.getWphWardFid(), 1);
				// 患者的余额 - 护理的钱
				Double m = Double.parseDouble(df.format(customer.getBalance()- wngc.getNursingMoney()));
				if (m < 0) {
					sb.append(customer.getName());
					sb.append(",");
				} else {
					// 修改下余额
					customer.setBalance(m);
					mapperCustom.updateCustomer(customer);
					// 保存到消费信息表
					WphOrdering ordering = new WphOrdering();
					ordering.setTitle("一对多护理费用");
					ordering.setDepict("一对多护理费用扣除");
					ordering.setMoney(wngc.getNursingMoney());
					ordering.setOrderingstatse(1);
					ordering.setCustomerFid(customer.getFid());
					ordering.setCustomerCarid(customer.getWphCardNumber());
					ordering.setCustomerHospitalld(customer.getHospitalld());
					ordering.setCustomerBalance(m);
					ordering.setWphInvoicerateFid(4);// 所属发票类别(护理、餐费、其他等)
					ordering.setWphQueryFid(wngc.getQueryFid());// 消费类型(护理/用血/餐费/延伸服务)
					// 服务类型(一对一，一对多，办血服务费，特餐，普餐，治疗餐)
					ordering.setWphServicetypeFid(wngc.getServiceTypeFid());
					// 服务明细(几级护理，办血服务费，办血费用，流餐，半流餐，普餐，回餐，糖餐，肠内)
					ordering.setWphServicedetailsFid(wngc
							.getSerivceDetailsFid());
					ordering.setOrderingdate(fordate(unur.getDate()+" 00:00:00"));
					ordering.setPaytype(5);
					ordering.setOrderingnumber(ordingN);
					ordering.setUserFid(user.getFid());
					ordering.setUsername(user.getName());
					ordering.setUserrole(user.getRoleName());
					ordering.setCreatedate(new Date());
					ordering.setNotes(unur.getNotes());
					ordering.setWphWardFid(customer.getWphWardFid());
					// 保存消费信息
					mapperCustom.insertOrdering(ordering);

					// 保存到护理定消费信息表
					WphOrderingnursingCustom orderingnursing = new WphOrderingnursingCustom();
					orderingnursing.setOrderingnumber(ordingN);// 订单编号
					orderingnursing.setTitle("一对多护理费用");
					orderingnursing.setDepict("一对多护理费用扣除");
					orderingnursing.setWphWardOmFid(wngc.getWarOmFid());//
					orderingnursing.setNursingName(wngc.getName());
					orderingnursing.setMoney(wngc.getNursingMoney());
					orderingnursing.setNursingdate(fordate(unur.getDate()));
					orderingnursing.setNursingstates(1);
					orderingnursing.setCustomerFid(customer.getFid());
					orderingnursing.setCustomerHospitalld(customer
							.getHospitalld());
					orderingnursing.setNursingType(1);
					orderingnursing.setCustomerCardid(customer
							.getWphCardNumber());
					orderingnursing.setNotes(unur.getNotes());
					orderingnursing.setUserFid(user.getFid());
					orderingnursing.setUsername(user.getName());
					orderingnursing.setUserrole(user.getRoleName());
					mapperCustom.insertWphOrderingnursing(orderingnursing);
				}
			}
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		if (sb.length() != 0) {
			map.put("message", sb.toString() + "余额不足");
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	/**
	 * 
	 * 描述:查询已经定制一对多的患者
	 * 
	 * @return 创建人:赵福岭 2017年7月6日
	 */
	@WebMethod
	public String selectCustomerAlreadyNursing(String json) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		try {
			WphOnursing unur = (WphOnursing) JSONObject.toBean(
					JSONObject.fromObject(json), WphOnursing.class);
			List<WphCustomerCustom> list = mapperCustom.selectCustomerNursing(
					unur.getUserFid(), fordate(unur.getDate()), 1);
			map.put("list", list);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	/**
	 * 用于退订时查询 患者的信息 退订 ：卡退订和多人退订 修改 通过日期，卡号或者住院号查询患者信息和护理定制信息
	 */
	@Override
	public String selectCustomerNursing(String json) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		StringBuffer sb = new StringBuffer("");
		StringBuffer sbs = new StringBuffer("");
		WphOnursing unur = (WphOnursing) JSONObject.toBean(
				JSONObject.fromObject(json), WphOnursing.class);
		try {
			WphNursinggradeCustom wngcXg = null;

			// 获取登录用户信息
			WphUserCustom user = mapperCustom.getRoleAndUserByUser(unur
					.getUserFid());
			Integer[] customFid = unur.getCustomerFid();

			// 修改---考虑用户余额不租
			// 所有已订一堆多陪护的患者
			for (int i = 0, x = customFid.length; i < x; i++) {
				String ordingN = "phd_" + randmon(customFid[i]);
				// 获取患者
				WphCustomerCustom customer = mapperCustom.getCustomerByFid(customFid[i]);
				if (unur.getWphNursinggradeFid() != null) {
					wngcXg = mapperCustom.selectNursingGradeByFid(unur.getWphNursinggradeFid(),customer.getWphWardFid(), 1);
				}
				if(customer.getWorker()==1){
					map.put("flag", flag);
					return JSONObject.fromObject(map).toString();
				}
				WphOrderingnursingCustom orderingByCustomer = mapperCustom.selectOrderingByCustomerFid(customer.getFid(),fordate(unur.getDate()),1);
				// 该患者今天 的护理消费
				if(orderingByCustomer==null){
					map.put("flag", flag);
					return JSONObject.fromObject(map).toString();
				}
				WphOrderingCustom orderingCustom= mapperCustom.selectOrderingByCustomer(orderingByCustomer.getOrderingnumber());
				if (orderingCustom == null) {
					map.put("flag", flag);
					return JSONObject.fromObject(map).toString();
				}
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
				ordering.setOrderingstatse(2);// 护理消费状态(0-默认 1-定 2-退)
				ordering.setCustomerFid(customer.getFid());
				ordering.setCustomerCarid(customer.getWphCardNumber());// 患者卡号
				ordering.setCustomerHospitalld(customer.getHospitalld());// 患者住院号
				ordering.setCustomerBalance(m); // 患者余额
				ordering.setWphInvoicerateFid(4);// 所属发票类别(护理、餐费、其他等)
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
				ordering.setNotes(unur.getNotes());
				ordering.setWphWardFid(customer.getWphWardFid());

				// 保存到护理定消费信息表
				WphOrderingnursingCustom orderingnursing = new WphOrderingnursingCustom();
				orderingnursing.setOrderingnumber(ordingN);// 订单编号
				orderingnursing.setOldOrderingnumber(orderingCustom
						.getOrderingnumber());// 原订单编号
				orderingnursing.setTitle("一对多护理费用");
				orderingnursing.setDepict("一对多护理退费");
				orderingnursing.setWphWardOmFid(orderingCustom.getCount());
				orderingnursing.setNursingName(orderingByCustomer.getNursingName());
				orderingnursing.setMoney(orderingCustom.getMoney());
				orderingnursing.setNursingdate(fordate(unur.getDate()));
				orderingnursing.setNursingstates(2);// 消费状态(0-默认 1-消费 2-退费 3-预存)
				orderingnursing.setCustomerFid(customer.getFid());
				orderingnursing.setCustomerHospitalld(customer.getHospitalld());
				orderingnursing.setNursingType(1);// 护理类型(0-默认 1-对多 2-对一)
				orderingnursing.setCustomerCardid(customer.getWphCardNumber());
				orderingnursing.setNotes(unur.getNotes());
				orderingnursing.setUserFid(user.getFid());
				orderingnursing.setUsername(user.getName());
				orderingnursing.setUserrole(user.getRoleName());
				// 如果护理等级不为空，则为修改
				if (unur.getWphNursinggradeFid() != null) {

					String ordingND = "phd_" + randmon(customFid[i]);
					// 获取护理关联表 根据护理等级和病区
					WphWardOmCustom wardOm = mapperCustom.selectWardOmCustom(
							customer.getWphWardFid(),
							unur.getWphNursinggradeFid(), 1);
					// 判断第一位患者(刷卡的)是否已办护理
					// 患者的余额 - 护理的钱
					Double md = Double.parseDouble(df.format(customer
							.getBalance()
							- wardOm.getMoney()+ orderingCustom.getMoney()));
					// 保存到消费信息表
					WphOrdering orderingd = new WphOrdering();
					orderingd.setTitle("一对多护理费用");
					orderingd.setDepict("一对多护理费用扣除");
					orderingd.setMoney(wardOm.getMoney());
					orderingd.setOrderingstatse(1);
					orderingd.setCustomerFid(customer.getFid());
					orderingd.setCustomerCarid(customer.getWphCardNumber());
					orderingd.setCustomerHospitalld(customer.getHospitalld());
					orderingd.setCustomerBalance(md);
					orderingd.setWphInvoicerateFid(4);// 所属发票类别(护理、餐费、其他等)
					orderingd.setWphQueryFid(wngcXg.getQueryFid());// 消费类型(护理/用血/餐费/延伸服务)
					// 服务类型(一对一，一对多，办血服务费，特餐，普餐，治疗餐)
					orderingd.setWphServicetypeFid(wngcXg.getServiceTypeFid());
					// 服务明细(几级护理，办血服务费，办血费用，流餐，半流餐，普餐，回餐，糖餐，肠内)
					orderingd.setWphServicedetailsFid(wngcXg.getSerivceDetailsFid());
					orderingd.setOrderingdate(new Date());
					orderingd.setPaytype(5);
					orderingd.setOrderingnumber(ordingND);
					orderingd.setUserFid(user.getFid());
					orderingd.setUsername(user.getName());
					orderingd.setUserrole(user.getRoleName());
					orderingd.setCreatedate(new Date());
					orderingd.setNotes(unur.getNotes());
					orderingd.setWphWardFid(customer.getWphWardFid());

					// 保存到护理定消费信息表
					WphOrderingnursingCustom orderingnursingd = new WphOrderingnursingCustom();
					orderingnursingd.setOrderingnumber(ordingND);// 订单编号
					orderingnursingd.setTitle("一对多护理费用");
					orderingnursingd.setDepict("一对多护理费用扣除");
					orderingnursingd.setWphWardOmFid(wardOm.getFid());
					orderingnursingd.setNursingName(wngcXg.getName());
					orderingnursingd.setMoney(wardOm.getMoney());
					orderingnursingd.setNursingdate(fordate(unur.getDate()));
					orderingnursingd.setNursingstates(1);
					orderingnursingd.setCustomerFid(customer.getFid());
					orderingnursingd.setCustomerHospitalld(customer
							.getHospitalld());
					orderingnursingd.setNursingType(1);
					orderingnursingd.setCustomerCardid(customer
							.getWphCardNumber());
					orderingnursingd.setNotes(unur.getNotes());
					orderingnursingd.setUserFid(user.getFid());
					orderingnursingd.setUsername(user.getName());
					orderingnursingd.setUserrole(user.getRoleName());
					if (md < 0) {
						sbs.append(customer.getName());
						sbs.append(",");
						continue;
					}
					mapperCustom.insertOrdering(ordering);// 退订
					mapperCustom.insertWphOrderingnursing(orderingnursing);// 退订
					customer.setBalance(md);
					mapperCustom.updateCustomer(customer);
					mapperCustom.insertOrdering(orderingd);
					mapperCustom.insertWphOrderingnursing(orderingnursingd);
				} else {
					mapperCustom.insertOrdering(ordering);
					mapperCustom.insertWphOrderingnursing(orderingnursing);
					customer.setBalance(m);
					mapperCustom.updateCustomer(customer);
				}
			}
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (unur.getWphNursinggradeFid() != null) {
			if (sbs.length() != 0) {
				map.put("message", sb.toString() + "余额不足");
				flag = false;
			}
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}

	/**
	 * 刷卡查询患者是否已经办理一对多护理，如果已 办理显示患者信息及患者护理等级 日期
	 */
	public String selectCustomerNursingGrade(String userFid, String cardId,
			String hospitalld, String date) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		try {
			Date dates = format.parse(date);
			WphCustomerCustom wphCustomerCustom = mapperCustom
					.selectByCardIdOrHospita(cardId, hospitalld);
			if (wphCustomerCustom != null) {
				if (mapperCustom.selectCountByUserFid(
						Integer.parseInt(userFid),
						wphCustomerCustom.getWphWardFid()) > 0
						&& wphCustomerCustom.getHospitalldstatus() == 1) {
					WphCustomerCustom customer = mapperCustom
							.selectCustomerNursingGrade(cardId, hospitalld,
									dates);
					if (customer != null) {
						flag = true;
						map.put("customer", customer);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("flag", flag);
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

	@Override
	public String summaryNursing(String json) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean flag = false;
		try {
			WphOnursing unur = (WphOnursing) JSONObject.toBean(
					JSONObject.fromObject(json), WphOnursing.class);
			WphUserCustom user = mapperCustom.getRoleAndUserByUser(unur.getUserFid());
			String roles = user.getRoleFid();
			String role[] = roles.split(",");
			for (int i = 0; i < role.length; i++) {
				if ("34".equals(role[i])) {
					unur.setWphNursinggradeFid(6);
				}
			}
			// 查询已订
			List<WphCustomerCustom> list = null;
			if (unur.getFlag() == 1) {
				list = mapperCustom.selectSummaryNursing(unur.getUserFid(),
						fordate(unur.getDate()), unur.getWphNursinggradeFid());
			} else {
				// 查询未订
				try{
					list = mapperCustom.selectNotNursing(unur.getUserFid(),format.format(fordate(unur.getDate())));
				}catch (Exception ee){
					System.out.println("查询汇总时间格式转换错误");
				}

			}
			map.put("list", list);
			flag = true;
		} catch (Exception e) {
               e.printStackTrace();
		}
		map.put("flag", flag);
		return JSONObject.fromObject(map).toString();
	}
}
