package com.company;

//Abstract class
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //Abstract methods that can be implemented
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
