package com.memento;

import java.io.DataInputStream;

public class Memento {
    String name = "";
    long Date;
    String State;

    String getName(){
        return this.name;
    }
    long getDate(){
        return Date;
    }

     String getState() {
        return State;
    }
}
