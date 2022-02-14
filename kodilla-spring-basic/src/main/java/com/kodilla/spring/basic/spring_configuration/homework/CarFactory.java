package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;
import java.time.Month;

@Configuration
public class CarFactory {

    private LocalDateTime dateTime = LocalDateTime.now();

    @Bean
    @Scope("prototype")
    public Car createCar() {
        boolean turnOnLights = false;
        int hour = dateTime.getHour();
        if (hour >= 20 || hour <= 6) {
            turnOnLights = true;
        }
        String season = getSeason(dateTime);
        if ("SUMMER".equals(season)) {
            return new Cabrio(turnOnLights);
        } else if ("WINTER".equals(season)) {
            return new SUV(turnOnLights);
        } else {
            return new Sedan(turnOnLights);
        }
    }

    private String getSeason(LocalDateTime dateTime) {
        int monthDay = (dateTime.getMonth().ordinal()+1)*100+dateTime.getDayOfMonth();
        Month month = dateTime.getMonth();
        if(monthDay<321 || monthDay>=1222){
            return "WINTER";
        }else if(monthDay>=321 && monthDay<622){
            return "SPRING";
        }else if (monthDay>=622 && monthDay<923){
            return "SUMMER";
        }else{
            return "AUTUMN";
        }
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}