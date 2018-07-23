package com.slk.wph.module.WPH_Feedtype.mapper;

import com.slk.wph.module.WPH_Feedtype.po.WphFeedtype;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphFeedtypeMapper {
    int countByExample(WphFeedtypeExample example);

    int deleteByExample(WphFeedtypeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphFeedtype record);

    int insertSelective(WphFeedtype record);

    List<WphFeedtype> selectByExample(WphFeedtypeExample example);

    WphFeedtype selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphFeedtype record, @Param("example") WphFeedtypeExample example);

    int updateByExample(@Param("record") WphFeedtype record, @Param("example") WphFeedtypeExample example);

    int updateByPrimaryKeySelective(WphFeedtype record);

    int updateByPrimaryKey(WphFeedtype record);
}