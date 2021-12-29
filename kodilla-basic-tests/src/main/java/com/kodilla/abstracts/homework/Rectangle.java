package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculateCircumference() {
        return 2 * sideA + 2 * sideB;
    }
}
