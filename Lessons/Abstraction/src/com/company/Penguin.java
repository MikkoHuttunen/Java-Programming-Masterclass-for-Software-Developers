package com.company;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    //fly method implemented from Bird class
    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguins can't fly");
    }
}
