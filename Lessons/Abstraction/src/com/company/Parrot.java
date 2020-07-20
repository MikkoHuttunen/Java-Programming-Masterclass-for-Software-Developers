package com.company;

//Inherits Bird Class
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    //Abstract method from Bird class
    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
