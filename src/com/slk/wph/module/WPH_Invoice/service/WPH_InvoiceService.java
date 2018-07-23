package com.slk.wph.module.WPH_Invoice.service;

import java.util.Date;
import java.util.List;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Invoice.po.WphInvoiceCustom;
import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

 public interface WPH_InvoiceService {
	 
	 /**
	  * 
	  *描述:根据住院号查询患者信息及消费信息
	  *@param hospitalld
	  *@return
	  *创建人:赵福岭
	  *2017年8月10日
	  */
	 public WphCustomerCustom getWphInvoiceManger(String hospitalld);
	 
	 /**
	  * 
	  *描述:通过fid查找税率
	  *@return
	  *创建人:赵福岭
	  *2017年8月10日
	  */
	 public WphInvoicerateCustom getInvoicerateByFid(Integer fid);
	 /**
	  * 
	  *描述:插入
	  *@param custom
	  *@return
	  *创建人:赵福岭
	  *2017年8月10日
	  */
	 public int insertWphInvoice(WphInvoiceCustom custom);
	 /**
	  * 
	  *描述:通过fid查询患者
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年8月11日
	  */
	 public WphCustomerCustom getCustomerByFid(Integer fid);
	 
	 public WphUserCustom getRoleAndUserByUser(Integer fid);
	 
	 /**
	  * 
	  *描述:根据住院好查询患者办理税费信息
	  *@param hospitalld
	  *@return
	  *创建人:赵福岭
	  *2017年8月11日
	  */
	 public List<WphInvoiceCustom> selectWphInvoiceByHospitalld(String hospitalld);
	 
	/**
	* 
	*描述:根据日期，病区，开票名称查询开票信息
	*@param date
	*@param wardFid
	*@param name
	*@return
	*创建人:赵福岭
	*2017年8月16日
	*/
	public List<WphInvoiceCustom> selectInvoice(Date startDate,Date endDate,Integer wardFid,String name);
	
	/**
	 * 
	 *描述:查询开启状态中的病区
	 *@return
	 *创建人:赵福岭
	 *2017年8月16日
	 */
	public  List<WphWardCustom> getWphWardListByStatus();
	
	/**
	 * 
	 *描述:查询税率信息
	 *@return
	 *创建人:赵福岭
	 *2017年8月16日
	 */
	public List<WphInvoicerateCustom> selectInvoicerate();
	
}