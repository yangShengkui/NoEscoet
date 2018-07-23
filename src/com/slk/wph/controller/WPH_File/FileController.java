package com.slk.wph.controller.WPH_File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.slk.wph.framework.Util.FileUtil;
@Controller
@RequestMapping(value="UserLogin")
public class FileController {
	
	@RequestMapping(value="fileUpload")
	@ResponseBody
	public String fileUpload(MultipartFile multipartFile){
		String onload="";
		try {
			onload=FileUtil.uploadFile("AppImgs", multipartFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return onload;
	}
}
