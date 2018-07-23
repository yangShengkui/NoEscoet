package com.slk.wph.module.WPH_User.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

public interface WphUserService {

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WphUser record);

    public List<WphUserCustom> selectUserListByType() throws Exception;
    
    public void deleteUser_RoleByUserId(Integer userFID) throws Exception;
    /**
     * 描述：根据所传对象中的变量获取符合条件的对象
     *
     * @param custom
     * @return
     * @throws Exception
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月8日-下午1:34:07
     */
    public WphUserCustom getUserByInfo(WphUserCustom custom) throws Exception;
    /**
     * 描述：根据用户fid获取对象信息
     *
     * @param userFid
     * @return
     * @throws Exception
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月8日-下午2:21:59
     */
    public WphUser getUserByFid(Integer userFid) throws Exception;
    /**
     * 描述：修改用户信息
     *
     * @param user
     * @return
     * @throws Exception
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月8日-下午2:53:35
     */
    public Integer setUserByInfo(WphUser user) throws Exception;
    /**
     * 描述：添加用户
     *
     * @param user
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月12日-下午2:15:07
     */
    public Integer insertUserInfo(WphUser user);
    /**
     * 描述：根据userId and RoleFid 获取user的角色
     *
     * @param custom
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月26日-上午11:58:51
     */
    public List<Integer> getCheckByUserFid(Integer fid);
    
    /**
     * 
     *描述:根据角色fid获取用户列表
     *@param roleFid
     *@return
     *创建人:赵福岭
     *2017年8月29日
     */
    public List<WphUserCustom> selectUserByRole(Integer roleFid);
    
    
    public int checkWphUser(WphUser wphUser);

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
	 *描述:删除用户并删除  用户关联权限
	 *@param userFid
	 *@return
	 *创建人:赵福岭
	 *2017年8月29日
	 */
    public int deleteUserByUserFid(Integer userFid);
}
