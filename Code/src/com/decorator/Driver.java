package com.decorator;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Driver {

    public static void main(String[] args) {
        Sandwich basicSandwich = new HotSauce(new Egg(new Salt(new BasicSandwich())));

        System.out.printf("Description: %s%n", basicSandwich.getDescription());
        System.out.printf("Cost: %.2f", basicSandwich.getCost());

        





        //
        /**
         * Car Options System
         * Car: Interface
         * BasicCar: Concrete Implementaion
         * CarDecorator: Abstract Decorator
         * Options: Navigation system, DVD Player ... etc (Decoroate as you wish :D)
         */
    }
}
