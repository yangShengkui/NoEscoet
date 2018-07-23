package com.slk.wph.module.WPH_Blood.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;

public interface WphBloodMapperCustom {
	
	 /**
	  * 
	  *描述:根据cardid获取 血务信息
	  *@param cardid
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public WphBloodCustom getWphBloodCustomByCardId(String cardid);
	 
	 /**
	  * 
	  *描述:根据身份证号获取 血务信息
	  *@param codeid
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 //public WphBloodCustom getWphBloodCustomByCodeId(String codeid);
	 
	 /**
	  * 
	  *描述:保存到血务信息表
	  *@param wphBloodCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public int insertWphBloodCustom(WphBloodCustom wphBloodCustom);
	 /**
	  * 
	  *描述:修改血务信息表
	  *@param wphBloodCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public int updateWphBloodCustom(WphBloodCustom wphBloodCustom);
	 
	 /**
	  * 
	  *描述:查询所有的血务信息
	  *@return  血务集合
	  *创建人:赵福岭
	  *2017年6月23日
	  */
	 public List<WphBloodCustom> selectAll();
	 
	 public WphBloodCustom  selectWphBloodCustomByFid(Integer fid);
	 /**
	  * 
	  *描述:查询所有图片
	  *@return
	  *创建人:赵福岭
	  *2017年8月1日
	  */
	 public List<WphBloodCustom> selectAllPic(@Param("hospitalld")String hospitalld);
	 
}
