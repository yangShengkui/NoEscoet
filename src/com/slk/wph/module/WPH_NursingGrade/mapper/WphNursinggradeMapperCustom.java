package com.slk.wph.module.WPH_NursingGrade.mapper;

import java.util.List;

import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggrade;
import com.slk.wph.module.WPH_NursingGrade.po.WphNursinggradeCustom;
import com.slk.wph.module.Wph_Ward_Om.po.WphWardOmCustom;

public interface WphNursinggradeMapperCustom {
	
	public List<WphNursinggradeCustom>  selectAllNursing();
	
	public int insertSelective(WphNursinggradeCustom custom);
	
	public int updateByPrimaryKeySelective(WphNursinggradeCustom custom);
	
	public int saveWphWardOmCustom(WphWardOmCustom custom);
	
	public WphNursinggrade getByFid(Integer fid);
	
	public List<WphNursinggradeCustom> selectNursing(Integer type);
	
}
