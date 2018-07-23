package com.slk.wph.controller.WPH_Notice;

import com.slk.wph.module.WPH_Notice.po.WphNotice;
import com.slk.wph.module.WPH_Notice.service.WPH_NoticeService;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import com.slk.wph.module.WPH_Warmprompt.service.WPH_WarmpromptService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/Notice")
public class WPH_NoticeController {



    @Autowired
    private WPH_WarmpromptService service;

    private Map<String,Object> map = new HashMap<String,Object>();


    /**
     * 获取开卡缴费-用户协议须知
     * Create by song on 2018-01-22 15:32:18
     */
    @RequestMapping("/getCustomerNotice")
    public String getCustomerNotice(Model model){
        WphWarmprompt mprompt = service.getCustomerNotice(5);
        model.addAttribute("mprompt",mprompt);
        return "Notice/NoticeEdit";
    }



    /**
     *  修改notice对象-用户协议须知
     * Create by song on 2018-01-22 16:25:35
     */
    @ResponseBody
    @RequestMapping("/setCustomerNotice")
    public String setCustomerNotice(WphWarmprompt mprompt){
        map.clear();
        Boolean flag = false;
        if(0 != service.updateNoticeByFid(mprompt))flag = true;
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }



}
