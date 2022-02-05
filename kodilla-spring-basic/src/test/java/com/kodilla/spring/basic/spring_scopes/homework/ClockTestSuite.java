package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTimeClock() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        Clock firstClock = context.getBean(Clock.class);
        Thread.sleep(100);
        Clock secondClock = context.getBean(Clock.class);
        Thread.sleep(100);
        Clock thirdClock = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstClock.getDate(), thirdClock.getDate());
        Assertions.assertNotEquals(secondClock.getDate(), thirdClock.getDate());
        Assertions.assertNotEquals(firstClock.getDate(), secondClock.getDate());
    }
}