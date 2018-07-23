package com.slk.wph.module.WPH_Prepcustomer.mapper;

import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphPrepcustomerMapperCustom {

    List<WphPrepcustomer> getPrepListByNowDate(String date);

    /*
    * 庞军霞
    */
    public List<WphPrepcustomer> selectPreCustomerList(@Param("modifyDate") String startdate);

    public int selectPrepcustomByHospitalid(@Param("hospitalid") String hospitalid);

    public int insertPrecustom(WphPrepcustomer prepcustomer);

    public int updatePrecustom(WphPrepcustomer prepcustomer);


    public WphPrepcustomer getWphPrepcustomerByHopitalid(@Param("hospitalid")String hospitalid);

}