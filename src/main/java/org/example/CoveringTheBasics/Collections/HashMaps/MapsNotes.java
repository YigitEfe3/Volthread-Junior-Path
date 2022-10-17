package org.example.CoveringTheBasics.Collections.HashMaps;

import java.util.*;

public class MapsNotes {
    public static void main(String[] args) {

        //example to map numbers to strings
        Map<String, Integer>  numberMapping = new HashMap<>();

        //add key-value pair to map
                    //     KEY  VALUE
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Five", 5);

        numberMapping.put(null, 6);     //When an element reoccurs, map will delete the old one
        numberMapping.put(null, 7);     //and keep the new one

        System.out.println(numberMapping);

        System.out.println(numberMapping.isEmpty());    //returns if the map is empty

        System.out.println(numberMapping.size());       //returns the size of the map

        if(numberMapping.containsKey("Four")){          //see if the element contains a key
            System.out.println("Key exists for Four");
        }else{
            System.out.println("Key does not exist for Four");
        }


        if(numberMapping.containsValue(4)){         //see if the element contains a value
            System.out.println("The value 4 exists");
        }else{
            System.out.println("The value 4 does not exist");
        }


        //get value by key
        System.out.println("Value of 5 is : " + numberMapping.get("Five"));

        //removing keys from hashmap
        numberMapping.remove("One");
        System.out.println(numberMapping);


        //get only keys from hashmap
        Set<String> setOfKeys = new HashSet<>();
        setOfKeys = numberMapping.keySet();
        System.out.println(setOfKeys);

        //get only values from hashmap
        Collection<Integer> setOfValues = numberMapping.values();
        System.out.println(setOfValues);

        //iterate over hashmap
        //1 - forEach method
        for(Map.Entry<String, Integer> entry: numberMapping.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        //2 - using iterator
        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
        Iterator <Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        //3 - hashmap using java8 foreach
        numberMapping.forEach((K,V) -> {
            System.out.println(" K " + K);
            System.out.println(" V " + V);
        });


    }
}
