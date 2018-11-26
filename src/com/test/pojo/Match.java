package com.test.pojo;

public class Match {
    private Integer matchid;

    private String team1;

    private String team2;

    private Integer team1support;

    private Integer team2support;

    public Integer getMatchid() {
        return matchid;
    }

    public void setMatchid(Integer matchid) {
        this.matchid = matchid;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1 == null ? null : team1.trim();
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2 == null ? null : team2.trim();
    }

    public Integer getTeam1support() {
        return team1support;
    }

    public void setTeam1support(Integer team1support) {
        this.team1support = team1support;
    }

    public Integer getTeam2support() {
        return team2support;
    }

    public void setTeam2support(Integer team2support) {
        this.team2support = team2support;
    }
}