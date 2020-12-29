package com.Builder;

public class Main {
    public static void main(String[] args) {
       ComputerCreator computerCreator = new ComputerCreator(new ComputerABuilder());
       computerCreator.creatComputer();
        System.out.println(computerCreator.getComputer().Keyboard);
        System.out.println(computerCreator.getComputer().Monitor);
        System.out.println(computerCreator.getComputer().Mouse);
        System.out.println(computerCreator.getComputer().Tower);
        System.out.println(computerCreator.getComputer().Printer);
    }
    
}
