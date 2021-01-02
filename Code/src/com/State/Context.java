package com.State;

public class Context {
    public Istate  State;

    public Context(Istate state) {
        State = state;
    }
    public void request(){
        State.Handle(this);

    }
}
