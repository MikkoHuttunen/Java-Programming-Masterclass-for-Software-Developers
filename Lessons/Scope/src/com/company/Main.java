package com.company;

public class Main {

    public static void main(String[] args) {
        String var4 = "This is private to Main()"; //Private variable to the Main class

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();
        System.out.println("********************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
