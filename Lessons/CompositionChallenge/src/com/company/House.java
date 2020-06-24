package com.company;

public class House {

    private Room room;
    private Sofa sofa;
    private Television television;

    public House(Room room, Sofa sofa, Television television) {
        this.room = room;
        this.sofa = sofa;
        this.television = television;
    }

    public void turnOnTV() {
        room.getTelevision().turnOn();
    }

    public void turnOffTV() {
        room.getTelevision().turnOff();
    }

    public void rotateSofa() {
        room.getSofa().rotate(90);
    }

    //Getters
    public Room getRoom() {
        return room;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Television getTelevision() {
        return television;
    }
}
