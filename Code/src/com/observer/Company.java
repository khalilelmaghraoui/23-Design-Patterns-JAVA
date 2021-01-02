package com.observer;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Company implements Observer {

    private String name;
    private String address;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void update(String message) {
        System.out.printf("Company %s Got new notification: %s%n", this.name, message);
    }
}
