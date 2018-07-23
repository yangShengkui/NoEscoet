package com.slk.wph.module.WPH_Customer.mapper;

import java.util.List;
import java.util.Date;

import com.slk.wph.module.WPH_Ordering.po.WphMealInfo;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;

public interface WphCustomerMapperCustom {
	/**
	 * 描述：患者信息录入
	 * 
	 * @param customer
	 * @return
	 * 
	 *         创 建 人：宋现亮 创建时间：2017年6月19日-下午4:31:49
	 */
	public Integer insertCustomerByInfo(WphCustomer customer);

	/**
	 * 
	 * 描述:查询患者信息
	 * 
	 * @param cardFid
	 * @return 创建人:赵福岭 2017年6月21日
	 */
	public WphCustomerCustom selectByCardFid(String cardFid);

	/**
	 * 描述：Customer根据对象获取信息
	 * 
	 * @param customer
	 * @return
	 * 
	 *         创 建 人：宋现亮 创建时间：2017年6月21日-下午3:25:47
	 */
	public WphCustomerCustom getCustomerByInfo(WphCustomer customer);

	/**
	 * 
	 * 描述:修改患者信息
	 * 
	 * @param wphCustomerCustom
	 * @return 创建人:赵福岭 2017年6月23日
	 */
	public int updateCustomer(WphCustomerCustom wphCustomerCustom);

	/**
	 * 
	 * 描述:获取患者信息
	 * 
	 * @return 创建人:赵福岭 2017年6月23日
	 */
	public WphCustomerCustom getCustomerByFid(Integer fid);

	/**
	 * 
	 * 描述:根据住院号获取患者信息
	 * 
	 * @param hospitalld
	 * @return 创建人:赵福岭 2017年6月26日
	 */
	public WphCustomerCustom getCustomerByHospitalld(String hospitalld);

	/**
	 * 描述：根据卡片Id获取患者信息
	 * 
	 * @param cardId
	 * @return
	 * 
	 *         创 建 人：宋现亮 创建时间：2017年6月27日-下午12:03:31
	 */
	public WphCustomerCustom getCustomerByCardId(String cardId);

	/**
	 * 描述：根据卡片号码获取患者信息
	 * 
	 * @return
	 * 
	 *         创 建 人：宋现亮 创建时间：2017年6月27日-下午12:03:31
	 */
	public WphCustomerCustom getCustomerByCardNumber(String cardNumber);
	/**
	 * 描述：根据food信息获取患者集合以及普餐信息集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:04:02
	 */
	public List<WphCustomerCustom> getCustomerAndFoodOByFood(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据food信息获取患者集合以及糖餐信息集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:04:02
	 */
	public List<WphCustomerCustom> getCustomerAndFoodSByFood(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据food信息获取没有定制的肠内配置患者集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:04:02
	 */
	public List<WphCustomerCustom> getCustomerAndFoodIByFood(WphOrderingfoodCustom custom);
	/**
	 * 描述：根据food信息获取患者能变普餐的信息
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月2日-上午10:04:02
	 */
	public WphCustomerCustom getCustomerAndFoodCByFood(WphOrderingfoodCustom custom);
	
	/**
	 * 
	 *描述:查询所有办理护理的患者信息
	 *@param date
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	public List<WphCustomerCustom> selectAllCustomer(@Param("wardFid")Integer wardFid,@Param("nursingType")Integer nursingType,@Param("date")Date date);

	/**
	 * 
	 *描述:患者及发票信息
	 *@return
	 *创建人:赵福岭
	 *2017年8月9日
	 */
	public WphCustomerCustom getWphInvoiceManger(String hospitalld);
	
	/**
	 * 
	 *描述:余额预警
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月21日
	 */
	public List<WphCustomerCustom> getCustomByHospitalldStates(@Param("wardFid")Integer wardFid);
	/**
	 * 描述：通过fid清空卡FID，卡Number，余额
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月22日-下午5:12:18
	 */
	public Integer getEmptyCustomerByFid(Integer fid);
	/**
	 * 描述：获取满足条件可以自动退卡退费的用户集合（条件：满足6个月没有消费状态的用户）
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午3:05:28
	 */
	public List<WphCustomerCustom> getRetreatCardCustomerList();
	/**
	 * 描述：通过住院号获取自动退卡退费的患者
	 *
	 * @param hospitalld
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午4:10:34
	 */
	public WphCustomerCustom getRetreatCardFeeCustomerByhos(String hospitalld);
	/**
	 * 描述：退卡退费信息汇总
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月2日-下午5:19:37
	 */
	public List<WphCustomerCustom> RetreatCardFee_Summary(WphOrderingCustom order);
	/**
	 * 描述：通过患者信息获取患者集合
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-下午1:08:17
	 */
	public List<WphCustomerCustom> getCustomerListByInfo(WphCustomer custom);
	
	/**
	 * 
	 *描述:余额 预警
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年9月6日
	 */
	public List<WphCustomerCustom> selectCustomerBalanceByWardFid(Integer wardFid);
	/**
	 * 描述 :根据住院号OR卡号获取打印信息-webservice
	 *
	 * @param value
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月16日-下午4:33:15
	 */
	public List<WphCustomerCustom> getPSTByCustomerInfo(String value);

	/**
	 * 获取VIP国际诊疗中心的用户信息
	 * @param hospitalId 住院号
	 * @return
	 */
	public WphCustomerCustom getVIPReserve(String hospitalId);
	/**
	 * 根据属性获取患者订餐的信息（空腹）
	 * @param food
	 * @return
	 */
	public List<WphCustomerCustom> getInputFactFoodListByInfo(WphOrderingfoodCustom food);
	/**
	 * 根据患者姓名查询患者信息
	 * @param name
	 * @return
	 * 2017-12-19
	 * 赵福岭
	 */
    public List<WphCustomerCustom> getCustomerByName(String name);

	/**
	 * 根据id和住院号查找患者信息
	 * @param hospitalld
	 * @return
	 * 庞军霞
	 */
    public int selectCustomerById(@Param("hospitalld") String hospitalld);

    public List<WphMealInfo> selectMealTcInfo(@Param("datatime") String datatime,@Param("wardFid") String wardFid);
}
