package com.slk.wph.module.WPH_AppVersion.mapper;

import com.slk.wph.module.WPH_AppVersion.po.WphAppversion;
import com.slk.wph.module.WPH_AppVersion.po.WphAppversionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphAppversionMapper {
    int countByExample(WphAppversionExample example);

    int deleteByExample(WphAppversionExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphAppversion record);

    int insertSelective(WphAppversion record);

    List<WphAppversion> selectByExample(WphAppversionExample example);

     WphAppversion selectByPrimaryKey(Integer fid);


}