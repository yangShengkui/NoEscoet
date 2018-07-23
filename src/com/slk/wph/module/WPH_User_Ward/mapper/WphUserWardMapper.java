package com.slk.wph.module.WPH_User_Ward.mapper;

import com.slk.wph.module.WPH_User_Ward.po.WphUserWard;
import com.slk.wph.module.WPH_User_Ward.po.WphUserWardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphUserWardMapper {
    int countByExample(WphUserWardExample example);

    int deleteByExample(WphUserWardExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphUserWard record);

    int insertSelective(WphUserWard record);

    List<WphUserWard> selectByExample(WphUserWardExample example);

    WphUserWard selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphUserWard record, @Param("example") WphUserWardExample example);

    int updateByExample(@Param("record") WphUserWard record, @Param("example") WphUserWardExample example);

    int updateByPrimaryKeySelective(WphUserWard record);

    int updateByPrimaryKey(WphUserWard record);
}