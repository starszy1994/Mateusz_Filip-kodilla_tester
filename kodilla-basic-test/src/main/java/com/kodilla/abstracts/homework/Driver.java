package com.kodilla.abstracts.homework;

public class Driver extends Job {

    public Driver() {
        super(3200,"Driving a car");
        System.out.println("Drivers duties include: " + responsibilities);
    }
    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return responsibilities;
    }
}
