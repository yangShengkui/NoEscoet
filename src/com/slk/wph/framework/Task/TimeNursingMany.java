package com.slk.wph.framework.Task;
import java.text.DecimalFormat;
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
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;
import com.slk.wph.module.Wph_Servicedetails.mapper.WphServicedetailsMapperCustom;

@Component("timeNursingMany")
@Lazy(false)  
@EnableScheduling  
public class TimeNursingMany {
	private static Logger logger = LogManager.getLogger(CustimExceptionResolver.class);
	@Autowired
	private WphOrderingnursingMapperCustom wonm;
	@Autowired
	private WphServicedetailsMapperCustom detailsMapper;

	DecimalFormat df = new java.text.DecimalFormat("#0.00");

	
	@Scheduled(cron = "0 05 22 * * ?")
	public void timeNursing() throws Exception {

		if(Test.getRandoms()==(int)MemcachedUtil.get("automatic")){
			logger.error("------timeNursingMany-------------------------------start+++");

		//获取今日订护理 ，明天没订护理的  护理信息
		List<WphOrderingnursingCustom> list = wonm._selectCustomerAllNursing(1);
			logger.error("------timeNursingMany------list-------------------------+++"+list.size());
		if(list.size()!=0){
			wonm._updateCustomer(list);
			wonm._insertWphOrderingnursing(list);//
			wonm._insertOrdering(list);
		}
			logger.error("----TaskEnd-----");
		}
	}
	
	

}
