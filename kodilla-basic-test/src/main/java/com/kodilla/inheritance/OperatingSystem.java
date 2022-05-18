package com.kodilla.inheritance;

public class OperatingSystem {
    private int publicationDate;

    public OperatingSystem(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void turnOnSystem() {
        System.out.println("System were turned on");
    }
    public void turnOffSystem() {
        System.out.println("System were turned off");
    }
    public void displayPublicationDate() {
        System.out.println("Publication year: " + publicationDate);
    }
    public int getPublicationDate() {
        return publicationDate;
    }
}
