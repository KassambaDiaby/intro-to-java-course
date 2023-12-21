package com.cbfacademy.cars;

public class Car {
    // car members or fields/attributes
    private String make;
    private String model;
    private String colour;
    private int year;

    // Constructor
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // methods
    public String getMake() {
        return make;
    }// the getter method returns the car make

    public String getModel() {
        return model;
    }// returns the car model

    public int getYear() {
        return year;
    } // returns the year the car was made

    public String getColour() {
        return colour;
    }// returns the colour of the car

    public void setColour(String colour) {
        this.colour = colour;
    }// sets the colour of the car

    public String getDetails() {
        return "This car is a" + make + " " + model + " " + colour + " " + year;
    } // returns the car details, including the make, model, colour and year

}
