package com.slk.wph.module.WPH_Unsubscribetime.service;

import java.util.List;

import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetime;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;

 public interface WPH_UnsubscribetimeService {
	 /**
	  * 描述：获取时间集合
	  *
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年8月7日-下午1:07:21
	  */
	 public List<WphUnsubscribetimeCustom> getUnsubsbscribetime();
	 /**
	  * 描述：根据fid修改时间
	  *
	  * @param time
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年8月7日-下午1:53:19
	  */
	 public Integer updateTimeByFid(WphUnsubscribetime time);
}