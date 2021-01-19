package com.company;

public class Truck extends Car {

    boolean refrigerator;

    public Truck(String name, String color, CarBrand carBrand, boolean isRunning, boolean refrigerator) {
        super(name, color, carBrand, isRunning);
        this.refrigerator = refrigerator;
    }

    @Override
    public void move() {
        System.out.println(name + " TRUCK STARTED!");
    }

    @Override
    public void stop() {
        System.out.println(name + " STOP\n___________________________________________");
    }

    public boolean truckRefrigerator() {
        return refrigerator;
    }
    @Override
    public String toString() {
        return ("TRUCK\n____________\n" + super.toString()+
                "REFRIGERATOR " + truckRefrigerator() + "\n");
    }
}
