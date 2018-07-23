package com.slk.wph.module.WPH_Servicetype.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Servicetype.po.WphServicetypeCustom;

public interface WphServicetypeMapperCustom {
	/**
	 * 描述：通过query获取服务类型以及服务明细集合
	 *
	 * @param queryFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月31日-下午5:19:15
	 */
	public List<WphServicetypeCustom> getServiceTypeAndDetailsByQuery(Integer queryFid);
	/**
	 * 描述：获取所有服务类型以及服务明细集合
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月1日-上午9:42:05
	 */
	public List<WphServicetypeCustom> getServiceTypeAndDetailsByQueryAll();
}