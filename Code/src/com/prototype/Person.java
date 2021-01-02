package com.prototype;

public class Person implements Cloneable{
    public String FirstName;
    public String LastName;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }
}
