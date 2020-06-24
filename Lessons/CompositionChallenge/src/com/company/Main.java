package com.company;

public class Main {

    public static void main(String[] args) {

        //Instantiate objects
        Sofa sofa = new Sofa("Leather", "Brown", 3);
        Television television = new Television(48.0, 240);
        Room room = new Room(10, 14, "Light blue", "Linoleum", sofa, television);
        House house = new House(room, sofa, television);

        //Calling object methods
        house.turnOnTV();
        house.rotateSofa();
        house.getRoom().renovate(); //Calling a method inside an object that is inside an object
        house.turnOffTV();
    }
}
