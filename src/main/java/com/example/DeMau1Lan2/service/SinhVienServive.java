package com.example.DeMau1Lan2.service;

import com.example.DeMau1Lan2.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServive {

    List<SinhVien> sinhViens = new ArrayList<>();

    public void add (SinhVien sinhVien){
        if (sinhVien == null){
            throw new IllegalArgumentException("sinh viên không được trống");
        }
        sinhViens.add(sinhVien);
    }

    public void update(SinhVien sinhVien){
        if (sinhVien == null){
            throw new IllegalArgumentException("sinh viên không được trống");
        }
        for (int i=0; i< sinhViens.size(); ++i){
            if (sinhViens.get(i).getMaSV()== sinhVien.getMaSV()){
                sinhViens.set(i, sinhVien);
            }
            else {
                throw new IllegalArgumentException("sinh viên không tồn tại");
            }
        }
    }
    public SinhVien getSVByMaSV (String ma){
        for (SinhVien sinhVien: sinhViens){
            if (sinhVien.getMaSV() == ma){
                return sinhVien;
            }
        }
        return null;
    }

    public List<SinhVien> getAll(){
        return new ArrayList<>(sinhViens);
    }

    public boolean delete(String ma){
        for (int i=0; i<sinhViens.size();++i){
            if (sinhViens.get(i).getMaSV() == ma){
                sinhViens.remove(i);
                return true;
            }
        }
        return false;
    }
}
