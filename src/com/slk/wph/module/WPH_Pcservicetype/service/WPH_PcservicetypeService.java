package com.slk.wph.module.WPH_Pcservicetype.service;

import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

import java.util.List;


public interface WPH_PcservicetypeService {

  public List<WphPcservicetype> selectAllPcservicetype();

  public List<WphPcservicetype> selectPcservicetypeState();

  public int savePcservicetype(WphPcservicetype wpst);

  public WphUserCustom getRoleAndUserByUserFid(Integer userFid);

  public boolean hashCode(WphPcservicetype pst);
 }