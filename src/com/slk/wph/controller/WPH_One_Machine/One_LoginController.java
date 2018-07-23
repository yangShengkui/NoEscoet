package com.slk.wph.controller.WPH_One_Machine;

import com.slk.wph.framework.Cache.MemcachedUtil;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_Device.po.WphDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/One_Login")
public class One_LoginController {



    @Autowired
    private WPH_CustomerService service;




    /**
     * 一体机登录
     * Create by song on 2018-01-26 13:53:11
     */
    @RequestMapping("/homePage")
    public String homePage(String deviceID,String userId,HttpSession session) {
        try {
            WphDevice device = service.getDeviceByDeviceid(deviceID);
            session.removeAttribute("ytj");
            session.removeAttribute("userFID");
            session.setAttribute("ytj", device.getWphWardFid());
            session.setAttribute("userFID", Integer.valueOf(userId));
            MemcachedUtil.put(userId+"UserSessionId", session.getId().toString());
            session.setMaxInactiveInterval(24 * 60 * 60);
            System.out.println(session.getAttribute("ytj"));
            System.out.println(session.getAttribute("userFID"));
        }catch (Exception e){
            session.removeAttribute("ytj");
            session.removeAttribute("userFID");
        }
        return "redirect:/code/Screen/Carousel/Main_Pos.jsp";
    }






}
