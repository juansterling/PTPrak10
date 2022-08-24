package com.example.p_pt10_2072009;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class contohTest {
    @BeforeAll
    static void inits(){
        System.out.println("sebelum segala sesuatu");
    }
    @BeforeEach
    void setUp(){
        System.out.println("sebelum setiap");
    }
    @Test
    void returnnumber() {
        contoh c = new contoh();
        int temp = c.returnnumber();
        assertNotEquals(50,temp);
        assertNotEquals(40,temp);
        assertNotEquals(20,temp);
    }
}