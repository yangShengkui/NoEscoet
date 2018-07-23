package com.slk.wph.module.WPH_Pcservicetype.po;

import org.springframework.web.multipart.MultipartFile;

public class WphPcservicetypeCustom extends WphPcservicetype {
    private MultipartFile files;

    public MultipartFile getFiles() {
        return files;
    }

    public void setFiles(MultipartFile files) {
        this.files = files;
    }
}
