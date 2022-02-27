package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
       Square square = new Square();
       square.a=(10);
       System.out.println("Square area= " + square.giveArea());
       System.out.println("Square circuit= " + square.giveCircuit());

       Rectangle rectangle = new Rectangle();
       rectangle.a=(4.5);
       rectangle.b=(8.0);
       System.out.println("Rectangle area= " + rectangle.giveArea());
       System.out.println("Rectangle circuit= " + rectangle.giveCircuit());

       Triangle triangle = new Triangle();
       triangle.a=(3);
       triangle.b=(6);
       triangle.c=(8);
       triangle.h=(6.5);
       System.out.println("Triangle area= " + triangle.giveArea());
       System.out.println("Triangle circuit= " + triangle.giveCircuit());
    }
}
