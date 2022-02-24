package com.kodilla.abstracts.homework;

public class Person {

    public String firstName;
    public int age;
    public String Job;

    public Person(String name, int age, String Job) {
        Person Anna = new Person ("Anna", 28, "Teacher");
        Person Ricky = new Person("Ricky", 48, "Comedian");
        Person Joe = new Person("Joe", 29, "Driver");
        Person[] person = {Anna, Ricky, Joe};
        int numerOfElements = person.length;
        int result = 0;
    }

    public static void main(String[] args) {

        Job teacher = new Teacher ();
        teacher.getResponsibilities();

        Job comedian = new Comedian();
        comedian.getResponsibilities();

        Job driver = new Driver();
        driver.getResponsibilities();
    }
}

