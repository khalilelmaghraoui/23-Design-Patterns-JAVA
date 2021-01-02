package com.memento;

public class ConcreteMemento extends Memento {
    public ConcreteMemento(String state) {
        super();
        this.State=state;
        this.Date=System.currentTimeMillis();
    }

    @Override
    String getName() {
        return Date +" / " + State;
    }

    @Override
    long getDate() {
        return super.getDate();
    }

    @Override
    String getState() {
        return super.getState();
    }
}
