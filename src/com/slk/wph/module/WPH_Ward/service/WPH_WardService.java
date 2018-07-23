package com.slk.wph.module.WPH_Ward.service;

import java.util.List;

import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;
import com.slk.wph.module.WPH_Ward.po.WphWard;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

 public interface WPH_WardService {
	 /**
	  * 
	  *描述:查询所有病区
	  *@return WphWard类型集合
	  *创建人:赵福岭
	  *2017年6月9日
	  */
	 public List<WphWardCustom> getWphWardList();
	 
	 /**
	  * 
	  *描述:更新并保存病区
	  *@param WphWard
	  *创建人:赵福岭
	  *2017年6月8日
	  */
	 public void updateAndSaveWphHospita(WphWard WphWard);
	 
	 /**
	  * 
	  *描述:修改时查询数据库用是否有该病区的名称
	  *@param name
	  *@return 
	  *创建人:赵福岭
	  *2017年6月12日
	  */
	 public int checkWphWard(String name);
	 
	 /**
	  * 
	  *描述:新增时查询数据库用是否有该病区的名称
	  *@param fid,name
	  *@return 
	  *创建人:赵福岭
	  *2017年6月12日
	  */
	 public int checkWphWard(Integer fid,String name);
	 
	
}