package com.memento;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> mementos;
    Originator Originator;
    CareTaker(Originator originator){
        mementos = new ArrayList<Memento>();
        Originator=originator;

    }
    void backUp(){
        System.out.println("CareTaker : Saving the Originator's State");
        mementos.add(Originator.save());

    }
    void undo(){
        if(mementos.size()<1 || mementos==null)
        {
            return;
        }
        Memento memento  = mementos.remove(mementos.size()-1);
        System.out.println("restoring : " + memento.getName());
        try {
            Originator.restore(memento);
        }catch (Exception e ){
            this.undo();
        }

    }
    void ShowHistory(){
        System.out.println("History");
        for (Memento e : mementos
             ) {
            System.out.println(e.getName());

        }
    }

}
