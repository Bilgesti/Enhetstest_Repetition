package com.bilgee.demo.inheritance;

public abstract class AVehicle {
    int durability;
   public abstract void durability(); // alla abstrakta methoder behöver implementera.

    public void steer(){
        System.out.println("Steers the vehicle");
    }
}
