package com.cbfacademy.shapes;

import java.util.List;

import com.cbfacademy.accounts.Bank;
import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // instanciate a showroom object, need a new object of the showroom class
        Showroom showRoomObject = new Showroom();

        // call getcars(), a method available to showroom object as it was specified in
        // the showroom class
        // store the result of getCars() in a variable carList of a List return type
        // Inside the getCars method, there is code that creates and returns a list of
        // Car objects
        List<Car> carList = showRoomObject.getCars();

        // for each car (instance) in the carlist, get the car details and print it
        for (Car car : carList) {
            System.out.println(car.getDetails());
        }

        // Create a bank instance and then execute your bank's
        // operations
        Bank newBank = new Bank();
        // open a savings acount
        newBank.openSavingsAccount(456195, 300, 5);

        newBank.addAccount(3462, 260);

        System.out.println("my bank contains" + newBank);

    }
}
