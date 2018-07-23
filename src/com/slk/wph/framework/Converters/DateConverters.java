package com.slk.wph.framework.Converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverters implements Converter<String, Date>{

	@Override
	public Date convert(String soure) {
		if(null!=soure && !"".equals(soure)){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return simpleDateFormat.parse(soure);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		return null;
	}
	
	

}
