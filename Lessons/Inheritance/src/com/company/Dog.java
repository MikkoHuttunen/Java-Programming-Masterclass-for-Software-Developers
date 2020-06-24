package com.company;

//Dog class inherits the Animal class
public class Dog extends Animal {

    //Unique instance variables to this class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //Call the constructor of the class we are inheriting from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //Overriding a method from the super class(Animal)
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //Call a method from super class(Animal)
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); //Only execute the move method in the super class(Animal)
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10); //Look for move method in this class before the super class(Animal)
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
