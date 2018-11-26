package com.test.pojo;

public class MatchWithBLOBs extends Match {
    private String team1score;

    private String team2score;

    private String team1icon;

    private String team2icon;

    private String zhuangtai;

    public String getTeam1score() {
        return team1score;
    }

    public void setTeam1score(String team1score) {
        this.team1score = team1score == null ? null : team1score.trim();
    }

    public String getTeam2score() {
        return team2score;
    }

    public void setTeam2score(String team2score) {
        this.team2score = team2score == null ? null : team2score.trim();
    }

    public String getTeam1icon() {
        return team1icon;
    }

    public void setTeam1icon(String team1icon) {
        this.team1icon = team1icon == null ? null : team1icon.trim();
    }

    public String getTeam2icon() {
        return team2icon;
    }

    public void setTeam2icon(String team2icon) {
        this.team2icon = team2icon == null ? null : team2icon.trim();
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai == null ? null : zhuangtai.trim();
    }
}