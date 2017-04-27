package com.Collection.advanced;

/**
 * Created by simd0922 on 21/03/2017.
 */
public class Seat {
    private final String Name;
    private boolean reserved  = false;
    public Seat(String name) {
        Name = name;
    }

    public boolean reserve(){
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("Seat reserved");
            return true;
        }
        else
        {
            System.out.println("Seat not reserved");
            return false;
        }

    }
}
