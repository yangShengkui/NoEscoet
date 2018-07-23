package com.slk.wph.module.WPH_App.mapper;

import java.util.List;

import com.slk.wph.module.WPH_App.po.WphAppCustom;

public interface WphAppMapperCustom {
	/**
	 * 描述：根据APP的FID获取下级菜单列表
	 *
	 * @param parentFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月5日-下午2:14:32
	 */
	public List<WphAppCustom> getAppListByParentFid(WphAppCustom custom);
	/**
	 * 描述：根据APP图标FID获取对象，并判断访问者是否拥有查看or修改的权限
	 *
	 * @param fid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月5日-下午3:10:13
	 */
	public WphAppCustom findAppById(Integer appId);
	/**
	 * 描述：根据app表fid查看当前数据有没有下级菜单
	 * 		有：=1
	 * 		无：=！1
	 *
	 * @param appFid
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月6日-下午1:06:40
	 */
	public Integer deleteAppFindById(Integer appFid);
	/**
	 * 描述：根据fid删除app表数据
	 *
	 * @param custom
	 * @return
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年6月6日-下午1:09:12
	 */
	public Integer deleteAppById(Integer fid);
	/**
     * 描述：根据角色fid和父级菜单fid获取菜单集合 并显示是否选中
     *
     * @param custom
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月7日-上午8:43:46
     */
    public List<WphAppCustom> getAppListCheckByApp(WphAppCustom custom);
    /**
     * 描述：根据userFid和parent_Fid获取APP菜单集合
     *
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月12日-上午9:15:43
     */
    public List<WphAppCustom> getAppListByApp(WphAppCustom custom);
}
