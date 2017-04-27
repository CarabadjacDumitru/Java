package com.Classes;


class Movie{
    private String _name;

    public Movie(String name){
        this._name= name;
    }

}

class Jaws extends  Movie{
    public Jaws(){
        super("Jaws");

    }

    public  String Plot(){
        return  "A shark eats a lot of people";
    }
}

class IndependenceDay extends  Movie{
    public IndependenceDay() {
        super("Independence Day");
    }
}

public class Main {
    public static void main(String[] args){

    }
}
