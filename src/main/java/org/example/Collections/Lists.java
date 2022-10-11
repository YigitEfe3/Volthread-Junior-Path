package org.example.Collections;

/*
*
*   List is an ordered collection.
*
*   Upon displaying the list content it will display the elements in the same order
*           in which they got inserted into the list                        (First In First Out)
*
*   List provides control over the position where you can insert an element
*
*   You can access elements by their index and also search elements in the list.
*
*   List allows you to add duplicate elements.
*
*   List allows you to have 'null' elements.
*
*
* ----------------------------------------------------------------------------------------------------------------------
*
*   ARRAYLIST
*
*   ArrayList is a re-sizable array, also called a dynamic array.
*           It grows its size to accommodate new elements and shrinks the size when the elements are removed.
*
*   ArrayList allows you to retrieve the elements by their index.
*
*   ArrayList allows duplicate elements and 'null' elements.
*
*   ArrayList is an ordered collection, it maintains the insertion order of the elements
*
*   You cannot create an ArrayList of primitive types, you need to use wrapper classes
*                                        (int, char)                 (Integer, Character)
*
*   ArrayList is not synchronized. If multiple threads try to modify an ArrayList at the same time,
*           the final outcome will be non-deterministic. You must explicitly synchronize access.
*
*   The default size of an ArrayList is 10
*
* ----------------------------------------------------------------------------------------------------------------------
*
*   LINKEDLIST
*
*   LinkedList class can contain duplicate elements
*
*   LinkedList class maintains insertion order.
*
*   LinkedList class implements Queue and Deque interfaces.
*       Therefore, it can also be used as a Queue, Deque, or Stack
*
*   LinkedList is not thread-safe. You must explicitly synchronize concurrent modifications to the LinkedList
*       in a multi-threaded environment.
*
*
*
*
* ----------------------------------------------------------------------------------------------------------------------

*       METHODS
*
*   Methods For Both Lists and ArrayLists:
*
*   myList.add()                    //to add a new element to the list
*
*   myList.isEmpty()                //to check if an ArrayList is empty
*
*   myList.size()                   //to find the size of an ArrayList
*
*   myList.get()                    //to access the element at a particular index in an ArrayList
*
*   myList.set()                    //to modify the element at a particular index in an ArrayList
*
*   myList.remove(3)                //to remove the element at index 3 from the list
*
*   myList.removeAll()              //to remove from this list all of its elements that are contained in the specified
*                                     collection
*
*   myList.clear()                  //to remove all elements from the list
*
*   Collections.sort(list)           //to sort the list in ascending order
*
*   Collections.reverse(list)       //to sort the list in descending order
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */

public class Lists {
}
