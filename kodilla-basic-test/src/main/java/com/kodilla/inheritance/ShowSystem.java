package com.kodilla.inheritance;

public class ShowSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2012);
        operatingSystem.turnOnSystem();
        operatingSystem.turnOffSystem();

        TypeOfSystem typeOfSystem = new TypeOfSystem(2021);
        typeOfSystem.displayPublicationDate();
    }
}
