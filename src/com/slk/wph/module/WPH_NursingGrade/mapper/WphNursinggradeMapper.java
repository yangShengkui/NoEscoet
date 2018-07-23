package com.slk.wph.module.WPH_NursingGrade.mapper;

import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggrade;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphNursinggradeMapper {
    int countByExample(WphNursinggradeExample example);

    int deleteByExample(WphNursinggradeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphNursinggrade record);

    int insertSelective(WphNursinggrade record);

    List<WphNursinggrade> selectByExample(WphNursinggradeExample example);

    WphNursinggrade selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphNursinggrade record, @Param("example") WphNursinggradeExample example);

    int updateByExample(@Param("record") WphNursinggrade record, @Param("example") WphNursinggradeExample example);

    int updateByPrimaryKeySelective(WphNursinggrade record);

    int updateByPrimaryKey(WphNursinggrade record);
}