package com.slk.wph.module.WPH_Summary_Navigation.service;

import java.util.List;

import com.slk.wph.module.WPH_Summary_Navigation.po.WphSummaryNavigationCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

 public interface WPH_SummaryNavigationService {
	 public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
	 /**
		 * 
		 *描述:查询开启状态的数据
		 *@return
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public List<WphSummaryNavigationCustom> selectSummaryNavigationState();
		/**
		 * 
		 *描述:查询全部数据
		 *@return
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public List<WphSummaryNavigationCustom> selectSummaryNavigationAll();
		/**
		 * 
		 *描述:新增数据
		 *@param summaryNavigationCustom
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public void insertSummaryNavigation(WphSummaryNavigationCustom summaryNavigationCustom);
		/**
		 * 
		 *描述:修改数据
		 *@param summaryNavigationCustom
		 *@return
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public int updateSummaryNavigation(WphSummaryNavigationCustom summaryNavigationCustom);
		
		
		public List<WphWardCustom> getWphWardListByStatus();
		
}