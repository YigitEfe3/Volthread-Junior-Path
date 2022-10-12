package org.example.Collections.ListArrayListLinkedList.LinkedList;

/*
* add()
* add(index,element)
* addFirst()
* addLast()
* How to get the first element in the LinkedList
* How to get the last element in the LinkedList
* How to get the element at a given index in the LinkedList
* How to get all the elements from the LinkedList
* How to remove the first element in the LinkedList
* How to remove the last element in the LinkedList
* How to remove the first occurrence of a given element in the LinkedList
* How to clear the LinkedList completely
*
* */

import java.util.LinkedList;

public class CreateRetrieveRemoveElementsInLinkedList {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");   //0
        fruits.add("Apple");    //1
        fruits.add("Mango");    //2
        System.out.println("initial linkedlist -> " + fruits);

        //adding an element at the specified position in the LinkedList
        fruits.add(2, "Watermelon");
        System.out.println("after adding Watermelon -> " + fruits);

        //adding an element at the beginning of the LinkedList
        fruits.addFirst("Kiwi");
        System.out.println("after adding Kiwi -> " + fruits);

        //adding an element at the end of the LinkedList
        fruits.addLast("Orange");
        System.out.println("after adding Orange -> " + fruits);

        //getting the first element of the LinkedList
        System.out.println(fruits.getFirst());

        //getting the last element of the LinkedList
        System.out.println(fruits.getLast());

        //getting the last element of the LinkedList
        System.out.println(fruits.get(3));

        //getting all the element of the LinkedList
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        //remove the first element of the LinkedList
        fruits.removeFirst();
        System.out.println("After removing the first element -> " + fruits);

        //remove the last element of the LinkedList
        fruits.removeLast();
        System.out.println("After removing the last element -> " + fruits);

        //remove an element from the LinkedList using its index
        fruits.remove(3);
        System.out.println("After removing the element at index 3 -> " + fruits);

        //remove an element from the LinkedList using its value
        fruits.remove("Apple");
        System.out.println("After removing Apple -> " + fruits);


        //add reoccurring elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        System.out.println("After adding reoccurring elements -> " + fruits);

        //remove the first occurrence element of the LinkedList
        fruits.removeFirstOccurrence("Apple");
        System.out.println("After removing the first occurrence of an element -> " + fruits);

        //remove the last occurrence element of the LinkedList
        fruits.removeLastOccurrence("Apple");
        System.out.println("After removing the last occurrence of an element -> " + fruits);

        //remove all the elements in the LinkedList
        fruits.clear();
        System.out.println("After removing all elements -> " + fruits);

        //this part also removes all the elements in the LinkedList
        //fruits.removeAll(fruits);
        //System.out.println("After removing all elements -> " + fruits);

        //this part also removes all the elements in the LinkedList
        //for(int i = fruits.size(); i > 0 ; i--){
        //    fruits.remove(i-1);
        //}
        //System.out.println("After removing all elements -> " + fruits);

        //this part also removes all the elements in the LinkedList
        //int size = fruits.size();
        //for(int i = 0; i < size; i++){
        //    fruits.removeFirst();  //fruits.removeLast();  //also works
        //}
        //System.out.println("After removing all elements -> " + fruits);



    }
}
