package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Product implements Subject {

    /**
     * Product Name
     */
    private String name;

    /**
     * Product avaiablity. Observers are interested in this
     */
    private String availablity;

    /**
     * A list to hold all the observers
     */
    private List<Observer> observerList;

    public Product(String name) {
        this.name = name;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: observerList) {
            observer.update(availablity);
        }
    }

    /**
     * Set the product avaiablity based on boolean value and notify all observers
     * @param available
     */
    public void setAvailablity(boolean available) {
        availablity = this.name + (available ? " Avaiable": " Not avaiable");
        notifyAllObservers();
    }
}
