package com.slk.wph.module.WPH_Screensaver.po;

import org.springframework.web.multipart.MultipartFile;

public class WphScreensaverCustom extends WphScreensaver{
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}
	

}
