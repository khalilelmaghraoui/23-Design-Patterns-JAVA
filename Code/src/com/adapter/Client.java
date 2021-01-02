package com.adapter;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */

//Client
public class Client {

    public static void main(String[] args) {
        Vehicle car = new Car();

        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        playWithVehicle(car);

        playWithVehicle(bicycle);
    }

    private static void playWithVehicle(Vehicle vehicle) {

        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
        System.out.println("\n");
    }
}
