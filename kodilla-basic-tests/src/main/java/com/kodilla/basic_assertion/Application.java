package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 8;
        int r = 4;

        int sumResult = calculator.sum(a, b);
        int resultSubtract = calculator.subtractNumber(a, b);
        int resultSquare = calculator.squareNumber(r);

        boolean correct = ResultChecker.assertEquals(18, sumResult);
        if (correct) {
            System.out.println("Metoda dodawania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Nie działa dodawanie dla liczb " + a + " i " + b);
        }

        boolean good = ResultChecker.assertEquals(2, resultSubtract);
        if (good) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Nie działa odejmowanie dla liczb " + a + " i " + b);
        }

        boolean checkSquare = ResultChecker.assertEquals(16, resultSquare);
        if (checkSquare) {
            System.out.println("Metoda do kwadratu działa dla liczby " + r);
        } else {
            System.out.println("Nie działa metoda do kwadratu dla liczby " + r);
        }
    }
}
