package com.slk.wph.module.WPH_UserCodeId.mapper;

import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeid;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphUsercodeidMapper {
    int countByExample(WphUsercodeidExample example);

    int deleteByExample(WphUsercodeidExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphUsercodeid record);

    int insertSelective(WphUsercodeid record);

    List<WphUsercodeid> selectByExample(WphUsercodeidExample example);

    WphUsercodeid selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphUsercodeid record, @Param("example") WphUsercodeidExample example);

    int updateByExample(@Param("record") WphUsercodeid record, @Param("example") WphUsercodeidExample example);

    int updateByPrimaryKeySelective(WphUsercodeid record);

    int updateByPrimaryKey(WphUsercodeid record);
}