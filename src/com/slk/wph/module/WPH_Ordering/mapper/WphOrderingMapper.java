package com.slk.wph.module.WPH_Ordering.mapper;

import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphOrderingMapper {
    int countByExample(WphOrderingExample example);

    int deleteByExample(WphOrderingExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphOrdering record);

    int insertSelective(WphOrdering record);

    List<WphOrdering> selectByExample(WphOrderingExample example);

    WphOrdering selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphOrdering record, @Param("example") WphOrderingExample example);

    int updateByExample(@Param("record") WphOrdering record, @Param("example") WphOrderingExample example);

    int updateByPrimaryKeySelective(WphOrdering record);

    int updateByPrimaryKey(WphOrdering record);
}