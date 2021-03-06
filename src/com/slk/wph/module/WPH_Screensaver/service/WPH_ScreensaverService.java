package com.slk.wph.module.WPH_Screensaver.service;

import java.util.List;

import com.slk.wph.module.WPH_Screensaver.po.WphScreensaver;
import com.slk.wph.module.WPH_Screensaver.po.WphScreensaverCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

 public interface WPH_ScreensaverService {
	 
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
		
		
		 /**
		  * 
		  *描述:获取当前登录人信息
		  *@param wphUserCustom
		  *@return
		  *创建人:赵福岭
		  *2017年6月22日
		  */
		 public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom);
}