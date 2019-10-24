package com.lanou.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String username;
    private String sex;
    private int id;

    public UserBean(String username, String sex, int id) {
        this.username = username;
        this.sex = sex;
        this.id = id;
    }

    public UserBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }
}
