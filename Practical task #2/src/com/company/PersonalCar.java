package com.company;

public class PersonalCar extends Car {

    boolean fuel;

    public PersonalCar(String name, String color, CarBrand carBrand, boolean isRunning, boolean fuel) {
        super(name, color, carBrand, isRunning);
        this.fuel = fuel;
    }

    @Override
    public void move() {
        System.out.println(name + " STARTED!");
    }

    @Override
    public void stop() {
        System.out.println(name + " STOP\n___________________________________________");
    }

    public boolean refuelingMethod() {
        return fuel;
    }

    @Override
    public String toString() {
        return ("PERSONAL CAR\n____________\n" + super.toString()+
                "ELECTRIC CAR: " + refuelingMethod() + "\n");
    }
}
