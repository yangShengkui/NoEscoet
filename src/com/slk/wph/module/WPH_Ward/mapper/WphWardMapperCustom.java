package com.slk.wph.module.WPH_Ward.mapper;
import java.util.List;

import javax.jws.WebParam;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Customer.po.WphMealCustomerApp;
import com.slk.wph.module.WPH_Ward.po.WphWard;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

public interface WphWardMapperCustom {
	
	public List<WphWardCustom> getWphWardList();
	
	public void updateWphWard(WphWard wphWard);
	
	public void saveWphWard(WphWard wphWard);
	
	public int checkWphWard(String name);
	
	public int checkWphWard_(Integer fid,String name);
	
	public List<WphWardCustom> getWphWardListByUserFid(Integer userFid);
	
	public int selectCountByUserFid(@Param("userFid")Integer userFid,@Param("wardFid")Integer wardFid);
	
	public List<WphWardCustom>  getWardNursingMoney(Integer type);
	
	public  List<WphWardCustom> getWphWardListByStatus();
	
	public List<WphWardCustom> getWardListByUserFid(Integer userFid);
	/**
	 * 描述：app获取订餐信息汇总
	 *
	 * @param datetime
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月25日-下午4:34:09
	 */
	public List<WphMealCustomerApp> appMealReserveSummaryByTime(@Param( "datetime")String datetime,@Param( "wardFid")Integer wardFid);
	/**
	 * 获取所有启用病区，根据fids数组排除fid
	 * @return
	 */
	public List<WphWardCustom> getNotChildrenWardList(Integer[] fids);

	/**
	 * 描述 ：app获取特餐订餐信息汇总
	 * @param datetime
	 * @param wardFid
	 * @return
	 */
	public List<WphMealCustomerApp> mealReserveTcSummary(@Param( "datetime")String datetime,@Param( "wardFid")Integer wardFid);
	
	
}
