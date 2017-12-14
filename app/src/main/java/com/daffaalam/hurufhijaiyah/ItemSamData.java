package com.daffaalam.hurufhijaiyah;

/**
 * Created by X on 12/5/2017.
 */

public class ItemSamData {
    private String huruf, awal, tengah, akhir;

    ItemSamData(String huruf, String awal, String tengah, String akhir) {
        this.huruf = huruf;
        this.awal = awal;
        this.tengah = tengah;
        this.akhir = akhir;
    }

    public String getHuruf() {
        return huruf;
    }

    public void setHuruf(String huruf) {
        this.huruf = huruf;
    }

    public String getAwal() {
        return awal;
    }

    public void setAwal(String awal) {
        this.awal = awal;
    }

    public String getTengah() {
        return tengah;
    }

    public void setTengah(String tengah) {
        this.tengah = tengah;
    }

    public String getAkhir() {
        return akhir;
    }

    public void setAkhir(String akhir) {
        this.akhir = akhir;
    }
}
