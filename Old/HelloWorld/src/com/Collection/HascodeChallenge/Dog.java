package com.Collection.HascodeChallenge;


import java.util.Comparator;

public class Dog extends Animal  {

    @Override
    void yeal() {
        System.out.println("Latra");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog doggy = (Dog) o;

        return getName().equals(doggy.getName());
    }
}
