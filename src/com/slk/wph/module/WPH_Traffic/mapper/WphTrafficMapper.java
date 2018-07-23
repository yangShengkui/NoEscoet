package com.slk.wph.module.WPH_Traffic.mapper;

import com.slk.wph.module.WPH_Traffic.po.WphTraffic;
import com.slk.wph.module.WPH_Traffic.po.WphTrafficExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphTrafficMapper {
    int countByExample(WphTrafficExample example);

    int deleteByExample(WphTrafficExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphTraffic record);

    int insertSelective(WphTraffic record);

    List<WphTraffic> selectByExample(WphTrafficExample example);

    WphTraffic selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphTraffic record, @Param("example") WphTrafficExample example);

    int updateByExample(@Param("record") WphTraffic record, @Param("example") WphTrafficExample example);

    int updateByPrimaryKeySelective(WphTraffic record);

    int updateByPrimaryKey(WphTraffic record);
}