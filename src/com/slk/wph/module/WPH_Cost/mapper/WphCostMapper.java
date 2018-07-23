package com.slk.wph.module.WPH_Cost.mapper;

import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Cost.po.WphCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphCostMapper {
    int countByExample(WphCostExample example);

    int deleteByExample(WphCostExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphCost record);

    int insertSelective(WphCost record);

    List<WphCost> selectByExample(WphCostExample example);

    WphCost selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphCost record, @Param("example") WphCostExample example);

    int updateByExample(@Param("record") WphCost record, @Param("example") WphCostExample example);

    int updateByPrimaryKeySelective(WphCost record);

    int updateByPrimaryKey(WphCost record);
}