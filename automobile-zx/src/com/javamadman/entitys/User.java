package com.javamadman.entitys;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/12
 * Time: 19:30
 * 用户
 * @author zx
 */
public class User extends BaseEntity {

    public User() {
    }

    private String uName;//用户名

    private String uPassword;//用户密码

    private String phone;//用户手机号

    private Integer checkCode;//验证码

    private Integer verifyCode;//校验码


    public User(Long id) {
        super(id);
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(Integer checkCode) {
        this.checkCode = checkCode;
    }

    public Integer getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(Integer verifyCode) {
        this.verifyCode = verifyCode;
    }
}
