package com.cbfacademy.shapes;

public abstract class Shape {
    private String name;

    // constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method that returns the area of the shape
    abstract double getArea(); // returns the area of the shape

    // concrete returns the name of the shape
    String getName() {
        return name;
    }
};
