package com.slk.wph.module.WPH_Summary_Synopsis.po;

import org.springframework.web.multipart.MultipartFile;

public class WphSummarySynopsisCustom extends WphSummarySynopsis{
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}
}

