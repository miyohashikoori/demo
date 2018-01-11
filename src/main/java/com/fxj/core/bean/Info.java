package com.fxj.core.bean;

import java.io.Serializable;

/**
 * @author faver
 */
public class Info implements Serializable {
    private Integer id;

    private String  username;

    private String pwd;

    private String mobilephone;

    public Integer getId() {
        return id;
    }

    public Info setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Info setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public Info setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getMobilePhone() {
        return mobilephone;
    }

    public Info setMobilePhone(String mobilephone) {
        this.mobilephone = mobilephone;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                '}';
    }
}
