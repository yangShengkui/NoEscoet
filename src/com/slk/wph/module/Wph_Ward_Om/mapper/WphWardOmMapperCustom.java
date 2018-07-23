package com.slk.wph.module.Wph_Ward_Om.mapper;

import java.util.List;

import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;
import org.apache.ibatis.annotations.Param;


public interface WphWardOmMapperCustom {
	
     public int updateOmName(WphWardOmCustom wphWardOmCustom);
     
     public int deleteByNursingFid(@Param("fid") Integer fid,@Param("wardFid") Integer wardFid);
     
     public int saveWphWardOmCustom(WphWardOmCustom wphWardOmCustom);

     public int saveWphWardOmCustomList(List<WphWardOmCustom> list);
     
     public int updateOmMoney(WphWardOmCustom custom);

     public List<String> selecetWardOmByGradeFid(Integer fid);

     /**
      * 查询 病区下是否有办护理的患者
      * @param
      * @return
      */
     public Integer selectNursingForWard(@Param("fid") String fid,@Param("wardFid") String[] wardFid);
     
}
