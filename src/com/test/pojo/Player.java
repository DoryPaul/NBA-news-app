package com.test.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

import com.test.controller.CustomDateConverter;

public class Player {
    private Integer id;

    private Date shengti;

    private Integer qiuduiid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getShengti() {
        return shengti;
    }

    public void setShengti(Date shengti) {
        this.shengti = shengti;
    }

    public Integer getQiuduiid() {
        return qiuduiid;
    }

    public void setQiuduiid(Integer qiuduiid) {
        this.qiuduiid = qiuduiid;
    }
}