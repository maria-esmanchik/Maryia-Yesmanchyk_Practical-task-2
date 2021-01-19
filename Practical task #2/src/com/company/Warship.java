package com.company;

public class Warship extends Ship{

    protected String classShip;

    public Warship(String name, int lenghtShip, int wideShip, int waterLineShip, String classShip) {
        super(name, lenghtShip, wideShip, waterLineShip );
        this.classShip = classShip;
    }

    @Override
    public void move() {
        System.out.println(name + " STARTED THE WARSHIP!\n");
    }

    @Override
    public String toString() {
        return ("WARSHIP\n____________\n" + super.toString()+
                "NUMBER OF BATLE: " + classShip + "\n");
    }
}
