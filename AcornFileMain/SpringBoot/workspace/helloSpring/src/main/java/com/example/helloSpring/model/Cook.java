package com.example.helloSpring.model;

public class Cook {
    protected String name;

    public Cook() {
        System.out.println("Cook default constructor");
    }

    public Cook(String name) {
        this.name = name;
        System.out.println("Cook constructor with name");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cook [name=" + name + " ]";
    }
}
