package com.slk.wph.module.WPH_Pcservicetype.service.impl;

import com.slk.wph.module.WPH_Pcservicedetails.mapper.WphPcservicedetailsCustomMapper;
import com.slk.wph.module.WPH_Pcservicetype.mapper.WphPcservicetypeCustomMapper;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.wph.module.WPH_Pcservicetype.service.WPH_PcservicetypeService;

import java.util.List;

@Service
public class WPH_PcservicetypeServiceImpl implements WPH_PcservicetypeService {

    @Autowired
    private WphPcservicetypeCustomMapper mapper;
    @Autowired
    private WphPcservicedetailsCustomMapper detailsMapper;
    @Autowired
    private WphUserCustomMapper usercustomMapper;

    @Override
    public List<WphPcservicetype> selectAllPcservicetype() {
        return mapper.selectAllPcservicetype();
    }

    @Override
    public List<WphPcservicetype> selectPcservicetypeState() {
        return mapper.selectPcservicetypeState();
    }

    @Override
    public int savePcservicetype(WphPcservicetype wpst) {
        int count = 0;
        if (null != wpst.getFid()) {
            Boolean flag = hashCode(wpst);
            if (flag) {
                mapper.updatePcservicetype(wpst);
                if (wpst.getState() == 1) {
                    detailsMapper.updatePcservicedetailsState(wpst.getFid(), wpst.getCreateuser());
                }
            }
        }else {
            mapper.savePcservicetype(wpst);
        }
        return count;
    }

    @Override
    public WphUserCustom getRoleAndUserByUserFid(Integer userFid) {

        return usercustomMapper.getRoleAndUserByUserFid(userFid);
    }

    @Override
    public boolean hashCode(WphPcservicetype pst) {
        WphPcservicetype pcserviceType = mapper.selectByFid(pst.getFid());
        if (!pcserviceType.getImg().equals(pst.getImg()) || !pcserviceType.getName().equals(pst.getName()) || !pcserviceType.getState().equals(pst.getState())) {
            return true;
        } else {
            return false;
        }

    }
}