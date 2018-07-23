package com.slk.wph.module.WPH_UserCodeId.mapper;

import com.slk.wph.module.WPH_UserCodeId.po.WphUsercodeidCustom;

public interface WphUsercodeidMapperCustom {
	
	public WphUsercodeidCustom getWphUserCodeIdByCodeId(String codeid);
	
	public int updateWphUserCodeId(WphUsercodeidCustom wphUsercodeidCustom);
	
	public int insertWphUserCodeId(WphUsercodeidCustom wphUsercodeidCustom);
	
	public int updateWphUserCodeBlood(WphUsercodeidCustom wphUsercodeidCustom);
	
	public WphUsercodeidCustom getWphUserCodeIdByFid(Integer fid);
	
	public WphUsercodeidCustom selectByWphUserCode();
	
	public WphUsercodeidCustom getWphUserCodeIdByCodeNumber(String codeNumber);
	/**
	 * 描述：通过患者FID清除身份证在库信息 
	 *
	 * @return
	 *
	 * @author 宋现亮
	 * @time 2017年10月9日-下午1:21:23
	 */
	public Integer cleanCodeidByCustomerFid(Integer customerFid);

}
