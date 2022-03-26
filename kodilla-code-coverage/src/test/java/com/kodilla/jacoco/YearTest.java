package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class YearTest {

    @Test
    public void shouldBeNotALeapYearIfNotDivisibleBy4() {
        //given
        LeapYearUtil leapYearUtil = new LeapYearUtil(121);

        //when
        boolean isLeapYear = leapYearUtil.isLeap();

        //then
        assertTrue(!isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy4AndDivisibleBy100AndNotBy400() {
        //given
        LeapYearUtil leapYearUtil = new LeapYearUtil(1500);

        //when
        boolean isLeapYear = leapYearUtil.isLeap();

        //then
        assertTrue(!isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4AndNotDivisibleBy100() {
        //given
        LeapYearUtil leapYearUtil = new LeapYearUtil(1508);

        //when
        boolean isLeapYear = leapYearUtil.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        //given
        LeapYearUtil leapYearUtil = new LeapYearUtil(1600);

        //when
        boolean isLeapYear = leapYearUtil.isLeap();

        //then
        assertTrue(isLeapYear);
    }
}
