package com.slk.wph.module.WPH_Hospita.mapper;

import java.util.List;

import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;

public interface WphHospitaMapperCustom {
	public void updateWphHospita(WphHospita wphHospita);

	public void saveWphHospita(WphHospita wphHospita);

	public void deleteWphHospitaByFId(Integer fid);

	public List<WphHospita> getWphHospitaList();
	
	public WphHospita getWphHospitaByFid(Integer fid);
	
	public void deleteWphWardByWphHospitaFId(Integer fid);
	
	public int checkWphHospita(String name);
	
	public int checkWphHospita_(Integer fid,String name);
	
	public List<WphHospitaCustom> getWphHospitaAndWphWard();
	
	public List<WphHospita> getWphHospitaListByStatus();
	
	public int getWardCountStatus(Integer fid);
}
