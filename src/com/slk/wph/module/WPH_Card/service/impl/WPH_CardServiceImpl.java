package com.slk.wph.module.WPH_Card.service.impl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card.po.WphCardCustom;
import com.slk.wph.module.WPH_Card.service.WPH_CardService;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;

@Service
public class WPH_CardServiceImpl implements WPH_CardService {
	@Autowired
	private WphCardMapperCustom wphCardMapper;
	
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	
	@Autowired
	private WphCustomerMapperCustom wphCustomerMapperCustom;


	@Override
	public void UpdateAndSaveCard(WphCard wphCard) {
		if (wphCard.getFid()!=null&&!"".equals(wphCard.getFid())) {
			wphCard.setType(0);
			wphCardMapper.updateCard(wphCard);
		} else {
			if (wphCard.getType() != null && !"".equals(wphCard.getType())) {
				
			} else {
				wphCard.setType(0);
			}
			wphCard.setCardstatus(0);
			wphCardMapper.insertCard(wphCard);
		}
	}

	@Override
	public WphCard getWphCardById(Integer fid) {
		// TODO Auto-generated method stub
		return  wphCardMapper.getWphCardById(fid);
	}

	@Override
	public List<WphCard> getWphCardList() {
		// TODO Auto-generated method stub
		return wphCardMapper.getWphCardList();
	}

	
	@Override
	public int getWphCardByCardIdOrCardNumber(String cardid,String cardnumber) {
		// TODO Auto-generated method stub
		return wphCardMapper.getWphCardByCardIdOrCardNumber(cardid,cardnumber);
	}

	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}

	@Override
	public List<WphCardCustom> selectCustomerAndCard(Integer status,Date startDate,Date endDate) {
		// TODO Auto-generated method stub
		return wphCardMapper.selectCustomerAndCard(status,startDate,endDate);
	}

	

}