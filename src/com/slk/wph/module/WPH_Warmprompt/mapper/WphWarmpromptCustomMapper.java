package com.slk.wph.module.WPH_Warmprompt.mapper;

import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmpromptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WphWarmpromptCustomMapper {

    public int updateByFid(WphWarmprompt warmprompt);

    public WphWarmprompt selectByType(Integer type);

    public List<WphWarmprompt> selectByZtype(Integer ztype);
}