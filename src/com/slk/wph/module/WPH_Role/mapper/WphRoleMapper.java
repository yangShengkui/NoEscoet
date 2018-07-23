package com.slk.wph.module.WPH_Role.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Role.po.WphRole;
import com.slk.wph.module.WPH_Role.po.WphRoleExample;

public interface WphRoleMapper {
    int countByExample(WphRoleExample example);

    int deleteByExample(WphRoleExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphRole record);

    int insertSelective(WphRole record);

    List<WphRole> selectByExample(WphRoleExample example);

    WphRole selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphRole record, @Param("example") WphRoleExample example);

    int updateByExample(@Param("record") WphRole record, @Param("example") WphRoleExample example);

    int updateByPrimaryKeySelective(WphRole record);

    int updateByPrimaryKey(WphRole record);
}