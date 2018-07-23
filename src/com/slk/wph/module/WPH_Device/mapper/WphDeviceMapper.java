package com.slk.wph.module.WPH_Device.mapper;

import com.slk.wph.module.WPH_Device.po.WphDevice;
import com.slk.wph.module.WPH_Device.po.WphDeviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphDeviceMapper {
    int countByExample(WphDeviceExample example);

    int deleteByExample(WphDeviceExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphDevice record);

    int insertSelective(WphDevice record);

    List<WphDevice> selectByExample(WphDeviceExample example);

    WphDevice selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphDevice record, @Param("example") WphDeviceExample example);

    int updateByExample(@Param("record") WphDevice record, @Param("example") WphDeviceExample example);

    int updateByPrimaryKeySelective(WphDevice record);

    int updateByPrimaryKey(WphDevice record);
}