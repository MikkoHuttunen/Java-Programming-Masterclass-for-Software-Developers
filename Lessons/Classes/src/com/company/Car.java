package com.company;

public class Car {

    //Private variables cannot be accessed outside class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Setter in Java
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        //.equals tests if the string is equal to another value
        if (validModel.equals("carrera") || validModel.equals(("commodore"))) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //Getter in Java
    public String getModel() {
        return this.model;
    }
}
