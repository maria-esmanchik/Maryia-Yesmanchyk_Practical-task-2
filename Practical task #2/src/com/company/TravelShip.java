package com.company;

public class TravelShip extends Ship{

    protected int capaity;

    public TravelShip(String name, int lenghtShip, int wideShip, int waterLineShip, int capaity) {
        super(name, lenghtShip, wideShip, waterLineShip);
        this.capaity = capaity;
    }

    @Override
    public void move() {
        System.out.println(name + " STARTED THE TRAVEL SHIP!\n");
    }

    @Override
    public String toString() {
        return ("TRAVEL SHIP\n____________\n" + super.toString()+
                "NUMBER OF PEOPLE: " + capaity + "\n");
    }
}
