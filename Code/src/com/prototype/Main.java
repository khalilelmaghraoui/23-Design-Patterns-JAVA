package com.prototype;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.FirstName= "khalil ";
        person.LastName= "el maghroaui ";

        try {
            Person person1 = person.clone();
            System.out.println(person1.FirstName + "  " + person1.LastName);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
