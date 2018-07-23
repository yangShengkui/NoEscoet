package com.slk.wph.module.WPH_Hospita.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.wph.module.WPH_Hospita.mapper.WphHospitaMapperCustom;
import com.slk.wph.module.WPH_Hospita.po.WphHospita;
import com.slk.wph.module.WPH_Hospita.po.WphHospitaCustom;
import com.slk.wph.module.WPH_Hospita.service.WPH_HospitaService;

@Service
 public class  WPH_HospitaServiceImpl implements WPH_HospitaService  {
	@Autowired
	public WphHospitaMapperCustom wphHospitaMapperCustom;
	
	@Override
	public void updateAndSaveWphHospita(WphHospita wphHospita) {
		// TODO Auto-generated method stub
		if(wphHospita.getFid()!=null&&!"".equals(wphHospita.getFid())){
			wphHospitaMapperCustom.updateWphHospita(wphHospita);
		}else{
			wphHospita.setStatus(0);
			wphHospitaMapperCustom.saveWphHospita(wphHospita);
		}
		
	}

	@Override
	public void deleteWphHospitaById(Integer fid) {
		// TODO Auto-generated method stub
		wphHospitaMapperCustom.deleteWphHospitaByFId(fid);
		
	}

	@Override
	public WphHospita getWphHospitaById(Integer fid) {
		// TODO Auto-generated method stub
		return wphHospitaMapperCustom.getWphHospitaByFid(fid);
	}

	@Override
	public List<WphHospita> getWphHospitaList() {
		// TODO Auto-generated method stub
		return wphHospitaMapperCustom.getWphHospitaList();
	}

	@Override
	public int checkWphHospita(String name) {
		// TODO Auto-generated method stub
		return wphHospitaMapperCustom.checkWphHospita(name);
	}
	
	@Override
	public int checkWphHospita(Integer fid,String name) {
		// TODO Auto-generated method stub
		return wphHospitaMapperCustom.checkWphHospita_(fid,name);
	}

	@Override
	public List<WphHospita> getWphHospitaListByStatus() {
		// TODO Auto-generated method stub
		return wphHospitaMapperCustom.getWphHospitaListByStatus();
	}

	@Override
	public int getWardCountStatus(Integer fid) {
		// TODO Auto-generated method stub
		return wphHospitaMapperCustom.getWardCountStatus(fid);
	}
}