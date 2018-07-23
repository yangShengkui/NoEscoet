package com.slk.wph.module.WPH_Card.service;
import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

 public interface WPH_CardService {
	 /**
	  *描述:更新并保存
	  *@param wphCard
	  *创建人:赵福岭
	  *2017年6月7日
	  */
	public void UpdateAndSaveCard(WphCard wphCard);
	
	/**
	 *描述:根据Fid获取实体类
	 *@param fid
	 *@return  Entity
	 *创建人:赵福岭
	 *2017年6月7日
	 */
	public WphCard getWphCardById(Integer fid);
	
	/**
	 * 
	 *描述:获取全部卡片信息
	 *@return  List<WphCard>
	 *创建人:赵福岭
	 *2017年6月8日
	 */
	public List<WphCard> getWphCardList();
	/**
	 * 
	 *描述:查询卡片是否有冲突
	 *@return  WphCard
	 *创建人:赵福岭
	 *2017年6月8日
	 */
	public int getWphCardByCardIdOrCardNumber(String cardid,String cardnumber);
	
	
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
	
	/**
	 * 
	 *描述:根据卡片状态查询
	 *@param status
	 *@return
	 *创建人:赵福岭
	 *2017年8月7日
	 */
	public List<WphCardCustom> selectCustomerAndCard(Integer status,Date startDate,Date endDate);
}