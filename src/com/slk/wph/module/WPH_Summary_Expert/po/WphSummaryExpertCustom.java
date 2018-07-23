package com.slk.wph.module.WPH_Summary_Expert.po;

import org.springframework.web.multipart.MultipartFile;

public class WphSummaryExpertCustom extends WphSummaryExpert{
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}
}
