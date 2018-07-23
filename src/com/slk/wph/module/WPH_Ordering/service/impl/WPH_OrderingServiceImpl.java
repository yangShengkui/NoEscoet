package com.slk.wph.module.WPH_Ordering.service.impl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Customer.mapper.WphCustomerMapperCustom;
import com.slk.wph.module.WPH_Customer.po.WphCustomerCustom;
import com.slk.wph.module.WPH_NursingGrade.mapper.WphNursinggradeMapperCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_Ordering.mapper.WphOrderingMapperCustom;
import com.slk.wph.module.WPH_Ordering.po.WphOrdering;
import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;
import com.slk.wph.module.WPH_Ordering.service.WPH_OrderingService;
import com.slk.wph.module.WPH_Query.mapper.WphQueryMapperCustom;
import com.slk.wph.module.WPH_Query.po.WphQuery;
import com.slk.wph.module.WPH_Query.po.WphQueryCustom;
import com.slk.wph.module.WPH_Servicetype.mapper.WphServicetypeMapperCustom;
import com.slk.wph.module.WPH_Servicetype.po.WphServicetypeCustom;
import com.slk.wph.module.WPH_User.mapper.WphUserCustomMapper;
import com.slk.wph.module.WPH_User.mapper.WphUserMapper;
import com.slk.wph.module.WPH_User.po.WphUser;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;

@Service
 public class  WPH_OrderingServiceImpl implements WPH_OrderingService  {
	
	@Autowired
	private WphWardMapperCustom wardMapper;
	@Autowired
	private WphOrderingMapperCustom mapper;
	@Autowired
	private WphUserMapper userMapper;
	@Autowired
	private WphUserCustomMapper userCustomMapper;
	@Autowired
	private WphQueryMapperCustom queryMapperCustom;
	@Autowired
	private WphNursinggradeMapperCustom nursingCustom;
	@Autowired
	private WphServicetypeMapperCustom servicetypeMapperCustom;
	@Autowired
	private WphCustomerMapperCustom customerMapperCustom;
	
	@Override
	public List<WphOrderingCustom> selectNursingHZ(Date startDate,Date endDate,
			Integer wardFid, Integer type) {
		// TODO Auto-generated method stub
		return mapper.selectNursingHZ(startDate,endDate, wardFid, type);
	}
	
	@Override
	public List<WphOrderingCustom> selectWphBloodHZ(Date startDate,Date endDate, Integer wardFid,Integer type) {
		// TODO Auto-generated method stub
		return mapper.selectWphBloodHZ(startDate,endDate, wardFid,type);
	}

	@Override
	public List<WphWardCustom> getWphWardListByStatus() {
		// TODO Auto-generated method stub
		return wardMapper.getWphWardListByStatus();
	}

	@Override
	public List<WphOrderingCustom> getOrderListByInfo(WphOrdering ordering) {
		// TODO Auto-generated method stub
		return mapper.getOrderListByInfo(ordering);
	}

	@Override
	public WphUser getUserByFid(Integer userFid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userFid);
	}

	@Override
	public List<WphQuery> getQueryAll() {
		// TODO Auto-generated method stub
		return queryMapperCustom.getQueryAll();
	}

	@Override
	public List<WphOrderingCustom> selectOnephmx(Date startDate,Date endDate, Integer wardFid,
			Integer type) {
		// TODO Auto-generated method stub
		return mapper.selectOnephmx(startDate,endDate, wardFid, type);
	}

	@Override
	public List<WphNursinggradeCustom> selectNursing(Integer type) {
		// TODO Auto-generated method stub
		return nursingCustom.selectNursing(type);
	}
	
	@Override
	public List<WphOrderingCustom> tollInquirySummary(WphOrdering ordering) {
		// TODO Auto-generated method stub
		return mapper.tollInquirySummary(ordering);
	}

	@Override
	public List<WphUser> getUserListByRoleFids(List<Integer> roleFids) {
		// TODO Auto-generated method stub
		return userCustomMapper.getUserListByRoleFids(roleFids);
	}

	@Override
	public List<WphOrderingCustom> getTotalCollection(WphOrdering orderingCustom) {
		// TODO Auto-generated method stub
		return mapper.getTotalCollection(orderingCustom);
	}

	@Override
	public List<WphOrderingCustom> getMeal_collection(WphOrdering orderingCustom) {
		// TODO Auto-generated method stub
		return mapper.getMeal_collection(orderingCustom);
	}

	@Override
	public List<WphServicetypeCustom> getServiceTypeAndDetailsByQuery(Integer queryFid) {
		// TODO Auto-generated method stub
		return servicetypeMapperCustom.getServiceTypeAndDetailsByQuery(queryFid);
	}

	@Override
	public List<WphServicetypeCustom> getServiceTypeAndDetailsByQueryAll() {
		// TODO Auto-generated method stub
		return servicetypeMapperCustom.getServiceTypeAndDetailsByQueryAll();
	}

	@Override
	public List<WphQueryCustom> getQueryAllSubordinate() {
		// TODO Auto-generated method stub
		return queryMapperCustom.getQueryAllSubordinate();
	}

	@Override
	public List<WphOrderingCustom> getPatientdetails(WphOrdering orderingCustom) {
		// TODO Auto-generated method stub
		return mapper.getPatientdetails(orderingCustom);
	}

	@Override
	public List<WphOrderingCustom> getPatientdetailsNursing(
			WphOrdering orderingCustom) {
		// TODO Auto-generated method stub
		return mapper.getPatientdetailsNursing(orderingCustom);
	}

	@Override
	public WphCustomerCustom getRetreatCardFeeCustomerByhos(String hospitalld) {
		// TODO Auto-generated method stub
		return customerMapperCustom.getRetreatCardFeeCustomerByhos(hospitalld);
	}

	@Override
	public List<WphCustomerCustom> RetreatCardFee_Summary(WphOrderingCustom order) {
		// TODO Auto-generated method stub
		return customerMapperCustom.RetreatCardFee_Summary(order);
	}
}