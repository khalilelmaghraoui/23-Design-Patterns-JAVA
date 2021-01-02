package com.memento;

public class Originator {
    String State;
    Originator(String state){
        State=state;
        System.out.println("state : " + State);
    }
    void PerformAction(int num ){
        System.out.println("Originator : Performing an action ");
        State = Integer.toString(num);
        System.out.println("Originator State has changed  to " + State);
    }
    Memento save(){
        return  new ConcreteMemento(State);

    }
    void restore(Memento memento){
        State=memento.getState();
        System.out.println("Originator : state has changed to  : " + State);
    }
}
