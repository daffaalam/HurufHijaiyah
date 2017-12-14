package com.daffaalam.hurufhijaiyah;

public class ItemData {
    private Integer gambarHijaiyah;
    private String hurufHijaiyah;

    ItemData(Integer gambarHijaiyah, String hurufHijaiyah) {
        this.gambarHijaiyah = gambarHijaiyah;
        this.hurufHijaiyah = hurufHijaiyah;
    }

    Integer getGambarHijaiyah() {
        return gambarHijaiyah;
    }

    public void setGambarHijaiyah() {
        this.gambarHijaiyah = gambarHijaiyah;
    }

    public String getHurufHijaiyah() {
        return hurufHijaiyah;
    }

    public void setHurufHijaiyah() {
        this.hurufHijaiyah = hurufHijaiyah;
    }
}
