package com.slk.wph.module.WPH_Invoice.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Invoice.po.WphInvoiceCustom;

public interface WphInvoiceMapperCustom {
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
	 *描述:根据住院号查询
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
	public List<WphInvoiceCustom> selectInvoice(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("wardFid")Integer wardFid,@Param("name")String name);
}
