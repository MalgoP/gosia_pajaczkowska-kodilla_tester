package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {
    private int speed;
    private int maxSpeed = 160;

    public Fiat() {
        speed = 0;
    }

    public Fiat(int speed) {
        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        if (speed + 30 > maxSpeed) {
            speed = maxSpeed;
        } else {
            speed += 30;
        }
    }

    @Override
    public void decreaseSpeed() {
        if (speed - 10 < 0) {
            speed = 0;
        } else {
            speed -= 10;
        }
    }
}
