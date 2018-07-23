package com.slk.wph.module.WPH_Menu.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Menu.po.WphMenu;
import com.slk.wph.module.WPH_Menu.po.WphMenuCustom;

public interface WphMenuCustomMapper {
	
    int insert(WphMenu record);
    
    public WphMenuCustom findMenuById(WphMenuCustom zdyhMenuCustom)throws Exception;
    
    
    public Integer deleteMenuFindById(WphMenuCustom zdyhMenuCustom)throws Exception;
    
    
    public Integer deleteMenuById(WphMenuCustom zdyhMenuCustom)throws Exception;
    
    
    public Integer updateMenu(WphMenuCustom zdyhMenuCustom)throws Exception;
    
    /**
     * 描述：根据用户fid和父级菜单fid获取菜单集合
     *
     * @param ParentFid
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月2日-上午8:55:33
     */
    public List<WphMenuCustom> getMenuListByParentFid(WphMenuCustom custom);
    
    
    /**
     * 描述：根据角色fid和父级菜单fid获取菜单集合 并显示是否选中
     *
     * @param custom
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月3日-下午3:28:21
     */
    public List<WphMenuCustom> getMenuListCheckByMenu(WphMenuCustom custom);
    /**
     * 描述：删除菜单，并判断用户角色是否有删除此菜单的权限
     *
     * @param custom
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月6日-下午3:18:06
     */
    public Integer deleteMenusByIdAndUserId(WphMenuCustom custom);
    /**
     * 描述：拦截器-判断用户是否拥有访问当前方法的权限
     *
     * @param custom
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年6月8日-下午3:40:32
     */
    public Integer getCountByUrlUserIds(WphMenuCustom custom);
}
