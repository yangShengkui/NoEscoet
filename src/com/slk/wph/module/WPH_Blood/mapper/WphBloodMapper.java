package com.slk.wph.module.WPH_Blood.mapper;

import com.slk.wph.module.WPH_Blood.po.WphBlood;
import com.slk.wph.module.WPH_Blood.po.WphBloodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphBloodMapper {
    int countByExample(WphBloodExample example);

    int deleteByExample(WphBloodExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphBlood record);

    int insertSelective(WphBlood record);

    List<WphBlood> selectByExample(WphBloodExample example);

    WphBlood selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphBlood record, @Param("example") WphBloodExample example);

    int updateByExample(@Param("record") WphBlood record, @Param("example") WphBloodExample example);

    int updateByPrimaryKeySelective(WphBlood record);

    int updateByPrimaryKey(WphBlood record);
}