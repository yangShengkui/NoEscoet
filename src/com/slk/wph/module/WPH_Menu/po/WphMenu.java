package com.slk.wph.module.WPH_Menu.po;

public class WphMenu {
    private Integer fid;

    private String menuname;

    private String menuurl;

    private String menudesc;

    private Integer parentFid;

    private Integer createUserfid;

    private Integer levels;

    private Integer menutype;

    private Integer orders;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getMenudesc() {
        return menudesc;
    }

    public void setMenudesc(String menudesc) {
        this.menudesc = menudesc == null ? null : menudesc.trim();
    }

    public Integer getParentFid() {
        return parentFid;
    }

    public void setParentFid(Integer parentFid) {
        this.parentFid = parentFid;
    }

    public Integer getCreateUserfid() {
        return createUserfid;
    }

    public void setCreateUserfid(Integer createUserfid) {
        this.createUserfid = createUserfid;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Integer getMenutype() {
        return menutype;
    }

    public void setMenutype(Integer menutype) {
        this.menutype = menutype;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}