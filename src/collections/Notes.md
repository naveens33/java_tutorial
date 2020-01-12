### Various interfaces Collection:

* Collection interface: Collection (java.util.Collection) is the primary interface, and every collection must implement this interface.
* List interface: List interface extends the Collection interface, and it is an ordered collection of objects. It contains duplicate elements. It also allows random access of elements.
* Set interface: Set (java.util.Set) interface is a collection which cannot contain duplicate elements. It can only include inherited methods of Collection interface
* Queue interface: Queue (java.util.Queue) interface defines queue data structure, which stores the elements in the form FIFO (first in first out).
* Dequeue interface: it is a double-ended-queue. It allows the insertion and removal of elements from both ends. It implants the properties of both Stack and queue so it can perform LIFO (Last in first out) stack and FIFO (first in first out) queue, operations.
* Map interface: A Map (java.util.Map) represents a key, value pair storage of elements. Map interface does not implement the Collection interface. It can only contain a unique key but can have duplicate elements. There are two interfaces which implement Map in java that are Map interface and Sorted Map.

### ArrayList

* Java ArrayList class can contain duplicate elements.
* Java ArrayList class maintains insertion order.
* Java ArrayList class is non synchronized.
* Java ArrayList allows random access because array works at the index basis.
* In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.

### LinkedList

* Java LinkedList class can contain duplicate elements.
* Java LinkedList class maintains insertion order.
* Java LinkedList class is non synchronized.
* In Java LinkedList class, manipulation is fast because no shifting needs to occur.
* Java LinkedList class can be used as a list, stack or queue.

### HashSet

* HashSet stores the elements by using a mechanism called hashing.
* HashSet contains unique elements only.
* HashSet allows null value.
* HashSet class is non synchronized.
* HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
* HashSet is the best approach for search operations.
* The initial default capacity of HashSet is 16, and the load factor is 0.75.

### ArrayList vs Vector

|S.No.|	ArrayList|	Vector|
|-----|----------|--------|
|1|	ArrayList is not synchronized.|	Vector is synchronized.|
|2|	ArrayList is not a legacy class.|	Vector is a legacy class.|
|3|	ArrayList increases its size by 50% of the array size.|	Vector increases its size by doubling the array size.|
|4|	ArrayList is not ?thread-safe? as it is not synchronized.|	Vector list is ?thread-safe? as it?s every method is synchronized.|

### ArrayList vs Linked List

|S.No.|	ArrayList|	LinkedList|
|-----|----------|------------|
|1|	ArrayList uses a dynamic array.|	LinkedList uses a doubly linked list.|
|2|	ArrayList is not efficient for manipulation because too much is required.|	LinkedList is efficient for manipulation.|
|3|	ArrayList is better to store and fetch data.|	LinkedList is better to manipulate data.|
|4|	ArrayList provides random access.|	LinkedList does not provide random access.|
|5|	ArrayList takes less memory overhead as it stores only object|	LinkedList takes more memory overhead, as it stores the object as well as the address of that object.|

### List vs Set

* The List can contain duplicate elements whereas Set includes unique items.
* The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.
* The List interface contains a single legacy class which is Vector class whereas Set interface does not have any legacy class.
* The List interface can allow n number of null values whereas Set interface only allows a single null value.

### Set vs Map

* Set contains values only whereas Map contains key and values both.
* Set contains unique values whereas Map can contain unique Keys with duplicate values.
* Set holds a single number of null value whereas Map can include a single null key with n number of null values.

### HashSet vs  HashMap

* HashSet contains only values whereas HashMap includes the entry (key, value). HashSet can be iterated, but HashMap needs to convert into Set to be iterated.
* HashSet implements Set interface whereas HashMap implements the Map interface
* HashSet cannot have any duplicate value whereas HashMap can contain duplicate values with unique keys.
* HashSet contains the only single number of null value whereas HashMap can hold a single null key with n number of null values.

### Arrays vs ArrayList

|S.No.|	Array|	ArrayList|
|-----|------|-----------|
|1|	The Array is of fixed size, means we cannot resize the array as per need.|	ArrayList is not of the fixed size we can change the size dynamically.|
|2|	Arrays are of the static type.|	ArrayList is of dynamic size.|
|3|	Arrays can store primitive data types as well as objects.|	ArrayList cannot store the primitive data types it can only store the objects.|

### SortedMap->TreeMap vs HashMap