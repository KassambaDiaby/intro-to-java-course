package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // ODO - Implement this method such that
        // it creates a list where for each element of the input list ${numbers}
        // - if the ${element} is divisible by 3, it adds “Fizz” to the list
        // - if the ${element} is divisible by 5, it adds “Buzz” to the list
        // - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the
        // list
        // - it adds the element to the list in any other case
        // - it returns the constructed list
        // throw new RuntimeException("Not implemented");
        List<String> returnString = new ArrayList<>();
        for (int number : numbers) {
            if (number % 3 == 0) {
                returnString.add("Fizz");
            } else if (number % 5 == 0) {
                returnString.add("Buzz");
            } else if (number % 3 == 0 && number % 5 == 0) {
                returnString.add("FizzBuzz");
            } else
                returnString.add(String.valueOf(number));

        }
        return returnString;
    }

    public String whichMonth(Integer number) {
        // ODO - Implement this method such that
        // - it returns the month corresponding to the input ${number}
        //
        // - if the ${number} is invalid, the method should return "Invalid month
        // number"
        // throw new RuntimeException("Not implemented");

        switch (number) {
            case 1:
                return "January";

            case 2:
                return " February";
            case 3:
                return "March";
            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";
            default:
                return "Invalid month number";
        }

    }

    public void sumOfOddsAndSumOfEvens() {

        // ODO - Implement this method such that
        // - creates and initialises a list of 100 numbers - from 1 to 100
        // - determines the sum of all the even numbers in the list
        // - determines the sum of all the odd numbers in the list
        // turns a map with two entries:
        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // throw new RuntimeException("Not implemented");

        // Create a list of numbers from 1 to 100, create an array, add numbers to your
        // array
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
            // Separate even and odd numbers and calculate sums, to check for a condition
            // use
            // for each statement, += assigment operator
            int calculatedSumOfEvens = 0;
            int calculatedSumOfOdds = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    // It's even
                    calculatedSumOfEvens += number;
                } else {
                    // It's odd
                    calculatedSumOfOdds += number;
                }
            }

            // Create a map (key value pairs) with the calculated sums, add values to the
            // pair using put method on the hashmap
            Map<String, Integer> result = new HashMap<>();
            result.put("SumOfEvens", calculatedSumOfEvens);
            result.put("SumOfOdds", calculatedSumOfOdds);
        }

    }

    public List<Integer> reverse(List<Integer> numbers) {
        // ODO - Implement this method such that
        // - it takes an array list of integers
        // - it returns the list in reverse order
        // throw new RuntimeException("Not implemented");

        // collections.reverse method from java collections package reverses all
        // elements in an arraylist
        Collections.reverse(numbers);
        // the reverse method was called on numbers so its now in reverse order and can
        // be returned
        return numbers;

        // List<Integer> myArrayList = new ArrayList<>();
        // reverse(myArrayList);// calling reverse method of my array list or taking in
        // myarraylist as parameter
        // of the method
        // return myArrayList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
