package com.slk.wph.controller.WPH_Pcservicetype;

import com.slk.wph.module.WPH_Pcservicetype.service.WPH_PcservicetypeService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/Screen/WphpcservicetypeCenter")
public class PcservicetypeCenterController {
    //查询启用状态的服务类型
    @Autowired
    private WPH_PcservicetypeService service;

    Map<String,Object> map=new HashMap<String,Object>();

    @ResponseBody
    @RequestMapping(value="selectPcservicetypeState")
    public String selectPcservicetypeState(){
        map.clear();
        map.put("list",service.selectPcservicetypeState());
        //获取全部 服务类型（排序正序）
        return JSONObject.fromObject(map).toString();
    }
}
