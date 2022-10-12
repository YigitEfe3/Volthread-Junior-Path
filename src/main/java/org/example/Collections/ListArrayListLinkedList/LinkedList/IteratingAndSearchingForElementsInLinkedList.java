package org.example.Collections.ListArrayListLinkedList.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingAndSearchingForElementsInLinkedList {

    public static void main(String[] args) {

        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("C");                     //0
        progLangs.add("C++");                   //1
        progLangs.add("Core Java");             //2
        progLangs.add("Java EE");               //3
        progLangs.add("Spring Framework");      //4
        progLangs.add("Hibernate Framework");   //5

        //Find the index of the first occurrence of an element in the LinkedList
        int index = progLangs.indexOf("Core Java");
        System.out.println("index = " + index);

        //Find the index of the last occurrence of an element in the LinkedList
        int lastIndex = progLangs.lastIndexOf("Spring Framework");
        System.out.println("lastIndex = " + lastIndex);

        //Ways to iterate over a LinkedList
        //1-iterator
        Iterator<String> iterator = progLangs.iterator();
        while(iterator.hasNext()){
            String prog = (String) iterator.next();
            System.out.println(prog);
        }
        //2-foreach
        progLangs.forEach((element) -> {
            System.out.println(element);
        });
        //3-foreach advanced loop
        for(String e: progLangs){
            System.out.println(e);
        }
        //4-simple for loop
        for(int i = 0; i < progLangs.size(); i++){
            System.out.println(progLangs.get(i));
        }


    }

}
