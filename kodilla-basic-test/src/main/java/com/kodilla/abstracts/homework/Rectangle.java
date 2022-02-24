package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double Area() {
        return a*b;
    }
    public double Circuit() {
        return 2*(a+b);
    }
}