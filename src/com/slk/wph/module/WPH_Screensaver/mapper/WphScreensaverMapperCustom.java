package com.slk.wph.module.WPH_Screensaver.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Screensaver.po.WphScreensaver;
import com.slk.wph.module.WPH_Screensaver.po.WphScreensaverCustom;

public interface WphScreensaverMapperCustom {
	/**
	 * 
	 *描述:查询所有图片
	 *@return
	 *创建人:赵福岭
	 *2017年9月2日
	 */
	public List<WphScreensaverCustom> selectScreensaver();
	/**
	 * 
	 *描述:查询开启状态的图片
	 *@return
	 *创建人:赵福岭
	 *2017年9月2日
	 */
	public List<WphScreensaverCustom> selectScreensaverByStatus();
	
	/**
	 * 
	 *描述:修改图片 状态
	 *@param screensaver
	 *@return
	 *创建人:赵福岭
	 *2017年9月2日
	 */
	public int updateByFid(WphScreensaver screensaver);
	
	/**
	 * 
	 *描述:新增图片
	 *@param screensaver
	 *@return
	 *创建人:赵福岭
	 *2017年9月2日
	 */
	public int insertScreensaver(WphScreensaver screensaver);
}
