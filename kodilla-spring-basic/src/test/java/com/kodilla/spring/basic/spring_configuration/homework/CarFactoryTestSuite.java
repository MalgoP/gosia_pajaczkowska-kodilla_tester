package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    void shouldRideSuvInWinter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        carFactory.setSeason("WINTER");
        carFactory.setHour(5);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("SUV",car.getCarType());
    }

    @Test
    void shouldRideCabrioInSummer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        carFactory.setSeason("SUMMER");
        carFactory.setHour(22);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("Cabrio",car.getCarType());
    }

    @Test
    void shouldRideSedanInAutumn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        carFactory.setSeason("AUTUMN");
        carFactory.setHour(16);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("Sedan",car.getCarType());
    }

    @Test
    void shouldRideSedanInSpring() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        carFactory.setSeason("SPRING");
        carFactory.setHour(12);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("Sedan",car.getCarType());
    }

    @Test
    void shouldTurnOnLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        carFactory.setSeason("WINTER");
        carFactory.setHour(5);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }


    @Test
    void shouldTurnOffLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        carFactory.setSeason("WINTER");
        carFactory.setHour(7);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }
}