package com.slk.wph.controller.WPH_Message;

import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import com.slk.wph.module.WPH_Warmprompt.service.WPH_WarmpromptService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Message")
public class MessageController {
    Map<String,Object> map=new HashMap<String,Object>();
    @Autowired
    private WPH_WarmpromptService service;

    /**
     * 跳转页面
     * @return
     */
    @RequestMapping(value="redirectURL")
    public String redirectURL(){
        return "Reminder/WphNotice";
    }

    /**
     * 通过type判断（1温馨提示，2消息通知）
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value="selectByZtype")
    public String selectByType(Integer ztype){
        map.clear();
        List<WphWarmprompt> list=service.selectByZtype(ztype);
        map.put("list",list);
        return JSONObject.fromObject(map).toString();
    }

    //修改数据
    @ResponseBody
    @RequestMapping(value="updateByFid")
    public String updateByFid(WphWarmprompt warmprompt){
        map.clear();
        int count=service.updateByFid(warmprompt);
        map.put("count",count);
        return JSONObject.fromObject(map).toString();
    }
}
