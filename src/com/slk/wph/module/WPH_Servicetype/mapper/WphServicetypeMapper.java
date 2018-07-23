package com.slk.wph.module.WPH_Servicetype.mapper;

import com.slk.wph.module.WPH_Servicetype.po.WphServicetype;
import com.slk.wph.module.WPH_Servicetype.po.WphServicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphServicetypeMapper {
    int countByExample(WphServicetypeExample example);

    int deleteByExample(WphServicetypeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphServicetype record);

    int insertSelective(WphServicetype record);

    List<WphServicetype> selectByExample(WphServicetypeExample example);

    WphServicetype selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphServicetype record, @Param("example") WphServicetypeExample example);

    int updateByExample(@Param("record") WphServicetype record, @Param("example") WphServicetypeExample example);

    int updateByPrimaryKeySelective(WphServicetype record);

    int updateByPrimaryKey(WphServicetype record);
}