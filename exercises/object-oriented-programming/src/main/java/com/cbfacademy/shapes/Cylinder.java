package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    // constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Implementation of abstract super method for the cylinder class
    @Override
    double getArea() {
        return height * Math.PI * Math.pow(radius, 2);
    }

}
