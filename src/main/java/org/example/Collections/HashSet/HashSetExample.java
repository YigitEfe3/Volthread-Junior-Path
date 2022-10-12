package org.example.Collections.HashSet;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
* Creating a HashSet
* Adding new elements to the HashSet
* Creating a HashSet from another collection using Collection constructor and addAll() method
* Removing elements from the HashSet using;
*       - remove()      : Remove an element from a HashSet
*       - removeAll()   : Remove all the elements that exist in a given collection from the HashSet
*       - clear()       : Clear the HashSet completely by removing all the elements
*
* */

public class HashSetExample {

    public static void main(String[] args) {
        //A HashSet does not contain duplicate elements
        //A HashSet is an unordered collection
        //A HashSet can contain one null value
        Set<String> set = new HashSet<>();
        set.add("element5");
        set.add("element1");
        set.add("element2");
        set.add("element1");
        set.add("element7");
        set.add(null);
        set.add("element1");
        set.add(null);
        set.add("element1");
        set.add("element2");
        set.add("element4");
        set.add("element6");
        System.out.println(set);






        //Creating a HashSet from another collection
        Set<String> newSet = new HashSet<>();

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Kiwi");
        list.add("Banana");

        //newSet = new HashSet<>(list);   //These both do the same thing,
        newSet.addAll(list);              //if we replace list with set, it will print the set above
        System.out.println(newSet);





        //Removing elements from the HashSet
        System.out.println("Current version before removing elements -> " + set);

        List<String> listToRemove = new ArrayList<>();
        listToRemove.add("element2");
        listToRemove.add("element7");

        set.remove("element4");
        System.out.println("Set after removing element4 -> " + set);

        set.removeAll(listToRemove);
        System.out.println("Set after removing listToRemove -> " + set);

        set.clear();
        System.out.println("Remove all elements from the Set -> " + set);



    }
}
