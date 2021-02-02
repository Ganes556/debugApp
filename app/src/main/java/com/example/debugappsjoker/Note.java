package com.example.debugappsjoker;

import java.util.Date;

public class Note {
    private String title;
    private String harga;
    private Date tanggal;

    Note(){}

    Note(String title, String harga, Date tanggal){
        this.title  = title;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    public String getTitle() {
        return title;
    }

    public String getHarga() {
        return harga;
    }

    public Date getTanggal() {
        return tanggal;
    }
}
