package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Square extends Shape {

    private double a;

    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public double Area() {
        return a*a;
    }
    public double Circuit() {
        return 4*a;
    }
}