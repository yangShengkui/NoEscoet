package com.slk.wph.module.WPH_Feedmenu.service.impl;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Feedmenu.mapper.WphFeedmenuMapper;
import com.slk.wph.module.WPH_Feedmenu.mapper.WphFeedmenuMapperCustom;
import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenu;
import com.slk.wph.module.WPH_Feedmenu.po.WphFeedmenuCustom;
import com.slk.wph.module.WPH_Feedmenu.service.WPH_FeedmenuService;
import com.slk.wph.module.WPH_Feedmenu_Time.mapper.WphFeedmenuTimeMapper;
import com.slk.wph.module.WPH_Feedmenu_Time.mapper.WphFeedmenuTimeMapperCustom;
import com.slk.wph.module.WPH_Feedmenu_Time.po.WphFeedmenuTimeCustom;
import com.slk.wph.module.WPH_Feedtype.mapper.WphFeedtypeMapper;
import com.slk.wph.module.WPH_Feedtype.mapper.WphFeedtypeMapperCustom;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtype;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtypeCustom;
import com.slk.wph.module.WPH_Feedtype.po.WphFeedtypeExample;
import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class  WPH_FeedmenuServiceImpl implements WPH_FeedmenuService {


      @Autowired
      private WphFeedtypeMapperCustom mapper;
      @Autowired
      private WphFeedtypeMapper typemapper;
      @Autowired
      private WphFeedmenuMapper feedMapper;
      @Autowired
      private WphFeedmenuMapperCustom feedMapperCustom;
      @Autowired
      private WphFeedmenuTimeMapper timeMapper;
      @Autowired
      private WphFeedmenuTimeMapperCustom timeMapperCustom;


      @Override
      public Boolean setFeedType(WphFeedtype type) {
       Integer count;
       if (null == type.getFid()){
         count = typemapper.insertSelective(type);
       }else{
         count = typemapper.updateByPrimaryKeySelective(type);
       }
       return count>0;
      }

     @Override
     public List<WphFeedtypeCustom> selectFeedtypesByPId() {
        List<WphFeedtypeCustom> types = mapper.selectParentTypes();
        return types;
     }

     @Override
     public Boolean setFeedmenu(WphFeedmenuCustom feed) {
           Integer count = 0;
          if(null != feed.getMultipartFile()&&feed.getMultipartFile().getSize()!=0){
           feed.setImgs(FileUtil.FileImgUp(feed.getMultipartFile(),"wph/std" ));
          }else{
              feed.setImgs(null);
          }
           if(null == feed.getFid()){
            count = feedMapper.insertSelective(feed);
           }else {
            count = feedMapper.updateByPrimaryKeySelective(feed);
           }
        return count>0;
     }

    @Override
    public List<WphFeedmenuCustom> selectweekFeedAll() {
        return feedMapperCustom.selectweekFeedAll();
    }

    @Override
    public Integer getDeleteOrCreateByMealMenuTime(WphFeedmenuTimeCustom mealmenuTime) {
        Integer count = 0;
        if(mealmenuTime.getState() == 0){
            count = timeMapperCustom.deleteFeedMenuTimeByInfo(mealmenuTime);//删除
        }else{
            count = timeMapper.insertSelective(mealmenuTime);//插入
        }
        return count;
    }
}