package com.example.myapplication;

import java.sql.Blob;

public class LichHoc {
    String tietHoc;
    String monHoc;
    String Lop;
    Blob gio;
    String Phong;
    String tenGV;

    public LichHoc(String tietHoc, String monHoc, String lop, Blob gio, String phong, String tenGV) {
        this.tietHoc = tietHoc;
        this.monHoc = monHoc;
        this.Lop = lop;
        this.gio = gio;
        this.Phong = phong;
        this.tenGV = tenGV;
    }
}
