package com.slk.wph.module.WPH_Pcservicedetails.po;

import org.springframework.web.multipart.MultipartFile;

public class WphPcservicedetailsCustom extends WphPcservicedetails {
    private MultipartFile files;

    private String pstName;
    public MultipartFile getFiles() {
        return files;
    }

    public void setFiles(MultipartFile files) {
        this.files = files;
    }

    public String getPstName() {
        return pstName;
    }

    public void setPstName(String pstName) {
        this.pstName = pstName;
    }
}
