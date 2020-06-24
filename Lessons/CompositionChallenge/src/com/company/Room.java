package com.company;

public class Room {

    private int doors;
    private int windows;
    private String paintColor;
    private String floorMaterial;
    private Sofa sofa;
    private Television television;

    public Room(int doors, int windows, String paintColor, String floorMaterial, Sofa sofa, Television television) {
        this.doors = doors;
        this.windows = windows;
        this.paintColor = paintColor;
        this.floorMaterial = floorMaterial;
        this.sofa = sofa;
        this.television = television;
    }

    public void renovate() {
        changePaintColor("Orange");
        changeFloorMaterial("Parquet");
    }

    //Private methods
    private void changePaintColor(String color) {
        paintColor = color;
        System.out.println("Wall color changed to " + paintColor);
    }

    private void changeFloorMaterial(String material) {
        floorMaterial = material;
        System.out.println("Floor material changed to " + floorMaterial);
    }

    //Getters
    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Television getTelevision() {
        return television;
    }
}
