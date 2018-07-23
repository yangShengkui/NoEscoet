package com.slk.wph.module.WPH_Notice.mapper;

import com.slk.wph.module.WPH_Notice.po.WphNotice;
import com.slk.wph.module.WPH_Notice.po.WphNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphNoticeMapper {
    int countByExample(WphNoticeExample example);

    int deleteByExample(WphNoticeExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphNotice record);

    int insertSelective(WphNotice record);

    List<WphNotice> selectByExampleWithBLOBs(WphNoticeExample example);

    List<WphNotice> selectByExample(WphNoticeExample example);

    WphNotice selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphNotice record, @Param("example") WphNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") WphNotice record, @Param("example") WphNoticeExample example);

    int updateByExample(@Param("record") WphNotice record, @Param("example") WphNoticeExample example);

    int updateByPrimaryKeySelective(WphNotice record);

    int updateByPrimaryKeyWithBLOBs(WphNotice record);

    int updateByPrimaryKey(WphNotice record);
}