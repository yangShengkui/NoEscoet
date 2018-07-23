package com.slk.wph.controller.WPH_Prepcustomer;

import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import com.slk.wph.module.WPH_Prepcustomer.service.WPH_PrepcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Prep")
public class PrepcustomerController {


    @Autowired
    WPH_PrepcustomerService service;

    /**
     * 查询所有患者信息
     * @return
     * 庞军霞
     */
    @RequestMapping("/selectPreCustomerList")
    public String selectPreCustomerList(ModelMap model, String startdate){
        List<WphPrepcustomer> list=service.selectPreCustomerList(startdate);
        model.addAttribute("precutomerList",list);
        model.addAttribute("startdate",startdate);
        model.addAttribute("pCount",list.size());
        return "Customer/OpenCard_Info";
    }



}
