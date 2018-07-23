package com.slk.wph.module.WPH_Screensaver.mapper;

import com.slk.wph.module.WPH_Screensaver.po.WphScreensaver;
import com.slk.wph.module.WPH_Screensaver.po.WphScreensaverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphScreensaverMapper {
    int countByExample(WphScreensaverExample example);

    int deleteByExample(WphScreensaverExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphScreensaver record);

    int insertSelective(WphScreensaver record);

    List<WphScreensaver> selectByExample(WphScreensaverExample example);

    WphScreensaver selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphScreensaver record, @Param("example") WphScreensaverExample example);

    int updateByExample(@Param("record") WphScreensaver record, @Param("example") WphScreensaverExample example);

    int updateByPrimaryKeySelective(WphScreensaver record);

    int updateByPrimaryKey(WphScreensaver record);
}