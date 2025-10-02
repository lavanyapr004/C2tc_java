package com.tns.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class IteratorVsListIterator {
	
	    public static void main(String[] args) {

	        // Create a sample list
	        List<String> names = new ArrayList<>();
	        names.add("Ravi");
	        names.add("Sita");
	        names.add("Mohan");
	        names.add("Gita");

	        System.out.println("Original List : " + names);

	        /* Using Iterator  (simple, forward-only cursor)*/
	        System.out.println("\n--- Iterator Demo ---");

	        // Get an Iterator for the list
	        Iterator<String> itr = names.iterator();

	        // Loop only moves forward
	        while (itr.hasNext()) {
	            String name = itr.next();                  // get next element
	            System.out.println("Visited (forward only) : " + name);

	            // remove() is the ONLY modification allowed during iteration
	            if (name.startsWith("M")) {
	                System.out.println("Removing : " + name);
	                itr.remove();                          // safely remove "Mohan"
	            }
	            // No method to move backward or add/replace elements
	        }

	        System.out.println("List after Iterator removal : " + names);

	        /*Using ListIterator  (bi-directional & can modify)*/
	        System.out.println("\n--- ListIterator Demo ---");

	        // Get a ListIterator (works only for List, not for Set/Queue)
	        ListIterator<String> listItr = names.listIterator();

	        System.out.println("Forward direction:");
	        // Forward traversal like a normal Iterator
	        while (listItr.hasNext()) {
	            String name = listItr.next();
	            System.out.println("Index " + listItr.previousIndex() + " -> " + name);

	            // You can INSERT a new element while iterating
	            if (name.equals("Sita")) {
	                listItr.add("Hari");                   // insert right after "Sita"
	            }

	            // You can REPLACE the current element
	            if (name.equals("Gita")) {
	                listItr.set("Geeta");                  // change "Gita" to "Geeta"
	            }
	        }

	        System.out.println("\nBackward direction:");
	        // Move backward using hasPrevious()/previous()
	        while (listItr.hasPrevious()) {
	            String name = listItr.previous();
	            System.out.println("Index " + listItr.nextIndex() + " -> " + name);
	        }

	        System.out.println("\nList after ListIterator operations : " + names);
	    }
	}
