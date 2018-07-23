package com.slk.wph.module.WPH_Prepcustomer.mapper;

import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphPrepcustomerMapper {
    int countByExample(WphPrepcustomerExample example);

    int deleteByExample(WphPrepcustomerExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphPrepcustomer record);

    int insertSelective(WphPrepcustomer record);

    List<WphPrepcustomer> selectByExample(WphPrepcustomerExample example);

    WphPrepcustomer selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphPrepcustomer record, @Param("example") WphPrepcustomerExample example);

    int updateByExample(@Param("record") WphPrepcustomer record, @Param("example") WphPrepcustomerExample example);

    int updateByPrimaryKeySelective(WphPrepcustomer record);

    int updateByPrimaryKey(WphPrepcustomer record);
}