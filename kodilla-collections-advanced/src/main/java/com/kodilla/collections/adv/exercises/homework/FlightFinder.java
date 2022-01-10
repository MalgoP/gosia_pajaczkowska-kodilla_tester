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

    public static void main(String[] args) {
        FlightRepository.addFlight("Berlin","Warsaw");
        FlightRepository.addFlight("Berlin","Paris");
        FlightRepository.addFlight("Paris","Warsaw");
        FlightRepository.addFlight("Berlin","Dubai");
        FlightRepository.addFlight("Warsaw","Berlin");
        FlightRepository.addFlight("Berlin","Paris");
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromBerlin = flightFinder.findFlightsFrom("Berlin");
        List<Flight> flightsToWarsaw = flightFinder.findFlightsTo("Warsaw");
    }
}
