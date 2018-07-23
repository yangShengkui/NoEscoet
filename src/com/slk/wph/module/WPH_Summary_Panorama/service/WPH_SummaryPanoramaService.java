package com.slk.wph.module.WPH_Summary_Panorama.service;

import java.util.List;

import com.slk.wph.module.WPH_Summary_Panorama.po.WphSummaryPanoramaCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

 public interface WPH_SummaryPanoramaService {
	 
	 public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
	 
	 public List<WphSummaryPanoramaCustom> selectSummaryPanoramaState();
		
	 public List<WphSummaryPanoramaCustom> selectSummaryPanoramaAll();
		
	 public void insertSummaryPanorama(WphSummaryPanoramaCustom summaryPanoramaCustom);
		
	 public int updateSummaryPanorama(WphSummaryPanoramaCustom summaryPanoramaCustom);
	 
	 public List<WphSummaryPanoramaCustom> selectSummaryPanoramaByFid(Integer fid);
	 /**
	  * 根据类型  获取数据
	  * @param type
	  * @return
	  */
	 public List<WphSummaryPanoramaCustom> selectSummaryPanoramaByType(Integer type,Integer state);

	 /**
	  * 查询所有类型名称
	  * @return
	  */
	 public List<String> selectType();
}