package com.slk.wph.framework.Task;

import java.text.DecimalFormat;
import java.util.ArrayList;
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
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;

@Component("timeNursingOne")
@Lazy(false)
@EnableScheduling
public class TimeNursingOne {
	private static Logger logger = LogManager
			.getLogger(CustimExceptionResolver.class);


	@Autowired
	private WphOrderingnursingMapperCustom wonm;

	DecimalFormat df = new java.text.DecimalFormat("#0.00");

	@Scheduled(cron = "0 15 22 ? * *")
	public void timeNursing() throws Exception {

		if (Test.getRandoms()==(int)MemcachedUtil.get("automatic")) {
			logger.error("------timeNursingOne-------------------------------start+++");
			List<WphOrderingnursingCustom> list = wonm._selectCustomerAllNursing(2);
			// 退订
			List<WphOrderingnursingCustom> tList =  new ArrayList<WphOrderingnursingCustom>();
			// 订护理
			List<WphOrderingnursingCustom> dList = new ArrayList<WphOrderingnursingCustom>();

			logger.error("------timeNursingOne-----------------dList--------------"+dList.size());
			for (int i = 0, x = list.size(); i < x; i++) {
				Double m = Double.parseDouble(df.format(list.get(i).getNewBalance()));
				int j = new Date().compareTo(list.get(i).getOendDate());
				if (m < 0 || j >= 0) {
					tList.add(list.get(i));
				} else {
					dList.add(list.get(i));
				}
			}
			if (tList.size() != 0) {
				wonm._updateByWphOne(tList);
				wonm._tinsertWphOrderingnursing(tList);
				wonm._tinsertOrdering(tList);
				//批量退订修改护工状态
				wonm._updateWorkStatus(tList);
			}
			if (dList.size() != 0) {
				wonm._updateCustomer(dList);
				wonm._insertoWphOrderingnursing(dList);
				wonm._insertoOrdering(dList);

			}
			logger.error("----TaskEnd-----");
		}

	}

}
