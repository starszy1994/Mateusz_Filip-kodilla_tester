package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public double a;
    public double b;

    public double giveArea() {
        return a*b;
    }
    public double giveCircuit() {
        return 2*a + 2*b;
    }
}
