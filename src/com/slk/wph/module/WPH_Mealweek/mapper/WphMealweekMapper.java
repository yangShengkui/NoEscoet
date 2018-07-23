package com.slk.wph.module.WPH_Mealweek.mapper;

import com.slk.wph.module.WPH_Mealweek.po.WphMealweek;
import com.slk.wph.module.WPH_Mealweek.po.WphMealweekExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealweekMapper {
    int countByExample(WphMealweekExample example);

    int deleteByExample(WphMealweekExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealweek record);

    int insertSelective(WphMealweek record);

    List<WphMealweek> selectByExample(WphMealweekExample example);

    WphMealweek selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealweek record, @Param("example") WphMealweekExample example);

    int updateByExample(@Param("record") WphMealweek record, @Param("example") WphMealweekExample example);

    int updateByPrimaryKeySelective(WphMealweek record);

    int updateByPrimaryKey(WphMealweek record);
}