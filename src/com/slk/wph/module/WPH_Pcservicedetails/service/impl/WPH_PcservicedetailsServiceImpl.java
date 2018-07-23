package com.slk.wph.module.WPH_Pcservicedetails.service.impl;

import com.slk.wph.module.WPH_Pcservicedetails.mapper.WphPcservicedetailsCustomMapper;
import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetails;
import com.slk.wph.module.WPH_Pcservicetype.mapper.WphPcservicetypeCustomMapper;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.wph.module.WPH_Pcservicedetails.service.WPH_PcservicedetailsService;

import java.util.List;

@Service
public class WPH_PcservicedetailsServiceImpl implements WPH_PcservicedetailsService {
    @Autowired
    private WphPcservicedetailsCustomMapper mapper;
    @Autowired
    private WphPcservicetypeCustomMapper serivceTypeMapper;
    @Autowired
    private WphUserCustomMapper usercustomMapper;

    @Override
    public List<WphPcservicedetails> selectPcservicedetailsTypeFId(Integer pcserviceTypeFid, Integer state) {
        return mapper.selectPcservicedetailsTypeFId(pcserviceTypeFid, state);
    }

    @Override
    public WphPcservicedetails selectByFid(Integer fid) {
        return mapper.selectByFid(fid);
    }

    @Override
    public int savePcservicedetails(WphPcservicedetails psd) {
        int count = 0;
        if (null != psd.getFid()) {
            Boolean flag = hashCode(psd);
            if (flag) {
                mapper.updatePcservicedetails(psd);
            }
        } else {
            mapper.savePcservicedetails(psd);
        }
        return count;
    }

    @Override
    public WphUserCustom getRoleAndUserByUserFid(Integer userFid) {

        return usercustomMapper.getRoleAndUserByUserFid(userFid);
    }

    public boolean hashCode(WphPcservicedetails psd) {
        Boolean flag=false;
        //通过fid获取 WphPcservicedetails
        WphPcservicedetails pcservicedetails = mapper.selectByFid(psd.getFid());
        //如果数据已变更
        if (!pcservicedetails.getDetail().equals(psd.getDetail()) || !pcservicedetails.getImg().equals(psd.getImg())) {
            flag=true;
        }else if (!pcservicedetails.getNote().equals(psd.getNote()) || !pcservicedetails.getPcservicetypeFid().equals(psd.getPcservicetypeFid()) ) {
            flag=true;
        }else if(!pcservicedetails.getState().equals(psd.getState())){
            //数据已经变更。但是修改状态--从1改成0
            if(psd.getState()==0){
                int serivceTypeState=serivceTypeMapper.selectByFid(psd.getPcservicetypeFid()).getState();
                if(serivceTypeState==0){
                    flag=false;
                }
            }
            flag=true;
        }else{
            flag=false;
        }
        return flag;
    }

    @Override
    public List<WphPcservicetype> selectAllPcservicetype() {
        return serivceTypeMapper.selectAllPcservicetype();
    }


}