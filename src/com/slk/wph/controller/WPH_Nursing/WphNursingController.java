package com.slk.wph.controller.WPH_Nursing;

import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapper;
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_Orderingnursing.po.WphOrderingnursingCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value="/WphNursing")
public class WphNursingController {
    @Autowired
    private WphOrderingnursingMapperCustom mapper;
    DecimalFormat df = new java.text.DecimalFormat("#0.00");

    @RequestMapping(value="/nursingOneDate")
    public String nursingOneDate(){
        return "WphNursing/nursingOneDate";
    }

    @RequestMapping(value="/nursingManyDate")
    public String nursingManyDate(){
        return "WphNursing/nursingManyDate";
    }

    /**
     * 通过批量订一对一护理
     */
    @RequestMapping(value="/addNursingOneDate")
    public String addNursingOneDate(String date){
        if(null!=date&&!"".equals(date)){

            List<WphOrderingnursingCustom> list = mapper._selectCustomerAllNursing_(2,date);
            // 退订
            List<WphOrderingnursingCustom> tList =  new ArrayList<WphOrderingnursingCustom>();
            // 订护理
            List<WphOrderingnursingCustom> dList = new ArrayList<WphOrderingnursingCustom>();
            for (int i = 0, x = list.size(); i < x; i++) {
                Double m = Double.parseDouble(df.format(list.get(i).getNewBalance()));
                int j = new Date().compareTo(list.get(i).getOendDate());
                if (m < 0 || j >= 0) {
                    tList.add(list.get(i));
                } else {
                    list.get(i).setOrderDate(formatDate(date));
                    dList.add(list.get(i));
                }
            }
            if (tList.size() != 0) {
                mapper._updateByWphOne(tList);
                mapper._tinsertWphOrderingnursing(tList);
                mapper._tinsertOrdering(tList);
                //批量退订修改护工状态
                mapper._updateWorkStatus(tList);
            }
            if (dList.size() != 0) {
                mapper._updateCustomer(dList);
                mapper._insertoWphOrderingnursing_(dList);
                mapper._insertoOrdering_(dList);

            }
        }

        return "WphNursing/nursingOneDate";
    }
    @RequestMapping(value="/addNursingManyDate")
    public String addNursingManyDate(String date){
        if(null!=date&&!"".equals(date)) {
            List<WphOrderingnursingCustom> list = mapper._selectCustomerAllNursing_(1,date);
            if (list.size() != 0) {
                for (int i=0;i<list.size();i++){
                    list.get(i).setOrderDate(formatDate(date));
                }
                mapper._updateCustomer(list);
                mapper._insertWphOrderingnursing_(list);//
                mapper._insertOrdering_(list);
            }
        }
        return "WphNursing/nursingManyDate";
    }

    public String formatDate(String date){
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date newDate = dateFormat.parse(date);
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);
            int second = c.get(Calendar.SECOND);
            c.setTime(newDate);
            c.add(Calendar.DATE, 1);
            c.set(Calendar.HOUR_OF_DAY,hour);
            c.set(Calendar.MINUTE,minute);
            c.set(Calendar.SECOND,second);
            date=dateFormat.format(c.getTime());
            System.out.println(date);
        }
        catch (Exception e)
        {
            System.out.println(date);
        }
        return date;
    }
}
