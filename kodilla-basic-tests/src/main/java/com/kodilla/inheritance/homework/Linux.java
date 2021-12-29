package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux() {
        super(1991);
    }

    @Override
    public void turnOff() {
        System.out.println("Shut down the system Linux.");
    }
}
