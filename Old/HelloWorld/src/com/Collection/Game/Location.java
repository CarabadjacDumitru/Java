package com.Collection.Game;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, exit> exits ;

    public Location( int locationID,String description) {
        this.description = description;
        this.locationID = locationID;
        exits = new HashMap<>();
    }

    public void addExit(String dir,exit loc){
        exits.put(dir,loc);
    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, exit> getExits() {
        return new HashMap<>(exits);
    }
}
