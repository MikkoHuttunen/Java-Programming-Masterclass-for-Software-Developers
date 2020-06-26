package com.company;

class Car {
    private String name;
    private Boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println(getName() + " engine started");
    }

    public void accelerate(int speed) {
        System.out.println(getName() + " is moving at speed of " + speed);
    }

    public void brake() {
        System.out.println(getName() + " stopped moving");
    }
}

class Audi extends Car {
    public Audi() {
        super("Audi", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi's engine started");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Audi is moving at speed of " + speed + "km/h");
    }

    @Override
    public void brake() {
        System.out.println("Audi stopped moving");
    }
}

class Toyota extends Car {
    public Toyota() {
        super("Toyota", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota's engine started");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Toyota is moving at speed of " + speed + "km/h");
    }

    @Override
    public void brake() {
        System.out.println("Toyota stopped moving");
    }
}

class Nissan extends Car {
    public Nissan() {
        super("Nissan", 10);
    }

    @Override
    public void startEngine() {
        System.out.println("Nissan's engine started");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Nissan is moving at speed of " + speed + "km/h");
    }

    //No override for brake() method so super.brake() is called
}

public class Main {

    public static void main(String[] args) {

        Audi audi = new Audi();
        audi.startEngine();
        audi.accelerate(100);
        audi.brake();

        Toyota toyota = new Toyota();
        toyota.startEngine();
        toyota.accelerate(80);
        toyota.brake();

        Nissan nissan = new Nissan();
        nissan.startEngine();
        nissan.accelerate(120);
        nissan.brake();
    }
}
