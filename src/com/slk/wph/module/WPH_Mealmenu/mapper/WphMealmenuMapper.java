package com.slk.wph.module.WPH_Mealmenu.mapper;

import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenu;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMealmenuMapper {
    int countByExample(WphMealmenuExample example);

    int deleteByExample(WphMealmenuExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMealmenu record);

    int insertSelective(WphMealmenu record);

    List<WphMealmenu> selectByExample(WphMealmenuExample example);

    WphMealmenu selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMealmenu record, @Param("example") WphMealmenuExample example);

    int updateByExample(@Param("record") WphMealmenu record, @Param("example") WphMealmenuExample example);

    int updateByPrimaryKeySelective(WphMealmenu record);

    int updateByPrimaryKey(WphMealmenu record);
}