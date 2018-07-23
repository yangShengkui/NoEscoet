package com.slk.wph.module.WPH_Card_Relation.mapper;

import com.slk.wph.module.WPH_Card_Relation.po.WphCardRelation;
import com.slk.wph.module.WPH_Card_Relation.po.WphCardRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphCardRelationMapper {
    int countByExample(WphCardRelationExample example);

    int deleteByExample(WphCardRelationExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphCardRelation record);

    int insertSelective(WphCardRelation record);

    List<WphCardRelation> selectByExample(WphCardRelationExample example);

    WphCardRelation selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphCardRelation record, @Param("example") WphCardRelationExample example);

    int updateByExample(@Param("record") WphCardRelation record, @Param("example") WphCardRelationExample example);

    int updateByPrimaryKeySelective(WphCardRelation record);

    int updateByPrimaryKey(WphCardRelation record);
}