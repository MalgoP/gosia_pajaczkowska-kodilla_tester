package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {
    Set<Person> subscribedPersons = new HashSet<>();
    Map<String,Set<Person>> locationSubscription = new HashMap<>();

    public void addSubscription(String location, Person person){
        subscribedPersons.add(person);
        Set<Person> locationSubscriptionsSet = locationSubscription.getOrDefault(location,new HashSet<>());
        locationSubscriptionsSet.add(person);
        locationSubscription.put(location,locationSubscriptionsSet);
    }

    public void removeSubscription(String location, Person person){
        locationSubscription.getOrDefault(location,new HashSet<>()).remove(person);
    }

    public void removeSubscription(Person person){
        subscribedPersons.remove(person);
        locationSubscription.values().forEach(people -> people.remove(person));
    }

    public void removeLocation(String location){
        locationSubscription.remove(location);
    }
    public void sendToAll(Alert alert){
        subscribedPersons.stream().forEach(person -> person.receive(alert));
    }
    public void sendToLocation(String location, Alert alert){
        locationSubscription.getOrDefault(location, new HashSet<>()).stream().forEach(person -> person.receive(alert));
    }
}