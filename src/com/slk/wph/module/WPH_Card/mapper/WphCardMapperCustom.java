package com.slk.wph.module.WPH_Card.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;

public interface WphCardMapperCustom {
	
	public void insertCard(WphCard wphCard);
	
	public WphCard getWphCardById(Integer fid);
	
	public void updateCard(WphCard wphCard);
	
	public List<WphCard> getWphCardList();
	
	public int getWphCardByCardIdOrCardNumber(@Param("cardid") String cardid,@Param("cardnumber") String cardnumber);
	/**
	 * 描述：根据info中的一个或多个属性进行获取
	 *
	 * @param card
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月29日-上午9:29:53
	 */
	public WphCard getCardByCardInfo(WphCard card);
	/**
	 * 
	 *描述:按状态和绑定时间查询卡片信息
	 *@param status
	 *@param bindingTime
	 *@return
	 *创建人:赵福岭
	 *2017年8月7日
	 */
	public List<WphCardCustom> selectCustomerAndCard(@Param("status")Integer status,
			@Param("startDate")Date startDate,
			@Param("endDate")Date endDate);
	/**
	 * 描述：：验证卡是否存在待发卡（10：读卡器，6：人工）
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月14日-下午1:10:41
	 */
	public WphCardCustom getredingByCardId(String cardStr);
	/**
	 * 描述：：验证卡是否存在待发卡（10：读卡器，6：人工）
	 *
	 * @param cardStr
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月14日-下午1:10:41
	 */
	public WphCardCustom getredingByCardNumber(String cardStr);
	/**
	 * 描述：获取-最早的一条待发卡卡号
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-下午12:51:46
	 */
	public WphCard getUnusedCardOne();

}
