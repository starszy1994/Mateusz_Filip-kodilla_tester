package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double giveArea() {
        return a*b;
    }
    public double giveCircuit() {
        return 2*a + 2*b;
    }
}
