package com.test.pojo;

public class Newinfo1WithBLOBs extends Newinfo1 {
    private String newstitle;

    private String newsdesc;

    private String newspicurl;

    private String contentur;

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewsdesc() {
        return newsdesc;
    }

    public void setNewsdesc(String newsdesc) {
        this.newsdesc = newsdesc == null ? null : newsdesc.trim();
    }

    public String getNewspicurl() {
        return newspicurl;
    }

    public void setNewspicurl(String newspicurl) {
        this.newspicurl = newspicurl == null ? null : newspicurl.trim();
    }

    public String getContentur() {
        return contentur;
    }

    public void setContentur(String contentur) {
        this.contentur = contentur == null ? null : contentur.trim();
    }
}