package com.test.pojo;

public class FineWithBLOBs extends Fine {
    private String qiudui;

    private String jine;

    private String reason;

    private String state;

    public String getQiudui() {
        return qiudui;
    }

    public void setQiudui(String qiudui) {
        this.qiudui = qiudui == null ? null : qiudui.trim();
    }

    public String getJine() {
        return jine;
    }

    public void setJine(String jine) {
        this.jine = jine == null ? null : jine.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}