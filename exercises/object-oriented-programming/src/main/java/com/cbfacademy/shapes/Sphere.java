package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;

    // construcor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // implementation of getarea abstract method
    @Override
    double getArea() {
        // overriden formulae for a sphere (given in readme, converted into java format)
        return 4 * Math.PI * Math.pow(radius, 2);

    }

}
