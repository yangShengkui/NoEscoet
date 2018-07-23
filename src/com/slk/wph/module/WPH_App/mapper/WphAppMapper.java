package com.slk.wph.module.WPH_App.mapper;

import com.slk.wph.module.WPH_App.po.WphApp;
import com.slk.wph.module.WPH_App.po.WphAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphAppMapper {
    int countByExample(WphAppExample example);

    int deleteByExample(WphAppExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphApp record);

    int insertSelective(WphApp record);

    List<WphApp> selectByExample(WphAppExample example);

    WphApp selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphApp record, @Param("example") WphAppExample example);

    int updateByExample(@Param("record") WphApp record, @Param("example") WphAppExample example);

    int updateByPrimaryKeySelective(WphApp record);

    int updateByPrimaryKey(WphApp record);
}