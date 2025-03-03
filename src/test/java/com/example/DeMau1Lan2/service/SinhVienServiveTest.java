package com.example.DeMau1Lan2.service;

import com.example.DeMau1Lan2.entity.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiveTest {
    private SinhVienServive sinhVienServive;
    @BeforeEach
    void setUp() {
        sinhVienServive = new SinhVienServive();
    }



    @Test
    void update() {
        SinhVien sinhVien = new SinhVien("ma1", "h", 18, 9, 7, "avc");
        sinhVienServive.add(sinhVien);

        sinhVien.setTen("b");
        sinhVien.setTuoi(20);
        sinhVienServive.update(sinhVien);
        assertEquals("b", sinhVienServive.getSVByMaSV("ma1").getTen());
        assertEquals(20, sinhVienServive.getSVByMaSV("ma1").getTuoi());
    }

    @Test
    void updateWithTenNull (){

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sinhVienServive.update(new SinhVien("ma1", "", 18, 9, 7, "avc")));
        assertEquals("tên không để trống", exception.getMessage());
    }

    @Test
    void addWithInvalidSV(){
        SinhVien sinhVien = new SinhVien("ma1", "h", 18, 9, 7, "avc");
        SinhVien sinhVien1 = new SinhVien("ma2", "h", 18, 9, 7, "avc");
        sinhVienServive.add(sinhVien);
        sinhVienServive.add(sinhVien1);
        assertEquals(2, sinhVienServive.getAll().size());

    }

    @Test
    void delete (){
        SinhVien sinhVien = new SinhVien("ma1", "h", 18, 9, 7, "avc");
        SinhVien sinhVien1 = new SinhVien("ma2", "h", 18, 9, 7, "avc");
        sinhVienServive.add(sinhVien);
        sinhVienServive.add(sinhVien1);

        sinhVienServive.delete("ma2");
        assertEquals(1, sinhVienServive.getAll().size());

    }


}