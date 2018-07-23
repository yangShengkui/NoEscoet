package com.slk.wph.module.WPH_Orderingfood.mapper;

import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphOrderingfoodMapper {
    int countByExample(WphOrderingfoodExample example);

    int deleteByExample(WphOrderingfoodExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphOrderingfood record);

    int insertSelective(WphOrderingfood record);

    List<WphOrderingfood> selectByExample(WphOrderingfoodExample example);

    WphOrderingfood selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphOrderingfood record, @Param("example") WphOrderingfoodExample example);

    int updateByExample(@Param("record") WphOrderingfood record, @Param("example") WphOrderingfoodExample example);

    int updateByPrimaryKeySelective(WphOrderingfood record);

    int updateByPrimaryKey(WphOrderingfood record);
}