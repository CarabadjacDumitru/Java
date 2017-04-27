package com.Collection.HascodeChallenge;

/**
 * Created by simd0922 on 27/03/2017.
 */
public class Labrador extends  Dog {

    @Override
    void yeal() {
        super.yeal();
    }

    public Labrador(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Labrador)) return false;

        Labrador laaby = (Labrador) o;

        return getName().equals(laaby.getName());
    }
}
