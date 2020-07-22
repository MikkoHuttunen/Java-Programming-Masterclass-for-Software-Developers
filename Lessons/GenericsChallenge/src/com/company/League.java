package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println("Team is already in league");
            return false;
        }

        league.add(team);
        System.out.println("Team added to league");
        return true;
    }

    public void showLeague() {
        Collections.sort(league);
        for(T t: league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
