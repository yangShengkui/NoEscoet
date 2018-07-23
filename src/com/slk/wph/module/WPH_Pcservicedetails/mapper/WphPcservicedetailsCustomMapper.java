package com.slk.wph.module.WPH_Pcservicedetails.mapper;

import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetails;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphPcservicedetailsCustomMapper {

    public List<WphPcservicedetails> selectPcservicedetailsTypeFId(@Param("pcserviceTypeFid") Integer pcserviceTypeFid, @Param("state") Integer state);

    public int savePcservicedetails(WphPcservicedetails psd);

    public int updatePcservicedetails(WphPcservicedetails psd);

    public int updatePcservicedetailsState(@Param("pcserviceTypeFid") Integer pcserviceTypeFid, @Param("username") String username);

    public WphPcservicedetails selectByFid(Integer fid);


}
