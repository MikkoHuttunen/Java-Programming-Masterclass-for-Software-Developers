package com.company;

public class HealthyBurger extends Hamburger {

    private String addition5;
    private String addition6;

    //Constructor overloading
    public HealthyBurger(boolean patty, String addition1, String addition2, String addition3, String addition4, String addition5, String addition6) {
        super("Healthy Burger", "brown rye bread", patty, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public HealthyBurger(boolean patty, String addition1, String addition2, String addition3, String addition4, String addition5) {
        super("Healthy Burger", "brown rye bread", patty, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
    }

    public HealthyBurger(boolean patty, String addition1, String addition2, String addition3, String addition4) {
        super("Healthy Burger", "brown rye bread", patty, addition1, addition2, addition3, addition4);
    }

    public HealthyBurger(boolean patty, String addition1, String addition2, String addition3) {
        super("Healthy Burger", "brown rye bread", patty, addition1, addition2, addition3);
    }

    public HealthyBurger(boolean patty, String addition1, String addition2) {
        super("Healthy Burger", "brown rye bread", patty, addition1, addition2);
    }

    public HealthyBurger(boolean patty, String addition1) {
        super("Healthy Burger", "brown rye bread", patty, addition1);
    }

    public HealthyBurger(boolean patty) {
        super("Healthy Burger", "brown rye bread", patty);
    }

    //Getters
    @Override
    public double getTotalPrice() {
        double hamburgerPrice = super.getTotalPrice();
        if (addition5 != null) {
            hamburgerPrice += super.getAdditionPrice();
            System.out.println("Added " + addition5 + " for an extra " + super.getAdditionPrice());
        }

        if (addition6 != null) {
            hamburgerPrice += super.getAdditionPrice();
            System.out.println("Added " + addition6 + " for an extra " + super.getAdditionPrice());
        }

        return hamburgerPrice;
    }
}
