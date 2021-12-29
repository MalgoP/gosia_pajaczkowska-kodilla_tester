package com.kodilla.inheritance.homework;

public class Activation {

    public static void main(String[] args) {

        Windows98 windows98 = new Windows98();
        windows98.turnOn();
        System.out.println(windows98.getReleaseDate());
        windows98.turnOff();

        Linux linux = new Linux();
        linux.turnOn();
        System.out.println(linux.getReleaseDate());
        linux.turnOff();
    }
}
