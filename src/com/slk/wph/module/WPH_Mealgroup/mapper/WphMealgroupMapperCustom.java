package com.slk.wph.module.WPH_Mealgroup.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Mealgroup.po.WphMealGroupSpread;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroupCustom;

public interface WphMealgroupMapperCustom {
	/**
	 * 描述：获取组别集合
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月11日-上午11:20:02
	 */
	public List<WphMealgroupCustom> getGroupList();
	/**
	 * 描述：获取组别与餐品数量的集合
	 *
	 * @param timeFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月11日-上午11:20:10
	 */
	public List<WphMealGroupSpread> getGroupMealByGroup(WphMealgroupCustom group);

	/**
	 * 分组合计
	 */
	public List<WphMealGroupSpread> getGroupMealByGroupCollect(WphMealgroupCustom group);
}