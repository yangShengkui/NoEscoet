package com.slk.wph.module.WPH_User_Ward.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_User_Ward.po.WphUserWardCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

public interface WPH_User_WardService {
	
	
	/**
	 * 
	 *描述:根据权限查看用户
	 *@param roleFid
	 *@return
	 *创建人:赵福岭
	 *2017年6月15日
	 */
	public List<WphWardCustom> getUserListByRoleFid(Integer roleFid,Integer status);
	/**
	 * 
	 *描述：获取所有的WphUserWardCustom
	 *@return List<WphUserWardCustom>
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	public List<WphUserWardCustom> getWphUserWardList();
	/**
	 * 
	 *描述:修改并保存WphUserWardCustom
	 *@param Integer fid
	 *@return 
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	public int updateAndSaveWphUser(WphUserCustom wphUserCustom,HttpSession session,Integer roleFid);
	
	/**
	 * 
	 *描述: 获取所有病区
	 *@return 病区集合
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	public List<WphWardCustom> getWardList();
	
	/**
	 * 
	 *描述: 验证是否有重复的名称和手机号码 
	 *@param fid
	 *@param name
	 *@param phone
	 *@return 数量 type  int 
	 *创建人:赵福岭
	 *2017年6月14日
	 */
	public int checkWphUser(WphUser wphUser);
	
	/**
	 * 
	 *描述:批量插入
	 *@param userId
	 *@param ids
	 *@param session
	 *@return
	 *创建人:赵福岭
	 *2017年6月15日
	 */
	public void saveUserWardArray(Integer userId,String[] ids,HttpSession session);

	
	/**
	 * 
	 *描述:根据根据病区id获取  主管
	 *@param userId
	 *@return
	 *创建人:赵福岭
	 *2017年6月15日
	 */
	public List<WphUserCustom> selectByWardFid(Integer WardFid);
}