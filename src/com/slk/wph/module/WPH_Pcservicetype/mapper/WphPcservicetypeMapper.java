package com.slk.wph.module.WPH_Pcservicetype.mapper;

import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphPcservicetypeMapper {
    int countByExample(WphPcservicetypeExample example);

    int deleteByExample(WphPcservicetypeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphPcservicetype record);

    int insertSelective(WphPcservicetype record);

    List<WphPcservicetype> selectByExample(WphPcservicetypeExample example);

    WphPcservicetype selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphPcservicetype record, @Param("example") WphPcservicetypeExample example);

    int updateByExample(@Param("record") WphPcservicetype record, @Param("example") WphPcservicetypeExample example);

    int updateByPrimaryKeySelective(WphPcservicetype record);

    int updateByPrimaryKey(WphPcservicetype record);
}