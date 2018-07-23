package com.slk.wph.controller.WPH_Prepcustomer;

import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import com.slk.wph.module.WPH_Prepcustomer.service.WPH_PrepcustomerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 庞军霞
 * @日期 2018/6/11 15:28
 */
@Controller
@RequestMapping("/Prepcustomer")
public class PrepcustomerAppController {

    @Autowired
    WPH_PrepcustomerService service;

    /**
     * 患者信息查询
     * @param hospitalid
     * @return
     * 庞军霞
     */
    @ResponseBody
    @RequestMapping("/checkHospital")
    public Map<String, Object> checkHospital(String hospitalid){
        Map<String,Object> map=new HashMap<String,Object>();

        //判断Prepcustomer中是否有已经存在的Prepcustomer若有则默认为修改
        map.put("precustomer",service.getWphPrepcustomerByHopitalid(hospitalid));
        map.put("flag",service.checkHospital(hospitalid));
        return map;
    }
    /**
     * 添加及修改患者信息
     * @param
     * @return
     * 庞军霞
     */
    @ResponseBody
    @RequestMapping("/insertAndUpdatePrepCustomer")
    public Map insertAndUpdatePrepCustomer(WphPrepcustomer precustomer){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("flag",service.insertAndUpdatePrepCustomer(precustomer));
        map.put("precustomer",precustomer);
        return map;
    }
}
