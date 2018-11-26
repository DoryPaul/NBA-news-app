package com.test.pojo;

public class PlayerWithBLOBs extends Player {
    private String name;

    private String weizhi;

    private String shengao;

    private String tizhong;

    private String blengqiudui;
    
    private String data;
 
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi == null ? null : weizhi.trim();
    }

    public String getShengao() {
        return shengao;
    }

    public void setShengao(String shengao) {
        this.shengao = shengao == null ? null : shengao.trim();
    }

    public String getTizhong() {
        return tizhong;
    }

    public void setTizhong(String tizhong) {
        this.tizhong = tizhong == null ? null : tizhong.trim();
    }

    public String getBlengqiudui() {
        return blengqiudui;
    }

    public void setBlengqiudui(String blengqiudui) {
        this.blengqiudui = blengqiudui == null ? null : blengqiudui.trim();
    }
}