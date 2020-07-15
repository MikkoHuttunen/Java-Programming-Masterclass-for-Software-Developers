package com.company;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    //Overriding toString() method to show track name instead of data location
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
