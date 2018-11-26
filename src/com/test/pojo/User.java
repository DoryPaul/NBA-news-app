package com.test.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String identity;

    private String token;

    private Date createdtime;

    private String touxiangurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getTouxiangurl() {
        return touxiangurl;
    }

    public void setTouxiangurl(String touxiangurl) {
        this.touxiangurl = touxiangurl == null ? null : touxiangurl.trim();
    }
}