package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AlertServiceTestSuite {

    @Test
    public void shouldAddPersonToLocation() {
        AlertService alertService = new AlertService();
        Person person1 = Mockito.mock(Person.class);
        Alert alertPoznan = Mockito.mock(Alert.class);
        Alert alertWarszawa = Mockito.mock(Alert.class);
        alertService.addSubscription("Warszawa", person1);
        alertService.addSubscription("Poznań", person1);
        alertService.sendToLocation("Warszawa", alertWarszawa);
        alertService.sendToLocation("Poznań", alertPoznan);
        Mockito.verify(person1, Mockito.times(1)).receive(alertPoznan);
        Mockito.verify(person1, Mockito.times(1)).receive(alertWarszawa);
    }

    @Test
    public void shouldNotSendAlertsToPersonRemovedFromLocation() {
        AlertService alertService = new AlertService();
        Alert alert = Mockito.mock(Alert.class);
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Person person3 = Mockito.mock(Person.class);
        alertService.addSubscription("Warszawa", person1);
        alertService.addSubscription("Poznań", person1);
        alertService.addSubscription("Poznań", person2);
        alertService.addSubscription("Poznań", person3);
        alertService.removeSubscription("Poznań", person3);
        alertService.sendToLocation("Poznań", alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
        Mockito.verify(person3, Mockito.times(0)).receive(alert);
    }

    @Test
    public void shouldNotSendAlertsToPersonRemovedFromService() {
        AlertService alertService = new AlertService();
        Alert alert = Mockito.mock(Alert.class);
        Alert alertAll = Mockito.mock(Alert.class);
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Person person3 = Mockito.mock(Person.class);
        alertService.addSubscription("Warszawa", person1);
        alertService.addSubscription("Poznań", person1);
        alertService.addSubscription("Poznań", person2);
        alertService.addSubscription("Poznań", person3);
        alertService.removeSubscription(person3);
        alertService.sendToLocation("Poznań", alert);
        alertService.sendToAll(alertAll);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alertAll);
        Mockito.verify(person2, Mockito.times(1)).receive(alertAll);
        Mockito.verify(person3, Mockito.times(0)).receive(alert);
        Mockito.verify(person3, Mockito.times(0)).receive(alertAll);
    }

    @Test
    public void alertsShouldBeSendToPersonFromSubscribedLocation() {
        AlertService alertService = new AlertService();
        Alert alert = Mockito.mock(Alert.class);
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Person person3 = Mockito.mock(Person.class);
        alertService.addSubscription("Warszawa", person1);
        alertService.addSubscription("Poznań", person1);
        alertService.addSubscription("Poznań", person2);
        alertService.addSubscription("Warszawa", person3);
        alertService.sendToLocation("Poznań", alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
        Mockito.verify(person3, Mockito.times(0)).receive(alert);
    }

    @Test
    public void shouldSendAlertsToAll() {
        AlertService alertService = new AlertService();
        Alert alert = Mockito.mock(Alert.class);
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        alertService.addSubscription("Warszawa", person1);
        alertService.addSubscription("Poznań", person1);
        alertService.addSubscription("Poznań", person2);
        alertService.sendToAll(alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldDeleteLocalization() {
        AlertService alertService = new AlertService();
        Alert alert = Mockito.mock(Alert.class);
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        alertService.addSubscription("Warszawa", person1);
        alertService.addSubscription("Poznań", person1);
        alertService.addSubscription("Poznań", person2);
        alertService.removeLocation("Poznań");
        alertService.sendToLocation("Poznań",alert);
        Mockito.verify(person1, Mockito.times(0)).receive(alert);
        Mockito.verify(person2, Mockito.times(0)).receive(alert);
    }
}