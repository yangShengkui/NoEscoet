package com.slk.wph.module.WPH_Mealcleaning.service;

import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaning;

 public interface WPH_MealcleaningService {
	/**
	 * 描述：验证卡是否存在（10：读卡器，6：人工）
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月14日-上午11:46:08
	 */
	 public WphCardCustom getredingByCard(String cardStr);
	 /**
	  * 描述：修改或添加保洁餐数据
	  *
	  * @param cleaning
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年8月14日-下午5:19:47
	  */
	 public Integer setMealCleanByInfo(WphMealcleaning cleaning);
}