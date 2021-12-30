package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(100));
        cars.add(new Fiat(80));
        Opel opel = new Opel(90);
        cars.add(opel);
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}
