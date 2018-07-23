package com.slk.wph.module.WPH_Invoicerate.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;

public interface WphInvoicerateMapperCustom {
	
	public List<WphInvoicerateCustom> selectInvoicerate();
	
	public int updateWphInvoicerate(WphInvoicerateCustom custom);
	
	public WphInvoicerateCustom getInvoicerateByFid(Integer fid);
}
