package com.decorator;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public interface Sandwich {

    /**
     * Get Sandwich Cost
     * @return double value represeting the cost
     */
    double getCost();

    /**
     * Get Sandwich ingeridents
     * @return String value
     */
    String getDescription();
}
