package org.example.Collections.ListArrayListLinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysOfIterateOverList {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

        // Iterating using basic for loop
        for(int i = 0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }

        // Iterating using enhanced for loop
        for(String course1: courses){
            System.out.println(course1);
        }

        //Iterating using a basic loop with iterator
        for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();){
            String course2 = (String) iterator.next();
            System.out.println(course2);
        }

        //Iterating using iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            String course3 = (String) iterator.next();
            System.out.println(course3);
        }

        //Iterating using java8 stream + lambda
        courses.stream().forEach(course4 -> System.out.println(course4));

        //Iterating using java8 forEach + lambda
        courses.forEach((course5) -> System.out.println(course5));

    }
}
