package com.slk.wph.module.WPH_AppVersion.service;
import com.slk.wph.module.WPH_AppVersion.po.WphAppversion;

 public interface WPH_AppVersionService {
	 /**
		 * 
		 * @Title:             selectAppVersion
		 * @param:             @return   
		 * @return:         WphAppversion   
		 * @throws
		 * 作者: 		隋乔镇
		 * 描述：查看APP最新版本		 
		 * @date: 2017年9月11日 下午5:45:21
		 */
		 public WphAppversion selectAppVersion();
		 
		 /**
		  * 
		  *描述:新增
		  *@return
		  *创建人:赵福岭
		  *2017年9月27日
		  */
		 public void insertAppVersion(WphAppversion wphAppversion);
}