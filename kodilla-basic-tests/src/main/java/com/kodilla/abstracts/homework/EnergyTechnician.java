package com.kodilla.abstracts.homework;

public class EnergyTechnician extends Job {

    public EnergyTechnician(int salary) {
        super(5770);
        String[] responsibilities = {"Assembly of electrical installations in accordance with the technical documentation;"
                , "Diagnosis and repair of installations;"
                , "Performing technical inspections and maintenance;"
                , "Design of electrical networks;"
                , "Maintenance and repair of overhead lines and cables."};
        setResponsibilities(responsibilities);
        System.out.println("Power engineer will get " + salary + "PLN per month.");
    }
}
