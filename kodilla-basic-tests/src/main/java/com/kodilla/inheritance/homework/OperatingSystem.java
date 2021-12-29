package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseDate;

    public OperatingSystem(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void turnOn() {
        System.out.println("Hello.");
    }

    public void turnOff() {
        System.out.println("Good Bye.");
    }

    public int getReleaseDate() {
        return releaseDate;
    }
}
