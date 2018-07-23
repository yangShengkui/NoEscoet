package com.slk.wph.controller.WPH_Pcservicedetails;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetails;
import com.slk.wph.module.WPH_Pcservicedetails.po.WphPcservicedetailsCustom;
import com.slk.wph.module.WPH_Pcservicedetails.service.WPH_PcservicedetailsService;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetypeCustom;
import com.slk.wph.module.WPH_Pcservicetype.service.WPH_PcservicetypeService;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="Pcservicedetails")
public class PcservicedetailsController {

    Map<String,Object> map=new HashMap<String,Object>();

    @Autowired
    private WPH_PcservicetypeService typeService;

    @Autowired
    private WPH_PcservicedetailsService service;

    @RequestMapping(value="redirectURL")
    public String redirectURL(){
        return "ServiceIntroduction/WphServiceIntroduction";
    }

    @ResponseBody
    @RequestMapping(value="selectPcservicedetailsTypeFId")
    public String selectPcservicedetailsTypeFId(Integer pcserviceTypeFid){
        map.clear();
        List<WphPcservicedetails> psdList=service.selectPcservicedetailsTypeFId(pcserviceTypeFid,null);
        map.put("list",psdList);
        return JSONObject.fromObject(map).toString();
    }

    @ResponseBody
    @RequestMapping(value="savePcservicedetails")
    public String savePcservicedetails(WphPcservicedetailsCustom psd, HttpSession session){
        map.clear();
        Integer userFID = (Integer)session.getAttribute("userFID");

        //获取user信息以及角色名
        WphUserCustom userCustom = service.getRoleAndUserByUserFid(userFID);

        //WphPcservicedetailsCustom psd=((WphPcservicedetailsCustom)JSONObject.toBean(JSONObject.fromObject(json),WphPcservicedetailsCustom.class));
        if(null!=psd.getFiles()&&!"".equals(psd.getFiles())){
                psd.setImg(FileUtil.FileImgUp(psd.getFiles(), "wph/Pcservicedetails"));
        }
        psd.setCreateuser(userCustom.getName());
        //有fid为更新，无fid添加
        int count=service.savePcservicedetails(psd);
        map.put("count",count);
        return JSONObject.fromObject(map).toString();



    }

    //查询全部服务类型
    @ResponseBody
    @RequestMapping(value="selectAllPcservicetype")
    public String selectAllPcservicetype(){
        map.clear();
        //获取全部 服务类型（排序正序）
        map.put("typelist",service.selectAllPcservicetype());
        return JSONObject.fromObject(map).toString();
    }
}
