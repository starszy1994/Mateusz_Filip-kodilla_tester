package com.kodilla.inheritance.homework;

public class TypeOfSystem extends OperatingSystem{
    public void openWindows() {
        System.out.println("Opening Windows...");
    }
    public void closeWindows() {
        System.out.println("Closing Windows...");
    }
    public void startWindows() {
        System.out.println("Opening system in 1 min");
    }
    public TypeOfSystem (int publicationDate) {
        super(publicationDate);
        System.out.println("System Windows for Android");
    }
}
