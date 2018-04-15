package com.javamadman.entitys;

import java.util.Date;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:05
 * 订单
 * @author zx
 */
public class Orders extends BaseEntity {

    public Orders() {
    }

    public Orders(Long id) {
        super(id);
    }

    private Item item;//订单项id

    private Pay pay;//支付id

    private Record record;//车辆记录id

    private User user;//用户id

    private double price;//金额

    private Integer status;//订单状态

    private Date time;//下订时间

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Pay getPay() {
        return pay;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
