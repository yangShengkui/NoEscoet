package com.slk.wph.module.WPH_Blood.service.impl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Blood.mapper.WphBloodMapperCustom;
import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;
import com.slk.wph.module.WPH_Blood.service.WPH_BloodService;
import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Cost.mapper.WphCostMapper;
import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapper;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.mapper.WphUsercodeidMapperCustom;
import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;

@Service
 public class  WPH_BloodServiceImpl implements WPH_BloodService  {

	@Autowired
	private WphUserCustomMapper wphUserCustomMapper;
	@Autowired
	private WphUsercodeidMapperCustom wphUsercodeidMapperCustom;
	@Autowired
	private WphCustomerMapperCustom wphCustomerMapperCustom;
	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	@Autowired
	private WphBloodMapperCustom wphBloodMapperCustom;
	@Autowired
	private WphCostMapper wphCostMapper;
	@Autowired
	private WphOrderingMapper wphOrderingMapper;
	@Autowired
	private WphWardMapperCustom wardMapper;
	@Autowired
	private WphOrderingnursingMapperCustom OrderingnursingMapperCustom;
	
	@Override
	public WphUserCustom getRoleAndUserByUser(WphUserCustom wphUserCustom) {
		// TODO Auto-generated method stub
		return wphUserCustomMapper.getRoleAndUserByUserFid(wphUserCustom.getFid());
	}
	
	
	@Override
	public WphUsercodeidCustom getWphUserCodeList(String codeid) {
		// TODO Auto-generated method stub
		return wphUsercodeidMapperCustom.getWphUserCodeIdByCodeId(codeid);
	}
	@Override
	public int saveWphUsercodeid(WphUsercodeidCustom wphUsercodeidCustom) {
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
	public int updateWphUsercodeid(WphUsercodeidCustom wphUsercodeidCustom) {
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
	public WphCard getCardByCardId(String cardid) {
		// TODO Auto-generated method stub
		WphCard card = new WphCard();
		card.setCardid(cardid);
		return cardMapperCustom.getCardByCardInfo(card);
	}


	@Override
	public WphBloodCustom getWphBloodCustomByCardId(String cardid) {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.getWphBloodCustomByCardId(cardid);
	}


	/*@Override
	public WphBloodCustom getWphBloodCustomByCodeId(String codeid) {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.getWphBloodCustomByCodeId(codeid);
	}*/


	@Override
	public int insertWphBloodCustom(WphBloodCustom wphBloodCustom) {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.insertWphBloodCustom(wphBloodCustom);
	}


	@Override
	public int updateWphBloodCustom(WphBloodCustom wphBloodCustom) {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.updateWphBloodCustom(wphBloodCustom);
	}


	@Override
	public WphCost selectWphCostByFid(Integer fid) {
		// TODO Auto-generated method stub
		return wphCostMapper.selectByPrimaryKey(fid);
	}


	@Override
	public int insertWphOrding(WphOrdering wphOrdering) {
		// TODO Auto-generated method stub
		return wphOrderingMapper.insertSelective(wphOrdering);
	}


	@Override
	public List<WphBloodCustom> selectAll() {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.selectAll();
	}


	@Override
	public int updateCustom(WphCustomerCustom wphCustomerCustom) {
		// TODO Auto-generated method stub
		return wphCustomerMapperCustom.updateCustomer(wphCustomerCustom);
	}


	@Override
	public WphCustomerCustom getWphCustomerCustomByFid(Integer fid) {
		// TODO Auto-generated method stub
		
		return wphCustomerMapperCustom.getCustomerByFid(fid);
	}


	@Override
	public WphBloodCustom selectWphBloodCustomByFid(Integer fid) {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.selectWphBloodCustomByFid(fid);
	}


	@Override
	public WphUsercodeidCustom selectByWphUserCode() {
		// TODO Auto-generated method stub
		return wphUsercodeidMapperCustom.selectByWphUserCode();
	}


	@Override
	public int updateWphUserCodeBlood(WphUsercodeidCustom wphUsercodeidCustom) {
		// TODO Auto-generated method stub
		return wphUsercodeidMapperCustom.updateWphUserCodeBlood(wphUsercodeidCustom);
	}


	@Override
	public int selectNursing(Integer customFid, Date date) {
		// TODO Auto-generated method stub
		return OrderingnursingMapperCustom.selectNursinggradeByCusFidAndDate(customFid, date);
	} 


}