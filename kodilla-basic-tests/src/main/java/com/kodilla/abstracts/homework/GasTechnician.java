package com.kodilla.abstracts.homework;

public class GasTechnician extends Job {

    public GasTechnician(int salary) {
        super(3200);
        String[] responsibilities = {"Sealing or replacing gas taps;"
                , "Periodic checking of tightness of pipeline joints and fittings;"
                , "Connecting gas appliances after the works are completed;"
                , "Checking the condition of the rooms of the main gas cock;"
                , "Checking the passage of gas pipes through the external walls of the building;"
                , "Checking gas concentration in gas meter cavities, in particular gas meter connections and condition;"
                , "Annual inspection of the gas installation."};
        setResponsibilities(responsibilities);
        System.out.println("Gas technician will get " + salary + "PLN per month.");
    }
}
