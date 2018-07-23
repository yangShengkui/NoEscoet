package com.slk.wph.module.WPH_Orderingfood.service.impl;
import java.util.List;

import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Mealmenu.mapper.WphMealmenuMapperCustom;
import com.slk.wph.module.WPH_Mealmenu.po.WphMealmenuCustom;
import com.slk.wph.module.WPH_Mealtype.mapper.WphMealtypeMapperCustom;
import com.slk.wph.module.WPH_Mealtype.po.WphMealtypeCustom;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapperCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_Orderingfood.service.WPH_OrderingfoodService;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
public class  WPH_OrderingfoodServiceImpl implements WPH_OrderingfoodService  {

	@Autowired
	private WphCustomerMapperCustom customerMapperCustom;
	@Autowired
	private WphOrderingfoodMapperCustom orderingfoodMapperCustom;
	@Autowired
	private WphWardMapperCustom wardMapperCustom;
	@Autowired
	private WphMealmenuMapperCustom mealmenuMapperCustom;
	@Autowired
	private WphMealtypeMapperCustom mealtypeMapperCustom;


	@Override
	public List<WphOrderingfoodCustom> getCustomerOrderingFoodByInfo( WphOrderingfoodCustom food) {
		// TODO Auto-generated method stub
		return orderingfoodMapperCustom.getCustomerOrderingFoodByInfo(food);
	}

	@Override
	public List<WphOrderingfoodCustom> getCustomerOrderingAllByInfo( WphOrderingfoodCustom food) {
		// TODO Auto-generated method stub
		return orderingfoodMapperCustom.getCustomerOrderingAllByInfo(food);
	}

	@Override
	public List<WphWardCustom> getWphWardList() {
		// TODO Auto-generated method stub
		return wardMapperCustom.getWphWardListByStatus();
	}

	@Override
	public List<WphMealmenuCustom> getMealMenuByTypeFid(Integer typeFid) {
		// TODO Auto-generated method stub
		return mealmenuMapperCustom.getMealMenuOneByTypeFid(typeFid);
	}

	@Override
	public List<WphMealtypeCustom> getMealTypeAndMenuAll() {
		// TODO Auto-generated method stub
		return mealtypeMapperCustom.getMealTypeAndMenuAll();
	}
	@Override
	public List<WphOrderingfoodCustom> selectFoodInfoHospitalld(String startDate, String endDate, String hospitalld){
		return orderingfoodMapperCustom.selectFoodInfoHospitalld(startDate,endDate,hospitalld);
	}

	@Override
	public List<WphOrderingfoodCustom> getSpecialPrintListByInfo(WphOrderingfoodCustom food) {
		return orderingfoodMapperCustom.getSpecialPrintListByInfo(food);
	}

}