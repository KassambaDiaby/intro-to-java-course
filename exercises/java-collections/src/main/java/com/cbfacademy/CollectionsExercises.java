package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        // - add 4 as the first element of the list
        // - then add 5, 6, 8, 2, 9 to the list
        // - add another 2 as the last element of the list
        // - add 4 as the 3rd element of the list
        // - invoke the method element() on the list and print the result on the screen
        // - return the list
        // throw new RuntimeException("Not implemented");
        LinkedList<Integer> mylist = new LinkedList<>();
        mylist.addFirst(4);// adding first element
        mylist.add(5); // adding all elements
        mylist.add(6);
        mylist.add(8);
        mylist.add(2);
        mylist.add(9);
        mylist.addLast(2);
        mylist.add(2, 4);
        System.out.println(mylist.element());
        return mylist;

    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        // - add 5, 6, 8, 9 to the stack
        // - print the first element of the stack on the screen
        // - print the last element of the stack on the screen
        // - invoke the method pop() on the stack and print the result on the screen
        // - invoke the push(4) method on the stack
        // - return the stack
        // throw new RuntimeException("Not implemented");
        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);
        myStack.push(9);
        System.out.println(myStack.firstElement());
        System.out.println(myStack.lastElement());
        Integer pop = myStack.pop();// retrieve and remove the top element from the stack
        System.out.println(pop);
        myStack.push(4);// adds the value 4 to the stack
        return myStack;

    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        // - add 5, 6, 8, 9 to the queue
        // - print the first element of the queue on the screen
        // - print the last element of the queue on the screen
        // - invoke the method poll() on the queue and print the result on the screen
        // - invoke the element() method on the queue and print the result on the screen
        // - return the queue
        // throw new RuntimeException("Not implemented");
        ArrayDeque<Integer> myQueue = new ArrayDeque<>();
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(8);
        myQueue.add(9);
        System.out.println(myQueue.peekFirst());
        System.out.println(myQueue.peekLast());
        Integer pollMethod = myQueue.poll();
        System.out.println(pollMethod);
        Integer elemementMethod = myQueue.element();
        System.out.println(elemementMethod);
        return myQueue;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        // - add {1, TypeScript} entry to the map
        // - add {2, Kotlin} entry to the map
        // - add {3, Python} entry to the map
        // - add {4, Java} entry to the map
        // - add {5, JavaScript} entry to the map
        // - add {6, Rust} entry to the map
        // - determine the set of keys from the map and print it on the screen
        // - determine the set of values from the map and print it on the screen
        // - determine whether the map contains "English" as a language and print the
        // result on the screen
        // - return the map
        // throw new RuntimeException("Not implemented");
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Typescript");
        myMap.put(2, "Kotlin");
        myMap.put(3, "Python");
        myMap.put(4, "Java");
        myMap.put(5, "Javascript");
        myMap.put(6, "Rust");
        System.out.println(myMap.keySet());// set of keys or ketset method, returns a Set view of the keys contained in
                                           // the
        // map.
        System.err.println(myMap.values());// returns values contained in the map
        System.out.println(myMap.containsValue("English"));
        return myMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
