package com.slk.wph.module.Wph_Servicedetails.mapper;

import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;

public interface WphServicedetailsMapperCustom {
	/**
	 * 
	 *描述:通过uuid获取服务信息
	 *@param uuid
	 *@return
	 *创建人:赵福岭
	 *2017年7月14日
	 */
	public WphServicedetailsCustom selectByUUid(String uuid);
	
	/**
	 * 
	 *描述:根据wardOmFid获取服务信息
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月14日
	 */
	public WphServicedetailsCustom selectByWardOMFid(Integer wardOmFid);
	
	/**
	 * 
	 *描述:根据护理等级表FId获取服务信息
	 *@param wardFid
	 *@return
	 *创建人:赵福岭
	 *2017年7月14日
	 */
	public WphServicedetailsCustom selectByGradeFid(Integer gradeFid);
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

	public WphServicedetails getDetailBymenuFid(Integer menuFid);
}
