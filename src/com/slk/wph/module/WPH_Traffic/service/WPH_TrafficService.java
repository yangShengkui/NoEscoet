package com.slk.wph.module.WPH_Traffic.service;

import java.util.List;

import com.slk.wph.module.WPH_Traffic.po.WphTrafficCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

 public interface WPH_TrafficService {
	 
		public List<WphTrafficCustom> selectWphTrafficCustomState(Integer type,Integer state);
		
		public WphTrafficCustom selectWphTrafficCustomByFid(Integer fid);
		
		public int updateWphTrafficCustom(WphTrafficCustom wphTrafficCustom);
		
		public int insertWphTrafficCustom(WphTrafficCustom wphTrafficCustom);
		
		public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
}