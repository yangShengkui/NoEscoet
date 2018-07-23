package com.slk.wph.module.WPH_Summary_Panorama.po;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class WphSummaryPanoramaCustom extends WphSummaryPanorama{
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}

	private List<String> imgList;

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}
}
