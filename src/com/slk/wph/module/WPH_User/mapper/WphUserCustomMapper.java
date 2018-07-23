package com.slk.wph.module.WPH_User.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

public interface WphUserCustomMapper {
   
    public List<WphUserCustom> selectUserListByType() throws Exception;
   
    public void deleteUser_RoleByUserId(Integer userFID) throws Exception;
    /**
     * 
     * @功能：根据ID获取与此用户（管理员）的公司ID和类型相同的用户集合，并带出公司信息
     * @param userId 电厂管理员ID
     * @return
     * @throws Exception
     * @作者 宋现亮
     * @date: 日期：2016年9月22日 时间：上午9:44:25
     */
    public List<WphUserCustom> getUserListById(Integer userId)throws Exception;
    /**
     * 
     * @功能：通过userId删除user_Menus关联的数据
     * @param userId
     * @return
     * @throws Exception
     * @作者 宋现亮
     * @date: 日期：2016年11月22日 时间：上午10:25:58
     */
    public Integer deleteUser_MenusByUserId(Integer userId) throws Exception;
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
     * 
     *描述:验证用户名，姓名及手机号是是否重复
     *@param fid
     *@param username
     *@param name
     *@param phone
     *@return
     *创建人:赵福岭
     *2017年6月14日
     */
    
    public int checkWphUser(WphUser wphUser);

    /**
     * 
     *描述:插入
     *@param wphUser
     *@return
     *创建人:赵福岭
     *2017年6月14日
     */
    
    public int insertSelective(WphUser wphUser);
     
     /**
      * 
      *描述:修改
      *@param wphUser
      *@return
      *创建人:赵福岭
      *2017年6月14日
      */
     
     public int updateByPrimaryKeySelective(WphUser wphUser);
     
     /**
      * 
      *描述:根据权限查看用户
      *@return
      *创建人:赵福岭
      *2017年6月15日
      */
     public List<WphWardCustom> getUserListByRoleFid(@Param("roleId")Integer roleId,@Param("status")Integer status);
     /**
      * 描述：根据userFid获取管理员信息以及角色信息
      *
      * @param custom: fid,state
      * @return
      *
      * 创  建  人：宋现亮
      * 创建时间：2017年6月19日-下午5:25:49
      */
     public WphUserCustom getRoleAndUserByUserFid(Integer fid);
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
      * 描述：根据病区获取护工组长
      *
      * @param wardFid
      * @return
      *
      * 创  建  人：宋现亮
      * 创建时间：2017年6月28日-下午3:06:44
      */
     public WphUserCustom getUserByRoleWard(Integer wardFid);
     
     /**
      * 
      *描述:根据病区获取主管
      *@param wardFid
      *@return
      *创建人:赵福岭
      *2017年7月3日
      */
     public List<WphUserCustom> selectByWardFid(Integer wardFid);
     /**
      * 描述：根据userFid获取info
      *
      * @param userFid
      * @return
      *
      * 创  建  人：宋现亮
      * 创建时间：2017年7月7日-下午1:47:09
      */
     public WphUserCustom getUserByFid(Integer userFid);
 	/**
 	 * 描述：通过roleFids获取user用户集合
 	 *
 	 * @param roleFids
 	 * @return
 	 *
 	 * 创  建  人：宋现亮
 	 * 创建时间：2017年8月25日-上午11:57:19
 	 */
 	public List<WphUser> getUserListByRoleFids(List<Integer> roleFids);
 	
 	/**
 	 * 
 	 *描述:根据角色fid获取所有该角色的所有用户
 	 *@param roleFid
 	 *@return
 	 *创建人:赵福岭
 	 *2017年8月29日
 	 */
 	public List<WphUserCustom> selectUserByRole(Integer roleFid);
}