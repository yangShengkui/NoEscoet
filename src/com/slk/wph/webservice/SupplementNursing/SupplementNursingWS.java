package com.slk.wph.webservice.SupplementNursing;

import com.slk.wph.module.WPH_SupplementNursing.po.WPH_SupplementNursing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SupplementNursingWS {
    /**
     * 查询患者信息
     * @param json
     * @return
     */
    @WebMethod
    public String getCustomerHosOrCardId(@WebParam(name = "json")String json);

    /**
     * 添加订单----护理补费
     * @param json
     * @return
     */
    @WebMethod
    public String saveOrieringSupplement(@WebParam(name = "json")String json);

    /**
     * 查询一对一患者明细
     * @param json
     * @return
     */
    @WebMethod
    public String selectOneInfo(@WebParam(name = "json")String json);
}
