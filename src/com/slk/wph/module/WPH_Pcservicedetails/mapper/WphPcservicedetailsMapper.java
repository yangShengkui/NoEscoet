package com.slk.wph.module.WPH_Pcservicedetails.mapper;

import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetails;
import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphPcservicedetailsMapper {
    int countByExample(WphPcservicedetailsExample example);

    int deleteByExample(WphPcservicedetailsExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphPcservicedetails record);

    int insertSelective(WphPcservicedetails record);

    List<WphPcservicedetails> selectByExample(WphPcservicedetailsExample example);

    WphPcservicedetails selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphPcservicedetails record, @Param("example") WphPcservicedetailsExample example);

    int updateByExample(@Param("record") WphPcservicedetails record, @Param("example") WphPcservicedetailsExample example);

    int updateByPrimaryKeySelective(WphPcservicedetails record);

    int updateByPrimaryKey(WphPcservicedetails record);
}