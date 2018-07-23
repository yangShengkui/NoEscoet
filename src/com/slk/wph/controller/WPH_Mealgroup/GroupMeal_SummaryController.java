package com.slk.wph.controller.WPH_Mealgroup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slk.wph.module.Demo.mapper.DemoMapper;
import com.slk.wph.module.Demo.po.Demo;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealGroupSpread;
import com.slk.wph.module.WPH_Mealgroup.po.WphMealgroupCustom;
import com.slk.wph.module.WPH_Mealgroup.service.WPH_MealgroupService;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.service.WPH_OrderingService;
import com.slk.wph.module.WPH_Unsubscribetime.po.WphUnsubscribetimeCustom;
import org.springframework.web.bind.annotation.ResponseBody;

//餐类组别集合显示（不受拦截器控制）
@Controller
@RequestMapping("/MealSummary")
public class GroupMeal_SummaryController {

	
	@Autowired
	WPH_MealgroupService service;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");

	private Map<String,Object> map = new HashMap<String,Object>();


	/**
	 * 时间判断，不在时间范围内不执行方法
	 * @return
	 * @throws ParseException
	 */
	@ResponseBody
	@RequestMapping("/GroupMeal_SummaryBefore")
	public String GroupMeal_SummaryTweBefore() throws ParseException {
		Boolean flag = false;
		Integer timeFid = 0;
		Integer mealadd = 0;
		List<Integer> timefids = new ArrayList<Integer>();
		timefids.add(8);timefids.add(9);timefids.add(10);timefids.add(11);timefids.add(12);timefids.add(13);
		List<WphUnsubscribetimeCustom> timeList = service.getTimeByFids(timefids);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		long nowTime = sdf2.parse(sdf2.format(new Date())).getTime();

		long starttime1 = sdf2.parse(timeList.get(0).getStarttime()+":00").getTime();
		long endtime1 = sdf2.parse(timeList.get(0).getEndtime()+":00").getTime();
		long starttime2 = sdf2.parse(timeList.get(1).getStarttime()+":00").getTime();
		long endtime2 = sdf2.parse(timeList.get(1).getEndtime()+":00").getTime();
		long starttime3 = sdf2.parse(timeList.get(2).getStarttime()+":00").getTime();
		long endtime3 = sdf2.parse(timeList.get(2).getEndtime()+":00").getTime();

		long starttime4 = sdf2.parse(timeList.get(3).getStarttime()+":00").getTime();
		long endtime4 = sdf2.parse(timeList.get(3).getEndtime()+":00").getTime();
		long starttime5 = sdf2.parse(timeList.get(4).getStarttime()+":00").getTime();
		long endtime5 = sdf2.parse(timeList.get(4).getEndtime()+":00").getTime();
		long starttime6 = sdf2.parse(timeList.get(5).getStarttime()+":00").getTime();
		long endtime6 = sdf2.parse(timeList.get(5).getEndtime()+":00").getTime();

		if(nowTime > starttime1 && nowTime < endtime1){
			flag = true;timeFid = 1;mealadd = 0;
		}else if(nowTime > starttime2 && nowTime < endtime2){
			flag = true;timeFid = 2;mealadd = 0;
		}else if(nowTime > starttime3 && nowTime < endtime3){
			flag = true;timeFid = 3;mealadd = 0;
		}else if(nowTime > starttime4 && nowTime < endtime4){
			flag = true;timeFid = 1;mealadd = 1;
		}else if(nowTime > starttime5 && nowTime < endtime5){
			flag = true;timeFid = 2;mealadd = 1;
		}else if(nowTime > starttime6 && nowTime < endtime6){
			flag = true;timeFid = 3;mealadd = 1;
		}
		map.clear();
		map.put("flag",flag);
		map.put("timeFid",timeFid);
		map.put("mealadd",mealadd);

		return JSONObject.fromObject(map).toString();
	}



	
	/**
	 * 描述：餐类组别集合显示1
	 *
	 * @param group
	 * @param model
	 * @return
	 * @throws ParseException
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月5日-下午2:35:58
	 */
	@RequestMapping("/one")
	public String GroupMeal_SummaryOne(WphMealgroupCustom group, Model model) throws ParseException{
		if(null == group.getState()){
			WphMealgroupCustom groupInfo = GroupMealBefore();
			group.setTimeFid(groupInfo.getTimeFid());
			group.setMealadd(groupInfo.getMealadd());
		}
		List<Integer> fids = new ArrayList<Integer>();
		fids.add(1);fids.add(2);fids.add(3);
		group.setFids(fids);
		List<WphMealGroupSpread> groupList = service.getGroupMealByGroup(group);

		model.addAttribute("jumpState",group.getState());
		model.addAttribute("groupList", groupList);
		model.addAttribute("mealtime", group.getTimeFid());

		return "Meal_Group/GroupMeal_SummaryOne";
	}




	/**
	 * 描述：餐类组别集合显示2
	 *
	 * @param group
	 * @param model
	 * @return
	 * @throws ParseException
	 *
	 * 创  建  人：宋现亮
	 * 创建时间：2017年9月5日-下午2:36:20
	 */
	@RequestMapping("/twe")
	public String GroupMeal_SummaryTwe(WphMealgroupCustom group, Model model) throws ParseException{
		if(null == group.getState()){
			WphMealgroupCustom groupInfo = GroupMealBefore();
			group.setTimeFid(groupInfo.getTimeFid());
			group.setMealadd(groupInfo.getMealadd());
		}
		List<Integer> fids = new ArrayList<Integer>();
		fids.add(4);fids.add(5);
		group.setFids(fids);
		List<WphMealGroupSpread> groupList = service.getGroupMealByGroup(group);

		model.addAttribute("jumpState",group.getState());
		model.addAttribute("groupList", groupList);
		model.addAttribute("mealtime", group.getTimeFid());
		List<WphMealGroupSpread> groupListCollect = service.getGroupMealByGroupCollect(group);
		model.addAttribute("groupListCollect", groupListCollect);
		return "Meal_Group/GroupMeal_SummaryTwe";
	}



	private WphMealgroupCustom GroupMealBefore() throws ParseException{
		Boolean flag = false;
		Integer timeFid = 0;
		Integer mealadd = 0;
		List<Integer> timefids = new ArrayList<Integer>();
		timefids.add(8);timefids.add(9);timefids.add(10);timefids.add(11);timefids.add(12);timefids.add(13);
		List<WphUnsubscribetimeCustom> timeList = service.getTimeByFids(timefids);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		long nowTime = sdf2.parse(sdf2.format(new Date())).getTime();

		long starttime1 = sdf2.parse(timeList.get(0).getStarttime()+":00").getTime();
		long endtime1 = sdf2.parse(timeList.get(0).getEndtime()+":00").getTime();
		long starttime2 = sdf2.parse(timeList.get(1).getStarttime()+":00").getTime();
		long endtime2 = sdf2.parse(timeList.get(1).getEndtime()+":00").getTime();
		long starttime3 = sdf2.parse(timeList.get(2).getStarttime()+":00").getTime();
		long endtime3 = sdf2.parse(timeList.get(2).getEndtime()+":00").getTime();

		long starttime4 = sdf2.parse(timeList.get(3).getStarttime()+":00").getTime();
		long endtime4 = sdf2.parse(timeList.get(3).getEndtime()+":00").getTime();
		long starttime5 = sdf2.parse(timeList.get(4).getStarttime()+":00").getTime();
		long endtime5 = sdf2.parse(timeList.get(4).getEndtime()+":00").getTime();
		long starttime6 = sdf2.parse(timeList.get(5).getStarttime()+":00").getTime();
		long endtime6 = sdf2.parse(timeList.get(5).getEndtime()+":00").getTime();

		if(nowTime > starttime1 && nowTime < endtime1){
			flag = true;timeFid = 1;mealadd = 0;
		}else if(nowTime > starttime2 && nowTime < endtime2){
			flag = true;timeFid = 2;mealadd = 0;
		}else if(nowTime > starttime3 && nowTime < endtime3){
			flag = true;timeFid = 3;mealadd = 0;
		}else if(nowTime > starttime4 && nowTime < endtime4){
			flag = true;timeFid = 1;mealadd = 1;
		}else if(nowTime > starttime5 && nowTime < endtime5){
			flag = true;timeFid = 2;mealadd = 1;
		}else if(nowTime > starttime6 && nowTime < endtime6){
			flag = true;timeFid = 3;mealadd = 1;
		}

		WphMealgroupCustom group = new WphMealgroupCustom();
		group.setTimeFid(timeFid);
		group.setMealadd(mealadd);
		return group;
	}

	
}
