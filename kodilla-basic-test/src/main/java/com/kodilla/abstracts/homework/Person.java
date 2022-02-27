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

    public static void main(String[] args) {

        Person Anna = new Person ("Anna", 28, "Teacher");
        Person Ricky = new Person("Ricky", 48, "Comedian");
        Person Joe = new Person("Joe", 29, "Driver");
        Person[] person = {Anna, Ricky, Joe};
        int numerOfElements = person.length;
        int result = 0;

        Teacher teacher = new Teacher ();
        teacher.getResponsibilities();

        Comedian comedian = new Comedian();
        comedian.getResponsibilities();

        Driver driver = new Driver();
        driver.getResponsibilities();
    }
}

