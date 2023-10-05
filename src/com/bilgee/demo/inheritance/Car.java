package com.bilgee.demo.inheritance;

public class Car extends AVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("VROM VROM");
    }

    @Override
    public void crash() {
        System.out.println("Oh No, Not Timmy");
    }

    @Override
    public void expandFuel() {
        System.out.println("-1 fuel");
    }

    @Override
    public void horn() {
        System.out.println("HONK");
    }

    @Override
    public void durability() {
        System.out.println("Durability is: 100 " );
    }
}
