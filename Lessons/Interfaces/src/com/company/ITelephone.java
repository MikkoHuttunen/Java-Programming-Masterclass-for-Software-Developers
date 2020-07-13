package com.company;

//Interfaces can store variables and methods that can be implemented by classes that has similar functions
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
