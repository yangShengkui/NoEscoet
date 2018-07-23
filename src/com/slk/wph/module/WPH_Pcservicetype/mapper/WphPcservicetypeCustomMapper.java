package com.slk.wph.module.WPH_Pcservicetype.mapper;

import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;

import java.util.List;

public interface WphPcservicetypeCustomMapper {

    public List<WphPcservicetype> selectAllPcservicetype();

    public List<WphPcservicetype> selectPcservicetypeState();

    public int savePcservicetype(WphPcservicetype wpst);

    public int updatePcservicetype(WphPcservicetype wpst);

    public WphPcservicetype selectByFid(Integer fid);
}
