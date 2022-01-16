package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        return FlightRepository.getFlightsFromMap().getOrDefault(departure,new LinkedList<>());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return FlightRepository.getFlightsToMap().getOrDefault(arrival,new LinkedList<>());
    }
}
