package com.bilgee.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class SchoolTest {
    @Test
    public void schoolTest(){
        com.bilgee.demo.School sti = new com.bilgee.demo.School();

        sti.welcomeStudent();
        assertInstanceOf(String.class, sti.welcomeStudent());
    }

}
