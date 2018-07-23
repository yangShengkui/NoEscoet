package com.slk.wph.framework.Task;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.slk.wph.framework.Cache.MemcachedUtil;
import com.slk.wph.framework.Exception.CustimExceptionResolver;
import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Cost.mapper.WphCostMapper;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapper;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;

@Component("RetreatCard_RetreatFee")
@Lazy(false)  
@EnableScheduling  
public class RetreatCard_RetreatFee {

	@Autowired
	private WphCustomerMapperCustom customerMapperCustom;
	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;
	@Autowired
	private WphOrderingMapper orderingMapper;
	@Autowired
	private WphCostMapper costMapper;
	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	
	private static Logger logger = LogManager.getLogger(CustimExceptionResolver.class);

	/**
	 * 描述：自动进行超期扣除-退卡退费
	 *
	 * @throws Exception
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午2:22:26
	 */
	@Scheduled(cron = "0 0 22 * * ?")
	public void RetreatCardFee()   {
		logger.error("------RetreatCardFee-------------------------------randoms+++"+Test.getRandoms());
		logger.error("------MemcachedUtil--------------------------------randoms+++"+MemcachedUtil.get("automatic"));



		if(Test.getRandoms()==(int)MemcachedUtil.get("automatic")){
			logger.error("------RetreatCardFee-------------------------------start+++");
			try {
				List<WphCustomerCustom> customerList = customerMapperCustom.getRetreatCardCustomerList();
				logger.error("------RetreatCardFee-------------------------------customerList+++"+customerList.size());
				for(WphCustomerCustom customer : customerList){
					Double balance = customerMapperCustom.getCustomerByInfo(customer).getBalance();
					logger.error("------balance-------------------------------balance+++"+balance);
					 //获取开卡押金原订单号
					 WphOrdering order = new WphOrdering();
					 order.setTitle("开卡押金");
					 order.setCustomerHospitalld(customer.getHospitalld());
					 WphOrdering deposit = orderingMapperCustom.getOrderingByInfo(order);
					//进行退卡押金
					WphOrdering ordering = new WphOrdering();
					 ordering.setTitle("退卡押金");
					 ordering.setDepict("退卡押金");
					 ordering.setMoney(deposit.getMoney());
					 ordering.setOrderingstatse(2);
					 ordering.setCustomerFid(customer.getFid());
					 ordering.setCustomerCarid(customer.getWphCardNumber());
					 ordering.setCustomerHospitalld(customer.getHospitalld());
					 ordering.setCustomerBalance(Double.valueOf(new DecimalFormat("#.00").format(balance+ordering.getMoney())));
					 ordering.setOrderingdate(new Date());
					 ordering.setPaytype(5);
					 ordering.setOrderingnumber("tcyj_"+(int) ((Math.random() * 9 + 1) * 10000000));
					 ordering.setOldorderingnumber(deposit.getOrderingnumber());
					 ordering.setUsername("超期自动扣除");
					 ordering.setWphWardFid(customer.getWphWardFid());
					 orderingMapper.insertSelective(ordering);
					//出院结算--继上次insert共同参数不用重复定义
					//直接从退卡押金消费信息中获取卡内余额，无需再修改customer患者余额
					 ordering.setTitle("超期自动出院结算");
					 ordering.setDepict("超期自动出院结算，并扣除患者余额");
					 ordering.setMoney(ordering.getCustomerBalance());
					 ordering.setOrderingstatse(4);
					 ordering.setWphQueryFid(6);
					 ordering.setWphServicetypeFid(17);
					 ordering.setWphServicedetailsFid(51);
					 ordering.setOrderingdate(new Date());
					 ordering.setOrderingnumber("cyjs_"+(int) ((Math.random() * 9 + 1) * 10000000));
					 ordering.setOldorderingnumber("");
					 ordering.setCustomerBalance(0.0);
					 orderingMapper.insertSelective(ordering);
					//将卡号复位，默认0
					WphCard card = new WphCard();
					card.setFid(customer.getWphCardFid());
					card.setCardstatus(0);
					cardMapperCustom.updateCard(card);
					//清空患者卡信息，余额
					customerMapperCustom.getEmptyCustomerByFid(customer.getFid());
				}
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.error("------RetreatCardFee---------Yes----------------------end+++");
		}
		logger.error("------RetreatCardFee------------NO-------------------end");
	}
}
