package com.company;

public class Television {

    private double size;
    private int refreshRate;

    public Television(double size, int refreshRate) {
        this.size = size;
        this.refreshRate = refreshRate;
    }

    public void turnOn() {
        System.out.println("TV is now turned on");
    }

    public void turnOff() {
        System.out.println("TV is now turned off");
    }

    //Getters
    public double getSize() {
        return size;
    }

    public int getRefreshRate() {
        return refreshRate;
    }
}
