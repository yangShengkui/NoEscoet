package com.slk.wph.module.WPH_Cost.service;

import java.util.List;

import com.slk.wph.module.WPH_Cost.po.WphCostCustom;

 public interface WPH_CostService {
	 /**
	  * 
	  *描述:查询所有费用
	  *@return
	  *创建人:赵福岭
	  *2017年8月2日
	  */
	 public List<WphCostCustom> selectAllCost();
	 /**
	  * 
	  *描述:修改费用
	  *@param custom
	  *@return
	  *创建人:赵福岭
	  *2017年8月2日
	  */
	 public int updateCost(WphCostCustom custom);
}