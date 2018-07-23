package com.slk.wph.module.WPH_Cost.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Cost.po.WphCostCustom;

public interface WphCostCustomMapper {
	
	public List<WphCostCustom> selectAllCost();
	
	public int updateCost(WphCostCustom custom);
	/**
	 * 
	 * @Title:             PayCheck
	 * @param:             @return   
	 * @return:         int   
	 * @throws
	 * 作者: 		隋乔镇
	 * 描述：		 支付宝是否超额(0不能使用支付宝支付，1可以支付)
	 * @date: 2017年9月8日 下午2:31:29
	 */
	public int PayCheck();
}
