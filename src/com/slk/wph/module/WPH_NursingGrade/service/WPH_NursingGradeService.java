package com.slk.wph.module.WPH_NursingGrade.service;

import java.util.List;

import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggrade;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;
import org.apache.ibatis.annotations.Param;

public interface WPH_NursingGradeService {
	 /**
	  * 
	  *描述:查询所有护理等级
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public List<WphNursinggradeCustom>  selectAllNursing();
	 
	 /**
	  * 
	  *描述:查询所有病区
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public List<WphWardCustom> getWardList();
	 /**
	  * 
	  *描述:添加护理信息
	  *@param wphNursinggradeCustom
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public int insertSelective(WphNursinggradeCustom wphNursinggradeCustom);
	 /**
	  * 
	  *描述:修改护理信息
	  *@param custom
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public int updateByPrimaryKeySelective(WphNursinggradeCustom custom);
	 /**
	  * 
	  *描述:修改关联表中的 护理名称
	  *@param wphWardOmCustom
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public int updateWardOmName(WphWardOmCustom wphWardOmCustom);
	 /**
	  * 
	  *描述:通过护理等级删除wardom
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public int deleteByNursingFid(Integer fid, Integer wardFid);
	 /**
	  * 
	  *描述:添加关联信息
	  *@param wphWardOmCustom
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	public int saveWphWardOmCustom(WphWardOmCustom wphWardOmCustom);


	public int saveWphWardOmCustomList(List<WphWardOmCustom> list);
	 /**
	  * 
	  *描述:通过fid获取护理信息
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年7月19日
	  */
	 public WphNursinggrade getByFid(Integer fid);
	 /**
	  * 
	  *描述:获取病区护理等级
	  *@return
	  *创建人:赵福岭
	  *2017年7月20日
	  */
	 public List<WphWardCustom>  getWardNursingMoney(Integer type);
	 
	 /**
	  * 
	  *描述:获取该类型的所有护理等级
	  *@param type
	  *@return
	  *创建人:赵福岭
	  *2017年7月20日
	  */
	 public List<WphNursinggradeCustom> selectNursing(Integer type);
	 /**
	  * 
	  *描述:通过病区Fid和 护理等级fid 修改金额
	  *@param custom
	  *@return
	  *创建人:赵福岭
	  *2017年7月20日
	  */
	 
     public int updateOmMoney(WphWardOmCustom custom);
     /**
      * 
      *描述:获取病区
      *@return
      *创建人:赵福岭
      *2017年7月24日
      */
     public List<WphWardCustom> getWphWardList();

	 /**
	  * 根据护理等级查询所有病区
	  * @return
	  */
     public List<String> selecetWardOmByGradeFid(Integer fid);

	/**
	 * 查询 病区下是否有已办护理的患者
	 * @param list
	 * @return
	 */
	public Integer selectNursingForWard(String fid,String[] wardFid);
     
}