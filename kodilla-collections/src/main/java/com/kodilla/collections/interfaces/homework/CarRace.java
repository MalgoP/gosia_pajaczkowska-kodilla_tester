package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car ford = new Ford();
        doRace(ford);

        Car fiat = new Fiat();
        doRace(fiat);

        Car opel = new Opel();
        doRace(opel);

    }

    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
