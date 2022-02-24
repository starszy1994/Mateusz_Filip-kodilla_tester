package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher() {
        super(2500,"Learning");
        System.out.println("Teachers duties include: " + responsibilities);
    }
    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        return responsibilities;
    }
}
