package com.company;

public class Car extends Vehicle {

    private int gears;

    public Car(String name, String model, int speed, int steering, int gears) {
        super(name, model, speed, steering);
        this.gears = gears;
    }

    //Getters
    public int getGears() {
        return gears;
    }

    //Setters
    public void setGears(int gears) {
        this.gears = gears;
    }
}
