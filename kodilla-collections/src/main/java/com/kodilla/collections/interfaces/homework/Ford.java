package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;
    private int maxSpeed = 120;

    public Ford() {
        speed = 0;
    }

    public Ford(int speed) {
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
        if (speed + 10 > maxSpeed) {
            speed = maxSpeed;
        } else {
            speed += 10;
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
