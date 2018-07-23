package com.slk.wph.module.WPH_Orderingnursing.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursing;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;

public interface WphOrderingnursingMapperCustom {

	/**
	 * 
	 * 描述:根据患者住院号或者卡号查询患者信息
	 * 
	 * @param wphCustomerCustom
	 * @return 创建人:赵福岭 2017年6月28日
	 */
	public WphCustomerCustom selectByCardIdOrHospita(
			@Param("cardId") String cardId,
			@Param("hospita") String hospita);

	/**
	 * 
	 * 描述:获取患者信息
	 * 
	 * @param Integer
	 * @return 创建人:赵福岭 2017年6月23日
	 */
	public WphCustomerCustom getCustomerByFid(Integer fid);

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
	 * 描述:通过用户fid和病区号查询 是否有管辖病区
	 * 
	 * @param wphCustomerCustom
	 * @return 创建人:赵福岭 2017年6月23日
	 */
	public int selectCountByUserFid(@Param("userFid") Integer userFid,
			@Param("wardFid") Integer wardFid);

	/**
	 * 
	 * 描述:修改卡片信息
	 * 
	 * @param wphCard
	 *            创建人:赵福岭 2017年6月29日
	 */
	public void updateCard(WphCard wphCard);

	/**
	 * 
	 * 描述:根据fid获取卡片信息
	 * 
	 * @param fid
	 * @return 创建人:赵福岭 2017年6月29日
	 */
	public WphCard getWphCardById(Integer fid);

	/**************************************************************************************************/

	/**
	 * 
	 * 描述:通过用户的fid获取 用户管辖病区下的护理等级
	 * 
	 * @param userFid
	 * @return 创建人:赵福岭 2017年7月13日
	 */
	public List<WphNursinggradeCustom> selectNursingGradeByUserFid(
			@Param("userFid")Integer userFid,@Param("type") Integer type);

	/**
	 * 
	 * 描述:插入护理消费信息表
	 * 
	 * @param WphOrderingnursingcustom
	 * @return 创建人:赵福岭 2017年6月29日
	 */
	public int insertWphOrderingnursing(
			WphOrderingnursingCustom WphOrderingnursingcustom);

	/**
	 * 
	 * 描述:通过病区和护理类型获取该病区护理等级
	 * 
	 * @param wardFid
	 * @return 创建人:赵福岭 2017年6月29日
	 */
	public List<WphNursinggradeCustom> selectNursingGradeByWardFid(
			@Param("wardFid") Integer wardFid, @Param("type") Integer type);

	/**
	 * 通过护理等级fid获取护理等级的扩展信息 描述:
	 * 
	 * @param fid
	 * @return 创建人:赵福岭 2017年7月14日
	 */
	public WphNursinggradeCustom selectNursingGradeByFid(@Param("fid")Integer fid,@Param("wardFid")Integer wardFid,@Param("type")Integer type);

	/**
	 * 
	 * 描述:通过用户fid获取用户信息及角色名称
	 * 
	 * @param userFid
	 * @return 创建人:赵福岭 2017年6月29日
	 */
	public WphUserCustom getRoleAndUserByUser(Integer userFid);

	/**
	 * 
	 * 描述:通过病区Fid，护理等级获取护理关联表信息
	 * 
	 * @param wardFid
	 * @param nursingGradeFid
	 * @return 创建人:赵福岭 2017年6月29日
	 */
	public WphWardOmCustom selectWardOmCustom(
			@Param("wardFid") Integer wardFid,
			@Param("nursingGradeFid") Integer nursingGradeFid,
			@Param("type") Integer type);

	public WphWardOmCustom selectWardOmCustomByWM(
			@Param("wardFid") String wardFid,
			@Param("money") double money,
			@Param("type") Integer type);
	/**
	 * 
	 * 描述:按日期查询 未办护理的所有病人
	 * 
	 * @param date
	 *            wardFid, flag 注：如果flag有值时查询未办理护理的患者 如果flag为null时查询未办理护理的患者
	 * @return 创建人:赵福岭 2017年6月29日
	 */
	public List<WphCustomerCustom> selectCustomerNotNursing(
			@Param("date") Date date, @Param("wardFid") Integer wardFid);

	/**
	 * 
	 * 描述:按日期查询 所有办理过一对多的患者
	 * 
	 * @param date
	 * 
	 * @return
	 */
	public List<WphOrderingnursingCustom> selectCustomerAllNursing(@Param("type")Integer type);

	/**
	 * 
	 * 描述:查询所有患者管辖病区中未办理护理的患者
	 * 
	 * @param userFid
	 * @param date
	 * @return 创建人:赵福岭 2017年7月14日
	 */

	public List<WphCustomerCustom> selectNotNursing(
			@Param("userFid") Integer userFid, @Param("date") String date);
	/**
	 * 
	 *描述:一对多：按日期查询用户管辖区域中所有已办理过护理的患者 
	 *@param userFid
	 *@param date
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年7月14日
	 */
	public List<WphCustomerCustom> selectCustomerNursing(
			@Param("userFid") Integer userFid, @Param("date") Date date,
			@Param("type") Integer type);

	/**
	 * 
	 * 描述:通过患者fid和日期查询患者是否已订护理
	 * 
	 * @param customFid
	 * @param date
	 * @return 创建人:赵福岭 2017年7月14日
	 */
	public int selectNursinggradeByCusFidAndDate(
			@Param("customFid") Integer customFid, @Param("date") Date date);

	/**
	 * 
	 * 描述:插入消费信息
	 * 
	 * @param woc
	 * @return 创建人:赵福岭 2017年6月30日
	 */
	public int insertOrdering(WphOrdering woc);

	/**
	 * 
	 * 描述:按日期查询 患者fid的护理消费表
	 * 
	 * @param customerFid
	 * @param date
	 * @return 创建人:赵福岭 2017年7月31日
	 */
	public WphOrderingnursingCustom selectOrderingBycusFid(@Param("customerFid") Integer customerFid, @Param("date") Date date);
	
	

	/**
	 * 
	 * 描述:查询 某日 患者fid的护理消费表
	 * 
	 * @param customerFid
	 * @param date
	 * @return 创建人:赵福岭 2017年7月6日
	 */
	public WphOrderingnursingCustom selectOrderingByCustomerFid(@Param("customerFid") Integer customerFid, @Param("date") Date date,@Param("type") Integer type);


	/**
	 *
	 * 描述:根据fid查询护理等级
	 * 
	 * @param fid
	 * @return 创建人:赵福岭 2017年7月11日 
	 */
	public WphWardOmCustom selectWardOmByFid(Integer fid);

	/**************************************************************************************************************************************/

	/**
	 * 
	 * 描述:一对一查询用：<!-- 按卡片number或者住院号/日期，查询患者信息及患者病区号，患者的护理类型 -->
	 * 
	 * @param cardId
	 * @param hospita
	 * @param date
	 * @return 创建人:赵福岭 2017年7月12日
	 */
	public WphCustomerCustom selectCustomerNursingType(
			@Param("cardId") String cardId,
			@Param("hospita") String hospita, @Param("date") Date date);

	/**
	 * 
	 * 描述:查询所有护工
	 * 
	 * @return 创建人:赵福岭 2017年7月13日
	 */
	public List<WphCustomer> selectWorker();

	/**
	 * 
	 * 描述:添加一对一护理信息
	 * 
	 * @param wphOne
	 * @return 创建人:赵福岭 2017年7月13日
	 */
	public int insertSelective(WphOneCustom wphOne);

	/**
	 * 
	 * 描述:查询患者护理等级
	 * 
	 * @param customerFid
	 * @return 创建人:赵福岭 2017年7月13日
	 */
	public WphNursinggradeCustom selectNursingGradeByCustomerFid(@Param("customerFid")Integer customerFid,@Param("date")Date date);

	/**
	 * 
	 *描述:获取用户管辖的所有病区
	 *@param userFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	public List<WphWardCustom> selectWardListByUserFid(Integer userFid);
	
	/**
	 * 
	 *描述:通过时间查询  某病区已经办理护理的所有用户
	 *@param wardFid
	 *@param date
	 *@param type   1 一对多，  2一对一
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	public List<WphCustomerCustom> selectCustomerByWardAndDate(@Param("wardFid")Integer wardFid,@Param("date")Date date,@Param("type")Integer type);
	
	/**
	 * 
	 *描述:根据用户fid查询一对一的信息
	 *@param customerFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月20日
	 */
	public WphOneCustom selectWphOneByCustomerFid(Integer customerFid);
	/**
	 * 
	 *描述:刷卡查询已经办理一对多患者信息
	 *@param cardId
	 *@param hospita
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年7月21日
	 */
	public WphCustomerCustom selectCustomerNursingGrade(@Param("cardId") String cardId,@Param("hospita") String hospita, @Param("date") Date date);
	
	
	/**
	 * 
	 *描述:查询患者 开始到结束日期的总费用
	 *@return
	 *创建人:赵福岭
	 *2017年7月24日
	 */
	public Double totalCost(@Param("wphOneFid") Integer wphOneFid,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	/**
	 * 
	 *描述:修改一对一护理表
	 *@return
	 *创建人:赵福岭
	 *2017年7月24日
	 */
	public int updateByWphOne(WphOneCustom wphone);
	
	/**
	 * 
	 *描述:查询所有办理一对一的患者
	 *@return
	 *创建人:赵福岭
	 *2017年7月26日
	 */
	public List<WphCustomerCustom> selectCustomerAllOne();
	
	/**
	 * 陪护汇总
	 *描述:
	 *@param customerFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月27日
	 */
	public List<WphCustomerCustom> selectSummaryNursing(@Param("userFid") Integer customerFid,
			@Param("date") Date date,
			@Param("nursingGradeFid") Integer nursingGradeFid);
	/**
	 * 
	 *@param customerFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月1日
	 */
	public WphOrderingCustom getOrderingByCustomerFid(Integer customerFid);
	/**
	 * 
	 *描述:查询所有办理护理的患者信息
	 *@param date
	 *@return
	 *创建人:赵福岭
	 *2017年8月2日
	 */
	public List<WphCustomerCustom> selectAllCustomer(@Param("date")Date date);
	
	/**
	 * 
	 *描述:修改订餐信息表(转病区去掉订餐信息表的床位号)
	 *@param orderingfoot
	 *@return
	 *创建人:赵福岭
	 *2017年8月28日
	 */
	public int updateByOrderingfoodFid(@Param("date")Date date,@Param("customerFid")Integer customerFid,@Param("time")String time);

	public int updateOrderingByOrderingfood(@Param("wardFid")String wardFid,@Param("date")Date date,@Param("customerFid")Integer customerFid,@Param("time")String time);

	public int updateOrdringnursing(WphOrderingnursing orderingnursing);

	public int updateOrdering(WphOrdering ordering);

	/**
	 * 通过订单号修改 订单信息
	 * @param ordering
	 * @return
	 */
	public int updateOrderingByOrderingNumber(WphOrdering ordering);

	
	public WphOrdering selectOrderingByOrderNumber(String orderingNumber);
	
	/**
	 * 
	 *描述:转病区  且修改院区。如果院区未开启返回0
	 *@param customerFid
	 *@return
	 *创建人:赵福岭
	 *2017年9月4日
	 */
	public int updateCustomerWard(@Param("customerFid")Integer customerFid,@Param("wardFid")Integer wardFid);
	/**
	 * 
	 *描述:按日期患者查询当天最大 订单（已订）
	 *@param customerFid
	 *@param date
	 *@param type
	 *@return
	 *创建人:赵福岭
	 *2017年9月8日
	 */
	public WphOrderingCustom selectOrderingByCustomer(@Param("orderingnumber")String orderingnumber);


	public WphOrderingCustom _selectOrderingByCustomer(@Param("customerFid")Integer customerFid,@Param("date")Date date,@Param("type")Integer type);
	/*----------------------------------自动订护理一对多改--------------------------------------------------*/
	public List<WphOrderingnursingCustom> _selectCustomerAllNursing(@Param("type")Integer type);
	
	public int _updateCustomer(List<WphOrderingnursingCustom> list);
	
	public int _insertWphOrderingnursing(List<WphOrderingnursingCustom> list);
	
	public int _insertOrdering(List<WphOrderingnursingCustom> list);
	/*----------------------------------自动订护理一对一改--------------------------------------------------*/
	public int _updateByWphOne(List<WphOrderingnursingCustom> list);
	
	public int _insertoWphOrderingnursing(List<WphOrderingnursingCustom> list);
	
	public int _insertoOrdering(List<WphOrderingnursingCustom> list);
	
	public int _tinsertWphOrderingnursing(List<WphOrderingnursingCustom> list);
	
	public int _tinsertOrdering(List<WphOrderingnursingCustom> list);
    /*                                   修改护工病区            */
    public int updateWork(@Param("workFid")Integer workFid,@Param("wardFid")Integer wardFid);
    //修改护工状态
	public int updateWorkStatus(@Param("workFid")Integer workFid,@Param("status")Integer status);

	public int _updateWorkStatus(List<WphOrderingnursingCustom> list);

	//------手动批量
	public List<WphOrderingnursingCustom> _selectCustomerAllNursing_(@Param("type")Integer type,@Param("date")String date);
	//------- 批量订一对一护理 -------
	public int _insertoWphOrderingnursing_(List<WphOrderingnursingCustom> list);

	public int _insertoOrdering_(List<WphOrderingnursingCustom> list);
	//------- 批量订一对多护理 -------


	public int _insertWphOrderingnursing_(List<WphOrderingnursingCustom> list);

	public int _insertOrdering_(List<WphOrderingnursingCustom> list);
}
