package com.daffaalam.hurufhijaiyah;

public class ItemSamData {
    private String huruf, awal, tengah, akhir;

    ItemSamData(String huruf, String awal, String tengah, String akhir) {
        this.huruf = huruf;
        this.awal = awal;
        this.tengah = tengah;
        this.akhir = akhir;
    }

    String getHuruf() {
        return huruf;
    }

    public void setHuruf(String huruf) {
        this.huruf = huruf;
    }

    String getAwal() {
        return awal;
    }

    public void setAwal(String awal) {
        this.awal = awal;
    }

    String getTengah() {
        return tengah;
    }

    public void setTengah(String tengah) {
        this.tengah = tengah;
    }

    String getAkhir() {
        return akhir;
    }

    public void setAkhir(String akhir) {
        this.akhir = akhir;
    }
}
