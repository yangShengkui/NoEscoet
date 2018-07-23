package com.slk.wph.module.WPH_Summary_Equipment.mapper;

import com.slk.wph.module.WPH_Summary_Equipment.po.WphSummaryEquipment;
import com.slk.wph.module.WPH_Summary_Equipment.po.WphSummaryEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphSummaryEquipmentMapper {
    int countByExample(WphSummaryEquipmentExample example);

    int deleteByExample(WphSummaryEquipmentExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphSummaryEquipment record);

    int insertSelective(WphSummaryEquipment record);

    List<WphSummaryEquipment> selectByExample(WphSummaryEquipmentExample example);

    WphSummaryEquipment selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphSummaryEquipment record, @Param("example") WphSummaryEquipmentExample example);

    int updateByExample(@Param("record") WphSummaryEquipment record, @Param("example") WphSummaryEquipmentExample example);

    int updateByPrimaryKeySelective(WphSummaryEquipment record);

    int updateByPrimaryKey(WphSummaryEquipment record);
}