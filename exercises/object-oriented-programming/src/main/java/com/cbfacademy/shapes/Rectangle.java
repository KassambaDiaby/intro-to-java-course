package com.cbfacademy.shapes;

public class Rectangle extends Shape {

    private double width;
    private double length;

    // constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.width = width;

    }

    // Implementation of abract method for rectangle
    @Override
    double getArea() {
        return length * width;
    }

}
