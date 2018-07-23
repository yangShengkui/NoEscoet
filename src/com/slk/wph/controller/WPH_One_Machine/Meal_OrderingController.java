package com.slk.wph.controller.WPH_One_Machine;

import com.slk.wph.framework.Interceptor.AccessIntercept.Token;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealmenu.service.WPH_MealmenuService;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetails;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/Screen/Meal")
public class Meal_OrderingController {

    @Autowired
    private WPH_MealmenuService service;

    private Map<String,Object> map = new HashMap<String, Object>();

    private  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");



    /**
     * 获取普餐集合
     * Create by song on 2018-01-16 15:28:33
     */
    @ResponseBody
    @RequestMapping("/getMealListByOrdinary")
    public String getMealListByOrdinary(){
        map.clear();
        Boolean flag = false;
        List<WphMealmenuCustom> mealList = service.getMealMenuByFid(2);
        for (int i=0;i<mealList.size();i++)if(mealList.get(i).getStatus()==1) mealList.remove(i);

        if(mealList.size()!=0){
            flag = true;
            map.put("mealList",mealList);
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }



    
    /**
     * 提交订餐信息
     * Create by song on 2018-01-16 16:37:13
     */
    @ResponseBody
    @RequestMapping("/OrdinaryOrderIng")
    public String OrdinaryOrderIng(WphOrderingfoodCustom food, HttpSession session){
        map.clear();
        Boolean flag = false;
        String message = "";
        Double balance =  Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
                (service.getCustomerByHospitalFid(food.getCustomerHospitalld())//从数据库里获取患者余额
                        .getBalance()-food.getMoney())));//消费后的患者余额
        String orderingnumber =  "ytj_"+(int) ((Math.random() * 9 + 1) * 10000000)+food.getCustomerFid();
        WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));

        if(balance<0){
            message = "操作失败，余额不足";
        }else{
            //修改患者余额
            WphCustomerCustom customer = new WphCustomerCustom();
            customer.setFid(food.getCustomerFid());
            customer.setBalance(balance);
            service.updateCustomerByFid(customer);

            //添加餐类消费信息表以及总消费信息表
            try {
                food.setMealdate(df.parse(food.getDatetime()));
            } catch (ParseException e) {
                System.out.println("一体机订普餐时，时间转换错误---------------datetime");
            }
            food.setCustomerBalance(balance);
            food.setUserFid(user.getFid());
            food.setUsername(user.getName());
            food.setUserrole(user.getRoleName());
            food.setOrderingnumber(orderingnumber);

            if(service.insertOrdinaryOrderingByInfo(food) != 0)flag = true;
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }




    /**
     * 获取儿童餐集合
     * Create by song on 2018-01-18 11:43:59
     */
    @ResponseBody
    @RequestMapping("/getMealListByChildren")
    public String getMealListByChildren(){
        map.clear();
        Boolean flag = false;
        List<WphMealmenuCustom> mealList = service.getMealMenuByFid(3);
        for (int i=0;i<mealList.size();i++)if(mealList.get(i).getStatus()==1) mealList.remove(i);

        if(mealList.size()!=0){
            flag = true;
            map.put("mealList",mealList);
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }






    /**
     * 提交儿童餐订餐信息
     * Create by song on 2018-01-16 16:37:13
     */
    @ResponseBody
    @RequestMapping("/ChildrenOrderIng")
    public String ChildrenOrderIng(WphOrderingfoodCustom food, HttpSession session){
        map.clear();
        String message = "";
        Boolean flag = false;
        Double balance =  Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
                (service.getCustomerByHospitalFid(food.getCustomerHospitalld())//从数据库里获取患者余额
                        .getBalance()-food.getMoney())));//消费后的患者余额
        String orderingnumber =  "ytj_"+(int) ((Math.random() * 9 + 1) * 10000000)+food.getCustomerFid();
        WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));

        if(balance<0){
            message = "操作失败，余额不足";
        }else{
            //修改患者余额
            WphCustomerCustom customer = new WphCustomerCustom();
            customer.setFid(food.getCustomerFid());
            customer.setBalance(balance);
            service.updateCustomerByFid(customer);

            //添加餐类消费信息表以及总消费信息表
            try {
                food.setMealdate(df.parse(food.getDatetime()));
            } catch (ParseException e) {
                System.out.println("一体机订儿童餐时，时间转换错误---------------datetime");
            }
            food.setCustomerBalance(balance);
            food.setUserFid(user.getFid());
            food.setUsername(user.getName());
            food.setUserrole(user.getRoleName());
            food.setOrderingnumber(orderingnumber);

            if(service.insertOrdinaryOrderingByInfo(food) != 0)flag = true;
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }




    /**
     * 获取特餐集合
     * Create by song on 2018-01-18 11:43:49
     */
    @ResponseBody
    @RequestMapping("/getMealListBySpecial")
    public String getMealListBySpecial (){
        map.clear();
        Boolean flag = false;
        WphMealmenuCustom mealmenu = new WphMealmenuCustom();
        mealmenu.setWeek(getWeekByNextDate(new Date()));
        mealmenu.setWphMealtypeFid(5);
        List<WphMealmenuCustom> mealList = service.getMenuByAboutMealTypeFid(mealmenu);
        for (int i=0;i<mealList.size();i++)if(mealList.get(i).getStatus()==1) mealList.remove(i);

        if(mealList.size()!=0){
            flag = true;
            map.put("mealList",mealList);
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }



   /**
    * 订特餐
    * Create by song on 2018-01-18 11:43:07
    */
    @ResponseBody
    @RequestMapping("/SpecialReserveIng")
    public String SpecialReserveIng(WphOrderingfoodCustom custom, Model model, HttpSession session){
        map.clear();
        String message = "";
        Boolean flag = false;
        String orderingnumber =  "ytj_"+(int) ((Math.random() * 9 + 1) * 10000000)+custom.getCustomerFid();
        WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
        Double balance = Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
                (service.getCustomerByHospitalFid(custom.getCustomerHospitalld()).getBalance())));//从数据库里获取患者余额

        if(custom.getTotalamount()>balance){
            message = "操作失败，余额不足";
        }else{
            //insert 餐类信息表
            for(WphOrderingfoodCustom food :  custom.getFood())
                if(null != food.getTitle()){
                    try {
                        food.setMealdate(df.parse(food.getDatetime()));
                    } catch (ParseException e) {
                        System.out.println("订特餐------------转换时间报错");
                    }
                    food.setUserFid(user.getFid());
                    food.setUsername(user.getName());
                    food.setUserrole(user.getRoleName());
                    food.setOrderingnumber(orderingnumber);
                    service.insertSpecialOrderingFoodByInfo(food);

                    WphOrdering ordering = new WphOrdering();
                    ordering.setTitle(food.getTitle());
                    ordering.setDepict(food.getDepict());
                    ordering.setMoney(food.getMoney());
                    ordering.setOrderingstatse(1);
                    ordering.setCustomerFid(food.getCustomerFid());
                    ordering.setCustomerCarid(food.getCustomerCardid());
                    ordering.setCustomerHospitalld(food.getCustomerHospitalld());
                    balance = Double.valueOf(new DecimalFormat("#.00").format(balance-food.getMoney()));
                    ordering.setCustomerBalance(balance);
                    WphServicedetails details = service.getServiceDetaolsByUUID(food.getUuid());
                    ordering.setWphQueryFid(details.getWphQueryFid());
                    ordering.setWphServicetypeFid(details.getWphServicetypeFid());
                    ordering.setWphServicedetailsFid(details.getFid());
                    ordering.setOrderingdate(food.getMealdate());//两个表中的字段值相同
                    ordering.setPaytype(5);
                    ordering.setOrderingnumber(orderingnumber);
                    ordering.setUserFid(user.getFid());
                    ordering.setUsername(user.getName());
                    ordering.setUserrole(user.getRoleName());
                    ordering.setWphWardFid(custom.getWphWardFid());
                    service.insertOrderingByInfo(ordering);
                }

            //修改患者余额
            WphCustomerCustom customer = new WphCustomerCustom();
            customer.setFid(custom.getCustomerFid());
            customer.setBalance(balance);
            service.updateCustomerByFid(customer);
            flag = true;
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }






    /**
     * 获取其他餐集合
     * Create by song on 2018-01-18 11:43:20
     */
    @ResponseBody
    @RequestMapping("/getMealListByOther")
    public String getMealListByOther(){
        map.clear();
        Boolean flag = false;
        List<WphMealmenuCustom> mealList = service.getMealMenuByFid(6);
        for (int i=0;i<mealList.size();i++)if(mealList.get(i).getStatus()==1) mealList.remove(i);

        if(mealList.size()!=0){
            flag = true;
            map.put("mealList",mealList);
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }




    /**
     * 订其他餐
     * Create by song on 2018-01-18 11:43:34
     */
    @ResponseBody
    @RequestMapping("/OtherReserveIng")
    public String OtherReserveIng(WphOrderingfoodCustom custom, Model model, HttpSession session){
        map.clear();
        String message = "";
        Boolean flag = false;
        String orderingnumber =  "ytj_"+(int) ((Math.random() * 9 + 1) * 10000000)+custom.getCustomerFid();
        WphUserCustom user = service.getRoleAndUserByUserFid((Integer)session.getAttribute("userFID"));
        Double balance = Double.valueOf(new DecimalFormat("#.00").format(//四舍五入
                (service.getCustomerByHospitalFid(custom.getCustomerHospitalld()).getBalance())));//从数据库里获取患者余额

        if(custom.getTotalamount()>balance){
            message = "操作失败，余额不足";
        }else{
            //insert 餐类信息表
            for(WphOrderingfoodCustom food :  custom.getFood())
                if(null != food.getTitle()){
                    try {
                        food.setMealdate(df.parse(food.getDatetime()));
                    } catch (ParseException e) {
                        System.out.println("订特餐------------转换时间报错");
                    }
                    food.setUserFid(user.getFid());
                    food.setUsername(user.getName());
                    food.setUserrole(user.getRoleName());
                    food.setOrderingnumber(orderingnumber);
                    service.insertSpecialOrderingFoodByInfo(food);

                    WphOrdering ordering = new WphOrdering();
                    ordering.setTitle(food.getTitle());
                    ordering.setDepict(food.getDepict());
                    ordering.setMoney(food.getMoney());
                    ordering.setOrderingstatse(1);
                    ordering.setCustomerFid(food.getCustomerFid());
                    ordering.setCustomerCarid(food.getCustomerCardid());
                    ordering.setCustomerHospitalld(food.getCustomerHospitalld());
                    balance = Double.valueOf(new DecimalFormat("#.00").format(balance-food.getMoney()));
                    ordering.setCustomerBalance(balance);
                    WphServicedetails details = service.getServiceDetaolsByUUID(food.getUuid());
                    ordering.setWphQueryFid(details.getWphQueryFid());
                    ordering.setWphServicetypeFid(details.getWphServicetypeFid());
                    ordering.setWphServicedetailsFid(details.getFid());
                    ordering.setOrderingdate(food.getMealdate());//两个表中的字段值相同
                    ordering.setPaytype(5);
                    ordering.setOrderingnumber(orderingnumber);
                    ordering.setUserFid(user.getFid());
                    ordering.setUsername(user.getName());
                    ordering.setUserrole(user.getRoleName());
                    ordering.setWphWardFid(custom.getWphWardFid());
                    service.insertOrderingByInfo(ordering);
                }
            //修改患者余额
            WphCustomerCustom customer = new WphCustomerCustom();
            customer.setFid(custom.getCustomerFid());
            customer.setBalance(balance);
            service.updateCustomerByFid(customer);
            flag = true;
        }
        map.put("flag",flag);
        return JSONObject.fromObject(map).toString();
    }






    /**
     * 获取患者信息
     * 通过卡ID或者卡号或者住院号
     * Create by song on 2018-01-16 16:49:34
     */
    @ResponseBody
    @RequestMapping("/getCustomerByNumber")
    public String getCustomerByNumber(String number,String datetime){
        map.clear();
        Boolean flag = false;//普餐餐
        Boolean flag2 = false;//特餐及其他
        String message = null;
        WphCustomerCustom customer = service.getCustomerByNumber(number);
        if(null == customer){
            message = "获取不到患者信息";
        }else if(customer.getHospitalldstatus()==2 && null == customer.getWphCardFid()){
            message = "该患者已经办理出院结算";
        }else{
            flag2 = true;
            if(customer.getWphWardFid() == 2 || customer.getWphWardFid() == 3){
                flag = true;
            }else if(service.getBoolNursingByCustomerFid(customer.getFid())==0){
                message = "该患者没有订护理";
            }else {
                if(service.getOrdinaryFoodCodeByFid(customer.getFid(), datetime)!=0){
                    message = "该患者已经订餐";
                }else{
                    flag = true;
                }
            }
        }
        map.put("flag",flag);
        map.put("flag2",flag2);
        map.put("message",message);
        map.put("custsomer",customer);
        return JSONObject.fromObject(map).toString();
    }






    /**
     * 描述：根据当前时间获取明天的星期数（数字）
     *
     * @return
     *
     * 创  建  人：宋现亮
     * 创建时间：2017年7月21日-下午3:59:03
     */
    private static Integer getWeekByNextDate(Date date){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +1);//+1今天的时间加一天
        SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
        String format = dateFm.format(calendar.getTime());

        if ("星期一".equalsIgnoreCase(format)||"Monday".equals(format))
            return 1;
        else if ("星期二".equalsIgnoreCase(format)||"Tuesday".equals(format))
            return 2;
        else if ("星期三".equalsIgnoreCase(format)||"Wednesday".equals(format))
            return 3;
        else if ("星期四".equalsIgnoreCase(format)||"Thursday".equals(format))
            return 4;
        else if ("星期五".equalsIgnoreCase(format)||"Friday".equals(format))
            return 5;
        else if ("星期六".equalsIgnoreCase(format)||"Saturday".equals(format))
            return 6;
        else if ("星期日".equalsIgnoreCase(format)||"Sunday".equals(format))
            return 7;
        return 0;
    }
}
