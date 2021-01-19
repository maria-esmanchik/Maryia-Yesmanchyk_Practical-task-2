package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Car> cars = Arrays.asList(new PersonalCar("MERCEDES", "BLUE GREEN", CarBrand.MERCEDES, false, false),
                new PersonalCar("BMW", "BLACK", CarBrand.BMW, false, true),
                new PersonalCar("MAZDA", "GRAY", CarBrand.MAZDA, false, false),
                new PersonalCar("TESLA", "YELLOW", CarBrand.TESLA, false, true),
                new PersonalCar("TOYOTA", "WHITE", CarBrand.TOYOTA, false, false),
                new PersonalCar("KIA", "BURGUNDY", CarBrand.KIA, false, false),
                new Truck("MERCEDES", "RED", CarBrand.TMERCEDES, false, false),
                new Truck("MACK", "WHITE", CarBrand.MACK, false, false),
                new Truck("VOLVO", "BLUE", CarBrand.VOLVO, false, true));
        for (Car car : cars) {
            System.out.println(car);
            car.move();
            car.stop();
        }

        List<Ship> ships = Arrays.asList(new Warship("USS ALABAMA", 560, 42, 38, "OHIO"),
        new Warship("USS CALIFORNIA", 377, 34, 134, "IIRGINIA"),
                new TravelShip("MV DELPHIN", 513, 72, 19, 640),
                new TravelShip("NORWEGIAN JOY", 1094, 136, 29,3883),
                new Tankers("EURONAV NV", 1247, 232, 80, 1700),
                new Tankers("OOCL", 1510, 81, 98, 1300));
        for(Ship ship : ships) {
            System.out.println(ship);
            ship.move();
        }
    }
}
