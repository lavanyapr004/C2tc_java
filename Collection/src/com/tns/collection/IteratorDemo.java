package com.tns.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		  // 1. Create a list with some elements
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Sita");
        names.add("Mohan");
        names.add("Gita");

        System.out.println("Original List : " + names);

        // 2. Obtain an Iterator
        Iterator<String> itr = names.iterator();

        // 3. Traverse using hasNext() and next()
        System.out.println("\n-- Using hasNext() and next() --");
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println("Visited : " + name);

            // 4. Demonstrate remove() – remove elements starting with 'M'
            if (name.startsWith("M")) {
                System.out.println("Removing : " + name);
                itr.remove();  // Safe removal during iteration
            }
        }

        System.out.println("\nList after removal : " + names);

        // 5. Add a few more items to show forEachRemaining
        names.add("Hari");
        names.add("Radha");

        // 6. New iterator to use forEachRemaining
        Iterator<String> itr2 = names.iterator();

        // Skip the first element to show it really processes "remaining"
        if (itr2.hasNext()) {
            System.out.println("\nSkipping first element: " + itr2.next());
        }

        // 7. forEachRemaining: apply action to all remaining elements
        System.out.println("\n-- Using forEachRemaining() --");
        itr2.forEachRemaining(item -> System.out.println("Remaining : " + item));
    }

}

		      


