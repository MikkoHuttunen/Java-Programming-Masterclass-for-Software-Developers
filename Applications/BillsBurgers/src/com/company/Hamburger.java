package com.company;

public class Hamburger {

    private String name;
    private String roll;
    private boolean patty;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private double additionPrice = 0.5;
    private double totalPrice;

    //Constructor overloading
    public Hamburger(String name, String roll, boolean patty, String addition1, String addition2, String addition3, String addition4) {
        this.name = name;
        this.roll = roll;
        this.patty = patty;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.totalPrice = 1.0;
    }

    public Hamburger(String name, String roll, boolean patty, String addition1, String addition2, String addition3) {
        this(name, roll, patty, addition1, addition2, addition3, "");
    }

    public Hamburger(String name, String roll, boolean patty, String addition1, String addition2) {
        this(name, roll, patty, addition1, addition2, "");
    }

    public Hamburger(String name, String roll, boolean patty, String addition1) {
        this(name, roll, patty, addition1, "");
    }

    public Hamburger(String name, String roll, boolean patty) {
        this(name, roll, patty, "");
    }

    //Getters
    public String isPatty() {
        if (patty) {
            return "patty";
        }
        return "no patty";
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    //Print all the additions and return the total price value
    public double getTotalPrice() {
        double hamburgerPrice = totalPrice;
        System.out.println(name + " with " + roll + " roll and " + isPatty() + " = " + hamburgerPrice);
        if (!addition1.isEmpty()) {
            hamburgerPrice += additionPrice;
            System.out.println("Added " + addition1 + " for an extra " + additionPrice);
        }

        if (!addition2.equals("")) {
            hamburgerPrice += additionPrice;
            System.out.println("Added " + addition2 + " for an extra " + additionPrice);
        }

        if (!addition3.equals("")) {
            hamburgerPrice += additionPrice;
            System.out.println("Added " + addition3 + " for an extra " + additionPrice);
        }

        if (!addition4.equals("")) {
            hamburgerPrice += additionPrice;
            System.out.println("Added " + addition4 + " for an extra " + additionPrice);
        }

        return hamburgerPrice;
    }

    //Setters
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    //List additions and their price but also the total price of the burger
    public void order() {
        System.out.println("Total price == " + getTotalPrice());
    }
}
