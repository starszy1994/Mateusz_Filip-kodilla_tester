package com.kodilla.abstracts.homework;

import static java.lang.Math.pow;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b =b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getH() {
        return h;
    }
    public double area() {
        return a*h/2;
    }
    public double circuit() {
        return a+b+c;
    }
}
