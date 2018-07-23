package com.slk.wph.webservice.SupplementNursing;

import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_SupplementNursing.mapper.SupplementNursingMapper;
import com.slk.wph.module.WPH_SupplementNursing.po.WPH_OneInfo;
import com.slk.wph.module.WPH_SupplementNursing.po.WPH_SupplementNursing;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SupplementNursingWSImpl implements SupplementNursingWS{

    @Autowired
    private SupplementNursingMapper mapperCustom;

    public String getCustomerHosOrCardId(String json){
        Map<String,Object> map = new HashMap<String,Object>();
        WPH_SupplementNursing supplementNursing=clearMap(json);
        //前台控制money必填选项，控制日期必填选项
        //根据卡号或者id号查看患者是否住院
        String message="成功";
        Boolean flag=false;
        WphCustomer customer=mapperCustom.getCustomerHosOrCardId(supplementNursing);
        if(customer==null){
           message="未找到该患者或该患者未办理住院";
        }else{
            flag=true;
            map.put("wphCustom", customer);//如果已住院，返回患者信息
        }
        map.put("flag", flag);
        map.put("message", message);
        return JSONObject.fromObject(map).toString();

    }


    public String saveOrieringSupplement(String json){
        Map<String,Object> map = new HashMap<String,Object>();
        String message="成功";
        Boolean flag=false;
        WPH_SupplementNursing supplementNursing=clearMap(json);
        if(supplementNursing.getBalance()>=0){
            WphUserCustom user = mapperCustom.getRoleAndUserByUser(supplementNursing.getUserFid());
            supplementNursing.setUserName(user.getName());
            supplementNursing.setRoleName(user.getRoleName());
            mapperCustom.updateCustomerMoney(supplementNursing);
            mapperCustom.saveOrieringSupplement(supplementNursing );
            flag=true;
            message="护理补费成功";
        }else{
            message="余额不足";
        }
        map.put("flag", flag);
        map.put("message", message);
        return JSONObject.fromObject(map).toString();
    }

    public String selectOneInfo(String json){
        Map<String,Object> map = new HashMap<String,Object>();
        String message="成功";
        WPH_SupplementNursing supplementNursing=clearMap(json);
        List<WPH_OneInfo> list=mapperCustom.selectOneInfo(supplementNursing);
        if(list.size()>0){
            map.put("list",list);
        }else{
            message="该患者未办理过一对一护理";
        }
        map.put("message",message);
        map.put("flag",true);
        return JSONObject.fromObject(map).toString();
    }


    public WPH_SupplementNursing clearMap(String json){
        Map<String,Object> map = new HashMap<String,Object>();
        return (WPH_SupplementNursing)JSONObject.toBean(JSONObject.fromObject(json),WPH_SupplementNursing.class);

    }
}
