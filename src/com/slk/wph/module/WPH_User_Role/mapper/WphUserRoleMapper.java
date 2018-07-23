package com.slk.wph.module.WPH_User_Role.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_User_Role.po.WphUserRole;
import com.slk.wph.module.WPH_User_Role.po.WphUserRoleExample;

public interface WphUserRoleMapper {
    int countByExample(WphUserRoleExample example);

    int deleteByExample(WphUserRoleExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphUserRole record);

    int insertSelective(WphUserRole record);

    List<WphUserRole> selectByExample(WphUserRoleExample example);

    WphUserRole selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphUserRole record, @Param("example") WphUserRoleExample example);

    int updateByExample(@Param("record") WphUserRole record, @Param("example") WphUserRoleExample example);

    int updateByPrimaryKeySelective(WphUserRole record);

    int updateByPrimaryKey(WphUserRole record);
}