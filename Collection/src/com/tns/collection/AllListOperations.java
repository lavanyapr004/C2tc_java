package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AllListOperations {
	public static void main(String[] args) {
		
	
		        // Create a list that can hold mixed data
		        List<Object> list = new ArrayList<>();

		        // Add elements
		        list.add("Apple");      // String
		        list.add(42);           // Integer
		        list.add(3.14);         // Double
		        list.add('A');          // Character
		        list.add(true);         // Boolean
		        System.out.println("Initial List: " + list);

		        // Add element at specific index
		        list.add(2, "Inserted");
		        System.out.println("After inserting at index 2: " + list);

		        // Access elements
		        System.out.println("Element at index 0: " + list.get(0));

		        // Modify an element
		        list.set(1, 100);  // change the element at index 1
		        System.out.println("After set(): " + list);

		        // Remove by index and by object
		        list.remove(3);                 // remove element at index 3
		        list.remove(Boolean.TRUE);      // remove object 'true'
		        System.out.println("After remove(): " + list);

		        //  Check size, empty, contains
		        System.out.println("Size: " + list.size());
		        System.out.println("Contains 'Apple'? " + list.contains("Apple"));
		        System.out.println("Is list empty? " + list.isEmpty());

		        //  Iteration examples
		        System.out.println("\nIterating with for-each:");
		        for (Object item : list) System.out.print(item + "  ");
		        System.out.println();

		        System.out.println("\nIterating with for loop:");
		        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + "  ");
		        System.out.println();

		        //  Index search
		        System.out.println("Index of 'Apple': " + list.indexOf("Apple"));
		        list.add("Apple");
		        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

		        // Create subList (view of original)
		        List<Object> sub = list.subList(0, 2);
		        System.out.println("SubList(0,2): " + sub);

		        //  Sort a list of comparable elements
		        // (Need a list of the same type; create a separate String list)
		        List<String> names = new ArrayList<>();
		        names.add("Zara");
		        names.add("Mike");
		        names.add("Anna");
		        System.out.println("\nNames before sort: " + names);
		        Collections.sort(names);
		        System.out.println("Names after sort: " + names);
		        Collections.reverse(names);
		        System.out.println("Names reversed: " + names);

		        // Add all elements from another list
		        list.addAll(names);
		        System.out.println("\nAfter addAll(names): " + list);

		        // Retain only certain elements
		        list.retainAll(names);
		        System.out.println("After retainAll(names): " + list);
		        //  Remove all elements
		        list.clear();
		        System.out.println("After clear(): " + list);
		        System.out.println("Is empty now? " + list.isEmpty());
		   
	}

}
