package com.slk.wph.webservice.Meal_Cleaning;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_Mealcleaning.mapper.WphMealcleaningMapper;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaning;

public class Meal_CleaningServiceImpl implements Meal_CleaningService {

	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	@Autowired
	private WphMealcleaningMapper mapper;
	
	@Override
	public String MealCleaning(String cardStr) {
		Map<String,Object> map = new HashMap<String,Object>();
		Boolean cardFlag  = false;//=false 获取不到卡号
		Boolean countFlag = false;//=false 次数不足
		WphCardCustom card = null;
		
		if(cardStr.length() == 10)
			card = cardMapperCustom.getredingByCardId(cardStr);
		else
			card = cardMapperCustom.getredingByCardNumber(cardStr);
		
		if(null != card && null != card.getCleaning()){
			cardFlag = true;
			WphMealcleaning clean = card.getCleaning();
			if(clean.getCount()>=1){
				countFlag = true;
				clean.setCount(clean.getCount()-1);
				mapper.updateByPrimaryKeySelective(card.getCleaning());
			}
		}
		
		map.put("cardFlag", cardFlag);
		map.put("countFlag", countFlag);
		
		return JSONObject.fromObject(map).toString();
	}

}
