package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Square extends Shape {

    public double a;

    public double giveArea() {
        return a*a;
    }

    public double giveCircuit() {
        return 4*a;
    }
}
