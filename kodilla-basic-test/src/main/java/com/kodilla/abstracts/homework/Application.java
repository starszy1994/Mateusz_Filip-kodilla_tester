package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
       Square square = new Square ();
       square.setA(10);
       System.out.println("Square area= " + square.Area());
       System.out.println("Square circuit= " + square.Circuit());

       Rectangle rectangle = new Rectangle();
       rectangle.setA(4.5);
       rectangle.setB(8.0);
       System.out.println("Rectangle area= " + rectangle.Area());
       System.out.println("Rectangle circuit= " + rectangle.Circuit());

       Triangle triangle = new Triangle();
       triangle.setA(3);
       triangle.setB(6);
       triangle.setC(8);
       triangle.setH(6.5);
       System.out.println("Triangle area= " + triangle.Area());
       System.out.println("Triangle circuit= " + triangle.Circuit());
    }
}
