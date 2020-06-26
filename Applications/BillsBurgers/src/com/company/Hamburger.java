package com.company;

public class Hamburger {

    private String name;
    private String roll;
    private boolean meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean mayo;
    private double price;

    public Hamburger(String roll, boolean meat, boolean lettuce, boolean tomato, boolean cheese, boolean bacon, boolean mayo, double price) {
        this.name = "Basic Burger";
        this.roll = roll;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.mayo = mayo;
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isMayo() {
        return mayo;
    }

    public double getPrice() {
        return price;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
