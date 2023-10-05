package com.bilgee.test;

import com.bilgee.demo.School;
import com.bilgee.demo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    @Test
    public void myTest(){

        Student benny = null;

        assertNotNull(benny);
    }

    @Test
    public void addition(){

        assertEquals(4,2+2);// assert is condition
        // hierarki
    }

}