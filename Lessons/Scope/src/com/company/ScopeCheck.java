package com.company;

public class ScopeCheck {

    public int publicVar = 0;
    private int var1 = 1; //Private variable to the ScopeCheck class

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + var1);
    }

    //Private variables are only accessible through getters
    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2; //Private variable to the timesTwo method
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 from outer class: " + innerClass.var3);
    }

    public class InnerClass {

        private int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created, var1 is " + var1 + " and var3 is " + var3);
        }

        public void timesTwo() {
            //Calls method inside ScopeCheck class
            System.out.println("Var1 is still available here " + var1);
            for (int i = 0; i < 10; i++) {
                //Uses private variable from ScopeCheck class
                System.out.println(i + " times two is " + i * ScopeCheck.this.var1);
            }
        }
    }
}
