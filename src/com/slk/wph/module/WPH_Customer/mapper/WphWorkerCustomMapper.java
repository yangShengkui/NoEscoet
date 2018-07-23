package com.slk.wph.module.WPH_Customer.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.slk.wph.module.WPH_Customer.po.WphWorkerCustom;

public interface WphWorkerCustomMapper {
	
	public List<WphWorkerCustom> selectAllWorker(@Param("startDate")Date startDate ,
			@Param("endDate")Date endDate,
			@Param("type")Integer type);
}
