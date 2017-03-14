package com.Classes;

public class Animal {
    private int _brain;
    private int _size;
    private int _body;
    private int _weight;
    private String _name;

    public int get_brain() {
        return _brain;
    }

    public int get_size() {
        return _size;
    }

    public int get_body() {
        return _body;
    }

    public int get_weight() {
        return _weight;
    }

    public String get_name() {
        return _name;
    }

    public void set_brain(int _brain) {
        this._brain = _brain;
    }

    public void set_size(int _size) {
        this._size = _size;
    }

    public void set_body(int _body) {
        this._body = _body;
    }

    public void set_weight(int _weight) {
        this._weight = _weight;
    }

    public void set_name(String _name) {
        this._name = _name;
    }


    public Animal(int brain, int size, int body, int weight, String name) {
        this._brain = brain;
        this._size = size;
        this._body = body;
        this._weight = weight;
        this._name = name;
    }

    public void eat() {
        System.out.println(get_name() + " is eating");
    }

    public void move() {
        System.out.println(get_name() + " started moving");
    }
}

