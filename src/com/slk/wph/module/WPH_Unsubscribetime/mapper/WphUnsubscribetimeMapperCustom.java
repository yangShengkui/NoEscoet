package com.slk.wph.module.WPH_Unsubscribetime.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;


public interface WphUnsubscribetimeMapperCustom {
	/**
	 * 描述：获取fid<=13的所有时间集合
	 *
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月24日-上午10:04:24
	 */
	public List<WphUnsubscribetimeCustom> getUnsubsbscribetime();
	/**
	 * 描述：根据fids（集合）获取时间集合
	 *
	 * @param fids
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月24日-上午10:03:40
	 */
	public List<WphUnsubscribetimeCustom> getTimeByFids(List<Integer> fids);
	/**
	 * 描述：根据fids（数组）获取时间集合
	 *
	 * @param arrFids
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月24日-上午10:01:29
	 */
	public List<WphUnsubscribetimeCustom> getTimeByArrFids(Integer[] arrFids);
}