package com.kodilla.abstracts.homework;

public class Trapeze extends Shape {
    private double sideA, sideB, sideC, sideD, height;

    public Trapeze(double sideA, double sideB, double sideC, double sideD, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 1d / 2 * (sideA + sideB) * height;
    }

    @Override
    public double calculateCircumference() {
        return sideA + sideB + sideC + sideD;
    }
}
