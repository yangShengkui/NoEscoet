package com.slk.wph.module.WPH_Invoicerate.service;

import java.util.List;

import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;

 public interface WPH_InvoicerateService {
	 
	 /**
	  * 
	  *描述:查询税率
	  *@return
	  *创建人:赵福岭
	  *2017年8月8日
	  */
	 public List<WphInvoicerateCustom> selectInvoicerate();
	 /**
	  * 
	  *描述:修改税率
	  *@param custom
	  *@return
	  *创建人:赵福岭
	  *2017年8月8日
	  */
	 public int updateWphInvoicerate(WphInvoicerateCustom custom);
}