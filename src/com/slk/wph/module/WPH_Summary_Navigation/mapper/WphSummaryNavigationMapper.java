package com.slk.wph.module.WPH_Summary_Navigation.mapper;

import com.slk.wph.module.WPH_Summary_Navigation.po.WphSummaryNavigation;
import com.slk.wph.module.WPH_Summary_Navigation.po.WphSummaryNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphSummaryNavigationMapper {
    int countByExample(WphSummaryNavigationExample example);

    int deleteByExample(WphSummaryNavigationExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphSummaryNavigation record);

    int insertSelective(WphSummaryNavigation record);

    List<WphSummaryNavigation> selectByExample(WphSummaryNavigationExample example);

    WphSummaryNavigation selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphSummaryNavigation record, @Param("example") WphSummaryNavigationExample example);

    int updateByExample(@Param("record") WphSummaryNavigation record, @Param("example") WphSummaryNavigationExample example);

    int updateByPrimaryKeySelective(WphSummaryNavigation record);

    int updateByPrimaryKey(WphSummaryNavigation record);
}