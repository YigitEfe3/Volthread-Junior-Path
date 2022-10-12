package org.example.Collections.HashSet;

/*
*   DIFFERENT WAYS TO ITERATE A SET
*
*   - Enhanced for loop
*   - Basic loop with iterator
*   - While loop with iterator
*   - JDK 8 forEach() method with lambda
*   - JDK 8 streaming + forEach + lambda expression
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingASet {

    public static void main(String[] args) {

        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

        //Enhanced for loop
        for(String course: courses){
            System.out.println(course);
        }

        //Basic loop with iterator
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        //While loop with iterator
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            String course = iterator.next();
            System.out.println(course);
        }

        //JDK 8 forEach() method with lambda
        courses.forEach(course -> System.out.println(course));

        //JDK 8 streaming + forEach + lambda expression
        courses.stream().forEach(course -> System.out.println(course));

        //same as above, but we filter out(exclude) Java
        courses.stream().filter(course -> !"Java".equals(course)).forEach(course -> System.out.println(course));

    }
}
