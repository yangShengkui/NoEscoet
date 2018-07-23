package com.slk.wph.module.WPH_Privilege.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Privilege.po.WphPrivilege;
import com.slk.wph.module.WPH_Privilege.po.WphPrivilegeExample;

public interface WphPrivilegeMapper {
    int countByExample(WphPrivilegeExample example);

    int deleteByExample(WphPrivilegeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphPrivilege record);

    int insertSelective(WphPrivilege record);

    List<WphPrivilege> selectByExample(WphPrivilegeExample example);

    WphPrivilege selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphPrivilege record, @Param("example") WphPrivilegeExample example);

    int updateByExample(@Param("record") WphPrivilege record, @Param("example") WphPrivilegeExample example);

    int updateByPrimaryKeySelective(WphPrivilege record);

    int updateByPrimaryKey(WphPrivilege record);
}