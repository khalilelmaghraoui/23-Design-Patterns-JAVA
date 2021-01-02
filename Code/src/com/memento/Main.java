package com.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator("initial State");
        CareTaker  careTaker = new CareTaker(originator);
        careTaker.backUp();
        originator.PerformAction(1);
        careTaker.backUp();
        originator.PerformAction(2);
        careTaker.backUp();
        originator.PerformAction(3);

        careTaker.ShowHistory();
        System.out.println("using undo ! ");
        careTaker.undo();
        careTaker.ShowHistory();


    }
}
