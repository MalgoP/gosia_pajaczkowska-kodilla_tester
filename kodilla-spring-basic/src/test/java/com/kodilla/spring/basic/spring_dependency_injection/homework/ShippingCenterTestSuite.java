package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldDeliverPackages() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        Assertions.assertEquals("Package delivered to: Warsaw", shippingCenter.sendPackage("Warsaw", 22.0));
    }

    @Test
    public void shouldNotDeliverOverweightPackages() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        Assertions.assertEquals("Package not delivered to: Warsaw", shippingCenter.sendPackage("Warsaw", 220.0));
    }
}