package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(double area, double circuit) {
        super();
    }

    public Rectangle() {
        super();
    }

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double area() {
        return a*b;
    }
    public double circuit() {
        return 2*(a+b);
    }
}
