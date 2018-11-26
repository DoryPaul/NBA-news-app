package com.test.pojo;

public class Pinglun {
    private Integer id;

    private Integer yonghuid;

    private Integer newsid;

    private String neirong;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYonghuid() {
        return yonghuid;
    }

    public void setYonghuid(Integer yonghuid) {
        this.yonghuid = yonghuid;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
}