package com.slk.wph.module.WPH_Hospita.mapper;

import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphHospitaMapper {
    int countByExample(WphHospitaExample example);

    int deleteByExample(WphHospitaExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphHospita record);

    int insertSelective(WphHospita record);

    List<WphHospita> selectByExample(WphHospitaExample example);

    WphHospita selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphHospita record, @Param("example") WphHospitaExample example);

    int updateByExample(@Param("record") WphHospita record, @Param("example") WphHospitaExample example);

    int updateByPrimaryKeySelective(WphHospita record);

    int updateByPrimaryKey(WphHospita record);
}