package com.slk.wph.framework.Task;

import java.text.ParseException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.slk.wph.framework.Cache.MemcachedUtil;
import com.slk.wph.framework.Exception.CustimExceptionResolver;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;

@Component("SugarMeal")
@Lazy(false)  
@EnableScheduling  
public class SugarMeal {

	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;
	
	private static Logger logger = LogManager.getLogger(CustimExceptionResolver.class);
	
	/**
	 * 描述：自动定糖餐
	 *
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月4日-上午11:36:18
	 * @throws ParseException 
	 */
	@Scheduled(cron = "0 25 22 * * ?")
	@Transactional
	public void SugarMealIng()  {
		if(Test.getRandoms()==(int)MemcachedUtil.get("automatic")){
			logger.error("------SugarMealIng-------------------------------start+++");
			List<WphOrderingCustom> sugarMeal = orderingMapperCustom.getSugarMealList();
			logger.error("------------SugarMealIng-------------foodList---------------------"+sugarMeal.size());
			if(sugarMeal.size()!=0){
				orderingMapperCustom.insertSugarMealOrderList(sugarMeal);
				orderingMapperCustom.insertSugarMealFoodList(sugarMeal);
				orderingMapperCustom.updateSugarCustomerList(sugarMeal);
			}
		}
		logger.error("---------------------SugarMealIng------------------------end");
	}
}
