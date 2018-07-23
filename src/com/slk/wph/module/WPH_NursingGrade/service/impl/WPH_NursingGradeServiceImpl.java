package com.slk.wph.module.WPH_NursingGrade.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_NursingGrade.mapper.WphNursinggradeMapperCustom;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggrade;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.WPH_NursingGrade.service.WPH_NursingGradeService;
import com.slk.wph.module.WPH_Ward.mapper.WphWardMapperCustom;
import com.slk.wph.module.WPH_Ward.po.WphWardCustom;
import com.slk.wph.module.Wph_Ward_Om.mapper.WphWardOmMapperCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;

@Service
 public class  WPH_NursingGradeServiceImpl implements WPH_NursingGradeService  {
    @Autowired
	private WphNursinggradeMapperCustom custom;
    @Autowired
    private WphWardMapperCustom wardCustom;
    @Autowired
    private WphWardOmMapperCustom wardOmCustom;
    
	@Override
	public List<WphNursinggradeCustom> selectAllNursing() {
		// TODO Auto-generated method stub
		return custom.selectAllNursing();
	}
	
	
	@Override
	public List<WphWardCustom> getWardList() {
		// TODO Auto-generated method stub
		return wardCustom.getWphWardList();
	}


	@Override
	public int insertSelective(WphNursinggradeCustom wphNursinggradeCustom) {
		// TODO Auto-generated method stub
		return custom.insertSelective(wphNursinggradeCustom);
	}


	@Override
	public int updateByPrimaryKeySelective(WphNursinggradeCustom wphNursinggradeCustom) {
		// TODO Auto-generated method stub
		return custom.updateByPrimaryKeySelective(wphNursinggradeCustom);
	}


	@Override
	public int updateWardOmName(WphWardOmCustom wphWardOmCustom) {
		// TODO Auto-generated method stub
		return wardOmCustom.updateOmName(wphWardOmCustom);
	}


	@Override
	public int deleteByNursingFid(Integer fid,Integer wardFid) {
		// TODO Auto-generated method stub
		return wardOmCustom.deleteByNursingFid(fid,wardFid);
	}


	@Override
	public int saveWphWardOmCustomList(List<WphWardOmCustom> list) {
		// TODO Auto-generated method stub
		return wardOmCustom.saveWphWardOmCustomList(list);
	}

	@Override
	public int saveWphWardOmCustom(WphWardOmCustom wphWardOmCustom){
		return wardOmCustom.saveWphWardOmCustom(wphWardOmCustom);
	}


	@Override
	public WphNursinggrade getByFid(Integer fid) {
		// TODO Auto-generated method stub
		return custom.getByFid(fid);
	}


	@Override
	public List<WphWardCustom> getWardNursingMoney(Integer type) {
		// TODO Auto-generated method stub
		return wardCustom.getWardNursingMoney(type);
	}


	@Override
	public List<WphNursinggradeCustom> selectNursing(Integer type) {
		// TODO Auto-generated method stub
		return custom.selectNursing(type);
	}


	@Override
	public int updateOmMoney(WphWardOmCustom custom) {
		// TODO Auto-generated method stub
		return wardOmCustom.updateOmMoney(custom);
	}


	@Override
	public List<WphWardCustom> getWphWardList() {
		// TODO Auto-generated method stub
		return wardCustom.getWphWardList();
	}


	public List<String> selecetWardOmByGradeFid(Integer fid){
		return wardOmCustom.selecetWardOmByGradeFid(fid);
	}

	public Integer selectNursingForWard(String fid,String[] wardFid){
		return wardOmCustom.selectNursingForWard(fid,wardFid);
	}
}