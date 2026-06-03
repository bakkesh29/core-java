package main;

import vehicle.Car;
import vehicle.Driver;
import transport.Bike;
import transport.Mechanic;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.showCar();

        Driver d = new Driver();
        d.drive();

        Bike b = new Bike();
        b.showBike();

        Mechanic m = new Mechanic();
        m.repair();
    }
}