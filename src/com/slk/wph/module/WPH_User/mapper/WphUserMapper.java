package com.slk.wph.module.WPH_User.mapper;

import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WphUserMapper {
    int countByExample(WphUserExample example);

    int deleteByExample(WphUserExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(WphUser record);

    int insertSelective(WphUser record);

    List<WphUser> selectByExample(WphUserExample example);

    WphUser selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") WphUser record, @Param("example") WphUserExample example);

    int updateByExample(@Param("record") WphUser record, @Param("example") WphUserExample example);

    int updateByPrimaryKeySelective(WphUser record);

    int updateByPrimaryKey(WphUser record);
    
    int checkWphUser(Integer fid,String username,String name,String phone);
    
    int checkWphUser_(String username,String name,String phone);
}