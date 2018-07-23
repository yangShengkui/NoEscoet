package com.slk.wph.module.WPH_Prepcustomer.service.impl;

import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Prepcustomer.mapper.WphPrepcustomerMapperCustom;
import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import com.slk.wph.module.WPH_Prepcustomer.service.WPH_PrepcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
 public class  WPH_PrepcustomerServiceImpl implements WPH_PrepcustomerService  {


     @Autowired
     private WphPrepcustomerMapperCustom mapperCustom;

     @Autowired
     private WphCustomerMapperCustom customerMapper;

    /**
     * 查询所有患者信息
     * @return
     */
     @Override
     public List<WphPrepcustomer> selectPreCustomerList(String startdate) {
        return mapperCustom.selectPreCustomerList(startdate);
     }

     /**
     * 患者信息录入及修改
     * @param prepcustomer
     * @return
     * 庞军霞
     */
      @Override
      public boolean insertAndUpdatePrepCustomer(WphPrepcustomer prepcustomer) {
          int count=0;
          if(customerMapper.selectCustomerById(prepcustomer.getHospitalid())==0){
              prepcustomer.setModifyDate(new Date());
              prepcustomer.setState(0);
              if (prepcustomer.getFid()!=null && !"".equals(prepcustomer.getFid())){
                  count=mapperCustom.updatePrecustom(prepcustomer);
              }else {
                  count=mapperCustom.insertPrecustom(prepcustomer);
              }
          }
          return count>0;
      }


    /**
     * 患者录入查询住院号
     * @param hospitalid
     * @return
     * 庞军霞
     */
      @Override
      public boolean checkHospital(String hospitalid) {
          return customerMapper.selectCustomerById(hospitalid)==0;
      }

    @Override
    public WphPrepcustomer getWphPrepcustomerByHopitalid(String hospitalid) {
        return mapperCustom.getWphPrepcustomerByHopitalid(hospitalid);
    }


}