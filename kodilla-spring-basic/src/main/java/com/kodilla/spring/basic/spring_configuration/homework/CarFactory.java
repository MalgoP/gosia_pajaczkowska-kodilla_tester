package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarFactory {

    private String season;
    private int hour;

    @Bean
    @Scope("prototype")
    public Car createCar() {
        boolean turnOnLights = false;
        if (hour >= 20 || hour <= 6) {
            turnOnLights = true;
        }
        if ("SUMMER".equals(season)) {
            return new Cabrio(turnOnLights);
        } else if ("WINTER".equals(season)) {
            return new SUV(turnOnLights);
        } else {
            return new Sedan(turnOnLights);
        }
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}