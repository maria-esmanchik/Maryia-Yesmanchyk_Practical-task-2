package com.company;

public class Tankers extends Ship{

    protected int numberOfWorkers;
    public Tankers(String name,int lengthShip, int wideShip, int waterLineShip, int numberOfWorkers) {
        super(name, lengthShip, wideShip, waterLineShip);
        this.numberOfWorkers = numberOfWorkers;
    }

    @Override
    public void move() {
        System.out.println(name + " STARTED THE TANKER!\n");
    }

    @Override
    public String toString() {
        return ("TANKER\n____________\n" + super.toString()+
                "NUMBER OF WORKERS: " + numberOfWorkers + "\n");
    }
}
