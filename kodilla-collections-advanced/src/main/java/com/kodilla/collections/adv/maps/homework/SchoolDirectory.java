package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> informationBooklet = new HashMap<>();
        Principal daniel = new Principal("Daniel", "Blast", "The Norwegian School in London");
        Principal jacob = new Principal("Jacob", "Gump", "ACS International School Egham");
        Principal liam = new Principal("Liam", "Peterson", "Instituto Espanol Vicente Canada Blanch");
        Principal owen = new Principal("Owen", "Common", "Marymount London");

        School danielSchool = new School(20, 31, 18, 25, 32, 26, 28, 28, 30, 29, 25);
        School jacobsSchool = new School(29, 35, 32, 30, 30, 28, 26);
        School liamSchool = new School(17, 19, 20, 16, 17, 18, 19, 18, 21, 19, 19, 21, 16);
        School owenSchool = new School(22, 24, 25, 26, 23, 22, 24, 23, 20, 26, 23, 22);

        informationBooklet.put(daniel, danielSchool);
        informationBooklet.put(jacob, jacobsSchool);
        informationBooklet.put(liam, liamSchool);
        informationBooklet.put(owen, owenSchool);

        System.out.println(informationBooklet.get(daniel));
        System.out.println(informationBooklet.get(jacob));
        System.out.println(informationBooklet.get(liam));
        System.out.println(informationBooklet.get(owen));

        for (Map.Entry<Principal, School> principalEntry : informationBooklet.entrySet())
            System.out.println("Head: " + principalEntry.getKey().getDirectorName() + " " + principalEntry.getKey().getDirectorSurname() + " of " + principalEntry.getKey().getNameSchool() + ", sum of all students at this school is " + principalEntry.getValue().sumStudents() + ".");
    }
}
