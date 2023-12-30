package com.cbfacademy.shapes;

public class Paint {
    private double coverage;

    // constructor, whereby coverage is the number of square feet that 1 gallon of
    // paint can
    // cover
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // get amount method to calculate the amount of paint needed to paint a given
    // shape
    public double getAmount(Shape shape) {
        // Use the getArea() method of the Shape class to get the area of the shape
        double area = shape.getArea();
        // Calculate the amount of paint needed (measured in gallons), area of shape /
        // the number of sqaure that 1 galloon of paint can cover
        return area / coverage;
    }

}
