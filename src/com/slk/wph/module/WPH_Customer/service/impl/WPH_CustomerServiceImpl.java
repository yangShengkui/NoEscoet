package com.slk.wph.module.WPH_Customer.service.impl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.slk.wph.module.WPH_Customer.po.WphCustomerExample;
import com.slk.wph.module.WPH_Device.mapper.WphDeviceMapper;
import com.slk.wph.module.WPH_Device.po.WphDevice;
import com.slk.wph.module.WPH_Device.po.WphDeviceExample;
import com.slk.wph.module.WPH_Prepcustomer.mapper.WphPrepcustomerMapper;
import com.slk.wph.module.WPH_Prepcustomer.mapper.WphPrepcustomerMapperCustom;
import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomer;
import com.slk.wph.module.WPH_Prepcustomer.po.WphPrepcustomerExample;
import com.slk.wph.module.WPH_Warmprompt.mapper.WphWarmpromptMapper;
import com.slk.wph.module.WPH_Warmprompt.po.WphWarmprompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Blood.mapper.WphBloodMapperCustom;
import com.slk.wph.module.WPH_Blood.po.WphBloodCustom;
import com.slk.wph.module.WPH_Card.mapper.WphCardMapperCustom;
import com.slk.wph.module.WPH_Card.po.WphCard;
import com.slk.wph.module.WPH_Card_Relation.mapper.WphCardRelationMapper;
import com.slk.wph.module.WPH_Card_Relation.po.WphCardRelation;
import com.slk.wph.module.WPH_Cost.mapper.WphCostCustomMapper;
import com.slk.wph.module.WPH_Cost.mapper.WphCostMapper;
import com.slk.wph.module.WPH_Cost.po.WphCost;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapper;
import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.mapper.WphWorkerCustomMapper;
import com.slk.wph.module.WPH_Customer.po.WphCustomer;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_Customer.po.WphWorkerCustom;
import com.slk.wph.module.WPH_Customer.service.WPH_CustomerService;
import com.slk.wph.module.WPH_Hospita.mapper.WphHospitaMapperCustom;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;
import com.slk.wph.module.WPH_One.mapper.WphOneMapperCustom;
import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapper;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingConsumeInfo;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapper;
import com.slk.wph.module.WPH_Orderingfood.mapper.WphOrderingfoodMapperCustom;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfood;
import com.slk.wph.module.WPH_Orderingfood.po.WphOrderingfoodCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.po.WphUserCustom;
import com.slk.wph.module.WPH_UserCodeId.mapper.WphUsercodeidMapperCustom;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Servicedetails.mapper.WphServicedetailsMapperCustom;
import com.slk.wph.module.Wph_Servicedetails.po.WphServicedetailsCustom;

@Service
public class WPH_CustomerServiceImpl implements WPH_CustomerService {
	@Autowired
	private WphCustomerMapperCustom wphCustomerMapperCustom;
	@Autowired
	private WphHospitaMapperCustom hospitaMapperCustom;
	@Autowired
	private WphCostMapper costMapper;
	@Autowired
	private WphCostCustomMapper costCustomMapper;
	@Autowired
	private WphCustomerMapper mapper;
	@Autowired
	private WphCustomerMapperCustom customerMapper;
	@Autowired
	private WphOrderingMapper orderingMapper;
	@Autowired
	private WphOrderingMapperCustom orderingMapperCustom;
	@Autowired
	private WphUserCustomMapper usercustomMapper;
	@Autowired
	private WphCardMapperCustom cardMapperCustom;
	@Autowired
	private WphCardRelationMapper cardRelationMapper;
	@Autowired
	private WphWorkerCustomMapper wphWorkerCustomMapper;
	@Autowired
	private WphOneMapperCustom wphOneMapperCustom;
	@Autowired
	private WphServicedetailsMapperCustom servicedetailsCustom;
	@Autowired
	private WphOrderingfoodMapperCustom orderingfoodMapperCustom;
	@Autowired
	private WphOrderingfoodMapper orderingfoodMapper;
	@Autowired
	private WphWardMapperCustom wphWardCustom;
	@Autowired
	private WphBloodMapperCustom wphBloodMapperCustom;
	@Autowired
	private WphUsercodeidMapperCustom usercodeidMapper;
	@Autowired
	private WphWarmpromptMapper warmpromptMapper;
	@Autowired
	private WphDeviceMapper deviceMapper;
	@Autowired
    private WphPrepcustomerMapper prepMapper;
	@Autowired
    private WphPrepcustomerMapperCustom prepMapperCustom;

	@Override
	public WphCustomerCustom selectByCardFid(String cardFid) {
		// TODO Auto-generated method stub
		return wphCustomerMapperCustom.selectByCardFid(cardFid);
	}
	
	@Override
	public List<WphHospitaCustom> getWphHospitaAndWphWard() {
		// TODO Auto-generated method stub
		return hospitaMapperCustom.getWphHospitaAndWphWard();
	}



	@Override
	public WphCost getCostByFid(Integer costfid) {
		// TODO Auto-generated method stub
		return costMapper.selectByPrimaryKey(costfid);
	}



	@Override
	public Integer InsertCustomerByInfo(WphCustomerCustom custom) {
		// TODO Auto-generated method stub
		return customerMapper.insertCustomerByInfo(custom);
	}



	@Override
	public Integer InsertOrderingByInfo(WphOrdering ordering) {
		// TODO Auto-generated method stub
		return orderingMapper.insertSelective(ordering);
	}



	@Override
	public WphUserCustom getRoleAndUserByUserFid(Integer userFid) {
		
		return usercustomMapper.getRoleAndUserByUserFid(userFid);
	}



	@Override
	public WphCard getCardByCardInfo(WphCard card) {
		// TODO Auto-generated method stub
		return cardMapperCustom.getCardByCardInfo(card);
	}

	@Override
	public WphCustomerCustom getCustomerByInfo(WphCustomer customer) {
		// TODO Auto-generated method stub
		return customerMapper.getCustomerByInfo(customer);
	}

	@Override
	public void updateCardByCardFid(WphCard card) {
		// TODO Auto-generated method stub
		cardMapperCustom.updateCard(card);
	}

	@Override
	public WphCustomerCustom getCustomerByCard(String cardId) {
		WphCustomerCustom customer = new WphCustomerCustom();

		if(cardId.length() == 10)
			customer = wphCustomerMapperCustom.getCustomerByCardId(cardId);//根据卡id
		else
			customer = wphCustomerMapperCustom.getCustomerByCardNumber(cardId);//根据卡号
		
		return customer;
	}

	@Override
	public WphUserCustom getUserByRoleWard(Integer wardFid) {
		// TODO Auto-generated method stub
		return usercustomMapper.getUserByRoleWard(wardFid);
	}

	@Override
	public WphUserCustom getuserById(Integer userFid) {
		WphUserCustom user = new WphUserCustom();
		user.setFid(userFid);
		try {
			user = usercustomMapper.getUserByInfo(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public Integer updateCustomerByFid(WphCustomer customer) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(customer);
	}

	@Override
	public Integer InsertCardRelationByFid(WphCardRelation cardRelation) {
		// TODO Auto-generated method stub
		return cardRelationMapper.insertSelective(cardRelation);
	}

	@Override
	public List<WphCustomerCustom> selectAllCustomer(Integer wardFid,Integer nursingType,Date date) {
		// TODO Auto-generated method stub
		return wphCustomerMapperCustom.selectAllCustomer( wardFid, nursingType, date);
	}

	@Override
	public List<WphWorkerCustom> selectAllWorker(Date startDate,Date endDate,Integer type) {
		// TODO Auto-generated method stub
		return wphWorkerCustomMapper.selectAllWorker(startDate,endDate,type);
	}

	@Override
	public WphOneCustom getWphOneByFid(Integer fid) {
		// TODO Auto-generated method stub
		return wphOneMapperCustom.getWphOneByFid(fid);
	}

	@Override
	public int updateWphOne(WphOneCustom wphone) {
		// TODO Auto-generated method stub
		return wphOneMapperCustom.updateWphOne(wphone);
	}

	@Override
	public WphServicedetailsCustom selectByQueryFid(Integer queryFid) {
		// TODO Auto-generated method stub
		return servicedetailsCustom.selectByQueryFid(queryFid);
	}

	@Override
	public WphOrderingConsumeInfo getOrderSummaryByHospital(String hospitalId) {
		// TODO Auto-generated method stub
		return orderingMapperCustom.getOrderSummaryByHospital(hospitalId);
	}

	@Override
	public WphOrderingConsumeInfo getOrderSummaryByHospital2(String hospitalId) {
		// TODO Auto-generated method stub
		return orderingMapperCustom.getOrderSummaryByHospital2(hospitalId);
	}

	@Override
	public List<WphOrderingfoodCustom> getOrderingfoodRetreatByHospitalId(String hospitalId) {
		// TODO Auto-generated method stub
		return orderingfoodMapperCustom.getOrderingfoodRetreatByHospitalId(hospitalId);
	}

	@Override
	public List<WphOrderingCustom> getRetreatMoneyByHospitalld(String[] ordernumbers) {
		// TODO Auto-generated method stub
		return orderingMapperCustom.getRetreatMoneyByHospitalld(ordernumbers);
	}

	@Override
	public Integer updateOrderFoodByFid(WphOrderingfood food) {
		// TODO Auto-generated method stub
		return orderingfoodMapper.updateByPrimaryKeySelective(food);
	}

	@Override
	public Integer getEmptyCustomerByFid(Integer fid) {
		// TODO Auto-generated method stub
		return customerMapper.getEmptyCustomerByFid(fid);
	}

	@Override
	public WphOrdering getOrderingByInfo(WphOrdering ordering) {
		// TODO Auto-generated method stub
		return orderingMapperCustom.getOrderingByInfo(ordering);
	}

	@Override
	public List<WphWardCustom> getWphWardListByStatus() {
		// TODO Auto-generated method stub
		return wphWardCustom.getWphWardListByStatus();
	}

	@Override
	public WphCard getUnusedCardOne() {
		// TODO Auto-generated method stub
		return cardMapperCustom.getUnusedCardOne();
	}

	@Override
	public List<WphOneCustom> selectWphOnePic(String hospitalld) {
		// TODO Auto-generated method stub
		return wphOneMapperCustom.selectWphOnePic(hospitalld);
	}

	@Override
	public List<WphBloodCustom> selectAllPic(String hospitalld) {
		// TODO Auto-generated method stub
		return wphBloodMapperCustom.selectAllPic(hospitalld);
	}

	@Override
	public List<WphCustomerCustom> getCustomerListByInfo(WphCustomer custom) {
		// TODO Auto-generated method stub
		return wphCustomerMapperCustom.getCustomerListByInfo(custom);
	}

	@Override
	public List<WphCustomerCustom> selectCustomerBalanceByWardFid(
			Integer wardFid) {
		// TODO Auto-generated method stub
		return wphCustomerMapperCustom.selectCustomerBalanceByWardFid(wardFid);
	}

	@Override
	public Integer PayCheck() {
		// TODO Auto-generated method stub
		return costCustomMapper.PayCheck();
	}

	@Override
	public Integer cleanCodeidByCustomerFid(Integer customerFid) {
		// TODO Auto-generated method stub
		return usercodeidMapper.cleanCodeidByCustomerFid(customerFid);
	}

	@Override
	public WphCustomer getCustomerByFid(Integer customerFid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(customerFid);
	}

	@Override
	public Integer getOutHospitalByHospitalId(String hospitalId) {
		return orderingMapperCustom.getOutHospitalByHospitalId(hospitalId);
	}
	@Override
	public List<WphCustomerCustom> getCustomerByName(String name){
		return wphCustomerMapperCustom.getCustomerByName(name);
	}

	@Override
	public String getRetreaOrdernumbers(String hospitalld) {
		return orderingMapperCustom.getRetreaOrdernumbers(hospitalld);
	}

	@Override
	public WphCustomerCustom getCustomerByNumber(String number) {
		WphCustomerCustom customer = new WphCustomerCustom();
		if(number.length() == 10){//卡id
			customer = wphCustomerMapperCustom.getCustomerByCardId(number);
		}else if(number.length() == 8){//住院号
			customer = wphCustomerMapperCustom.getCustomerByHospitalld(number);
		}else if(number.length() == 6){
			customer = wphCustomerMapperCustom.getCustomerByCardNumber(number);//卡号
		}
		return customer;
	}


	@Override
	public WphWarmprompt getCustomerNotice(Integer fid) {
		WphWarmprompt notice = warmpromptMapper.selectByPrimaryKey(fid);
		return notice;
	}

	@Override
	public WphDevice getDeviceByDeviceid(String deviceid) {
		WphDevice device = null;
		if(null != deviceid){
			WphDeviceExample example = new WphDeviceExample();
			WphDeviceExample.Criteria criteria = example.createCriteria();
			criteria.andDeviceidEqualTo(deviceid);
			List<WphDevice> deviceList = deviceMapper.selectByExample(example);
			if(deviceList.size() ==1)device = deviceList.get(0);
		}
		return device;
	}

    @Override
    public Boolean setPrepcustomerById(WphPrepcustomer customer) {
        WphPrepcustomerExample example = new WphPrepcustomerExample();
        WphPrepcustomerExample.Criteria criteria = example.createCriteria();
        criteria.andHospitalidEqualTo(customer.getHospitalid());
        return prepMapper.updateByExampleSelective(customer,example)>0;
    }

    @Override
    public List<WphPrepcustomer> getPrepListByNowDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return prepMapperCustom.getPrepListByNowDate(sdf.format(new Date()));
    }


}