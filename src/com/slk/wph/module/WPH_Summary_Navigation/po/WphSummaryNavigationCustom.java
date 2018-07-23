package com.slk.wph.module.WPH_Summary_Navigation.po;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class WphSummaryNavigationCustom extends WphSummaryNavigation{
	
	private String wardName;
	private MultipartFile files;
	private List<String> imgList;

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}
	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}
}
