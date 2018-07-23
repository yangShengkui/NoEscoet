package com.slk.wph.module.WPH_UserCodeId.service;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;

 public interface Wph_UserCodeIdService {
	 
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
	  *描述:修改并保存
	  *@param wphUsercodeidCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月20日
	  */
	 public int update(WphUsercodeidCustom wphUsercodeidCustom);
	 
	 
	 
	 public int save(WphUsercodeidCustom wphUsercodeidCustom);
	 
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
	  *描述  根据cardfid获取患者信息
	  *@param cardFid
	  *@return
	  *创建人:赵福岭
	  *2017年6月21日
	  */
	 public WphCustomerCustom selectByCardFid(String cardFid);
	 
	 /**
	  * 
	  *描述: 获取登录名及角色名称
	  *@param wphUserCustom
	  *@return
	  *创建人:赵福岭
	  *2017年6月21日
	  */
	 public  WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
	 
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
	  *描述:根据位置号查询
	  *@return
	  *创建人:赵福岭
	  *2017年7月10日
	  */
	 public WphUsercodeidCustom getWphUserCodeIdByCodeNumber(String codeNumber);
}