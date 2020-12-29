package com.decorator;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class HotSauce extends SandwichDecorator {

    public HotSauce(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Shatta";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }
}
