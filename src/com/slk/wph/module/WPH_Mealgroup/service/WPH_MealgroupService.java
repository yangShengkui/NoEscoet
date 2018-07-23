package com.slk.wph.module.WPH_Mealgroup.service;

import java.util.List;

import com.slk.wph.module.WPH_Mealgroup.po.WphMealGroupSpread;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroup;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroupCustom;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetime;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;

 public interface WPH_MealgroupService {
	 /**
	  * 描述：获取组别集合
	  *
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年8月9日-上午9:15:03
	  */
	 public List<WphMealgroupCustom> getGroupList();
	 /**
	  * 描述：修改组别，根据fid
	  *
	  * @param mealgroup
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年8月9日-上午9:39:14
	  */
	 public Integer UpdateGroupByFid(WphMealgroup mealgroup);
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
	  * 描述：分组合计
	  *
	  * @param timeFid
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年8月11日-上午11:20:10
	  */
	 public List<WphMealGroupSpread> getGroupMealByGroupCollect(WphMealgroupCustom group);
	/**
	 * 描述：获取时间管理集合
	 *
	 * @param fids
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月30日-下午4:31:05
	 */
	public List<WphUnsubscribetimeCustom> getTimeByFids(List<Integer> fids);
}