package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:18
 * 租赁人
 * @author zx
 */
public class Holder extends BaseEntity {

    public Holder() {
    }

    public Holder(Long id) {
        super(id);
    }

    private String hName;//租赁人姓名

    private Integer num;//租赁人身份证

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
