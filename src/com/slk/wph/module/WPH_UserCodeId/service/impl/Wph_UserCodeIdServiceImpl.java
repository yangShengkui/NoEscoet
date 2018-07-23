package com.slk.wph.module.WPH_UserCodeId.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.mapper.WphUsercodeidMapperCustom;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;
import com.slk.wph.module.WPH_UserCodeId.service.Wph_UserCodeIdService;

@Service
 public class  Wph_UserCodeIdServiceImpl implements Wph_UserCodeIdService  {
	
	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Autowired
	private WphUsercodeidMapperCustom wphUsercodeidMapperCustom;
	@Autowired
	private WphCustomerMapperCustom wphCustomerMapperCustom;
	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	
	@Override
	public WphUsercodeidCustom getWphUserCodeList(String codeid) {
		// TODO Auto-generated method stub
		return wphUsercodeidMapperCustom.getWphUserCodeIdByCodeId(codeid);
	}
	@Override
	public int save(WphUsercodeidCustom wphUsercodeidCustom) {
		// TODO Auto-generated method stub
		int count=wphUsercodeidMapperCustom.insertWphUserCodeId(wphUsercodeidCustom);
		return count;
	}
	@Override
	public WphUsercodeidCustom getWphUserCodeIdByFid(Integer fid) {
		// TODO Auto-generated method stub
		return wphUsercodeidMapperCustom.getWphUserCodeIdByFid(fid);
	}
	
	@Override
	public int update(WphUsercodeidCustom wphUsercodeidCustom) {
		// TODO Auto-generated method stub
		int count=wphUsercodeidMapperCustom.updateWphUserCodeId(wphUsercodeidCustom);
		return count;
	}
	
	@Override
	public WphCustomerCustom selectByCardFid(String cardFid) {
		// TODO Auto-generated method stub
		return wphCustomerMapperCustom.selectByCardFid(cardFid);
	}
	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
	@Override
	public WphCard getCardByCardId(String cardId) {
		
		WphCard card = new WphCard();
		card.setCardid(cardId);
		return cardMapperCustom.getCardByCardInfo(card);
	}
	@Override
	public WphUsercodeidCustom getWphUserCodeIdByCodeNumber(String codeNumber) {
		// TODO Auto-generated method stub
		return wphUsercodeidMapperCustom.getWphUserCodeIdByCodeNumber(codeNumber);
	}
}