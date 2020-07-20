package com.company;

//Abstract class that inherits Animal class and also implements interface
public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    //Abstract methods implemented from Animal Class
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    //fly method from interface
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
