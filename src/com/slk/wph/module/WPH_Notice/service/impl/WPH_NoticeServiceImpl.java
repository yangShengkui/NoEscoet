package com.slk.wph.module.WPH_Notice.service.impl;

import com.slk.wph.module.WPH_Notice.mapper.WphNoticeMapper;
import com.slk.wph.module.WPH_Notice.po.WphNotice;
import com.slk.wph.module.WPH_Notice.service.WPH_NoticeService;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class  WPH_NoticeServiceImpl implements WPH_NoticeService  {


  @Autowired
  private WphNoticeMapper mapper;
  @Autowired
  private WphUserCustomMapper userMapper;

  @Override
  public WphNotice getCustomerNotice(Integer fid) {
   WphNotice notice = mapper.selectByPrimaryKey(fid);
   return notice;
  }

 @Override
 public Integer updateNoticeByFid(WphNotice notice) {
  int count = mapper.updateByPrimaryKeySelective(notice);
  return count;
 }

 @Override
 public WphUserCustom getRoleAndUserByUserFid(Integer userFid) {
  return userMapper.getRoleAndUserByUserFid(userFid);
 }

}