package com.company;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible { //Visible for everything in the same namespace
    int SOME_CONSTANT = 100;
    public void methodA(); //Visible for everything because of public
    void methodB(); //Public
    boolean methodC(); //Also public
}
