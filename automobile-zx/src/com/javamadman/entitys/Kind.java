package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:08
 * 汽车分类
 * @author zx
 */
public class Kind extends BaseEntity {

    public Kind() {
    }

    public Kind(Long id) {
        super(id);
    }

    private String type;//分类名称

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
