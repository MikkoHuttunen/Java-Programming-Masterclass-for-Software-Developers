package com.company;

public class Vehicle {

    private String name;
    private String model;
    private int speed;
    private int steering;

    public Vehicle(String name, String model, int speed, int steering) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.steering = steering;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSteering() {
        return steering;
    }

    //Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }
}
