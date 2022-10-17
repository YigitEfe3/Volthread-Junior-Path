package org.example.CoveringTheBasics.Collections.ListArrayListLinkedList.SortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        /*
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);

        System.out.println(list);

        Collections.sort(list);     //ascending order
        System.out.println(list);

        Collections.reverse(list);     //descending order
        System.out.println(list);
        */

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "A", 30, 400000));
        employees.add(new Employee(20, "B", 29, 350000));
        employees.add(new Employee(30, "C", 30, 450000));
        employees.add(new Employee(40, "D", 29, 500000));


                    //List<T> list, Comparator<? super T> c
        Collections.sort(employees, new MySortAscending());  //ascending order
        System.out.println(employees);


        Collections.sort(employees, new MySortDescending());  //descending order
        System.out.println(employees);


        Collections.sort(employees, new Comparator<Employee>() {     //ascending order
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println(employees);


        Collections.sort(employees, new Comparator<Employee>() {     //descending order
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        });
        System.out.println(employees);

                                        //üsttekinin lambda expression versiyonu
        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));   //ascending order
        System.out.println(employees);


        Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));   //descending order
        System.out.println(employees);


        Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));   //ascending order
        System.out.println(employees);


        Collections.sort(employees, (o1, o2) -> (o2.getName().compareTo(o1.getName())));   //descending order
        System.out.println(employees);

    }
}

class MySortAscending implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return (int) (o1.getSalary() - o2.getSalary());
    }
}

class MySortDescending implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
