package com.slk.wph.module.WPH_Invoicerate.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Invoicerate.mapper.WphInvoicerateMapperCustom;
import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;
import com.slk.wph.module.WPH_Invoicerate.service.WPH_InvoicerateService;

@Service
 public class  WPH_InvoicerateServiceImpl implements WPH_InvoicerateService  {
	
	@Autowired
	private WphInvoicerateMapperCustom mapperCustom;
	@Override
	public List<WphInvoicerateCustom> selectInvoicerate() {
		// TODO Auto-generated method stub
		return mapperCustom.selectInvoicerate();
	}

	@Override
	public int updateWphInvoicerate(WphInvoicerateCustom custom) {
		// TODO Auto-generated method stub
		return mapperCustom.updateWphInvoicerate(custom);
	}
}