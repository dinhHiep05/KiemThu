package com.example.DeMau1Lan2.ultil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    private TinhTong tinhTong;
    @BeforeEach
    void setUp() {
        tinhTong = new TinhTong();
    }

    @Test
    void tong() {
        int tong[]={1,3,5};
        assertEquals(9, tinhTong.tong(tong));
    }
}