package com.kodilla.jacoco;

public class LeapYearUtil {
    int year;

    public LeapYearUtil(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                return (this.year % 400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
