package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem {

    public Windows98() {
        super(1998);
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome to Windows98");
    }
}
