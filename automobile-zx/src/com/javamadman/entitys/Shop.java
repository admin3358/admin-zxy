package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:20
 * 门店
 * @author zx
 */
public class Shop extends BaseEntity {

    public Shop() {
    }

    public Shop(Long id) {
        super(id);
    }

    private String sName;//门店名称

    private Area area;//名店所在区域id

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
