package com.slk.wph.module.WPH_Summary_Equipment.service;

import java.util.List;
import com.slk.wph.module.WPH_Summary_Equipment.po.WphSummaryEquipmentCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

 public interface WPH_SummaryEquipmentService {
        
	 
	   public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
		/**
		 *  
		 *描述:按类型查询开启状态的数据
		 *@param type
		 *@return
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public List<WphSummaryEquipmentCustom> selectSummaryEquipmentState();
		/**
		 * 
		 *描述:查询全部数据
		 *@return
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public List<WphSummaryEquipmentCustom> selectSummaryEquipmentAll();
		/**
		 * 
		 *描述:新增
		 *@param summaryEquipmentCustom
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public void insertSummaryEquipment(WphSummaryEquipmentCustom summaryEquipmentCustom);
		
		/**
		 * 
		 *描述:修改
		 *@param summaryEquipmentCustom
		 *@return
		 *创建人:赵福岭
		 *2017年9月25日
		 */
		public int updateSummaryEquipment(WphSummaryEquipmentCustom summaryEquipmentCustom);
		
		
		public List<WphWardCustom> getWphWardListByStatus();
}