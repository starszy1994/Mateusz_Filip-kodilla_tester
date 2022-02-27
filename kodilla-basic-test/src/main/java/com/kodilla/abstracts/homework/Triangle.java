package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Triangle extends Shape{
    public double a;
    public double b;
    public double c;
    public double h;

    public double giveArea () {
        return a*h/2;
    }
    public double giveCircuit() {
        return a+b+c;
    }
}
