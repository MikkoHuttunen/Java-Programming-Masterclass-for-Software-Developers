package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic Burger", "sesame seed", true, "lettuce", "cheese", "tomato", "mayo");
        hamburger.order();
        System.out.println("********************");

        Hamburger hamburger2 = new Hamburger("Basic Burger", "sesame seed", false);
        hamburger2.order();
        System.out.println("********************");

        HealthyBurger healthyBurger = new HealthyBurger(true);
        healthyBurger.order();
        System.out.println("********************");

        HealthyBurger healthyBurger2 = new HealthyBurger(true, "lettuce", "tomato", "egg", "chicken", "dressing");
        healthyBurger2.order();
        System.out.println("********************");

        DeluxeBurger deluxeBurger = new DeluxeBurger("sesame seed", true);
        deluxeBurger.order();
        System.out.println("********************");

        Hamburger hamburger3 = new Hamburger("Basic Burger", "sesame seed", true, "cheese", "lettuce");
        hamburger3.order();
    }
}
