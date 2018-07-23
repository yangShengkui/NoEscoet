package com.slk.wph.module.WPH_SupplementNursing.mapper;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_SupplementNursing.po.WPH_OneInfo;
import com.slk.wph.module.WPH_SupplementNursing.po.WPH_SupplementNursing;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

import java.util.List;

public interface SupplementNursingMapper {
    /**
     * 描述：根据患者卡号或者住院号查询患者是否住院
     * @param wph_SupplementNursing
     * @return int
     * 2017-12-13  赵福岭
     */
    public WphCustomer getCustomerHosOrCardId(WPH_SupplementNursing supplementNursing);
    /**
     * 描述：插入到订单表
     * @param WPH_SupplementNursing
     * @return int
     * 2017-12-13  赵福岭
     */
    public int saveOrieringSupplement(WPH_SupplementNursing supplementNursing);

    /**
     * 描述：根据userFid获取 用户信息
     * 2017-12-51 赵福岭
     */
    public WphUserCustom getRoleAndUserByUser(Integer userFid);

    /**
     * 修改患者 余额
     * @param supplementNursing
     * @return
     */
    public int updateCustomerMoney(WPH_SupplementNursing supplementNursing);

    /**
     * 根据住院号查询患者  一对一明细
     * @param supplementNursing
     * @return
     */
    public List<WPH_OneInfo> selectOneInfo(WPH_SupplementNursing supplementNursing);


    public List<Double> selectSubsidyByOneFid(Integer oneFid);










}