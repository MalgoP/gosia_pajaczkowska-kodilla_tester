package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void duty() {
        System.out.println("This Person has responsibilities:");
        for (int i = 0; i < job.getResponsibilities().length; i++) {
            System.out.println(job.getResponsibilities()[i]);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

}
