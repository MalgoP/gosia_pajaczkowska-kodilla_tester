package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    private static final List<Flight> repository = new LinkedList<>();
    private static final Map<String, List<Flight>> flightsFromMap = new HashMap<>();
    private static final Map<String, List<Flight>> flightsToMap = new HashMap<>();

    public static void addFlight(String departure, String arrival) {
        Flight flight = new Flight(departure, arrival);
        repository.add(flight);
        List<Flight> flightsFrom = flightsFromMap.getOrDefault(departure, new LinkedList<>());
        List<Flight> flightsTo = flightsToMap.getOrDefault(arrival, new LinkedList<>());
        flightsFrom.add(flight);
        flightsTo.add(flight);
        flightsFromMap.put(departure, flightsFrom);
        flightsToMap.put(arrival, flightsTo);
    }

    public static List<Flight> getFlightsTable() {
        return repository;
    }

    public static Map<String, List<Flight>> getFlightsFromMap() {
        return flightsFromMap;
    }

    public static Map<String, List<Flight>> getFlightsToMap() {
        return flightsToMap;
    }
}
