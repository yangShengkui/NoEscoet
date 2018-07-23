package com.slk.wph.module.WPH_Query.mapper;

import com.slk.wph.module.WPH_Query.po.WphQuery;
import com.slk.wph.module.WPH_Query.po.WphQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphQueryMapper {
    int countByExample(WphQueryExample example);

    int deleteByExample(WphQueryExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphQuery record);

    int insertSelective(WphQuery record);

    List<WphQuery> selectByExample(WphQueryExample example);

    WphQuery selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphQuery record, @Param("example") WphQueryExample example);

    int updateByExample(@Param("record") WphQuery record, @Param("example") WphQueryExample example);

    int updateByPrimaryKeySelective(WphQuery record);

    int updateByPrimaryKey(WphQuery record);
}