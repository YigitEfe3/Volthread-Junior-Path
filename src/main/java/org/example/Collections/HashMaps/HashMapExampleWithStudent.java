package org.example.Collections.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleWithStudent {
    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student("Ramesh", "Fadatare"));
        studentMap.put(2, new Student("Tony", "Stark"));
        studentMap.put(3, new Student("umesh", "fadatare"));

        System.out.println(studentMap.values());

    }
}
