package com.slk.wph.module.WPH_Warmprompt.service.impl;

import com.slk.wph.module.WPH_Notice.po.WphNotice;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Warmprompt.mapper.WphWarmpromptCustomMapper;
import com.slk.wph.module.WPH_Warmprompt.mapper.WphWarmpromptMapper;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.wph.module.WPH_Warmprompt.service.WPH_WarmpromptService;

import java.util.List;

@Service
public class WPH_WarmpromptServiceImpl implements WPH_WarmpromptService {
    @Autowired
    private WphWarmpromptCustomMapper mapper;
    @Autowired
    private WphWarmpromptMapper warmpromptMapper;
    @Override
    public int updateByFid(WphWarmprompt warmprompt) {
        return mapper.updateByFid(warmprompt);
    }

    @Override
    public WphWarmprompt selectByType(Integer type) {
        return mapper.selectByType(type);
    }

    @Override
    public List<WphWarmprompt> selectByZtype(Integer ztype) {
        return mapper.selectByZtype(ztype);
    }

    @Override
    public WphWarmprompt getCustomerNotice(Integer fid) {
        WphWarmprompt notice = warmpromptMapper.selectByPrimaryKey(fid);
        return notice;
    }

    @Override
    public Integer updateNoticeByFid(WphWarmprompt mprompt) {
        int count = warmpromptMapper.updateByPrimaryKeySelective(mprompt);
        return count;
    }
}