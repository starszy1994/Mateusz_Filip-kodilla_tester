package com.kodilla.abstracts.homework;

public class Comedian extends Job{

    public Comedian() {
        super(6000,"Telling jokes");
        System.out.println("Comedians duties include: " + responsibilities);
    }
    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return responsibilities;
    }
}
