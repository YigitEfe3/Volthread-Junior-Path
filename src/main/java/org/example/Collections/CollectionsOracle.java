package org.example.Collections;

/*          INTERFACES
*
*   Set is a special kind of Collection,
*       SortedSet is a special kind of Set
*
*   List is a special kind of Collection
*
*   Queue is a special kind of Collection
*
*   Deque is a special kind of Collection
*
*   Map is not a true Collection
*       SortedMap is a special kind of Map
*
*   List - an ordered collection
*          Can contain duplicated elements
*          Generally has precise control over where in the list each element is inserted and can access elements
*               by their integer index.
*
*   Queue - Deque - A collection used to hold multiple elements prior to processing. Besides basic Collection operations
*                       a Queue provides additional insertion, extraction, and inspection operations
*                   Queues typically order elements in a FIFO manner. Exception is Priority Queue
*
*   Map - an object that maps keys to values. A map cannot contain duplicate keys, each key can map to at most one value
*
*   SortedSet - a Set that maintains its elements in ascending order.
*
*   SortedMap - a Map that maintains its mappings in ascending key order.
*
* ----------------------------------------------------------------------------------------------------------------------
*
*      COLLECTION INTERFACE
*
*   The Collection interface contains methods that perform basic operations, such as;
*       - int size()                                : returns the number of elements
*       - boolean isEmpty()                         : returns true if the Collection is empty, false if not
*       - boolean contains(Object element)          : returns true if the Collection contains the specified element, false if not
*       - boolean add(E element)                    : adds element to the Collection
*       - boolean remove(Object element)            : removes the element from the Collection
*       - Iterator<E> iterator()                    : returns an Iterator over the Set
*       - boolean containsAll(Collection<?> c)      : returns true if the target contains all elements
*       - boolean addAll(Collection<? extends E> c) : adds all the elements in the specified collection
*       - boolean removeAll(Collection<?> c)        : removes from the target Collection all of its elements that are also
*                                                     contained in the specified Collection
*       - boolean retainAll(Collection<?> c)        : removes from the target Collection all its elements that are NOT also
*                                                     contained in the specified Collection
*       - void clear()                              : removes all elements from the Collection
*
*       These methods are the same in all Collection types.
*
*   There are three ways to traverse collections
*       - using aggregate operations
*       - with the for-each construct
*       - Iterators
*
* ----------------------------------------------------------------------------------------------------------------------
*
*       SET INTERFACE
*
*
*   A collection that cannot contain duplicate elements.
*
*   Models the mathematical set abstraction and is used to represent sets
*
*   The Set Interface contains only methods inherited from Collection and adds the restriction that duplicate elements
*       are prohibited.
*
*   Two Set instances are equal if they contain the same elements.
*
*   The Java platform contains three general-purpose Set implementations
*       - HashSet       : Stores elements in a hash table, is the best-performing implementation.
*                         Makes no guarantees concerning the order of iteration.
*       - TreeSet       : Stores elements in a red-black tree, orders its elements based on their values. Slower than HashSet
*       - LinkedHashSet : Implemented as a hash table with a linked list running through it,
*                         orders its elements based on the order of insertion.
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

public class CollectionsOracle {
}
