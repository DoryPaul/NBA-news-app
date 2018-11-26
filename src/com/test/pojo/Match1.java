package com.test.pojo;

public class Match1 {
    private Integer id;

    private String time;

    private String player1;

    private String player2;

    private String player1logo;

    private String player2logo;

    private String player1logobig;

    private String player2logobig;

    private String player1url;

    private String player2url;

    private String link1text;

    private String link1url;

    private String mLink1url;

    private String link2text;

    private String link2url;

    private String mLink2url;

    private Integer status;

    private String score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1 == null ? null : player1.trim();
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2 == null ? null : player2.trim();
    }

    public String getPlayer1logo() {
        return player1logo;
    }

    public void setPlayer1logo(String player1logo) {
        this.player1logo = player1logo == null ? null : player1logo.trim();
    }

    public String getPlayer2logo() {
        return player2logo;
    }

    public void setPlayer2logo(String player2logo) {
        this.player2logo = player2logo == null ? null : player2logo.trim();
    }

    public String getPlayer1logobig() {
        return player1logobig;
    }

    public void setPlayer1logobig(String player1logobig) {
        this.player1logobig = player1logobig == null ? null : player1logobig.trim();
    }

    public String getPlayer2logobig() {
        return player2logobig;
    }

    public void setPlayer2logobig(String player2logobig) {
        this.player2logobig = player2logobig == null ? null : player2logobig.trim();
    }

    public String getPlayer1url() {
        return player1url;
    }

    public void setPlayer1url(String player1url) {
        this.player1url = player1url == null ? null : player1url.trim();
    }

    public String getPlayer2url() {
        return player2url;
    }

    public void setPlayer2url(String player2url) {
        this.player2url = player2url == null ? null : player2url.trim();
    }

    public String getLink1text() {
        return link1text;
    }

    public void setLink1text(String link1text) {
        this.link1text = link1text == null ? null : link1text.trim();
    }

    public String getLink1url() {
        return link1url;
    }

    public void setLink1url(String link1url) {
        this.link1url = link1url == null ? null : link1url.trim();
    }

    public String getmLink1url() {
        return mLink1url;
    }

    public void setmLink1url(String mLink1url) {
        this.mLink1url = mLink1url == null ? null : mLink1url.trim();
    }

    public String getLink2text() {
        return link2text;
    }

    public void setLink2text(String link2text) {
        this.link2text = link2text == null ? null : link2text.trim();
    }

    public String getLink2url() {
        return link2url;
    }

    public void setLink2url(String link2url) {
        this.link2url = link2url == null ? null : link2url.trim();
    }

    public String getmLink2url() {
        return mLink2url;
    }

    public void setmLink2url(String mLink2url) {
        this.mLink2url = mLink2url == null ? null : mLink2url.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}