package com.slk.wph.module.Demo.po;

import java.util.List;

import com.slk.wph.module.WPH_Ordering.po.WphOrderingCustom;

public class Demo {
    private Integer fid;


    private String password;

    private String username;

    private String name;
    
    private List<Demo> demoxia;
    
    private List<WphOrderingCustom> orderlist;
    

	public List<WphOrderingCustom> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<WphOrderingCustom> orderlist) {
		this.orderlist = orderlist;
	}

	public Integer getFid() {
        return fid;
    }

	public void setFid(Integer fid) {
        this.fid = fid;
    }

    public List<Demo> getDemoxia() {
		return demoxia;
	}

	public void setDemoxia(List<Demo> demoxia) {
		this.demoxia = demoxia;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}