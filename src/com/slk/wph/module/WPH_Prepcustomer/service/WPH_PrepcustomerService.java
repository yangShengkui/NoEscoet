package com.slk.wph.module.WPH_Prepcustomer.service;

import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;

import java.util.List;


public interface WPH_PrepcustomerService {



   public List<WphPrepcustomer> selectPreCustomerList(String startdate);


   public boolean insertAndUpdatePrepCustomer(WphPrepcustomer prepcustomer);


   public boolean checkHospital(String hospitalid);


   public WphPrepcustomer getWphPrepcustomerByHopitalid(String hospitalid);


}