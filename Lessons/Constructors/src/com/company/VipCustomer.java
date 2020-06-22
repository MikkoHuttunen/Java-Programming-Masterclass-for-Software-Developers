package com.company;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    //Constructor with 2 parameters and 1 default value
    public VipCustomer(String name, String email) {
        this(name, email, 9999.0);
    }

    public VipCustomer() {
        this("Default name", "Default email", 9999.0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
