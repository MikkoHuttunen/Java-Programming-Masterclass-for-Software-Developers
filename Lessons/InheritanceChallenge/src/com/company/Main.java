package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car ("Audi", "A10", 7, 4, 5);
        System.out.println("Name: " + audi.getName());
        System.out.println("Model: " + audi.getModel());
        System.out.println("Speed: " + audi.getSpeed());
        System.out.println("Steering: " + audi.getSteering());
        System.out.println("Gears: " + audi.getGears());
        System.out.println("********************");
        
        Van toyota = new Van("Toyota", "Hiace", 5, 4, 4, 10);
        System.out.println("Name: " + toyota.getName());
        System.out.println("Model: " + toyota.getModel());
        System.out.println("Speed: " + toyota.getSpeed());
        System.out.println("Steering: " + toyota.getSteering());
        System.out.println("Gears: " + toyota.getGears());
        System.out.println("Space: " + toyota.getSpace());
        System.out.println("********************");

        audi.setSteering(5);
        audi.setGears(6);
        audi.setSpeed(8);
        System.out.println("Steering: " + audi.getSteering());
        System.out.println("Gears: " + audi.getGears());
        System.out.println("Speed: " + audi.getSpeed());
        System.out.println("********************");

        toyota.setSteering(5);
        toyota.setGears(6);
        toyota.setSpeed(8);
        System.out.println("Steering: " + toyota.getSteering());
        System.out.println("Gears: " + toyota.getGears());
        System.out.println("Speed: " + toyota.getSpeed());
    }
}
