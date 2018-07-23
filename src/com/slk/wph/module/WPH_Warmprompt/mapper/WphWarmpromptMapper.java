package com.slk.wph.module.WPH_Warmprompt.mapper;

import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmpromptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphWarmpromptMapper {
    int countByExample(WphWarmpromptExample example);

    int deleteByExample(WphWarmpromptExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphWarmprompt record);

    int insertSelective(WphWarmprompt record);

    List<WphWarmprompt> selectByExample(WphWarmpromptExample example);

    WphWarmprompt selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphWarmprompt record, @Param("example") WphWarmpromptExample example);

    int updateByExample(@Param("record") WphWarmprompt record, @Param("example") WphWarmpromptExample example);

    int updateByPrimaryKeySelective(WphWarmprompt record);

    int updateByPrimaryKey(WphWarmprompt record);
}