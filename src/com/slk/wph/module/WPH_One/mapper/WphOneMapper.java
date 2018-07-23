package com.slk.wph.module.WPH_One.mapper;

import com.slk.wph.module.WPH_One.po.WphOne;
import com.slk.wph.module.WPH_One.po.WphOneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphOneMapper {
    int countByExample(WphOneExample example);

    int deleteByExample(WphOneExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphOne record);

    int insertSelective(WphOne record);

    List<WphOne> selectByExample(WphOneExample example);

    WphOne selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphOne record, @Param("example") WphOneExample example);

    int updateByExample(@Param("record") WphOne record, @Param("example") WphOneExample example);

    int updateByPrimaryKeySelective(WphOne record);

    int updateByPrimaryKey(WphOne record);
}