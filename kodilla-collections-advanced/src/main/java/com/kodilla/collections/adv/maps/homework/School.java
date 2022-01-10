package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> countStudents = new ArrayList<>();

    public School(int... countStudents) {
        for (int count : countStudents)
            this.countStudents.add(count);
    }

    public int sumStudents() {
        int sum = 0;
        for (int count : countStudents) {
            sum += count;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School:" + countStudents.toString();
    }
}
