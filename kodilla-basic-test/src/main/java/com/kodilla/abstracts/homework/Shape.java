package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int a;
    private int b;

    private double squareArea = a * b;
    private double perimeter = 2*(a +b);

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double Shape (double squareArea, double perimeter) {
        this.squareArea = squareArea;
        this.perimeter = perimeter;
    }
    public int getsqareArea(a * b) {
        return squareArea;
    }

    public double getPerimeter(2*(a + b)) {
        return perimeter;
    }
}
