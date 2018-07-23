package com.slk.wph.module.Wph_Servicedetails.mapper;

import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphServicedetailsMapper {
    int countByExample(WphServicedetailsExample example);

    int deleteByExample(WphServicedetailsExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphServicedetails record);

    int insertSelective(WphServicedetails record);

    List<WphServicedetails> selectByExample(WphServicedetailsExample example);

    WphServicedetails selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphServicedetails record, @Param("example") WphServicedetailsExample example);

    int updateByExample(@Param("record") WphServicedetails record, @Param("example") WphServicedetailsExample example);

    int updateByPrimaryKeySelective(WphServicedetails record);

    int updateByPrimaryKey(WphServicedetails record);
}