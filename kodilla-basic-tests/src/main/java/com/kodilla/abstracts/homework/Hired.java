package com.kodilla.abstracts.homework;

public class Hired {

    public static void main(String[] args) {
        Job gasTechnician = new GasTechnician(1000);
        Job energyTechnician = new EnergyTechnician(5000);
        Person firstPerson = new Person("Arkadiusz", 43, gasTechnician);
        Person secondPerson = new Person("Adam",33,gasTechnician);
        Person thirdPerson = new Person("Wojciech", 29, energyTechnician);
        Person fourthPerson = new Person("Patryk", 31, new GasNetworkFitter(4200));
        Person fifthPerson = new Person("Tomasz", 31, energyTechnician);

        System.out.println(firstPerson.getFirstName());
        firstPerson.duty();
        System.out.println(secondPerson.getFirstName());
        secondPerson.duty();
        System.out.println(thirdPerson.getFirstName());
        thirdPerson.duty();
        System.out.println(fourthPerson.getFirstName());
        fourthPerson.duty();
        System.out.println(fifthPerson.getFirstName());
        fifthPerson.duty();
    }
}
