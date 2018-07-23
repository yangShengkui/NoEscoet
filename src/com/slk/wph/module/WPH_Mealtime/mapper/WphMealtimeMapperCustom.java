package com.slk.wph.module.WPH_Mealtime.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Mealtime.po.WphMealtimeCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;


public interface WphMealtimeMapperCustom {
	/**
	 * 描述：APP获取就餐时间集合以及菜品集合中的订单信息详情
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月8日-下午2:55:08
	 */
	public List<WphMealtimeCustom> getMealOrderFoodByinfo(WphOrderingfood food);
}