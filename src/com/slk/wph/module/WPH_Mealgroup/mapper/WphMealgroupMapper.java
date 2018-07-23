package com.slk.wph.module.WPH_Mealgroup.mapper;

import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroup;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealgroupMapper {
    int countByExample(WphMealgroupExample example);

    int deleteByExample(WphMealgroupExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealgroup record);

    int insertSelective(WphMealgroup record);

    List<WphMealgroup> selectByExample(WphMealgroupExample example);

    WphMealgroup selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealgroup record, @Param("example") WphMealgroupExample example);

    int updateByExample(@Param("record") WphMealgroup record, @Param("example") WphMealgroupExample example);

    int updateByPrimaryKeySelective(WphMealgroup record);

    int updateByPrimaryKey(WphMealgroup record);
}