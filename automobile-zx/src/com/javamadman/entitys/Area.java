package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:21
 * 区域
 * @author zx
 */
public class Area extends BaseEntity {

    public Area() {
    }

    public Area(Long id) {
        super(id);
    }

    private String aName;//区域名称

    private City city;//区域所在城市id

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
