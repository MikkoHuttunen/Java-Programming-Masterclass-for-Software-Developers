package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car(); //Initialized new object name porsche from class Car
        Car holden = new Car();
        porsche.setModel("Carrera"); //Set the porche's model
        System.out.println("Model is " + porsche.getModel()); //Get the porsche's model
    }
}
