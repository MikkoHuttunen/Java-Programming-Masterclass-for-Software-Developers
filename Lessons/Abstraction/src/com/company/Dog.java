package com.company;

//Inherits abstract class Animal
public class Dog extends Animal {

    public Dog (String name) {
        super(name);
    }

    //Abstract methods implemented from Animal class
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
