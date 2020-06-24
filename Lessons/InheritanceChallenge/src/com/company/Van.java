package com.company;

public class Van extends Car {

    private int space;

    public Van(String name, String model, int speed, int steering, int gears, int space) {
        super(name, model, speed, steering, gears);
        this.space = space;
    }

    //Getters
    public int getSpace() {
        return space;
    }

    //Setters
    public void setSpace(int space) {
        this.space = space;
    }
}
