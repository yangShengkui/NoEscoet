package com.slk.wph.module.WPH_Customer.service;

import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card_Relation.po.WphCardRelation;
import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.po.WphWorkerCustom;
import com.slk.wph.module.WPH_Device.po.WphDevice;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;
import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingConsumeInfo;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;

 public interface WPH_CustomerService {
	 /**
	  * 
	  *描述:根据绑定的卡号获取病人信息
	  *@param cardFid
	  *@return
	  *创建人:赵福岭
	  *2017年6月21日
	  */
	 public WphCustomerCustom selectByCardFid(String cardFid);
	 
	 
	 
	 /**
	  * 描述：获取院区集合以及院区下的病区集合
	  *
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年6月14日-下午5:00:10
	  */
	 public List<WphHospitaCustom> getWphHospitaAndWphWard();
	 /**
	  * 描述：根据fid获取card押金
	  *
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年6月19日-下午2:44:26
	  */
	 public WphCost getCostByFid(Integer costfid);
	 /**
	  * 描述：用户信息录入
	  *
	  * @param custom
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年6月19日-下午4:17:28
	  */
	 public Integer InsertCustomerByInfo(WphCustomerCustom custom);
	 /**
	  * 描述：用户消费信息录入
	  *
	  * @param ordering
	  * @return
	  *
	  * 创  建  人：宋现亮
	  * 创建时间：2017年6月19日-下午4:21:42
	  */
	 public Integer InsertOrderingByInfo(WphOrdering ordering);
    /**
     * 描述：根据userFid获取管理员信息以及角色信息
     *
     * @param custom
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月19日-下午5:28:47
     */
    public WphUserCustom getRoleAndUserByUserFid(Integer userFid);
    /**
     * 描述：根据card获取card对象
     *
     * @param card
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月20日-上午9:21:16
     */
    public WphCard getCardByCardInfo(WphCard card);
	/**
	 * 描述：Customer根据对象获取信息
	 *
	 * @param customer
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月21日-下午3:25:47
	 */
	public WphCustomerCustom getCustomerByInfo(WphCustomer customer);
	/**
	 * 描述：根据fid修改card信息
	 *
	 * @param card
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月21日-下午3:55:29
	 */
	public void updateCardByCardFid(WphCard card);
	/**
	 * 描述：根据卡片Id OR 卡号获取患者信息
	 *
	 * @param cardId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月27日-下午12:03:31
	 */
	public WphCustomerCustom getCustomerByCard(String cardId);
    /**
     * 描述：根据病区获取护工组长
     *
     * @param wardFid
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月28日-下午3:06:44
     */
    public WphUserCustom getUserByRoleWard(Integer wardFid);
    /**
     * 描述：根据UserId获取用户信息
     *
     * @param userFid
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月28日-下午4:37:24
     */
    public WphUserCustom getuserById(Integer userFid);
    /**
     * 描述：修改患者信息
     *
     * @param customer
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月30日-下午4:13:03
     */
    public Integer updateCustomerByFid(WphCustomer customer);
    /**
     * 描述：insert 卡关联表
     *
     * @param cardRelation
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月30日-下午4:14:00
     */
    public Integer InsertCardRelationByFid(WphCardRelation cardRelation);
    
    /**
     * 
     *描述:查询所有已办护理的患者信息
     *@param date
     *@return
     *创建人:赵福岭
     *2017年8月2日
     */
    public List<WphCustomerCustom> selectAllCustomer(Integer wardFid,Integer nursingType,Date date);

    /**
     * 
     *描述:查询护工
     *@param type (0未结算   ，1已结算)
     *@return
     *创建人:赵福岭
     *2017年8月3日
     */
    public List<WphWorkerCustom> selectAllWorker(Date startDate,Date endDate,Integer type);
    /**
     * 
     *描述:查询一对一护理
     *@param fid
     *@return
     *创建人:赵福岭
     *2017年8月4日
     */
    public WphOneCustom getWphOneByFid(Integer fid);
    
    /**
     * 
     *描述:修改一对一信息
     *@param wphone
     *@return
     *创建人:赵福岭
     *2017年8月4日
     */
    public int updateWphOne(WphOneCustom wphone);
	/**
	 * 描述：通过查询fid获取服务信息
	 *
	 * @param queryFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月17日-下午2:55:55
	 */
	public WphServicedetailsCustom selectByQueryFid(Integer queryFid);
	/**
	 * 描述：通过住院号获取总消费信息
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:28:22
	 */
	public WphOrderingConsumeInfo getOrderSummaryByHospital(String hospitalId);
	/**
	 * 描述：通过住院号获取总消费信息
	 * 		1.计算当天早上倘若在退餐（早餐）时间之外出院，将当天的餐费以及明天所有类型的的餐费退换到卡内余额
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-上午9:28:22
	 */
	public WphOrderingConsumeInfo getOrderSummaryByHospital2(String hospitalId);
	/**
	 * 描述：获取出院结算应退的餐类集合
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月18日-下午4:19:43
	 */
	public List<WphOrderingfoodCustom> getOrderingfoodRetreatByHospitalId(String hospitalId);
	/**
	 * 描述：通过住院号显示要退费的订单信息
	 *
	 * @param hospitalId
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月22日-下午1:48:14
	 */
	public List<WphOrderingCustom> getRetreatMoneyByHospitalld(String[] ordernumbers);
	/**
	 * 描述：通过fid修改餐类信息表
	 *
	 * @param food
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月22日-下午2:03:26
	 */
	public Integer updateOrderFoodByFid(WphOrderingfood food);
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
	 * 描述：根据order信息获取对象
	 *
	 * @param ordering
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月24日-下午4:11:39
	 */
	public WphOrdering getOrderingByInfo(WphOrdering ordering);
	
	/**
	 * 
	 *描述:查询所有开启的病区
	 *@return
	 *创建人:赵福岭
	 *2017年9月2日
	 */
	public  List<WphWardCustom> getWphWardListByStatus();
	/**
	 * 描述：获取-最早的一条待发卡卡号
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月3日-下午12:51:46
	 */
	public WphCard getUnusedCardOne();
	
	
	
	/**
	  * 
	  *描述:查询所有一对一护理图片
	  *@return
	  *创建人:赵福岭
	  *2017年8月1日
	  */
	 public List<WphOneCustom> selectWphOnePic(String hospitalld);
	
	
	 /**
	  * 
	  *描述:查询所有图片
	  *@return
	  *创建人:赵福岭
	  *2017年8月1日
	  */
	 public List<WphBloodCustom> selectAllPic(String hospitalld);
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
	 *描述:通过病区查找不满病区预警的患者
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年9月6日
	 */
	public List<WphCustomerCustom> selectCustomerBalanceByWardFid(Integer wardFid);
	/**
	 * 描述： 支付宝是否超额(0不能使用支付宝支付，1可以支付)
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月11日-上午11:35:06
	 */
	public Integer PayCheck();
	/**
	 * 描述：通过患者FID清除身份证在库信息 
	 *
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月9日-下午1:21:23
	 */
	public Integer cleanCodeidByCustomerFid(Integer customerFid);
	/**
	 * 描述：根据customerFid获取对象信息
	 *
	 * @param customerFid
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月30日-上午10:28:43
	 */
	public WphCustomer getCustomerByFid(Integer customerFid);
	 /**
	  * 通过住院号获取患者是否出院
	  * @param HospitalId
	  * @return
	  */
	 public Integer getOutHospitalByHospitalId(String hospitalId);

	 /**
	  * 根据住院号查询患者信息
	  * @param name
	  * @return
	  */
	 public List<WphCustomerCustom> getCustomerByName(String name);

	 /**
	  *
	  * @param ordernumbers
	  * @return
	  */
	 public String getRetreaOrdernumbers(String hospitalld);

	 /**
	  * 通过住院号或者卡号获取患者信息
	  * @param hospitalId
	  * @return
	  */
	 public WphCustomerCustom getCustomerByNumber(String number);
	 /**
	  * 根据fid获取用户协议对象
	  * Create by song on 2018-01-22 15:33:38
	  */
	 public WphWarmprompt getCustomerNotice(Integer fid);
	 /**
	  * 根据id获取信息
	  * Create by song on 2018-01-26 13:37:48
	  */
	 public WphDevice getDeviceByDeviceid(String deviceid);

	 public Boolean setPrepcustomerById(WphPrepcustomer customer);

	 public List<WphPrepcustomer> getPrepListByNowDate();
 }