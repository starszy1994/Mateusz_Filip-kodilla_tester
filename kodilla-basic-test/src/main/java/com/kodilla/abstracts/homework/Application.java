package com.kodilla.abstracts.homework.;

public class Application {

    public static void main(String[] args) {
        Square square = new Square();

        ShapeProcess process = new ShapeProcess();
        process.process(Square);

        Wheel wheel = new Wheel();
        wheel.perimeter();
    }