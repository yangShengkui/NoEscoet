package com.slk.wph.module.WPH_Notice.service;

import com.slk.wph.module.WPH_Notice.po.WphNotice;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

public interface WPH_NoticeService {
 /**
  * 根据fid获取用户协议对象
  * Create by song on 2018-01-22 15:33:38
  */
  public WphNotice getCustomerNotice(Integer fid);
  /**
   * 根据fid修改用户协议对象
   * Create by song on 2018-01-22 16:22:56
   */
  public Integer updateNoticeByFid(WphNotice notice);
  /**
   * 根据userFid 获取user对象以及角色信息
   * Create by song on 2018-01-22 17:10:45
   */
  public WphUserCustom getRoleAndUserByUserFid(Integer userFid);
}