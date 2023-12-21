package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // instanciate a showroom object
        Showroom showRoomObject = new Showroom();

        List<Car> carList = showRoomObject.getCars();

        for (Car car : carList) {
            System.out.println(car.getDetails());
        }

        // In the main method of the App class, instantiate a Showroom object, call
        // getCars() and print the details for each Car instance in the list.
    }
}
