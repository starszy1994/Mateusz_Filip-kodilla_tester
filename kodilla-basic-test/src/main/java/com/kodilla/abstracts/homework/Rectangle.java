package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Rectangle extends Shape {

    double a;
    public Rectangle (double a) {
        this.a = a;
    }

    public void surfaceArea() {
        double rectangleArea = pow(a, 7.5);
        System.out.println("The surface is " + rectangleArea);
    }
    @Override
    public double perimeter() {
        double rectanglePerimeter = a * 12.8;
        System.out.println("Rectangle perimeter is " + rectanglePerimeter);
        return rectanglePerimeter;
    }
}