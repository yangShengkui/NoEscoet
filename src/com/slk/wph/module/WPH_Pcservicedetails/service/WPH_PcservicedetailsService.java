package com.slk.wph.module.WPH_Pcservicedetails.service;

import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetails;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

import java.util.List;

public interface WPH_PcservicedetailsService {


 public WphUserCustom getRoleAndUserByUserFid(Integer userFid);
 /**
  * 通过类型fid 查询所有详细服务
  * @param pcserviceTypeFid
  * @return
  */
 public List<WphPcservicedetails> selectPcservicedetailsTypeFId(Integer pcserviceTypeFid, Integer state);

 /**
  * 通过fid查询详细服务
  * @param fid
  * @return
  */
 public WphPcservicedetails selectByFid(Integer fid);


 /**
  * （根据fid判定是新增还是修改）新增或者修改
  * @param psd
  * @return
  */
 public int savePcservicedetails(WphPcservicedetails psd);

 /**
  * （用于大屏幕）获取所有服务类型(状态为启用)
  * @return
  */

 public List<WphPcservicetype> selectAllPcservicetype();

}