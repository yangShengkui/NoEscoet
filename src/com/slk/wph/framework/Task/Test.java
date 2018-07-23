package com.slk.wph.framework.Task;

import com.slk.wph.framework.Cache.MemcachedUtil;
import com.slk.wph.framework.Util.SMSCodeUtil;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.slk.wph.framework.Exception.CustimExceptionResolver;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component 
@Lazy(false)  
@EnableScheduling  
public class Test {

	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;

	public static int randoms=0;

	 private static Logger logger = LogManager.getLogger(CustimExceptionResolver.class);

	
	@Scheduled(cron = "0 50 21 * * ?")
	public void TaskEnd(){
		randoms=(int)((Math.random()*9+1)*10000);
		MemcachedUtil.put("automatic", randoms);
	}


	@Scheduled(cron = "0 30 22 * * ?")
	@Transactional
	public void SugarMealIng()  {
		if(Test.getRandoms()==(int)MemcachedUtil.get("automatic")){
			String message = "";
			List<WphOrdering> orderingList = orderingMapperCustom.selectThreeOrding();
			for (WphOrdering order : orderingList)
				message += " 昨:"+order.getWphQueryFid()+" 今:"+order.getWphServicetypeFid()+" 明:"+order.getWphServicedetailsFid()+",";
			SMSCodeUtil.sendSms("17695705927",message);
		}

	}

	public static int getRandoms() {
		return randoms;
	}

	public static void setRandoms(int randoms) {
		Test.randoms = randoms;
	}
}
