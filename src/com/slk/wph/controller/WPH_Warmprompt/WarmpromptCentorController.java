package com.slk.wph.controller.WPH_Warmprompt;

import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import com.slk.wph.module.WPH_Warmprompt.service.WPH_WarmpromptService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("Screen/Warmprompt")
public class WarmpromptCentorController {

    Map<String,Object> map=new HashMap<String,Object>();
    @Autowired
    private WPH_WarmpromptService service;

    //获取数据
    @ResponseBody
    @RequestMapping(value="selectByType")
    public String selectByType(Integer type){
        map.clear();
        WphWarmprompt warmprompt=service.selectByType(type);
        map.put("model",warmprompt);
        return JSONObject.fromObject(map).toString();
    }

}
