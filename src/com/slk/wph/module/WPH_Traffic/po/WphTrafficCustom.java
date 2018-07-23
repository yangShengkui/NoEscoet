package com.slk.wph.module.WPH_Traffic.po;

import org.springframework.web.multipart.MultipartFile;

public class WphTrafficCustom extends WphTraffic{
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}

}
