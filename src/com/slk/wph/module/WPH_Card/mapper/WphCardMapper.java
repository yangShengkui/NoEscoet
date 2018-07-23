package com.slk.wph.module.WPH_Card.mapper;

import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WphCardMapper {
    int countByExample(WphCardExample example);

    int deleteByExample(WphCardExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphCard record);

    int insertSelective(WphCard record);

    List<WphCard> selectByExample(WphCardExample example);

    WphCard selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphCard record, @Param("example") WphCardExample example);

    int updateByExample(@Param("record") WphCard record, @Param("example") WphCardExample example);

    int updateByPrimaryKeySelective(WphCard record);

    int updateByPrimaryKey(WphCard record);
}