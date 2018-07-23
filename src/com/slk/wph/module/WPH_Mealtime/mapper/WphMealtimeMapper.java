package com.slk.wph.module.WPH_Mealtime.mapper;

import com.slk.wph.module.WPH_Mealtime.po.WphMealtime;
import com.slk.wph.module.WPH_Mealtime.po.WphMealtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealtimeMapper {
    int countByExample(WphMealtimeExample example);

    int deleteByExample(WphMealtimeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealtime record);

    int insertSelective(WphMealtime record);

    List<WphMealtime> selectByExample(WphMealtimeExample example);

    WphMealtime selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealtime record, @Param("example") WphMealtimeExample example);

    int updateByExample(@Param("record") WphMealtime record, @Param("example") WphMealtimeExample example);

    int updateByPrimaryKeySelective(WphMealtime record);

    int updateByPrimaryKey(WphMealtime record);
}