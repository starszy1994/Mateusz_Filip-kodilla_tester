package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Wheel extends Shape {

    double a;

    public Wheel (double a) {
        this.a = a;
    }

    public void surfaceArea() {
        double wheelArea = pow(a, 5.0);
        System.out.println("The surface is " + wheelArea);
    }
    @Override
    public double perimeter() {
        double wheelPerimeter = a * 8.0;
        System.out.println("Wheel perimeter is " + wheelPerimeter);
        return wheelPerimeter;
    }
}