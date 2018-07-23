package com.slk.wph.module.WPH_Menu.mapper;

import com.slk.wph.module.WPH_Menu.po.WphMenu;
import com.slk.wph.module.WPH_Menu.po.WphMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphMenuMapper {
    int countByExample(WphMenuExample example);

    int deleteByExample(WphMenuExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphMenu record);

    int insertSelective(WphMenu record);

    List<WphMenu> selectByExample(WphMenuExample example);

    WphMenu selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphMenu record, @Param("example") WphMenuExample example);

    int updateByExample(@Param("record") WphMenu record, @Param("example") WphMenuExample example);

    int updateByPrimaryKeySelective(WphMenu record);

    int updateByPrimaryKey(WphMenu record);
}