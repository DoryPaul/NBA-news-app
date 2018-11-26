package com.test.pojo;

public class QiuyuananalyseWithBLOBs extends Qiuyuananalyse {
    private String qiuyuanpicurl;

    private String gongzi;

    public String getQiuyuanpicurl() {
        return qiuyuanpicurl;
    }

    public void setQiuyuanpicurl(String qiuyuanpicurl) {
        this.qiuyuanpicurl = qiuyuanpicurl == null ? null : qiuyuanpicurl.trim();
    }

    public String getGongzi() {
        return gongzi;
    }

    public void setGongzi(String gongzi) {
        this.gongzi = gongzi == null ? null : gongzi.trim();
    }
}