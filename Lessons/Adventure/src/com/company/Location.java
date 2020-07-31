package com.company;

import java.util.HashMap;
import java.util.Map;

//Immutable class
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>();
        }

        this.exits.put("Q", 0); //Add quit option
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //Return copy of Map so the original won't be affected
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
