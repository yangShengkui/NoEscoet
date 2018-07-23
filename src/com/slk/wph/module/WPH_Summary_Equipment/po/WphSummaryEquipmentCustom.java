package com.slk.wph.module.WPH_Summary_Equipment.po;

import org.springframework.web.multipart.MultipartFile;

public class WphSummaryEquipmentCustom extends WphSummaryEquipment{
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}

}
