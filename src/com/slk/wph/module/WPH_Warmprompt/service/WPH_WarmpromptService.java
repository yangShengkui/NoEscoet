package com.slk.wph.module.WPH_Warmprompt.service;

import com.slk.wph.module.WPH_Notice.po.WphNotice;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;

import java.util.List;

public interface WPH_WarmpromptService {
    /**
     * 通过fid修改数据信息
     * @param warmprompt
     * @return
     */
    public int updateByFid(WphWarmprompt warmprompt);

    /**
     * 通过类型查询信息
     * @param type
     * @return
     */
    public WphWarmprompt selectByType(Integer type);

    /**
     *  根据ztype查询 数据（1为温馨提示，2为通知消息）
     * @param ztype
     * @return
     */
    public List<WphWarmprompt> selectByZtype(Integer ztype);
    /**
     * 根据fid获取用户协议对象
     * Create by song on 2018-01-22 15:33:38
     */
    public WphWarmprompt getCustomerNotice(Integer fid);
    /**
     * 根据fid修改用户协议对象
     * Create by song on 2018-01-22 16:22:56
     */
    public Integer updateNoticeByFid(WphWarmprompt mprompt);

}