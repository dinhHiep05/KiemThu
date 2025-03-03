package com.example.DeMau1Lan2.entity;

public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private float diemTrungBinh;
    private int kyHoc;
    private String chuyenNganh;

    public SinhVien(String maSV, String ten, int tuoi, float diemTrungBinh, int kyHoc, String chuyenNganh) {
        setMaSV(maSV);
        setTen(ten);
        setTuoi(tuoi);
        setDiemTrungBinh(diemTrungBinh);
        this.kyHoc = kyHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if (maSV.isEmpty() || maSV == null){
            throw new IllegalArgumentException("mã không trống");
        }
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()){
            throw new IllegalArgumentException("tên không để trống");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi < 18){
            throw new IllegalArgumentException("tuổi phải lớn hơn 18");
        }
        this.tuoi = tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        if (diemTrungBinh < 0 || diemTrungBinh >10){
            throw new IllegalArgumentException("điểm tb phải lớn hơn 0 và nhỏ hơn 10");
        }
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
