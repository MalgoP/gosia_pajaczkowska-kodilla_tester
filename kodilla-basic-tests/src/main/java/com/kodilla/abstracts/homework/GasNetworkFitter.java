package com.kodilla.abstracts.homework;

public class GasNetworkFitter extends Job {

    public GasNetworkFitter(int salary) {
        super(salary);
        String[] responsibilities = {"Performs work related to cutting and processing pipes, threading;"
                , "Drills holes, grinds, bends pipes;"
                , "Seals pipe joints;"
                , "Performs anti-corrosion and thermal insulation."};
        setResponsibilities(responsibilities);
        System.out.println("The gas network fitter will get " + salary + "PLN per month.");
    }
}
