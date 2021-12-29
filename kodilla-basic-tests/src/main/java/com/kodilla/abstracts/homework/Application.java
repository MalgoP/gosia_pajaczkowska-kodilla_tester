package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square number1 = new Square(3);
        System.out.println("Area of Square is " + number1.calculateArea());
        System.out.println("Circumference of Square is " + number1.calculateCircumference());

        Trapeze number2 = new Trapeze(7, 21, 13, 15, 12);
        System.out.println("Area of Trapeze is " + number2.calculateArea());
        System.out.println("Circumference of Trapeze is " + number2.calculateCircumference());

        Rectangle number3 = new Rectangle(5, 8);
        System.out.println("Area of Rectangle is " + number3.calculateArea());
        System.out.println("Circumference of Rectangle is " + number3.calculateCircumference());
    }
}
