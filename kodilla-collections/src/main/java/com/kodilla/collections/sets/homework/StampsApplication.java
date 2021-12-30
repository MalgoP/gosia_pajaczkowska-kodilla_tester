package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Kapral niedźwiedź Wojtek", 31.25, 43.0, false));
        stamps.add(new Stamp("150. rocznica urodzin Józefa Piłsudskiego", 40.5, 54.0, true));
        stamps.add(new Stamp("Sukcesy polskich skoczków narciarskich", 43.0, 31.25, false));
        stamps.add(new Stamp("150. rocznica urodzin Józefa Piłsudskiego", 40.5, 54.0, false));
        stamps.add(new Stamp("„Miasta polskie” Nowy Sącz", 31.25, 25.5, false));
        stamps.add(new Stamp("Kapral niedźwiedź Wojtek", 31.25, 43.0, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

