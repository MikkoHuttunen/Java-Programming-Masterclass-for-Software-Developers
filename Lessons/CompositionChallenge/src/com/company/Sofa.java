package com.company;

public class Sofa {

    private String material;
    private String color;
    private int size;

    public Sofa(String material, String color, int size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public void rotate(int angle) {
        System.out.println("Sofa is now positioned in " + angle + " degree angle");
    }

    //Getters
    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
