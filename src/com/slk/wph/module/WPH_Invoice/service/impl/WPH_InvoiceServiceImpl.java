package com.slk.wph.module.WPH_Invoice.service.impl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Invoice.mapper.WphInvoiceMapperCustom;
import com.slk.wph.module.WPH_Invoice.po.WphInvoiceCustom;
import com.slk.wph.module.WPH_Invoice.service.WPH_InvoiceService;
import com.slk.wph.module.WPH_Invoicerate.mapper.WphInvoicerateMapperCustom;
import com.slk.wph.module.WPH_Invoicerate.po.WphInvoicerateCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
 public class  WPH_InvoiceServiceImpl implements WPH_InvoiceService  {
	@Autowired
	private WphCustomerMapperCustom customerMapper;
	@Autowired
	private WphInvoicerateMapperCustom invoicerateMapper;
	@Autowired
	private WphInvoiceMapperCustom invoiceMapper;
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Autowired
	private WphWardMapperCustom wardCustomMapper;
	
	@Override
	public WphCustomerCustom getWphInvoiceManger(String hospitalld) {
		// TODO Auto-generated method stub
		return customerMapper.getWphInvoiceManger(hospitalld);
	}

	@Override
	public WphInvoicerateCustom getInvoicerateByFid(Integer fid) {
		// TODO Auto-generated method stub
		return invoicerateMapper.getInvoicerateByFid(fid);
	}

	@Override
	public int insertWphInvoice(WphInvoiceCustom custom) {
		// TODO Auto-generated method stub
		return invoiceMapper.insertWphInvoice(custom);
	}

	@Override
	public WphCustomerCustom getCustomerByFid(Integer fid) {
		// TODO Auto-generated method stub
		return customerMapper.getCustomerByFid(fid);
	}

	@Override
	public WphUserCustom getRoleAndUserByUser(Integer fid) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(fid);
	}

	@Override
	public List<WphInvoiceCustom> selectWphInvoiceByHospitalld(String hospitalld) {
		// TODO Auto-generated method stub
		return invoiceMapper.selectWphInvoiceByHospitalld(hospitalld);
	}

	@Override
	public List<WphInvoiceCustom> selectInvoice(Date startDate,Date endDate, Integer wardFid,
			String name) {
		// TODO Auto-generated method stub
		return invoiceMapper.selectInvoice(startDate,endDate, wardFid, name);
	}

	@Override
	public List<WphWardCustom> getWphWardListByStatus() {
		// TODO Auto-generated method stub
		return wardCustomMapper.getWphWardListByStatus();
	}

	@Override
	public List<WphInvoicerateCustom> selectInvoicerate() {
		// TODO Auto-generated method stub
		return invoicerateMapper.selectInvoicerate();
	}
	
}