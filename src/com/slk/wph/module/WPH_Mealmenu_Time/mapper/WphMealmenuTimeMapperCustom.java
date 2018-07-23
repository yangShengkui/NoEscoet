package com.slk.wph.module.WPH_Mealmenu_Time.mapper;

import com.slk.wph.module.WPH_Mealmenu_Time.po.WphMealmenuTimeCustom;

public interface WphMealmenuTimeMapperCustom {
	/**
	 * 描述：通过信息删除表数据
	 *
	 * @param mealmenuTime
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午3:20:35
	 */
	public Integer deleteMealMenuTimeByInfo(WphMealmenuTimeCustom mealmenuTime);
	/**
	 * 描述：通过信息修改表数据
	 *
	 * @param mealmenuTime
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年7月13日-下午3:22:18
	 */
	public Integer insertMealmenuTimeByInfo(WphMealmenuTimeCustom mealmenuTime);
}