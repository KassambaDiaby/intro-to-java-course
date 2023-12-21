package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    // getCar method that has a list return type, so it returns a list of Car
    // objects
    public List<Car> getCars() {
        // you need to return a list containing 3 car objects, therefore you need a
        // collection or an array
        List<Car> myCarList = new ArrayList<>();

        // my 3 car objects
        Car car1 = new Car("Volvo", "V40", "blue", 2012);
        Car car2 = new Car("Porsche", "Panamera", "red", 2009);
        Car car3 = new Car("Audi", "A3", "GREY", 2018);

        // add my 3 cars to my list
        myCarList.add(car1);
        myCarList.add(car2);
        myCarList.add(car3);

        return myCarList;

    };

}
