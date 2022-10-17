package org.example.CoveringTheBasics.Collections.ListArrayListLinkedList;

/*
*
* How to check if an ArrayList is empty using the isEmpty() method
*
* How to find the size of an ArrayList using the size() method
*
* How to access the element at a particular index in an ArrayList using the get() method
*
* How to modify the element at a particular index in an ArrayList using the set() method
*
* */

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {

        List<String> topProgrammingLanguage = new ArrayList<>();

        //System.out.println("Is the topProgrammingLanguage list empty? :" + topProgrammingLanguage.isEmpty());

        topProgrammingLanguage.add("C");        //0
        topProgrammingLanguage.add("Java");     //1
        topProgrammingLanguage.add("C++");      //2
        topProgrammingLanguage.add(".net");     //3
        topProgrammingLanguage.add("Python");   //4

        System.out.println("Here are the " + topProgrammingLanguage.size() + " programming languages in the world:");
        System.out.println(topProgrammingLanguage);

        String bestProgrammingLanguage = topProgrammingLanguage.get(1);
        System.out.println(bestProgrammingLanguage + " is the best programming languages in the world!");

        topProgrammingLanguage.set(3, "C#");
        System.out.println("Here are the " + topProgrammingLanguage.size() + " programming languages in the world:");
        System.out.println(topProgrammingLanguage);

        topProgrammingLanguage.remove(4);
        //topProgrammingLanguage.remove("Python");
        System.out.println("Here are the " + topProgrammingLanguage.size() + " programming languages in the world:");
        System.out.println(topProgrammingLanguage);

        List<String> subList = new ArrayList<>();

        subList.add("C");
        subList.add("C++");
        subList.add("C#");

        topProgrammingLanguage.removeAll(subList);

        System.out.println("Here are the " + topProgrammingLanguage.size() + " programming languages in the world:");
        System.out.println(topProgrammingLanguage);


        topProgrammingLanguage.add("C++");
        topProgrammingLanguage.add("C");
        topProgrammingLanguage.add(".net");
        topProgrammingLanguage.add("Python");

        System.out.println("Here are the " + topProgrammingLanguage.size() + " programming languages in the world:");
        System.out.println(topProgrammingLanguage);

        topProgrammingLanguage.clear();

        System.out.println("Here are the " + topProgrammingLanguage.size() + " programming languages in the world:");
        System.out.println(topProgrammingLanguage);



    }
}
