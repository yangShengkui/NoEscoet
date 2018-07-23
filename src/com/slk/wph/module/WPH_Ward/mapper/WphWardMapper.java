package com.slk.wph.module.WPH_Ward.mapper;

import com.slk.wph.module.WPH_Ward.po.WphWard;
import com.slk.wph.module.WPH_Ward.po.WphWardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphWardMapper {
    int countByExample(WphWardExample example);

    int deleteByExample(WphWardExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphWard record);

    int insertSelective(WphWard record);

    List<WphWard> selectByExample(WphWardExample example);

    WphWard selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphWard record, @Param("example") WphWardExample example);

    int updateByExample(@Param("record") WphWard record, @Param("example") WphWardExample example);

    int updateByPrimaryKeySelective(WphWard record);

    int updateByPrimaryKey(WphWard record);
}