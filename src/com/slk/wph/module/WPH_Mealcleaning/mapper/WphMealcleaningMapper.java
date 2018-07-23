package com.slk.wph.module.WPH_Mealcleaning.mapper;

import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaning;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealcleaningMapper {
    int countByExample(WphMealcleaningExample example);

    int deleteByExample(WphMealcleaningExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealcleaning record);

    int insertSelective(WphMealcleaning record);

    List<WphMealcleaning> selectByExample(WphMealcleaningExample example);

    WphMealcleaning selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealcleaning record, @Param("example") WphMealcleaningExample example);

    int updateByExample(@Param("record") WphMealcleaning record, @Param("example") WphMealcleaningExample example);

    int updateByPrimaryKeySelective(WphMealcleaning record);

    int updateByPrimaryKey(WphMealcleaning record);
}