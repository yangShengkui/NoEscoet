package com.slk.wph.module.WPH_Blood.service;
import java.util.Date;
import java.util.List;
import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;

 public interface WPH_BloodService {
	 /**
	  * 
	  *描述:获取当前登录人信息
	  *@param wphUserCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
	 
	 /**
	  * 
	  *描述  根据cardfid获取患者信息
	  *@param cardFid
	  *@return
	  *创建人:赵福岭
	  *2017年6月21日
	  */
	 public WphCustomerCustom selectByCardFid(String cardFid);
	 
	 
	 /**
	  * 
	  *描述:获取卡信息
	  *@param cardId
	  *@return
	  *创建人:赵福岭
	  *2017年6月21日
	  */
	 public WphCard getCardByCardId(String cardId);
	 
	 /**
	  * 
	  *描述:根据fid获取信息
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年6月20日
	  */
	 public WphUsercodeidCustom getWphUserCodeIdByFid(Integer fid);
	 
	 
	 /**
	  * 
	  *描述:修改
	  *@param wphUsercodeidCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月20日
	  */
	 public int updateWphUsercodeid(WphUsercodeidCustom wphUsercodeidCustom);
	 
	 /**
	  * 
	  *描述:保存
	  *@param wphUsercodeidCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月20日
	  */
	 public int saveWphUsercodeid(WphUsercodeidCustom wphUsercodeidCustom);
	 
	 
	 
	 
	 /**
	  * 
	  *描述:是否有闲置的
	  *@param codeid
	  *@return
	  *创建人:赵福岭
	  *2017年6月20日
	  */
	 public WphUsercodeidCustom selectByWphUserCode();
	 
	 /**
	  * 
	  *描述:根据用户身份证号，获取血务证件仓库信息
	  *@param codeid
	  *@return
	  *创建人:赵福岭
	  *2017年6月20日
	  */
	 public WphUsercodeidCustom getWphUserCodeList(String codeid);
	 
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
	// public WphBloodCustom getWphBloodCustomByCodeId(String codeid);
	 /**
	  * 
	  *描述:保存到血务表
	  *@param wphBloodCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public int insertWphBloodCustom(WphBloodCustom wphBloodCustom);
	 /**
	  * 
	  *描述:修改血务表
	  *@param wphBloodCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public int updateWphBloodCustom(WphBloodCustom wphBloodCustom);
	 
	 /**
	  * 
	  *描述:获取服务费用
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年6月22日
	  */
	 public WphCost selectWphCostByFid(Integer fid);
	 
	 /**
	  * 
	  *描述:保存到消费信息表
	  *@param wphOrdering
	  *@return
	  *创建人:赵福岭
	  *2017年6月23日
	  */
	 public int insertWphOrding(WphOrdering wphOrdering);
	 
	 /**
	  * 
	  *描述:查询所有的血务信息
	  *@return  血务集合
	  *创建人:赵福岭
	  *2017年6月23日
	  */
	 public List<WphBloodCustom> selectAll();
	 
	 
	 /**
	  * 
	  *描述:修改患者信息
	  *@return  
	  *创建人:赵福岭
	  *2017年6月23日
	  */
	 public int updateCustom(WphCustomerCustom wphCustomerCustom);
	 
	 /**
	  * 
	  *描述:根据fid获取患者信息
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年6月23日
	  */
	 public WphCustomerCustom getWphCustomerCustomByFid(Integer fid);
	 
	 /**
	  * 
	  *描述:根据fid获取血务信息
	  *@param fid
	  *@return
	  *创建人:赵福岭
	  *2017年6月23日
	  */
	 public WphBloodCustom selectWphBloodCustomByFid(Integer fid);
	 
	 public int updateWphUserCodeBlood(WphUsercodeidCustom wphUsercodeidCustom);
	 /**
	  * 
	  *描述:查询患者今天是否办过护理
	  *@param fid
	  *@param date
	  *@return
	  *创建人:赵福岭
	  *2017年10月18日
	  */
	 public int selectNursing(Integer customFid,Date date);
	 
	 
	 
}