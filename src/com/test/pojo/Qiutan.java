package com.test.pojo;

public class Qiutan {
    private Integer qiutanid;

    private String name;

    private String university;

    private String age;

    private String weizhi;

    private String score;

    public Integer getQiutanid() {
        return qiutanid;
    }

    public void setQiutanid(Integer qiutanid) {
        this.qiutanid = qiutanid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university == null ? null : university.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi == null ? null : weizhi.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}