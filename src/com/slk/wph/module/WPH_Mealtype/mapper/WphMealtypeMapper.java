package com.slk.wph.module.WPH_Mealtype.mapper;

import com.slk.wph.module.WPH_Mealtype.po.WphMealtype;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealtypeMapper {
    int countByExample(WphMealtypeExample example);

    int deleteByExample(WphMealtypeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealtype record);

    int insertSelective(WphMealtype record);

    List<WphMealtype> selectByExample(WphMealtypeExample example);

    WphMealtype selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealtype record, @Param("example") WphMealtypeExample example);

    int updateByExample(@Param("record") WphMealtype record, @Param("example") WphMealtypeExample example);

    int updateByPrimaryKeySelective(WphMealtype record);

    int updateByPrimaryKey(WphMealtype record);
}