package com.company;

import java.util.Objects;

public class Car implements Movable {

    protected String name;
    protected String color;
    protected StringBuilder stringBuilder;
    protected CarBrand carBrand;
    protected boolean isRunning;

    public Car(String name, String color, CarBrand carBrand, boolean isRunning) {
        this.name = name;
        this.color = color;
        this.carBrand = carBrand;
        this.isRunning = isRunning;
    }


    @Override
    public void move() {}

    public void stop() {}

    @Override
    public boolean equals(Object obj) {
        if( obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return (name == car.name || name != null && name.equals(car.getName())) &&
                (color == car.color || color != null && color.equals(car.getColor())) &&
                (carBrand == car.carBrand || carBrand != null && carBrand.equals(car.getCarBrand())) &&
                (isRunning == car.isRunning && car.isRunning());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                color,
                carBrand,
                isRunning);
    }

    @Override
    public String toString() {
        stringBuilder = new StringBuilder();
        stringBuilder.append("NAME: ").append(this.name).append("\n");
        stringBuilder.append("COLOR: ").append(this.color).append("\n");
        stringBuilder.append("BRAND INFO: ").append(this.carBrand.getInfoBrand()).append("\n");
        stringBuilder.append("RUNNING: ").append(this.isRunning).append("\n");
        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
