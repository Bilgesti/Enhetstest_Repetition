package com.bilgee.demo;


import com.bilgee.demo.inheritance.Airplane;
import com.bilgee.demo.inheritance.Car;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Car car = new Car();


        airplane.start();
        car.start();
        car.durability();

    }
}
