package com.Collection.Game;

import java.util.HashMap;

/**
 * Created by simd0922 on 23/03/2017.
 */
public class Game {
    private HashMap<String, Integer> listExists  = new HashMap<>();;
    private HashMap<Integer, Location> locations  = new HashMap<>();;

    public HashMap<Integer, Location> getLocations() {
        return locations;
    }

    private void setListExists() {
        locations.get(1).addExit()
    }

    private void setLocations() {
        locations.put(1, new Location(1, "You are in front of a calculator"));
        locations.put(2, new Location(2, "You are in front of a road"));
        locations.put(3, new Location(3, "You are in top of a hill"));
        locations.put(4, new Location(4, "You are inside building"));
        locations.put(5, new Location(5, "You are in a valley"));
        locations.put(6, new Location(6, "You are in a forest"));
    }

    public Game() {
        setListExists();
        setLocations();
    }
}