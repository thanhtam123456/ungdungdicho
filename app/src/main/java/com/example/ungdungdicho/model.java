package com.example.ungdungdicho;

import android.widget.CheckBox;

import java.io.Serializable;

public class model  implements Serializable {

    private  String checkbox;
    private String  TenHang ;
    private String  Donvi ;
    private String  Khoiluong;
    private  String Gia ;
    private  String Mieuta ;
    private String Ten;
    private String Mssv;

    public model() { }

    public model(String tenHang, String donvi, String khoiluong, String gia, String mieuta, String ten, String mssv) {

        TenHang = tenHang;
        Donvi = donvi;
        Khoiluong = khoiluong;
        Gia = gia;
        Mieuta = mieuta;
        Ten = ten;
        Mssv = mssv;
    }


    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String donvi) {
        Donvi = donvi;
    }

    public String getKhoiluong() {
        return Khoiluong;
    }

    public void setKhoiluong(String khoiluong) {
        Khoiluong = khoiluong;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public String getMieuta() {
        return Mieuta;
    }

    public void setMieuta(String mieuta) {
        Mieuta = mieuta;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String mssv) {
        Mssv = mssv;
    }
}
