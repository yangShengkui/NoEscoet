package com.slk.wph.controller.WPH_Pcservicedetails;

import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetails;
import com.slk.wph.module.WPH_Pcservicedetails.service.WPH_PcservicedetailsService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="Screen/Pcservicedetails")
public class PcservicedetailsCenterController {

    Map<String,Object> map=new HashMap<String,Object>();
    @Autowired
    private WPH_PcservicedetailsService service;

    //查询数据
    @ResponseBody
    @RequestMapping(value="selectPcservicedetailsTypeFId")
    public String selectPcservicedetailsTypeFId(Integer pcserviceTypeFid){
        map.clear();
        List<WphPcservicedetails> psdList=service.selectPcservicedetailsTypeFId(pcserviceTypeFid,0);
        map.put("list",psdList);
        return JSONObject.fromObject(map).toString();
    }

}
