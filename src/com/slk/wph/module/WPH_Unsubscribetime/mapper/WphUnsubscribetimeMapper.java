package com.slk.wph.module.WPH_Unsubscribetime.mapper;

import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetime;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphUnsubscribetimeMapper {
    int countByExample(WphUnsubscribetimeExample example);

    int deleteByExample(WphUnsubscribetimeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphUnsubscribetime record);

    int insertSelective(WphUnsubscribetime record);

    List<WphUnsubscribetime> selectByExample(WphUnsubscribetimeExample example);

    WphUnsubscribetime selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphUnsubscribetime record, @Param("example") WphUnsubscribetimeExample example);

    int updateByExample(@Param("record") WphUnsubscribetime record, @Param("example") WphUnsubscribetimeExample example);

    int updateByPrimaryKeySelective(WphUnsubscribetime record);

    int updateByPrimaryKey(WphUnsubscribetime record);
}