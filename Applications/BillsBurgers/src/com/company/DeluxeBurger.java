package com.company;

public class DeluxeBurger extends Hamburger {

    private double frenchFries;
    private double drink;

    public DeluxeBurger(String roll, boolean patty) {
        super("Deluxe Burger", roll, patty);
        super.setTotalPrice(5);
        frenchFries = 4.0;
        drink = 3.0;
    }

    //Getters
    @Override
    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        totalPrice += frenchFries;
        System.out.println("Added french fries for an extra " + frenchFries);
        totalPrice += drink;
        System.out.println("Added drink for an extra " + drink);
        return totalPrice;
    }
}
