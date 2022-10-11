package org.example.Collections.ListArrayListLinkedList;

/*
*   How to create an ArrayList from another collection using the ArrayList (Collection c) constructor
*
*   How to add all elements from an existing collection to the new ArrayList using the addAll() method
*
* */

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollection {
    public static void main(String[] args) {

        List<Integer> firstFivePrimeNumbers = new ArrayList<>();        //create ArrayList object
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

                                    //create ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();        //create second ArrayList object
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);      //add the second ArrayList

        System.out.println(firstTenPrimeNumbers);

    }
}
