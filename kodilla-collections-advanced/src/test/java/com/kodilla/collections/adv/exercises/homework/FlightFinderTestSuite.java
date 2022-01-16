package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        FlightRepository.addFlight("Dubai", "Warsaw");
        FlightRepository.addFlight("Dubai", "Paris");
        FlightRepository.addFlight("Paris", "Dubai");
        FlightRepository.addFlight("Dubai", "San Francisco");
        FlightRepository.addFlight("Dubai", "Lisbon");

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightFromDubai = flightFinder.findFlightsFrom("Dubai");
        assertEquals(4, flightFromDubai.size());
        List<Flight> expectedFromList =  new LinkedList<>();
        expectedFromList.add(new Flight("Dubai", "Warsaw"));
        expectedFromList.add(new Flight("Dubai", "Paris"));
        expectedFromList.add(new Flight("Dubai", "San Francisco"));
        expectedFromList.add(new Flight("Dubai", "Lisbon"));
        assertEquals(expectedFromList,flightFromDubai);
    }

    @Test
    public void testFindFlightsTo() {
        FlightRepository.addFlight("Dubai", "San Francisco");
        FlightRepository.addFlight("San Francisco", "Dubai");
        FlightRepository.addFlight("Lisbon", "Dubai");
        FlightRepository.addFlight("Lisbon", "San Francisco");
        FlightRepository.addFlight("Warsaw", "San Francisco");

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightToSanFrancisco = flightFinder.findFlightsTo("San Francisco");
        assertEquals(3, flightToSanFrancisco.size());
        List<Flight> expectedToList =  new LinkedList<>();
        expectedToList.add(new Flight("Dubai", "San Francisco"));
        expectedToList.add(new Flight("Lisbon", "San Francisco"));
        expectedToList.add(new Flight("Warsaw", "San Francisco"));
        assertEquals(expectedToList,flightToSanFrancisco);
    }
}