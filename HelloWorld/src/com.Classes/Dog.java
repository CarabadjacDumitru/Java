package com.Classes;


public class Dog extends Animal {
    private int _eyes;
    private int _legs;
    private int _tail;
    private String _coat;

    public Dog(int brain, int size, int body, int weight, String name,int eyes, int legs, int tail, String coat) {
        super(brain, size, body, weight, name);
        this._eyes = eyes;
        this._legs = legs;
        this._tail = tail;
        this._coat=coat;
    }

    @Override
    public void eat() {

        System.out.println("The Dog named " + get_name() + " is eating");
        //super.eat();
    }

    @Override
    public void move() {
       // super.move();
        System.out.println("The Dog named " + get_name() + " is moving");

    }
}
