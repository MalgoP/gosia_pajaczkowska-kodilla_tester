package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    private int maxSpeed = 140;

    public Opel() {
        speed = 0;
    }

    public Opel(int speed) {
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
        if (speed + 20 > maxSpeed) {
            speed = maxSpeed;
        } else {
            speed += 20;
        }
    }

    @Override
    public void decreaseSpeed() {
        if (speed - 5 < 0) {
            speed = 0;
        } else {
            speed -= 5;
        }
    }
}
