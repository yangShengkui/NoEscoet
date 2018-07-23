package com.slk.wph.webservice.FileUpload;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import net.sf.json.JSONObject;

import com.slk.wph.framework.Util.FileUtil;
import com.slk.wph.module.WPH_One.po.WphOneCustom;
import com.slk.wph.module.WPH_Orderingnursing.mapper.WphOrderingnursingMapperCustom;

public class FileUploadWSImpl implements FileUploadWS {
	@Autowired
	private WphOrderingnursingMapperCustom mapperCustom;


	public String fileUpload(String imgStr,String moduleName,String customerFid) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		String uploadFile = "";
		//System.out.println(imgStr);
		try {
			uploadFile = FileUtil.generateImage(moduleName, imgStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if (!"".equals(uploadFile) && null != uploadFile) {
			map.put("uploadFile", uploadFile);
			map.put("flag", true);
			WphOneCustom wphone=mapperCustom.selectWphOneByCustomerFid(Integer.parseInt(customerFid));
			if(wphone.getImgs()==null){
				wphone.setImgs(uploadFile);
			}else{
				wphone.setImgs(wphone.getImgs()+";"+uploadFile);
			}
			
			mapperCustom.updateByWphOne(wphone);
		} else {
			map.put("flag", false);
		}
		return JSONObject.fromObject(map).toString();
	}

}
