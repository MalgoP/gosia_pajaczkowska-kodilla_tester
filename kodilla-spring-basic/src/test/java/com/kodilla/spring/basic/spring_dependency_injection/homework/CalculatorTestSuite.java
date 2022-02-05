package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldAddDoubleValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(8.0, calculator.add(4.0, 4.0), 0.01);
    }

    @Test
    public void shouldSubtractDoubleValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(1.0, calculator.subtract(5.0, 4.0), 0.01);
    }

    @Test
    public void shouldMultiplyDoubleValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(4.0, calculator.multiply(2.0, 2.0), 0.01);
    }

    @Test
    public void shouldDivideDoubleValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(5.0, calculator.divide(10.0, 2.0), 0.01);
    }
}