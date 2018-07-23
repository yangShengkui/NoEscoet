package com.slk.wph.module.WPH_Query.mapper;

import com.slk.wph.module.WPH_Query.po.WphQuery;
import com.slk.wph.module.WPH_Query.po.WphQueryCustom;
import com.slk.wph.module.WPH_Query.po.WphQueryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WphQueryMapperCustom {
	/**
	 * 描述：获取消费类型
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年8月23日-下午5:27:44
	 */
	List<WphQuery> getQueryAll();
	/**
	 * 描述：获取消费类型集合以及子集合
	 *
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月1日-上午9:57:50
	 */
	List<WphQueryCustom> getQueryAllSubordinate();
}