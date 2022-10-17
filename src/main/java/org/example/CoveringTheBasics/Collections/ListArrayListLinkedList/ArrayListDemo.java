package org.example.CoveringTheBasics.Collections.ListArrayListLinkedList;

//How to create an arrayList using the ArrayList() constructor
//Add new elements to an ArrayList using the add() method

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(4);        //Created arraylist object


        fruits.add("apple");            //add to the ArrayList
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("mango");

        System.out.println(fruits);

    }

}
