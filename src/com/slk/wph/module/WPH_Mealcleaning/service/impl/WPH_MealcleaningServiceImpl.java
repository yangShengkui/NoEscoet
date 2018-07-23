package com.slk.wph.module.WPH_Mealcleaning.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Card.mapper.WphCardMapper;
import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_Mealcleaning.mapper.WphMealcleaningMapper;
import com.slk.wph.module.WPH_Mealcleaning.mapper.WphMealcleaningMapperCustom;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaning;
import com.slk.wph.module.WPH_Mealcleaning.po.WphMealcleaningCustom;
import com.slk.wph.module.WPH_Mealcleaning.service.WPH_MealcleaningService;

@Service
 public class  WPH_MealcleaningServiceImpl implements WPH_MealcleaningService  {

	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	@Autowired
	private WphMealcleaningMapper mapper;
	@Autowired
	private WphCardMapper cardMapper;
	
	
	@Override
	public WphCardCustom getredingByCard(String cardStr) {
		WphCardCustom card = null;
		
		if(cardStr.length() == 10)
			card = cardMapperCustom.getredingByCardId(cardStr);
		else
			card = cardMapperCustom.getredingByCardNumber(cardStr);
		
		return card;
	}


	@Override
	public Integer setMealCleanByInfo(WphMealcleaning cleaning) {
		Integer count = 0;
		
		if(null !=cleaning.getFid()){
			count = mapper.updateByPrimaryKeySelective(cleaning);
		}else{
			WphCard card = new WphCard();
			card.setFid(cleaning.getWphCardFid());
			card.setCardstatus(1);//修改为已发卡状态
			cardMapper.updateByPrimaryKeySelective(card);
			count = mapper.insertSelective(cleaning);
		}
		return count;
	}

	
	
	
	
	
}