package com.company;

public class BankAccount {

    private String name;
    private String phoneNumber;
    private String email;
    private String accountNumber;
    private double balance;

    //Getter
    public String getName() {
        return this.name;
    }

    //Getter
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //Getter
    public String getEmail() {
        return this.email;
    }

    //Getter
    public String getAccountNumber() {
        return this.accountNumber;
    }

    //Getter
    public double getBalance() {
        return this.balance;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Setter
    public void setEmail(String email) {
        this.email = email;
    }

    //Setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Can't deposit 0 or less");
        } else {
            this.balance += amount;
            System.out.println("Deposit successful. Current balance is " + this.balance);
        }
    }

    public void withdraw(double amount) {
        if (this.balance < amount || this.balance == 0) {
            System.out.println("Insufficient funds. Current balance is " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdraw successful. Remaining balance is " + this.balance);
        }
    }
}
