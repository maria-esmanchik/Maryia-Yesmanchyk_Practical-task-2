package com.company;

import java.util.Objects;

public class Ship implements Movable {

    protected String name;
    protected StringBuilder stringBuilder;
    protected int lenghtShip;
    protected int wideShip;
    protected int waterLineShip;

    public Ship(String name, int lenghtShip, int wideShip, int waterLineShip) {
        this.name = name;
        this.lenghtShip = lenghtShip;
        this.wideShip = wideShip;
        this.waterLineShip = waterLineShip;
    }

    @Override
    public void move() {}

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getLenghtShip() {
//        return lenghtShip;
//    }
//
//    public void setLenghtShip(int lenghtShip) {
//        this.lenghtShip = lenghtShip;
//    }
//
//    public int getWideShip() {
//        return wideShip;
//    }
//
//    public void setWideShip(int wideShip) {
//        this.wideShip = wideShip;
//    }
//
//    public int getWaterLineShip() {
//        return waterLineShip;
//    }
//
//    public void setWaterLineShip(int waterLineShip) {
//        this.waterLineShip = waterLineShip;
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Ship ship = (Ship) object;
        return name == ship.name && lenghtShip == ship.lenghtShip && wideShip == ship.wideShip && waterLineShip == ship.waterLineShip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenghtShip, wideShip, waterLineShip);
    }

    @Override
    public String toString() {
        stringBuilder = new StringBuilder();
        stringBuilder.append("NAME: ").append(this.name).append("\n");
        stringBuilder.append("LENGHT: ").append(this.lenghtShip).append("\n");
        stringBuilder.append("WIDE: ").append(this.wideShip).append("\n");
        stringBuilder.append("WATERLINE: ").append(this.waterLineShip).append("\n");
        return stringBuilder.toString();
    }
}
