package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 17:47
 * 汽车
 * @author zx
 */
public class Car extends BaseEntity {

    public Car() {
    }

    public Car(Long id) {
        super(id);
    }

    private Item item;//订单项id

    private Holder holder;//租赁人id

    private double netPrice;//网上价

    private double retPrice;//返现价

    private double prePrice;//预付价

    private String image;//图片地址

    private String description;//汽车描述

    private String header;//车系标题

    private Integer isTicket;//是否用券

    private Integer isHot;//是否热门

    private Integer isDown;//是否下架

    private Integer isFast;//是否闪租

    private Integer isPrice;//是否特价

    private Kind kind;//分类编号

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public double getRetPrice() {
        return retPrice;
    }

    public void setRetPrice(double retPrice) {
        this.retPrice = retPrice;
    }

    public double getPrePrice() {
        return prePrice;
    }

    public void setPrePrice(double prePrice) {
        this.prePrice = prePrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Integer getIsTicket() {
        return isTicket;
    }

    public void setIsTicket(Integer isTicket) {
        this.isTicket = isTicket;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsDown() {
        return isDown;
    }

    public void setIsDown(Integer isDown) {
        this.isDown = isDown;
    }

    public Integer getIsFast() {
        return isFast;
    }

    public void setIsFast(Integer isFast) {
        this.isFast = isFast;
    }

    public Integer getIsPrice() {
        return isPrice;
    }

    public void setIsPrice(Integer isPrice) {
        this.isPrice = isPrice;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
}
