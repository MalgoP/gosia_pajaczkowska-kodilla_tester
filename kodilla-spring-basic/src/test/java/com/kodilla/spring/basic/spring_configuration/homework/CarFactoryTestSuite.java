package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class CarFactoryTestSuite {

    private static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Test
    void shouldRideSuvInWinter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        LocalDateTime dateTime = LocalDateTime.parse("2022-03-20 19:00",df);
        carFactory.setDateTime(dateTime);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("SUV",car.getCarType());
    }

    @Test
    void shouldRideCabrioInSummer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        LocalDateTime dateTime = LocalDateTime.parse("2022-07-20 19:00",df);
        carFactory.setDateTime(dateTime);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("Cabrio",car.getCarType());
    }

    @Test
    void shouldRideSedanInAutumn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        LocalDateTime dateTime = LocalDateTime.parse("2022-04-25 05:00",df);
        carFactory.setDateTime(dateTime);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("Sedan",car.getCarType());
    }

    @Test
    void shouldRideSedanInSpring() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        LocalDateTime dateTime = LocalDateTime.parse("2022-11-05 23:00",df);
        carFactory.setDateTime(dateTime);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertEquals("Sedan",car.getCarType());
    }

    @Test
    void shouldTurnOnLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        LocalDateTime dateTime = LocalDateTime.parse("2022-03-20 03:00",df);
        carFactory.setDateTime(dateTime);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void shouldTurnOffLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarFactory carFactory = context.getBean(CarFactory.class);
        LocalDateTime dateTime = LocalDateTime.parse("2022-03-20 16:00",df);
        carFactory.setDateTime(dateTime);
        Car car = (Car)context.getBean("createCar");
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }
}