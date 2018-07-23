package com.slk.wph.module.WPH_Mealtype.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;

public interface WphMealtypeMapperCustom {
	/**
	 * 描述：添加类别
	 *
	 * @param mealtype
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午4:46:15
	 */
	public Integer InsertMealTypeByInfo(WphMealtype mealtype);
	/**
	 * 描述：获取大于输入fid的fid的数据
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午4:49:27
	 */
	public List<WphMealtype> getMealTypeByGreaterThanFid(Integer fid);
	/**
	 * 描述：获取餐类型以及餐品（特餐除外）
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午4:22:18
	 */
	public List<WphMealtypeCustom> getMealTypeAndMenu();
	/**
	 * 描述：获取餐类型以及餐品（所有）
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月27日-下午4:22:18
	 */
	public List<WphMealtypeCustom> getMealTypeAndMenuAll();
}