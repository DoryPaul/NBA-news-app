package com.test.pojo;

public class TeamWithBLOBs extends Team {
    private String teamiconurl;

    private String local;

    public String getTeamiconurl() {
        return teamiconurl;
    }

    public void setTeamiconurl(String teamiconurl) {
        this.teamiconurl = teamiconurl == null ? null : teamiconurl.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }
}