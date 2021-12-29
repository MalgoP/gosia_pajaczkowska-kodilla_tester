package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String[] responsibilities;

    public Job(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String[] responsibilities) {
        this.responsibilities = responsibilities;
    }
}
