package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/13
 * Time: 18:09
 * 支付
 * @author zx
 */
public class Pay extends BaseEntity {

    public Pay() {
    }

    public Pay(Long id) {
        super(id);
    }

    private Integer shoPay;//门店支付

    private Integer netPay;//在线支付

    public Integer getShoPay() {
        return shoPay;
    }

    public void setShoPay(Integer shoPay) {
        this.shoPay = shoPay;
    }

    public Integer getNetPay() {
        return netPay;
    }

    public void setNetPay(Integer netPay) {
        this.netPay = netPay;
    }
}
