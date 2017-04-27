package com.Collection.HascodeChallenge;

public abstract class Animal {
    private String name;
    abstract void  yeal();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        return getName().equals(animal.getName());
    }

}
