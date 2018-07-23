package com.slk.wph.module.WPH_Mealmenu_Time.mapper;

import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTime;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealmenuTimeMapper {
    int countByExample(WphMealmenuTimeExample example);

    int deleteByExample(WphMealmenuTimeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealmenuTime record);

    int insertSelective(WphMealmenuTime record);

    List<WphMealmenuTime> selectByExample(WphMealmenuTimeExample example);

    WphMealmenuTime selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealmenuTime record, @Param("example") WphMealmenuTimeExample example);

    int updateByExample(@Param("record") WphMealmenuTime record, @Param("example") WphMealmenuTimeExample example);

    int updateByPrimaryKeySelective(WphMealmenuTime record);

    int updateByPrimaryKey(WphMealmenuTime record);
}