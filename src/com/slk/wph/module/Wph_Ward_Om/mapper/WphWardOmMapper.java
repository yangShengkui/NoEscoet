package com.slk.wph.module.Wph_Ward_Om.mapper;

import com.slk.wph.module.Wph_Ward_Om.po.WphWardOm;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphWardOmMapper {
    int countByExample(WphWardOmExample example);

    int deleteByExample(WphWardOmExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphWardOm record);

    int insertSelective(WphWardOm record);

    List<WphWardOm> selectByExample(WphWardOmExample example);

    WphWardOm selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphWardOm record, @Param("example") WphWardOmExample example);

    int updateByExample(@Param("record") WphWardOm record, @Param("example") WphWardOmExample example);

    int updateByPrimaryKeySelective(WphWardOm record);

    int updateByPrimaryKey(WphWardOm record);
}