package com.slk.wph.module.WPH_Hospita.service;

import java.util.List;

import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;

 public interface WPH_HospitaService {
	 /**
	  * 
	  *描述:更新并保存院区
	  *@param wphHospita
	  *创建人:赵福岭
	  *2017年6月8日
	  */
	 public void updateAndSaveWphHospita(WphHospita wphHospita);
	 
	 /**
	  * 
	  *描述:删除院区
	  *@param fid
	  *创建人:赵福岭
	  *2017年6月8日
	  */
	 public void deleteWphHospitaById(Integer fid);
	 
	 
	 /**
	  * 
	  *描述:获取院区
	  *@param fid
	  *@return  WphHospita
	  *创建人:赵福岭
	  *2017年6月8日
	  */
	 public WphHospita getWphHospitaById(Integer fid);
	 
	 /**
	  * 
	  *描述:查询全部院区
	  *@return List<WphHospita>
	  *创建人:赵福岭
	  *2017年6月8日
	  */
	 public List<WphHospita> getWphHospitaList();
	 
	 /**
	  * 
	  *描述:修改时查询数据库用是否有该院区的名称
	  *@param name
	  *@return 
	  *创建人:赵福岭
	  *2017年6月12日
	  */
	 public int checkWphHospita(String name);
	 
	 /**
	  * 
	  *描述:新增时查询数据库用是否有该院区的名称
	  *@param name
	  *@return 
	  *创建人:赵福岭
	  *2017年6月12日
	  */
	 public int checkWphHospita(Integer fid,String name);
	 /**
	  * 
	  *描述:查询所有启用的院区
	  *@return
	  *创建人:赵福岭
	  *2017年8月11日
	  */
	 public List<WphHospita> getWphHospitaListByStatus();
	 /**
	  * 查询院区下面停用的的病区个数
	  *描述:
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年9月19日
	  */
	 public int  getWardCountStatus(Integer fid);
}