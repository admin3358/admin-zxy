package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:22
 * 城市
 * @author zx
 */
public class City extends BaseEntity {

    public City() {
    }

    public City(Long id) {
        super(id);
    }

    private String cName;//城市名称
}
