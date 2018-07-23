package com.slk.wph.controller.WPH_Pcservicetype;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetype;
import com.slk.wph.module.WPH_Pcservicetype.po.WphPcservicetypeCustom;
import com.slk.wph.module.WPH_Pcservicetype.service.WPH_PcservicetypeService;
import com.slk.wph.module.WPH_SupplementNursing.po.WPH_SupplementNursing;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="Wphpcservicetype")
public class PcservicetypeController {
    @Autowired
    private WPH_PcservicetypeService service;

    Map<String,Object> map=new HashMap<String,Object>();

    @RequestMapping(value="selectPcservicetypeUrl")
    public String selectPcservicetypeUrl(){
        //(用于菜单)这里只是个访问路径
        return "";
    }
    //查询全部服务类型
    @ResponseBody
    @RequestMapping(value="selectAllPcservicetype")
    public String selectAllPcservicetype(){
        map.clear();
        //获取全部 服务类型（排序正序）
        map.put("list",service.selectAllPcservicetype());
        return JSONObject.fromObject(map).toString();
    }


    //修改或者添加
    @ResponseBody
    @RequestMapping(value="savePcservicetype")
    public String savePcservicetype(String json, HttpSession session){
        map.clear();
        Integer userFID = (Integer)session.getAttribute("userFID");

        //获取user信息以及角色名称
        WphUserCustom userCustom = service.getRoleAndUserByUserFid(userFID);

        WphPcservicetypeCustom pcst=((WphPcservicetypeCustom)JSONObject.toBean(JSONObject.fromObject(json),WphPcservicetypeCustom.class));
        if(!"".equals(pcst.getImg())){
            if(pcst.getFiles().getSize()!=0){
                pcst.setImg(FileUtil.FileImgUp(pcst.getFiles(), "wph/Pcservicetype"));
            }
        }
        pcst.setCreateuser(userCustom.getName());
        //有fid为更新，无fid添加
        int count=service.savePcservicetype(pcst);
        map.put("count",count);
        return JSONObject.fromObject(map).toString();
    }


}
